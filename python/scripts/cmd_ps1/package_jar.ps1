$startTime = Get-Date

#set current dir in variable
$currentDir = (Get-Location).Path

cd ../../../java
git pull

cd parent_pom
mvn install -T1C "-DskipTests=true" "-Dmaven.javadoc.skip=true" "-Dmaven.source.skip=true"
cd ../common
mvn install -T1C "-DskipTests=true" "-Dmaven.javadoc.skip=true" "-Dmaven.source.skip=true"
cd ../algorithmic_trading_framework
mvn install -T1C "-DskipTests=true" "-Dmaven.javadoc.skip=true" "-Dmaven.source.skip=true"
cd ../trading_algorithms
mvn install -T1C "-DskipTests=true" "-Dmaven.javadoc.skip=true" "-Dmaven.source.skip=true"
cd ../backtest_engine
mvn install -T1C "-DskipTests=true" "-Dmaven.javadoc.skip=true" "-Dmaven.source.skip=true"
cd ../executables
mvn install package -T1C "-DskipTests=true" "-Dmaven.javadoc.skip=true" "-Dmaven.source.skip=true"

$endTime = Get-Date
$duration = $endTime - $startTime
Write-Host "Total execution time: $($duration.ToString('hh\:mm\:ss'))" -ForegroundColor Green
