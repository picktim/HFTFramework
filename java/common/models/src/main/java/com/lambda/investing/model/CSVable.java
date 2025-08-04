package com.lambda.investing.model;

import com.lambda.investing.model.asset.Instrument;
import com.lambda.investing.model.market_data.Depth;
import com.lambda.investing.model.market_data.DepthParquet;
import com.lambda.investing.model.market_data.Trade;
import com.lambda.investing.model.market_data.TradeParquet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;

public abstract class CSVable implements Serializable {

	public static Logger logger = LogManager.getLogger(CSVable.class);

	public abstract String toCSV(boolean withHeader);

	public abstract Object getParquetObject();

	public static CSVable getCSVAble(Object parquetObject, Instrument instrument) {
		if (parquetObject instanceof DepthParquet) {
			Depth depth = Depth.getInstance();
			depth.setDepthFromParquet((DepthParquet) parquetObject, instrument);
			return depth;
		}
		if (parquetObject instanceof TradeParquet) {
			Trade trade = Trade.getInstance();
			trade.setTradeFromParquet((TradeParquet) parquetObject, instrument);
			return trade;
		}

		logger.error("getCSVAble parquetObject not recognized! return null");
		//TODO something better
		return null;
	}

}
