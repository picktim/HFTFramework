package com.lambda.investing.model.portfolio;

import com.lambda.investing.model.trading.ExecutionReport;
import com.lambda.investing.model.trading.ExecutionReportStatus;
import com.lambda.investing.model.trading.Verb;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter public class PortfolioInstrument {

	private String instrumentPK;

	private long timestampLastUpdate;
	//	private double avgFillPrice;
	private double position;
	//	private double lastTradeQuantity;
	//	private double closePnl;
	//	private double openPnl;
	//	private double totalPnl;
	private double numberTrades;


	public PortfolioInstrument(String instrumentPK) {
		this.instrumentPK = instrumentPK;
	}

	public void updateTrade(ExecutionReport executionReport) {
		if (ExecutionReport.isTradeStatus(executionReport)) {
			//only in trades
			timestampLastUpdate = executionReport.getTimestampCreation();
			numberTrades++;

			if (executionReport.getVerb().equals(Verb.Buy)) {
				position += executionReport.getLastQuantity();
			}
			if (executionReport.getVerb().equals(Verb.Sell)) {
				position -= executionReport.getLastQuantity();
			}
		}
	}
}
