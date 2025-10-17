cd market_making_fw
git pull
cd ..
cd /home/tradeasystems/market_making_fw/java/executables/AlgoTradingZeroMq
mvn install package -Dmaven.test.skip=true
cp -rf /home/tradeasystems/market_making_fw/java/executables/AlgoTradingZeroMq /home/tradeasystems/AlgoTradingZeroMq
cp -f /home/tradeasystems/market_making_fw/java/executables/AlgoTradingZeroMq/target/AlgoTradingZeroMq.jar /home/tradeasystems/AlgoTradingZeroMq/AlgoTradingZeroMq.jar

