package com.lambda.investing.data_manager;

import com.lambda.investing.model.CSVable;
import tech.tablesaw.api.Table;

import java.util.List;

public interface DataManager {

	/***
	 *
	 * @param filepath parquet file to read
	 * @param objectType kind of object
	 * @return Table type of data
	 * @param <T> t
	 * @throws Exception error
	 */
	<T extends CSVable> Table getData(String filepath, Class<T> objectType) throws Exception;

	/***
	 *
	 * @param objectList List items to transform to table
	 * @param objectType kind of object to transform
	 * @param filepath destiny
	 * @return true if success
	 * @param <T> t
	 */
	<T extends CSVable> boolean saveData(List<T> objectList, Class<T> objectType, String filepath);

}
