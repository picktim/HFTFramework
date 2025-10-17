cd market_making_fw
git pull
cd ..
cd /home/tradeasystems/market_making_fw/java
mvn install package -Dmaven.test.skip=true
cd /home/tradeasystems/market_making_fw/java/executables/XChangeEngine
mvn install package -Dmaven.test.skip=true
cp -rf /home/tradeasystems/market_making_fw/java/executables/XChangeEngine /home/tradeasystems/XChangeEngine
cp -f /home/tradeasystems/market_making_fw/java/executables/XChangeEngine/target/XChangeEngine.jar /home/tradeasystems/XChangeEngine/XChangeEngine.jar
cp -f /home/tradeasystems/market_making_fw/python_lambda/scripts/csv_to_parquet.py /home/tradeasystems/XChangeEngine/csv_to_parquet.py
