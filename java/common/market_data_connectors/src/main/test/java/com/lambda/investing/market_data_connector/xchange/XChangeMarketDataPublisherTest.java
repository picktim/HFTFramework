package com.lambda.investing.market_data_connector.xchange;

import com.lambda.investing.connector.zero_mq.ZeroMqConfiguration;
import com.lambda.investing.connector.zero_mq.ZeroMqProvider;
import com.lambda.investing.connector.zero_mq.ZeroMqPublisher;
import com.lambda.investing.market_data_connector.MarketDataConfiguration;
import com.lambda.investing.market_data_connector.MarketDataListener;
import com.lambda.investing.market_data_connector.MarketDataProvider;
import com.lambda.investing.market_data_connector.ZeroMqMarketDataConnector;
import com.lambda.investing.model.asset.Currency;
import com.lambda.investing.model.asset.Instrument;
import com.lambda.investing.model.market_data.Depth;
import com.lambda.investing.model.market_data.Trade;
import com.lambda.investing.model.messaging.Command;
import com.lambda.investing.model.trading.ExecutionReport;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Ignore public class XChangeMarketDataPublisherTest extends TestCase {

	int threadsPublish = 1;
	ZeroMqConfiguration zeroMqConfiguration = new ZeroMqConfiguration("localhost", 55, null);
	ZeroMqPublisher zeroMqPublisher = new ZeroMqPublisher("testPublisher", threadsPublish);
	int threadsListen = 1;

	protected static Depth lastDepth = null;
	protected static Trade lastTrade = null;

	public XChangeMarketDataPublisherTest() {
	}

	public void setUp() throws Exception {
		super.setUp();
	}

	public void tearDown() throws Exception {
		lastDepth = null;
		lastTrade = null;
	}

	public List<Instrument> getInstrument(String market) {
		Instrument instrument = new Instrument();
		instrument.setMarket(market);
		instrument.setCurrency(Currency.USDT);
		instrument.setSymbol("btcusdt");
		List<Instrument> output = new ArrayList<>();
		output.add(instrument);
		return output;
	}

	private void testMD(String market, MarketDataConfiguration marketDataConfiguration) {
		//publisher
		List<Instrument> instruments = getInstrument(market);
		Instrument instrument = instruments.get(0);

		XChangeMarketDataPublisher marketDataPublisher = new XChangeMarketDataPublisher(market + "Test",
				zeroMqConfiguration, zeroMqPublisher, marketDataConfiguration, getInstrument(market));
		marketDataPublisher.start();

		//subscriber

		lastDepth = null;
		lastTrade = null;
		ZeroMqMarketDataConnector marketDataProvider = new ZeroMqMarketDataConnector(zeroMqConfiguration, threadsListen);

		marketDataProvider.register(new MarketDataListener() {

			@Override public boolean onDepthUpdate(Depth depth) {
				System.out.println("depth received " + depth.getInstrument());
				lastDepth = depth;
				return true;
			}

			@Override public boolean onTradeUpdate(Trade trade) {
				System.out.println("trade received " + trade.getInstrument());
				lastTrade = trade;
				return true;
			}

			@Override
			public boolean onCommandUpdate(Command command) {
				System.out.println("command received " + command.getMessage());
				return true;
			}

//			@Override public boolean onExecutionReportUpdate(ExecutionReport executionReport) {
//				System.out.println("ExecutionReport received " + executionReport.getInstrument());
//				return true;
//			}

			@Override
			public boolean onInfoUpdate(String header, Object message) {
				System.out.println("info received " + header);
				return true;
			}
		});
		marketDataProvider.start();
		///
		System.out.println("waiting md on " + instrument);
		while (lastTrade == null || lastDepth == null) {
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		///
		Assert.assertNotNull(lastTrade);
		Assert.assertNotNull(lastDepth);
		//
		Assert.assertTrue(lastTrade.getInstrument().equals(instrument.getPrimaryKey()));
		Assert.assertTrue(lastDepth.getInstrument().equals(instrument.getPrimaryKey()));
		//
		Assert.assertTrue(lastDepth.getLevels() > 1);
		Assert.assertTrue(lastDepth.getAskVolume() > 0);
		Assert.assertTrue(lastDepth.getBidVolume() > 0);
		Assert.assertTrue(lastDepth.getTotalVolume() > (lastDepth.getBestAskQty() + lastDepth.getBestBidQty()));

		Assert.assertTrue(lastDepth.getBestBid() < lastDepth.getBestAsk());
		Assert.assertTrue(lastDepth.getBestBid() < lastDepth.getMidPrice());
		Assert.assertTrue(lastDepth.getBestAsk() > lastDepth.getMidPrice());

		Assert.assertTrue(lastTrade.getQuantity() < lastDepth.getTotalVolume());
		Assert.assertTrue(Math.abs(lastTrade.getPrice() - lastDepth.getMidPrice()) > instrument.getPriceTick());

		marketDataPublisher.stop();

	}

	@Test public void testBinance() {
		MarketDataConfiguration marketDataConfiguration = new BinanceXchangeMarketDataConfiguration("aa", "aa");
		testMD("binance", marketDataConfiguration);
	}

	@Test public void testCoinbase() {
		MarketDataConfiguration marketDataConfiguration = new CoinbaseMarketDataConfiguration("aa", "aa");
		testMD("coinbase", marketDataConfiguration);
	}

	@Test public void testKraken() {
		MarketDataConfiguration marketDataConfiguration = new KrakenMarketDataConfiguration("aa", "aa");
		testMD("kraken", marketDataConfiguration);
	}
}