package com.lambda.investing.algorithmic_trading.reinforcement_learning;

import com.google.common.primitives.Doubles;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lambda.investing.algorithmic_trading.reinforcement_learning.q_learn.DeepQLearning.DEFAULT_PREDICTION_ACTION_SCORE;
import static com.lambda.investing.algorithmic_trading.reinforcement_learning.q_learn.QLearning.CSV_SEPARATOR;

public class TrainNNUtils {

	protected static Logger logger = LogManager.getLogger(TrainNNUtils.class);

	public static double[][] getColumnsArray(double[][] input, int firstColumn, int lastColumn) {
		double[][] output = new double[input.length][lastColumn - firstColumn];
		for (int row = 0; row < input.length; row++) {
			for (int column = firstColumn; column < lastColumn; column++) {
				// index starts from 0
				output[row][column - firstColumn] = input[row][column];
			}
		}
		return output;
	}

	//
	public static int argmax(double[] array) {
		double max = array[0];
		int re = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				re = i;
			}
		}
		return re;
	}

	public static int argmin(double[] array) {
		double min = array[0];
		int re = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				re = i;
			}
		}
		return re;
	}

	public static double[][] getTargetClassification(double[][] targetArr) {
		double[][] targetArrOutput = new double[targetArr.length][targetArr[0].length];
		for (int row = 0; row < targetArr.length; row++) {
			double bestColumn = Doubles.max(targetArr[row]);
			int bestAction = argmax(targetArr[row]);
			boolean bestIsPositive = true;
			if (bestColumn == DEFAULT_PREDICTION_ACTION_SCORE || bestColumn < 0) {
				bestIsPositive = false;
			}


			if (bestIsPositive) {
				targetArrOutput[row][bestAction] = 1.0;
			} else {
				int worstAction = argmin(targetArr[row]);
				//rest are better
				double valueToSet = 1.0;/// (targetArr[row].length - 1);
				for (int column = 0; column < targetArr[row].length; column++) {
					if (column == worstAction || targetArrOutput[row][column] < 0) {
						targetArrOutput[row][column] = 0;
						continue;
					}
					if (targetArrOutput[row][column] == DEFAULT_PREDICTION_ACTION_SCORE) {
						targetArrOutput[row][column] = valueToSet;
					}

				}
			}

		}
		return targetArrOutput;

	}

	/**
	 * Get array of states and action rewards that reward has some rewards !=0
	 *
	 * @param inputWithTarget
	 * @param stateNumberOfColumns
	 * @param actions
	 * @param cleanIt
	 * @return
	 */
	public static double[][] getArrayValid(double[][] inputWithTarget, int stateNumberOfColumns, int actions,
			boolean cleanIt) {
		double[][] targetRaw = getColumnsArray(inputWithTarget, stateNumberOfColumns, stateNumberOfColumns + actions);

		double[][] outputArr = inputWithTarget.clone();
		if (cleanIt) {
			int rowsDeleted = 0;
			for (int row = 0; row < targetRaw.length; row++) {
				double sumRewardsState = 0.0;
				double bestColumn = Doubles.max(targetRaw[row]);
				for (int column = 0; column < targetRaw[row].length; column++) {
					sumRewardsState += targetRaw[row][column];
				}
				if (sumRewardsState == DEFAULT_PREDICTION_ACTION_SCORE
						|| bestColumn == DEFAULT_PREDICTION_ACTION_SCORE) {
					int indexToDelete = row - rowsDeleted;
					outputArr = ArrayUtils.remove(outputArr, indexToDelete);
					rowsDeleted++;
				}
			}
			logger.info("input {} rows -> output {} rows", inputWithTarget.length, outputArr.length);
		}
		return outputArr;
	}


}
