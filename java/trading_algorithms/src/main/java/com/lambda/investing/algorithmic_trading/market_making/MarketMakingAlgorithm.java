package com.lambda.investing.algorithmic_trading.market_making;

import com.lambda.investing.algorithmic_trading.AlgorithmConnectorConfiguration;
import com.lambda.investing.algorithmic_trading.SingleInstrumentAlgorithm;
import com.lambda.investing.model.asset.Instrument;
import com.lambda.investing.model.market_data.Depth;
import com.lambda.investing.model.trading.Verb;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter @Setter public abstract class MarketMakingAlgorithm extends SingleInstrumentAlgorithm {

	public double quantityBuy;
	public double quantitySell;
	public int allowedPriceTickImproveBest = Integer.MAX_VALUE; //default no limit

	public MarketMakingAlgorithm(AlgorithmConnectorConfiguration algorithmConnectorConfiguration, String algorithmInfo,
								 Map<String, Object> parameters) {
		super(algorithmConnectorConfiguration, algorithmInfo, parameters);
	}

	public MarketMakingAlgorithm(String algorithmInfo, Map<String, Object> parameters) {
		super(algorithmInfo, parameters);
	}


	protected double boundPrice(Verb verb, double price, Depth depth) {
		if (allowedPriceTickImproveBest == Integer.MAX_VALUE) {
			return price; //no limit
		}
		double prevPrice = price;
		if (verb == Verb.Buy) {
			double bestAllowBidPrice = depth.getBestBid() + allowedPriceTickImproveBest * instrument.getPriceTick();
			price = Math.min(price, bestAllowBidPrice);
		} else if (verb == Verb.Sell) {
			double bestAllowAskPrice = depth.getBestAsk() - allowedPriceTickImproveBest * instrument.getPriceTick();
			price = Math.max(price, bestAllowAskPrice);
		} else {
			throw new IllegalArgumentException("Verb must be Buy or Sell");
		}
		if (prevPrice != price) {
			logger.info("[{}] boundPrice {} {} to {}", getCurrentTime(), verb, prevPrice, price);
		}
		return price;
	}


	@Override
	public void setInstrument(Instrument instrument) {
		super.setInstrument(instrument);
	}

	@Override
	public void setParameters(Map<String, Object> parameters) {
		super.setParameters(parameters);
	}
}
