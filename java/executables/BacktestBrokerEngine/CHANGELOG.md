# Changelog

## Unreleased
* upload to central
* upload to central
* working-directory: ./java
* ignore unresolved
* update build plugins
* update build plugins
* update build plugins
* add token
* add token
* java doc fix
* java doc fix
* [maven-release-plugin] prepare for next development iteration

## parent_parent_pom-1.0.4
* [maven-release-plugin] prepare release parent_parent_pom-1.0.4
* java doc fix
* java doc fix
* java doc fix
* java doc fix
* java doc fix
* [maven-release-plugin] prepare for next development iteration

## parent_parent_pom-1.0.3
* [maven-release-plugin] prepare release parent_parent_pom-1.0.3
* java doc fix
* [maven-release-plugin] prepare for next development iteration

## parent_parent_pom-1.0.2
* [maven-release-plugin] prepare release parent_parent_pom-1.0.2
* fix action versioning
* fix action versioning
* fix action versioning
* run it on root pom
* skip deploy private
* change package to deploy to maven central
* version 1.0.2-SNAPSHOT update for private too
* version 1.0.2-SNAPSHOT update for private too
* version 1.0.2-SNAPSHOT update
* tagNameFormat with version
* [maven-release-plugin] prepare for next development iteration

## parent_pom-1.0.0
* [maven-release-plugin] prepare release parent_pom-1.0.0
* push local modifications
* skip tests actions
* central-publishing-maven-plugin
* version upgrade action and deploy nexus
* version upgrade action and deploy nexus
* single place versioning
* refactoring private_trading_algorithms module+GUI splitted
* transformers inside
* transformers inside
* refactoring private_trading_algorithms module+GUI splitted
* fix tests+ pom compile
* refactoring private_trading_algorithms module+GUI splitted
* fix tests
* commenting test wrong
* creation private_trading_module and set AlgorithmProvider for AlgorithmCreationUtils
* remove sonar example
* add sonar binaries folder
* sonar properties to java_test
* sonar properties to root
* remove it
* add sonar api
* remove old sonar workflows
* include sonar in schedule workflows
* change sonar actions
* add sonar properties
* Merge remote-tracking branch 'origin/master'
* Create sonar_python.yml
* Create sonar_java.yml
* sonar organization maven
* add more kraken instruments
* fix test
* fix test
* studying half life mean reversion
* rollback to suffix f
* rollback to suffix f
* avoid residuals to eurusd
* add more timeframes minutes
* get_candles_time use generate_candle_time_legacy
* including candle_generation using polars
* including candle_generation using polars
* including candle_generation using polars
* population parallelize as min to len nodes_list
* population parallelize as min to len nodes_list
* fx_factors update
* fx_factors update
* fx_factors update
* update priceTicks
* refactor calculateSpreadAvellaneda
* is aggressor print logs
* is aggressor print logs
* is aggressor print logs
* show in ui agg
* logs bound price
* agressor/agressed stats
* agressor/agressed stats
* fix bug market order
* fix bug askPrice
* .allowed_price_tick_improve_best: 0x7fffffff,  # no limit
* .allowed_price_tick_improve_best: 0x7fffffff,  # no limit
* fix compare_trading_algorithms_test.py
* fix compare_trading_algorithms_test.py
* fix warning finalName
* add warnings for None and empty output in backtest results
* refactor backtest data handling to use where for main instrument filtering
* change market order to be worst price of the other side
* better logs
* list_to_numpy add zero in case of None
* fix execution living market orders
* fix aggressor/aggressed test
* fix aggressor/aggressed match engine prices -> application on fees
* fix aggressor/aggressed match engine prices -> application on fees
* fix aggressor/aggressed match engine prices -> application on fees
* fix match engine error on market orders + REJECT_SELF_TRADES
* update lookforwardBiad strategy with test
* update lookforwardBiad strategy
* update lookforwardBiad strategy
* update lookforwardBiad strategy
* update lookforwardBiad strategy
* update PortfolioManager before candleTickUpdater
* lookForwardBiasAlgorithm
* lookForwardBiasAlgorithm
* lookForwardBiasAlgorithm
* add CandleData to algorithm to download historicals
* move CSVable to root and make Candle CSVable
* same arb
* disable warning per tick
* update quoting notebook
* default values corrected
* setCalculateMeanStdSpread recalculate mean spread+ default values parameters disable kalman
* updating every depth zscore/quoting
* fix gui stat arb
* fix conccurent modification GUI
* fix zscore calculate mean  + fix conccurent modification GUI
* update examples
* include pdf reader_summarizer crewAI
* include pdf reader
* skip flaky test in parameter tuning
* example tickdb tool -> returning string
* remove cuda docs
* fix bug logging
* enhance documentation for Lambda Investing Framework
* getNumberActionColumnsDifferent
* check model shapes or print errors
* check normalizer shapes
* fix default configuration BacktestConfiguration
* fix
* default setup no commisions no delay no search market_trades
* improve print conditions
* fix problem with hedge updates
* fix problem with hedge updates
* Merge remote-tracking branch 'origin/master'
* check action size with SIZE_ARRAY_ACTION
* check action size with SIZE_ARRAY_ACTION
* agentops install
* warning in case of wrong action entries
* first tool for crewai
* first tool for crewai
* include transformers
* include transformers
* include transformers
* include transformers
* include transformers
* remvoe some ollama dependencies - upgrade crewai and crewai tools
* script for unix included
* script for unix included
* number of trades email
* warning in case of wrong entries
* factors in processes in parallel
* numberTrades change to column + remove some groups/resampliing  on scoring,already done
* updating requirements for crewai
* updating requirements for crewai
* update notebook to multi in threads
* fix skip test
* test_batch in parallel working
* fix plotting results
* fix test_batch output
* rollback to joblib pathos not returning output
* refactor subprocess options for Jupyter compatibility
* ensureColumnTypeConsistency
* add jupyter requirements
* add uv requirements project
* markdown llm documentation
* change order RL onDepthUpdate
* alpha_avellaneda mock testing
* multiprocess default using pathos
* multiprocess default using pathos
* multiprocess default using pathos
* fix Algorithm to save static variables + test batch ensure to pass important stuff too+example backtest launched changed
* change to use joblib by default
* remove host
* jupyter timeout same as normal
* import datetime fix
* add time to prints
* add time to prints
* parallelization using processes but joblib
* reducing memory allocation
* pickeable backtest_launcher
* Pathos multiprocessing
* update mcp requirements
* mcp test
* reducing memory allocation
* goback to 6g max
* fix yahoo imports
* fix: clear tableList to free memory
* fix: add TestNG dependency to pom.xml for testing support
* fix: add null and empty checks for lastClOrdIdsSent in QuoteManager
* fix: adjust thread count logic to handle negative values and enforce limits
* fix: adjust thread count logic to handle negative values and enforce limits
* fix: adjust thread count calculation to ensure minimum and maximum limits
* fix: update joblib processing preference from threads to processes
* fix: simplify forward fill method in equity curve calculation
* fix: improve logging format for configuration output
* refactor: replace ThreadFactoryBuilder with LambdaThreadFactory for thread creation
* more kraken instruments
* fix yahoo imports
* fix transformation string to datetime
* fix backtest_df_indexed error
* fix possible errors
* fix possible errors
* remove futureWarning
* notebook to test algo outputs with market
* fix bug
* GET_AFFINITY_CPUS to affinity exceptions
* fix ConstantSpread stops
* fix some warnings and renaming tests
* fix some warnings and renaming tests
* remove trace logs
* fix concurrent modification
* remove log transactions
* fix std calculations and checking parameters
* fix allignCandles
* fix plot returns
* fix concurrent modifications
* warning affinity log it
* fix error concurrentModification
* fix error concurrentModification
* catch AffinityLock thread and print/log them in linux
* catch AffinityLock thread and print/log them
* execution report check only my instrument logic
* testing stat arb results
* remove some trace logs on zscore caculations
* remove some trace logs on zscore caculations
* percent returns
* MidPnlReturn as custom column and calculated pnl as output
* remove log
* add lastDepth Nan if lastDepth is not valid
* add lastDepth on Histricals if depth is not complete
* reward RL based on PortfolioManager
* add market data to save data
* add market data to save data
* change method parse date
* remove test
* StatArb remove reference
* fix raw df
* custom columns logic added
* fix position plot
* fix sharpe calculation
* clean method
* backtest output resampled and grouped properly + raw output able
* PORTFOLIO_MANAGER_UPDATE_FREQUENCY_MS
* fix OrderMatchEngineTest
* reference to java get_hedge_ratio
* reference to python
* fix hedger think
* clean null levels from the middle too
* Depth isDefaultValue method
* Depth isDefaultValue method
* notify depth after order request , remove me and ignore duplicated depths , fix DepthTableModel gui + fix candle manager time management
* notify depth after order request , remove me and ignore duplicated depths , fix DepthTableModel gui + fix candle manager time management
* notify depth after order request , remove me and ignore duplicated depths , fix DepthTableModel gui + fix candle manager time management
* notify depth after order request , remove me and ignore duplicated depths , fix DepthTableModel gui + fix candle manager time mangement
* fix state synchronization
* portfolio results get everything
* thread safe ObjectPool
* fix xchange connector to connect to binance too and update library
* PORTFOLIO_MANAGER_UPDATE_FREQUENCY_MS to get results every 1 second
* PORTFOLIO_MANAGER_UPDATE_FREQUENCY_MS to get results every 5 seconds
* update examples console
* example Alpha AS
* adapting RL to Hedging
* Hedge single time RL strategies
* fix ConstantSpread
* fix ObjectPool is not increasing indefinitely
* fix ObjectPool is not increasing indefinitely
* fix DepthPool using
* fix test
* fix test
* fix test
* fix test
* change Depth Double to double and add primitive lists
* change Depth Double to double and add primitive lists
* test both sides trades market refresh
* using affinity in backtest but not better results
* using affinity in backtest but not better results
* add affinity to dependencies
* algos logs async
* PortfolioSnapshot and listeners to PrivateStates
* PnlSnapshot refactoring to be used in singleInstrument
* States filtering for my instrument only
* fix notebook
* fix notebook
* fix notebook
* fix notebook
* fix notebook
* fix notebook
* fix notebook
* fixing hedging on RL
* fix notebook
* RL algorithms remove hedger parent
* better print error kValues
* fix notebook
* another change in cell benchmark before
* change default level
* fix statistics
* ignor properties in notebooks
* remove probable error
* remove probable error
* adapt to hedge and parameters
* adapt to hedge and parameters
* mkdirs creating file
* testing ObjectPool
* add junit tests basic units for ObjectPool
* kalman filter check
* fix zscore periods
* new parameters
* check empty string
* remove
* generic getSyntheticInstrumentPath
* new parameters
* fixing some hedging for market making
* fixing some hedging for market making
* remove log because already in quoteSideManager
* remove log because already in hedger
* Simplify hedging wth SyntheticInstrumentFile and better logs
* market making gui for hedging too
* same factory method + ObjectPool
* Depth and Trade from factory method
* Depth and Trade from factory method
* fix hedge ratio
* fix hedge ratio
* fix double active ER
* get_hedge_ratio
* fix hedge on AS
* add hedger ti SingleInstrumentAlgorithm + fix HedgeRatio in LinearRegressionHedgeManager
* minQty into Zscore candles
* spread mid from level+qty
* minDepthQty + getBidPriceLevel
* minDepthQty + getBidPriceLevel
* commit notebooks
* print tables rebalance before
* more logs explaining errors quote
* explain period parameter
* explain period parameter
* getSummary kalman
* PYTHON_N_JOBS and JAVA_N_JOBS
* PYTHON_N_JOBS and JAVA_N_JOBS
* update notebooks to send email after java backtest
* update notebooks to send email after java backtest
* send email backtest
* send email backtest
* change examples with btcusdt
* orderRequest add referenceTimestamp + check on latency
* fix market trades if qty<0 + test
* fix StatArb no exist now...
* update yfinance + dependencies change api
* fix market orders aggressive no liquidity
* rollback
* add next day candle
* optimize memory
* optimize memory
* lastqty 0 remove log
* update priceTicks new instruments + check Statistical arbitrage
* fix starting with Depth
* instrumentsCandleManualStarted reformat
* remove ConcurrentMap,not needed
* remove ConcurrentMap,not needed
* testGestIndex
* getIndex with delta for Dates
* better align method candles
* force aligning candles
* update example_StatisticalArbitrageQuotingCrypto.json
* update example_StatisticalArbitrageQuotingCrypto.json
* recursive_entry_quantity_factor+recursive_entry_zscore_delta
* Backtest directly quoting + recursiveEntryZscoreDelta + recursiveEntryQuantityFactor
* update gui fix live trading
* jpy ticks change
* fix hedging errors
* keyToInstrument initialize
* rejected on replaces are not inactive
* fix MetatraderTradingEngine close positions
* add properties for script
* add properties for script
* add properties for script
* set lambda logs bt
* interactive brokers remove persist
* interactive brokers algo test
* interactive brokers algo test
* fix interactive brokers
* better logs SlippageStatistics
* add sharpe to legend benchmarks
* add sharpe to legend benchmarks
* add sharpe to legend benchmarks
* fix degiro portfolio script
* better logs SlippageStatistics
* better logs SlippageStatistics
* Slippage statistics in priceTicks
* Slippage statistics in priceTicks
* Slippage statistics take into account side
* fix update depth
* fix update depth
* Slippage Statistics
* Slippage Statistics
* LatencyStatistics and separate statistics file live trading
* LatencyStatistics and separate statistics file live trading
* LatencyStatistics and separate statistics file live trading
* live trading stats by instrument
* add statistics on market data publishers
* market making fix mt5
* trades cant be false by input
* fix json decode
* fix json decode
* fix json decode
* fix live trading StatArb getSyntheticInstrumentPath
* _positions
* manually update candles on Live trading
* fix live trading
* fix live trading
* fix live trading
* fix live trading
* fix live trading
* add more cyptos
* add more cyptos
* fix negative position
* fix negative position
* recursiveEntry logic
* "recursiveEntry" parameter
* "recursiveEntry" parameter
* using triple instruments statArb quoting
* using triple instruments statArb quoting
* newBidCrossSpread only if bidQty >0
* calculateMeanStdSpread
* calculateMeanStdSpread
* uniqueDate getLast fix
* uniqueDate getLast fix
* uniqueDate getLast fix
* updateCandleCalculations increase time to onsider , and Last unique
* CALCULATE_RESIDUAL_MEAN_STD if fase use json data
* CALCULATE_RESIDUAL_MEAN_STD if fase use json data
* get last candle price from candles
* zscore instrumentDepthMap to get
* zscore cleaning them before zscore calculations
* zscore cleaning them before zscore calculations
* rollback example
* rollback example
* crypto example to pepe
* StatArb quoting beta and spread fix error
* kalman_filter_period disable by default
* StatArb quoting beta and spread fix error
* StatArb quoting beta and spread fix error
* paramter tuning quoting fix
* StatArb quoting beta and spread fix error
* StatArb quoting beta and spread fix error
* update  fx strategies
* beta hedge invert in python and java
* logger crossing prices mid
* logger crossing prices mid
* updaeting alligned zscores
* updaeting alligned zscores
* kalmanFilterPeriod parameter + fix price adjustment
* updaeting alligned zscores
* updaeting alligned zscores
* updaeting alligned zscores
* fix kalman spread errors
* fix quote bid ask mm + kalman error
* timesList for bid and ask too
* kalmanFilterPeriod parameter + fix price adjustment
* clarify minPeriod and period
* better logs analysis zscore
* exit with position quantity
* logs on trade
* some fixes strategy with returns
* some fixes strategy with returns
* some fixes strategy with returns
* some fixes strategy with returns
* small fixes to get last candlePrice + getPosition using synthetic ones
* use mid to calculate getPrice
* thinking about exit quoting
* first kalman filter logic quoting
* first kalman filter logic quoting
* kalmanFilterPeriod parameter + fix price adjustment
* kalmanFilterPeriod parameter + fix price adjustment
* first kalman filter logic quoting
* confirm orders with key
* confirm orders with key
* fix script rebalance_portfolio_dgiro.py
* fix closePosition
* lastTimeoutSentTime update
* maxWorstTicks
* maxWorstTicks and close endOfBacktest day
* maxWorstTicks
* timeout fix bug
* timeout exit position
* hitSecondsOff add
* hit_seconds_off include in python
* max_through_mid_ticks include in python
* max_through_mid_ticks include in python
* maxThroughMidTicks add
* fix jumps bid
* calculating zscore price for returns
* calculating zscore price for returns
* calculating zscore price for returns
* USE_BID_ASK is not final to change it from quoting
* changing fx to use returns
* optuna version change
* optuna version change
* 2fa degiro enable
* 2fa degiro enable
* start Arb quoting is quoting and hedging
* start Arb quoting is quoting and hedging
* starting to think in StartArbQuoting algorithm
* configuring market and trade engine for bybit but some subiscriptions are not working yet ...
* configuring market and trade engine for bybit
* add bybit market
* add bybit market
* update xchange version and added bybit connector but not working yet
* fix apply commissions and spreads logprices
* sta arb fx working
* fix reduce memory usage
* logprices synth price
* date_time as int
* date_time as int
* StatArbParameters.regression_price_type:regression_price_type
* update test crypto notebook
* update crypto example
* update notebook FX
* adapt to be same as std in python
* candles close prices with the same as in python
* test comparing candles generation in both methods
* remove some crypto instruments
* undo error added
* fix backtest plot
* candles take closing time!
* sort index before saving
* fix if for residuals calculation1
* etf into darwinex script update
* etf into darwinex script update
* remove warning+ fix errors
* remove warning+ fix errors
* remove warning
* fix generate candles script
* fix backtest shift 1
* fix get candles from 1 unit
* remove some crypto instruments
* remove some crypto instruments
* less candles
* less candles
* generate candles from one second/minute
* install py-clob-client
* install py-clob-client
* update notebooks
* update fx parameters
* fix bug regression_price_type
* logic instrumentCandles LogPrices ZScore
* logic instrumentCandles LogPrices ZScore
* logic instrumentCandles LogPrices ZScore
* remove       "regressionPriceType": "Returns"
* remove parameter       "regressionPriceType": "Returns"
* only one RegressionPriceType
* log prices
* update example stat arb forex
* AlgorithmObserver notify custom with timestamp
* fix returns on lastresidual from depth
* fix gui
* total fees plot show
* update darwinex instruments
* total fees plot show
* zscoreEntry/exit
* zscoreEntry/exit
* zscore reaching observer
* Statistical arbitrage depths tabs and midprices fix
* plotting two midprices
* GUI for statArb empty
* test_get_backtest_df_compare_java
* get last residual using it
* update darwinex to update candles
* fx example like python test
* residuals calculation mean/std on candles only
* residuals calculation mean/std on candles only
* update darwinex to update candles
* aligning candles
* split CandleFromTickUpdater
* set index datetime
* print exception
* onlyCandleOperateSynchronized
* fix unhashable type list
* simplify notify candles not wrking like python yet
* ready to compare with python
* check dates loadPathMemory backtest
* check dates loadPathMemory backtest
* fix unhashable type list
* add fillna0
* tickdb Factors crypto forex
* fix bug
* middle of the day startup
* add location of candle index in case middle of the day backtest
* synchronize time_candle_publisher with mlfinlab candles /historical
* fix return candles!
* fix return candles!
* fix minutes
* fix minutes
* stat arb instrument transform to minutes
* splitted pyarrow method
* splitted pyarrow method
* show more errors manual
* adding more minute candles generation
* fx factors moved
* fx factors moved
* crypto factors moved
* fix stat arb  for FX
* fix stat arb  for FX
* fix stat arb  for FX
* batch test , change number
* batch test , change number
* refactoring stat_arb_instrument
* adapt discounts to returns
* logs generate candles better
* update forex instrument returns
* get Map fix try cathes
* ZScore calcualting returns and ffill on zeros
* fix json malformed
* print
* RegressionPriceType property
* RegressionPriceType property
* period in syntheticInstrument
* regressionPriceType parameter in json
* avoid error cleaning column
* test_size and period in results
* test_size and period in results
* test_size and period in results
* test size can be changed get_pair_summaries
* ffill stat arb other columns
* action ffill
* fix float32 error in json dumps
* change default CANDLES_BATCH_SIZE to 10000
* regenerate candles and change prints
* reduce memory usage after rading depth tick
* 5Bdays
* csv to parquet using repo script
* traceback csv to parquet
* traceback csv to parquet
* traceback csv to parquet
* reduce_memory_usage and CACHE_DISABLED os environment
* reduce_memory_usage and CACHE_DISABLED os environment
* csv to parquet fix error
* fix log print message
* fix candle generation
* strange changes
* round price logs marketBid marketAsk
* round price logs marketBid marketAsk
* kill all java
* timeout longer
* update notebooks to backtest python in parallel
* update notebooks
* update script
* update script
* update script
* update script
* skip test
* update example script crypto
* update script
* splitted into 6 script
* less calculations zscores
* skip sometimes not connecting
* generate candles splitted in 3
* generate candles splitted in 3
* refactor calculation ZScore only one per update
* plot zscore mid
* del depth_df to free memory
* remo gc collect
* reduce candle generation rows per batch+float32
* reduce candle generation rows per batch+float32
* reduce candle generation rows per batch+float32
* gc e
* refactor Candles Manager ZScore
* refactor Candles Manager ZScore
* refactor Candles Manager ZScore
* change color ,same as graph
* DEFAULT_CANDLES_NUM_UNITS
* update examples stat arb with default candles generated
* generate_candles script
* generate_candles script
* generate_candles script
* generate_candles script
* batch_test method in notebooks
* batch_test method in notebooks
* batch_test method
* add MS_TO_NEXT_UPDATE_COL to 1 to table trade
* remove limit notebook
* fix time to next update MS
* move kraken to better commissions
* time to next update on loading Depth directly
* progress bar in console for jupyter
* best candles save dict
* remove maven profiler
* update instrument parameters before backtests
* notebooks clean
* fix backtest entry exits by candles
* entry rules basic
* improve legibility some minor fixes
* backtest_df returns prices instead of returns in df
* backtest_df returns prices instead of returns in df
* ollama update
* main to test
* some fixes in stat arb strategy and backtest like preparing results as in notebook
* some fixes in stat arb strategy and backtest like preparing results as in notebook
* disable searchMatchMarketTrades Already Synchronizing in PersistorMarketDataConnector InstrumentCache
* better plot statistics trradeSync
* fix kraken publisher provider
* fix kraken publisher provider
* fix kraken publisher provider
* fix kraken publisher provider
* fix kraken publisher provider
* InstrumentCache synchronize Trades directly
* InstrumentCache synchronize Trades directly
* add pom plugin for profiling compilation
* multithread build
* fix test
* change properties fx
* OrderMatchEngine absolute for fx
* getTimeToNextUpdate by instrument
* TimeCandleManager to synch with candles in python
* commenting logs
* receiving trades
* testing more assets in IB
* fix degiro api
* migrate to fastParquet2
* update version json serializers
* update version json serializers
* update version json serializers
* update version json serializers
* adapt JSON transformations on a single function
* test complete
* trading engine sending/receiving ER
* receiving market data InteractiveBrokersMarketDataPublisher and test working
* Interactive brokers receiving market data
* Interactive brokers first version connection
* trying to connect market data
* fix disconnection trace
* add instruments subscription in ib market data publisher
* InteractiveBrokersEngine added . TODO testing
* ignore test
* IB trading engine schema done
* IB market data connector done
* remove connector settings from broker instance
* clean trading engine models from market data connector + clean instruments and add Ib instruments
* instance connector and replier
* instance is done , md not receiving
* upload interactiveBrokers api and samples
* fix OrderMatchEngine
* reducing time toString
* add log warning trade with lower timestampt
* improved OrdersMatchEngine , remove synchronized methods
* improved orderbook performance copilot + test
* add open interpreter to requirements
* add ollama python library
* add ollama python library
* fix cmap import
* fix cmap import
* cvxpy min version for optimizations
* remove dash as a requirement
* first llm iteration
* Merge remote-tracking branch 'origin/master'
* error in instrument
* Merge pull request #1 from javifalces/master_copy
  * Master copy
* change script forex statarb_daily_script.py
* clean complete notebooks
* tick_db and candles in float 32 to reduce memory and time processing
* update notebooks statArb study
* rebalancing only sell remove
* most mean rever
* most mean rever
* add turkish lyra
* adding ,"EURMXN","EURSGD"
* update notebook to launch java backtest too
* remove engle granger
* most mean rever
* most mean rever
* most mean rever
* update script darwinex candles seconds
* fx stat arb betas
* most mean rever
* most mean rever
* non discard is_valid_1_std
* fix ga parameter tuning and imports python
* fix get columns stat arb
* fix backtest zscores
* print backtest logs
* message about qty is printed
* reading in KB string
* better logs size parquet
* fix hadoop home logs
* metatrader trading engine server non server switch for orders
* metatrader trading engine server non server switch for orders
* include more instruments
* metatrader trading engine server non server switch for orders
* rollback instruments metatrader + add in darwinex instruments
* log SyntheticInstrument json
* fix bug
* add new insturments mt
* comestic changes and new mt instruments
* update trade.mqh
* missing fine tune
* update script statarb daily
* timeout sides
* update notebook with backtest
* update script stat arb
* statarb daily script updates more instruments automatic
* working hedging netting in mt5
* metatrader fix test
* better logs for warning cleaning Maps orders
* updating examples backtest stat Arb
* scripts ps1 copy
* save script
* scripts ps1 copy
* scripts ps1 copy
* script generation statarb strategy
* script generation statarb strategy
* script generation statarb strategy
* tests are working
* fix test metatrader netting stat arb ...etc
* timeout stat arb by halflife seconds and halfLifeSecondsTimeoutFactor
* print entry/exit zscore
* print error warning
* trades plot
* fixing abs to recognize odd lots
* log when cleaning position MetatraderTradingEngine
* update prints
* metatrader trading engine
* timeout stat arb by halflife seconds and halfLifeSecondsTimeoutFactor
* fix null pointer
* ignore metatrader test
* new parameters in strategy python
* euraud strategy
* avoid error backtest initially
* timeout stat arb by halflife seconds and halfLifeSecondsTimeoutFactor
* using conventional zscore
* fill candles data
* update core to download data and save it to read it
* update core to download data and save it to read it
* update core to download data and save it to read it
* persistance stat arb instrument file
* more instruments to subscribed kraken
* timeout stat arb by halflife seconds and halfLifeSecondsTimeoutFactor
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* calculation commission into spread
* apply spreads fees
* adding function to calculate commissions in spread / price
* fix null pointer when no market data complete
* fix fx backtest
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* onPostion Fix
* metatrader logs
* set logs path
* print we are ready
* less logs onOpenPosition
* change to getZScore
* fix json to map into crypto
* change log info
* remove my orders metatrader error
* change env to lambda2
* fix live trading
* fix start algo trading
* script update betas
* positive backtest with fees!
* fix with prices
* catch errors analyzing
* catch errors analyzing
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* regression returns disable by default
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* log it with spread costs
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* log zscore
* fix zscore
* clean old logs
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* discountMarketSpread rename
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* USE_BID_ASK to conditional use bidAsk mp candles
* aplying market spread to calculations
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* consider cash deposits for daily PNL
* email with deposit in subject
* cleaning pending orders and script sends directly the order
* StatisticalArbitrageAlgorithm is calculating two zscores ,per side
* fair_price module
* moving log synthetic pnl to a separate function
* integrate backtest with other periods
* change notebook and function with more logs in case of error
* cache memory some tick_db functions + extend tests for more than 1 day
* table with groups
* plotting in pct + switch graphs
* moving log synthetic pnl to a separate function
* mulitply lots
* logging midprices pnl
* logging midprices pnl
* matching python and java GetExponentialWeightedMean with ewm + convergence zscore
* stat arb on returns and operate when converging
* aggregation
* mapping dates
* dont drop columns
* aggregation fix
* plot all portfolio pies to see rebalancing
* plot all portfolio pies to see rebalancing
* plot all portfolio pies to see rebalancing
* plot all portfolio pies to see rebalancing
* plot all portfolio pies to see rebalancing
* plot all portfolio pies to see rebalancing
* plot all portfolio pies to see rebalancing
* plot all portfolio pies to see rebalancing
* FROM date static from 2023
* plot all portfolio pies to see rebalancing
* FROM date is 2 years and a half
* email portfolio script
* degiro portfolio send email fix
* plot all portfolio pies to see rebalancing
* fix error halg life with model
* controlling each portfolio live weights
* mean/std spread
* fix half life calculations
* update to new working
* update to new working
* stat arb logging zscore
* stat arb logging zscore
* better logs for stat Arb
* search_match_market_trades is configuration
* searchMatchMarketTrades is BacktestConfiguration
* backtestint stat arb from python
* backtestint stat arb from python
* multiple stat arb forex
* updated to weighted mean zscore
* fix bug num_units
* backtest stat arb in class
* implementing smooth zscore EWM
* fix persistance candles
* get_backtest_df
* stat arb backtest notebook
* multiple stat arb forex
* notebooks plots working
* update parameters periods
* multiple stat arb forex
* update parameters periods
* update scripts
* commit bash scripts
* update parameters periods
* update ignore tests
* fix some entry rules blogic and add to backtest files the stat arb
* fix some entry rules blogic and add to backtest files the stat arb
* multiple cointegration
* fix cointegration testings
* fix with warning same start - end date
* stat arb is sending messages
* fix stat arb notebooks
* fix stat arb refactoring
* update parameters periods
* update parameters periods
* update parameters periods
* add more cointegration tests
* notebook basic strategy
* update parameters periods
* update parameters periods
* update parameters periods
* update parameters periods
* update parameters periods
* update parameters periods
* update parameters periods
* plot pie fix
* plot pie fix
* normalizing weights rebalance + plot pie portfolio
* normalizing weights rebalance + plot pie portfolio
* fix cache manager to parquet
* statArbQuoting
* StatArb strategies adapt configuration
* fix rebalance script
* update it
* fix some genetic configurations . review IEVL.MI with degiro
* fix some genetic configurations . review IEVL.MI with degiro
* fix some genetic configurations . review IEVL.MI with degiro
* update spy degiro name + confirmation yes/no message + update stat arb java backtest
* ppo as example
* fix example
* stat arb summary instrument
* stat arb summary instrument
* pairs summary results
* image
* cuda install md
* fix time candles returns
* CandleType + CandleTimeResolution +GetCandles(type) -> using it in stat_arb +test
* stat_arb rescue
* fix concat columns
* stat_arb rescue test
* stat_arb rescue+change datetime fo same as end_time tickdb
* fix including end date
* fix some warnings/tickdb connector
* fix some warnings/tickdb connector
* fix some warnings/tickdb connector
* fix test residuals
* only for equity
* refactoring regressor
* some changes to avoid errors plotting
* run ser
* residuals is training in increasing window
* replace iteritems + warnings and errors running
* change iteritems by items
* fix test ignoring
* update training notebooks
* update training notebooks
* update training notebooks
* update training notebooks
* update training notebooks
* deprecation warning remove
* deprecation warning remove
* fix append pandas series
* new strategies + update script rebalancing
* etf_portfolio script example
* rebalance_portfolio_base with backtest and df
* plotting backtest returns with ratios box
* plotting backtest returns with ratios box
* backtest plot and mdd dates
* portfolio backtest rebalancer
* etf_portfolio rebalancer add FI portfolio
* etf_portfolio rebalancer
* fixed income first commit
* commenting to run it until creation algorithm
* decision transformer commit
* append dataframe
* append dataframe
* udateing appends
* update df
* update df
* update df
* update df
* fix parallelization pathos
* fix parallelization pathos
* comment numerox
* macro portfolio hrp
* update factor models
* add interactive pandas
* update to etf database binary
* update readmes
* update readmes
* update readmes
* update readmes
* update readmes
* update readmes
* changes in documentation
* update readmes
* update readmes
* update readmes
* update readmes
* update readmes
* add check initialization and more logs
* update readme and examples
* add check initialization is ready trend following
* train test parameter tuning logs
* binary_outputs as RlAlgorithm
* update documentation

## stable_baselines3_working
* private states relative
* remove anomalies
* _create_model change it
* modelsFolder defined
* _launch_train_algorithm after compare_trading_algorithms
* add checkers port in use setting rl_port
* fix continous adaptor for integers
* change side rounding value
* modelsFolder defined
* set a timeout to step STEP_TIMEOUT_MILISECONDS
* check is done in onFinishedIteration
* rounding state/reward
* waitDone timeout
* remove setWaitDone to true on reset
* 5 mins stepp timeout
* check
* reset force not to set setWaitDone
* del check close
* after reset dont restart algorithm
* fix null state exception
* back to tcp communication
* back to tcp communication
* increease timeout
* synchronized get socket
* fix
* logs initiualize
* save model before parameter tuning validation
* parameter_tuning with validation date
* add check initialization and more logs
* TimeoutThread
* installing skfolio
* _invalid_float method reward
* getCurrentStateSafe
* timout force close
* print eval
* validation set less steps
* eval comment
* disable jax by default
* round hidden nodes
* shared arquitecture
* custom policy is working
* customizing nn parameters
* DETERMINISTIC set to true on evaluation/testing
* remove eval when parameter tuning
* eval episodes in env_config
* set_eval_env_config rename
* training set validation if None
* validation not required tensorboard
* training with a validation date out of sample
* fix error parameters as false
* default parameter from static variable
* rl_port+=delta_rl_port
* saving evalCallback
* save EvalCustom best in same path
* save best evalCallback
* SaveModelConfig + EvalCallback saved in best performing algo
* controlling skew zero as no change
* fix futureWarnings sortino calculation
* timeout on reset increase and force close if not possible
* timeou reset 1 min
* add comment on port delta counter set to 2
* _get_eval_callback in training
* TIMEOUT_WAIT_PAUSE_MS max 1 min
* _get_eval_callback in training
* clean_previous_tb parameter in parameter_tuning
* remove start tb log
* log output and remove and comment setExitOnStop
* parameter tuning launch tensorboard
* remove plot training in parameter tuning
* launch_tensorboard disable by default
* launch_tensorboard parameter to disable it in parameter tuning
* print algorithm name with results
* remove print stack error
* optuna default configuration for 1 algorithm per time
* optuna default configuration for 1 algorithm per time
* grtid sampler parameter tuning
* normalize obs by default to 40 obs
* normalize_clip_obs as prameter to normalize states
* fix binary state
* getPArameterInt boolean valid
* fix error self.backtest_launcher.proc None
* add summary of rl iterations/rewards
* truncated and done in case of jar is killed
* print id in market making env
* update template
* reduce algorithm
* reduce algorithm
* reduce algorithm
* reduce algorithm
* training in parallel different algos
* fix update script
* fix update script
* core_model_kwargs argument
* start backtest only after first step received/not in start
* remove use JAX
* remove use JAX
* removed dump filename
* removed dump filename
* dump path in output
* mean_reward_episode statistics
* force close
* notifyEndOfFile remove pauseBacktest
* set discount to zero
* fix warnings new pandas version
* remove vf_coef SAC
* set initialized to false in case of stop backtest
* parameter tuning plotting trainig
* parameter tuning plotting trainig
* fix typo
* study clean_initial_experience
* rl algorithms tensorboard
* rl algorithms tensorboard
* fix print
* delete file error
* delete file error
* delete file error
* import optuna configuration
* include vf and ent coef
* optuna with genetic
* parameter_tuning_training method working multiple
* is_success bool conversion
* parameter_tuning_training first commit
* remove print
* optuna installation for parameter tuning
* add custom_neural_networks to customize arquitecture
* alphaReady for AbstractSideQuoting
* controlling ERFilled when state is not ready
* actions columns in java for continuous
* print_it states and actions
* logs error getMaxIndicator
* SAC fix input arg
* EndBacktestEarlyStopping only if min_iterations<max_episodes
* is_success bool conversion
* print candle types and max period in logs
* is_success mapping
* is_success bool
* fix warning !=
* add DISCOUNT_REWARD_NO_TRADE
* DISCOUNT_REWARD_NO_TRADE configured from DISCOUNT_REWARD_NO_TRADE environment
* remove last stats
* training with zeros pct stats
* transforming reward in float
* infoStepKey renaming +MeanRewardCallback
* adding is_success if totalPnl>0
* evalcallback comment it
* evalcallback comment it
* jax is changeable with a bool
* black it format
* fillna -> ffill
* _configure_core_rl_algorithm in set_parameters too
* avoid killing jar
* update interface plot
* fix alpha avellaneda incoming steps
* stoppers docu
* reset pause method and set only if change
* better pause backtest names between steps
* fix test
* not multiplying by simultaneous
* update python version
* restart
* all are independent of the number of simultaneous proc
* print warning timeout
* all are independent of the number of simultaneous proc
* waitIfPause LockLatch max timeout
* fix isin not found column
* add synchronized cleanEmptyPriceLevels when we are modifying side Treemaps
* update installation for gpu
* update installation for gpu
* fix the tests
* update requirements using jax rl
* update jax version something compatble
* not setting sbx version
* starting to play with ray implementation rl lib
* including version compatible
* updating requirements
* adding example script
* removed register ray
* total_timesteps must be multiplied by number of episodes and simultaneous_algos
* starting to play with ray implementation rl lib
* rl_algorithm depends on configuration get_reinforcement_learning_framework
* change save model
* change params fix
* more refactoring core_rl_algorithm woking stable baselines
* normalizing reset to work in ray
* cum reward plot training
* change name env
* print error json
* move jar is killed right before starting thread
* better logs in killing env
* simplify examples
* better logs in starting up
* ray rllib
* include ray in requirements
* pauseBacktest cleaned
* adding time sleep between backtest is ready and sending start
* reorganizing instancing environment from MarketMakingBacktestEnv
* registering market making backtest env in ray
* cleaning core interfaces , starting with ray core
* ray rl lib training example
* get_it
* set base model in set parameters
* fix printing dqn
* fix get period or default
* early stopping fix
* remove Discount reward no trade
* reduce in both environments
* rename the example script sb3
* removed gymAgentLauncher
* fix trading algorithms import
* callbacks normalized/multiplied by number of processors
* mean result continous adaptor
* mean result continous adaptor
* core_rl_algorithm to try moving to ray
* remove
* market state candles fix ready
* refactoring to use custom Queue TimeSeriesQueue
* training stats
* fix examples crypto
* change example
* cleaning duplicated queueCandlesMicropriceSpread and queueCandlesVPINValues
* normalization sharpe and get results test after env
* remove creation Queue startup method
* replacing queue last values common method changeLastElementQueue+getLastElementQueue
* fixing java dummy agent
* save/load of normaizer if is not used
* rsi around 0
* market states centered in 0
* remove vecenv ,already normalized
* relative mid and qty to previous
* mean result continous adaptor
* adapt to negative number of cpus
* adapt to negative number of cpus
* next multiple
* adapting iterations to factor
* fix error trials
* readding initial time_sleep if in parallel
* readding initial time_sleep if in parallel
* readding initial time_sleep if in parallel
* readding initial time_sleep if in parallel
* get_backtest_df_date_indexed
* fillna in case of no returns with 0
* fix resample
* resampleing pnl to map too
* fix GAConfiguration and resampling equitycurve for sharpe/sortino ratios
* inbcluding candles logic in sideQuoting algorithm
* set best in discretionary strategies
* creating discrete sideQuoting algorithms
* add device RlParameter
* trial errors to3
* fix import
* set state market Ticks Ms
* optional learning rate decrease learning_rate_decrease
* fix DISCOUNT_REWARD_NO_TRADE
* get last mid price avoid null pointer
* add DISCOUNT_REWARD_NO_TRADE and noramlization getCurrentReward to SingleInstrumentRLAlgorithm
* documentation and default paarameters for PPO
* scripts rl to play
* change tensorboard output folder
* fix index TrendFollowing action
* avoid null pointer setChangeSide
* Alpha TrendFollowing fix set action
* Alpha TrendFollowing fix set action
* example_AlphaTrendFollowing.json
* fix examples     "dummyAgent": 1,
* dummyRlAgent done
* update las value candles from depth
* market state updating candles onLadder high low
* change tensorboard output folder
* parameter tuning
* add info of levelToQuotes #1,2,3,4,5 and -1 is market order
* change state_min_market_tick_ms default values
* log discrate state received
* market state relative
* updating states with last mid in close price min and max too
* remove print
* change name actions
* add max timeout
* cleaning
* _stop_backtest orderly
* _stop_backtest orderly
* fix logs parameters prints
* recover test rl_algorithm
* fix rl test + reset wait proc is finished
* change name RSISideQuoting to MeanReversionSideQuoting
* setCandleSideRules with double to be updated from onDepth
* rounding mean prices
* alpha_trend_following launching and fix change_state_type_if_required + _stop_backtest is sending a reset to exit the process
* including reset -> early backtest stop
* first date of year update
* fix ui web
* updating web server portfolio
* cache to TEMP folder
* etf scrapping fix
* 4G per backtest proc
* not closing processes
* start server open external
* portfolio analytics
* portfolio analytics
* install server degiro
* stop_action_on_filled parameter
* update lastStepMillisElapsed in OnFinishedIteration
* change name of thread to reduce logs
* lastStepMillisElapsed is a variable
* isLockedLatch check + first iteration reward set to 0
* setActionReceived false in the locked latch thread
* increase memory
* fix pause RlGym between actions
* seed from parameter
* simplify pauseBacktest and remove bucletTraining
* etf_FI portfolio rebalance
* rebalance portfolio in scripts
* onFinishedIteration and step finished
* better logs for warning
* less memory for java process launcher
* continuous_action_adaptor is dividing by distance
* fix pause backtest as atomicBoolean
* setPause change by pause/resume + remove warning log
* set setActionReceived and unlock in case of repetitive endIterations
* backtest configuration seed too
* fix parallel envs training logs
* fix get reward message
* iteration fix log
* fix iteration finished log
* iterations counter fix
* pause backtest between actions received
* print action on setAction received
* change to atomicInteger iterations
* change to atomicInteger iterations
* fix multiple environments
* remove print infos in done
* remove factor investing logger
* etf portfolios scripts and configuration
* remove factor investing logger
* not print fitness function
* move get_logger to inside functions + fitness function from geneticConfiguration
* mean_centered
* ContinuousActionAdaptor action can be centered around 0.0
* set seed  and change threadName treatment
* fix alpha avellaneda order continuous actions
* fix alpha avellaneda order continuous actions
* update notebooks sample
* more trials startup error
* example training comparer
* change state_type
* update variables
* update variables
* playing with learning rate nn
* playing with learning rate nn
* playing with learning rate nn
* lambda temp path example
* lambda temp path example
* fix _get_train_freq_timedelta target period
* fix _get_train_freq_timedelta target period
* add steps training control + continous state if all integer
* add timestamp to infos
* fix calling getTradesTableAndSave and wrong logs
* change train freq
* change train freq
* upload notebook test mm
* add alphaName to python algorithm ingo
* add dates to get_results_compare
* warning divisor  is 0
* fixing statistically analysis emptty algos
* fix calling getTradesTableAndSave and wrong logs
* add alphaName to python algorithm ingo
* rl algorithm output with algorithm_info
* change DELTA_REWARD false -> cumulative
* change DELTA REWARD to false -> cumulative
* AlgorithmParameters.seed : seed_number,
* compare trading persitance + multi process launch
* compare classes
* joining launcher and compare trading algorithms
* fix imports
* fix imports
* fix imports
* CompareBacktestLauncherTest with parquets
* change variables to alphaAS
* same format logs step
* log midpricePeriodWindow and changeKPeriodSeconds
* set default hours trading to 0-24
* fix initial midpricePeriodWindow
* remove default parameters
* alpha fix parameters
* add check to constant spread
* add more parameters
* using parameters and changing default parameters
* check depth validity before override last midprice
* fix array bug
* avoid suarray if same size
* add midpricePeriodWindow +refactoring default parameters
* addin new parameter midpricePeriodWindow to AS + fix midpriceQueue error
* fix get skew method
* fix get skew method
* catch the skew error
* catch the skew error
* AS refactor skew and add some controls in price array
* remove constant spread logger error
* fix null pointer Depth
* cleaning rl actions and fix test
* test discrete
* fix order actions with set
* fix error duplicated actions
* fix order package
* remove plotting alpha avellaneda
* default parameters copy in constructor
* update gitignore to ignore logs
* change_k_period_seconds_action new default param
* AlphaAvellaneda new action kPeriodSeconds
* getPArameter Array double , error proof
* default parameters RlMarketMaking
* AS fix calculations
* fix alpha actions
* default number decimals to -1 alpha
* defaul parameters AS
* add imports parameters
* AS fix calculations
* refactor some parameters
* refactoring parameters and AS + fix gui for rl algos
* fix backtest test
* change refactoring some names
* fix setting parameters
* seed as int
* change k calculation
* set ui disabled
* change k calculation + remove ui in rl algos
* change k calculation + remove ui in rl algos
* renaming k counters
* seed as int
* remove some logs
* update package to install parent
* AS getPositionScaled depends of getQuantityTick
* fix plotting depth
* fix plotting pnl/position
* clean ParquetMarketDataConnectorPublisher
* using theme for UI dark theme flatlaf
* using theme for UI dark theme
* speed slider for ui
* algoQuotesEnabled to avoid double printing and double statistics in Rl algos + ExecutionReportManager
* remove some logs
* change color plot + more logs early stopping EarlyStoppingScoreEnum
* testing it
* plt show removed after plotting functions
* fix import
* early stopping better logs
* switch order first env then the model
* switch order first env then the model
* timeout error
* score early stopping default is rl_early_stopping_score = "totalPnl"
* change learning rate to discount factor
  * remove train_launcher.py and train input
* parallelized SAC
* parallelized SAC
* timeout fix units
* timeout custom message
* jupyter notebook redirecting console
* jupyter notebook redirecting console
* parameters class keys
* change log
* model.predict with try catch
* model.predict with try catch
* model.predict with try catch
* model.predict with try catch
* model.predict with try catch
* change log
* more statistics total updates
* more statistics total updates
* moved update statistics to on update
* model.predict with try catch
* avoid double trim
* avoid double trim
* save without end of lines
* save without end of lines
* fix isDone after action sent
* fix while cleaning last line separator
* remove empty lines if there are more than one
* persistor remove empty lines
* action when is done already true
* error to logs too!
* USDT currency instruments
* remove lock
* persist.temp_cache.ms to set "periodCheck" more frequent
* fix market state
* period check setter
* save cache for no trades
* rebalance script
* access notebook_lambda.ps1
* fix notebook
* fix notebook
* fix test
* trades format catch null pointer
* improve search trades
* better selection parquets adjusted trades
* remove first characted CacheManager
* faster search trades adjusted
* better logs in cache file + remove copy adjustment trade timestamp
* test in relative OrderMatchEngine
* test in relative OrderMatchEngine
* better logs synchronizing csv
* fix relative backtest and better merging data
* killing the process
* cleaning inputs on train dqn + timout trace
* more prints in merging data files
* avoid concurrent modification error
* more clear errors python
* avoid concurrent modification error
* persistor fix error
* fix data path replace
* cache using strings removing datapath
* change result of backtest
* change result of backtest
* change result of backtest
* backtest FilledReactionNextDepthEnum
* backtest refresh depth relatives
* remove test pnl
* OrderMatchEngine some refactoring + change backtest test
* update scripts start/stop/restart
* renaming colums to fit the rest of arq
* parquet reading changed to tablesaw
* fix reeading
* make it public
* make it public
* make it public
* more test in reading parquets
* deep copy map to avoid concurrent modifictaions
* getter and setter for tests
* testing uuid cache makes sense
* trying single dollar
* environment $$ rollback
* mintely Statistics and reset it
* mintely Statistics and reset it
* avoid log not processed parquets
* less logs stdout
* change log and remove some executables and change name + more scripts
* alpha avellaneda test
* BACKTEST_IS_READY_TIMEOUT_SECONDS seconds to retry or set as false
* testing generic library
* ignore functional test
* test junit backtest AS with simulated data
* remove np.float to float
* change script update wti portfolio
* add more copies portfolios
* Update README.md
* remove readme java
* no retries
* backtest_launcher kill notifier used to detect blocked backtests
* reset message
* timeout 7 minutes in a backtest
* controlling isDone end of backtest
* waitDoneto not exit the backtest if its true
* more traces to get stuck point
* not override train function
* more traces to zeromq connections not step + wrapper training function to stop backtest
* better documentation and logs
* logs launching backtests
* using float 32 with no warning lower casting
* not blocking training
* continous without warning+initial sleep jar
* verbose training as static variable
* gmt for backtesting + remove lazy pirate
* rollback to replier
* read cache message print
* checking adjust timestamp + mean adjusted ms
* cache merged and adjusted trades parquet
* java gui
* removing dependencies
* parameters into gui + maven compilation gui
* fix api
* fix api connection
* trying to cache ParquetFile -> TODO serializable Row
* only enable kraken
* discount one bDay reference day
* refactoring ZeroMq Url with protocol
* closing env
* disconnect method
* fix bud with socket close
* add del
* all zeromq connectors destroy socket
* destroy the context in del
* resetting connector eah bactest started with timeout
* SaveEndBacktestIterationCallback refactoring
* solved unlock in stop strategy
* initial_sleep_seconds removed to use synchronbization message
* checkTimeElapsedNoEntry only when state is ready
* customizing initial delay from initialSleepSeconds parameter
* start backtest message to avoid not sync problems start
* better
* fix floatting
* check errors
* WARNING refactoring + early stopping implementation train dqn
* more logs and fix some problems with output df
* cleaning deprecated algorithms DQN strategies
* update imports RL config for notebook
* cleaning some dependencies rl4j
* initialize dumpRows in constructor
* update threadly version
* to trading algorithms
* threadly add dependencny
* candle ConcurrentHashMap
* bucle run training RL disabled by default TRAIN_BUCLE_RUN
* configuration search trades max ms
* fix create Depth
* cache enable/disable parquet + fix trades not found
* fix adjusted not found trades
* remove log warning on not find trade
* from date replace hour/minutes to zero
* search in same instrument
* update xchange version
* move repositories
* searching trades backtest synch with depth
* fix compilation
* fix double registers
* gui looks better
* faster updates
* last trades
* faster update in parallel
* resize ui + portfolio text
* all algo in same tab
* using form form mainMenuGUI
* gui algo using forms
* refactor listener method onUpdateTrade onUpdateClose + gui java shows quoting
  * TODO:faster gui
* test_paste_root_combine_different_depth_path ignore failing test randomly
* plotting is working
* fix exception shown
* start UI from algorithm parameter       "ui": 1
* fix multiThread - single thread similar results
* OrderMatchEngine for algo List
* Depth contains Array of List algorithms List<String>[] bidsAlgorithmInfo, asksAlgorithmInfo
* multi and single in constant spread is the same
* check depth after removing
* check depth after removing
* refactor ArrayUtils to models
* cant to can't logs
* avoid rejections quoting
* avoid self aggressions quoting
* cleaning ourselves depth algorithm
* fix listener
* fix listener
* publich ER in threadpool if required
* refactoring ER from tradeEngine + doc
* setPause using lockLatch + pause strategy in orderRequest
* testing rl algorithm
* ignoring tests that failed
* gym_agent_launcher first test
* trying to set working multiple workers rl
* waiting to be free marketDataProviderIn too
* System.exit(0) end of backtest
* fix period<=1
* working one thread launcher
* comments and add one more horizon filtering
* refactoring states filtering
* filtering states fix refactoring+finish backtest method
* bucleRun with do while to avoid recursion
* fix end of backtest no file detected
* more base models and different action type per + send request without retries

## gymnasium_implementation_v1
* print ordinary in operational time only
* update py
* force Backtest logic
* default to     "candleTypeBusiness": CandleType.mid_time_seconds_threshold,
* testing continous actions works too
* default values to stable baselines values
* testing continous actions works too
* saving print message + plt commands
* not print
* testing bucleRun == isTraining => if not , enable ExitOnStop
* continuous action adaptor persisting and using agent launcher
* continuous action adaptor persisting and using agent launcher
* rescue algorithms
* some refactoring for rl_algorithm classes
* continuous actions work and train
* log changes
* fix plotting
* change to reward dictionary
* resetAlgorithm copy from MarketMaking , reetting stateManager
* reduce time backtest sample
* state to send
* states as zero in case lastState is null
* refactoring fix
* fix mean reversion initial state
* imports add some references
* refactoring fix
* alpha avellaneda is running
* arrays fill zeros in default output
* rl port host backtest starting from parameter
* state manager is ready print
* state manager is ready print
* KO space
* refacotring to start training
* fix again stop command
* renaming abstract classes and moving
* remove reinforcementLearningType from market making
* renaming to alpha_xxx
* change names and refactoring all RL to gym classes Alpha names and DQN is deprecated
* fix stop / doble prints
* refactoring some parameters for summary start stop rl gym
* some refactorings input to train/test rl gym and fixes in messaging zeromq protocol
* set to public method to read rlPort , rlHost
* backtest gym setting host port to parameters
* getRLZeroMqConfiguration can be from parameters algorithm
* tests scripts discrete and continuous
* refactor setLiveEngine only for not backtesting
* DiffReward double
* normalize state columns print
* normalize state prefixes
* continous
* print states java
* continous
* read
* baseModel from json
* base model from parameters
* read
* read
* read
* read
* check instrument null and depth null
* fix null pointer
* cumDayReward fix issue
* refactoring np type
* resetting variables endOfIteration
* print array double
* starting to configure continous actino spaces
* getLastActionString and continous nan checking
* tensorboard log in SAC
* training for continous algorithms too in python
* continous actions in java
* DELTA_REWARD to SingleInstrumentRLAlgorithm and disable it
* plotting training + ReinforcementLearningActionType as param => refactor GetActionValues to SingleInstrumentRLAlgorithm.java
* info as result of training
* base model from contructor
* creating ppo and tensorboard logs training
* sending info
* exit timeout
* commenting some classes and receiving info printing in done
* fix error queue candles
* exit timeout
* sending market data in info
* commenting some classes and receiving info printing in done
* using info dictionary to send backtest status
* better prints waiting ready
* fnishing action
* set parameters after constructor
* exit timeout
* get Instruments get all
* better prints waiting ready
* zeroMq live rl
* zeroMq live rl
* starting states ok live connector
* zeroMq live rl
* setLiveEngine method
* base model constructor
* rsi_dqn is testing
* rsi_dqn is training
* exit timeout
* setExitOnStop
* trying to launch rsi DQN
* states are the same finally
* force change to fx discrete state if instrument isFx
* algotrading can launch independent process gym_agent_launcher
* DQNRSISideQuoting.java
* algotrading can launch independent process gym_agent_launcher
* RL strategies refactoring to stable baseline
* backtesting and playing with different models
* testing and training from same venv , using vectorized
* not close the process in testing im doind frm python
* is training and testing in python
* testing_gym backtest configuration
* testingGym backtest configuration
* no logging factor_investing + training and python testint rl
* gym training enable but disable exit on stop if false
* exit timeout
* trainingGym Backtest configuration field
* playing with other agent algorithms
* TimeService comment further time
* resetting state and timeService
* remove keras2onnx
* remove keras2onnx
* keras2onnx>=1.7.0
* resetting state and timeService
* launching alpha_as
* rl starting to train
* reduce progressbar title
* rl_algorithm is launching rl gymnasium + thinking parallelize + register gym backtest
* avoid stack overflow
* reset abstract state
* done print and change pyython script
* update requirements for gymnasium
* reset abstract state
* resetAlgorithm is reseting stateManager and iterations + log isDone
* error pint address already in use
* update requirements for gymnasium
* move to gymnasium and starting to test training backtest
* normalize test and training
* restarting algorithms same process
* zmq_env only random
* get_context is general
* change end of backtest order to reset and reject orders not cancelling end of backtest
* controlling BACKTEST_BUSY_THREADPOOL_TRESHOLD when senderPool queue is great than 3
* ZeroMQrequesterReplier test
* context general
* lazy pirate working
* context general
* ZeroMqConfiguration.Z_CONTEXT
* move context to contructor
* reset is in done state and before first episode + lazy pirate
* ZeroMqRequester lazy pirate
* discover Thread.onSpinWait() to use instead Thread.Sleep 1 ms + fix Requester context GC
* faster backtest but blocking after some actions
* steps in backtest print when training
* market_making_backtest_env launch gym env and comunicating agent example
* starting to launch rlGym from python
* cleaning java objects created for backtest + pid is a variable now + json parser
* keras2onnx
* test reading onnx model redicting actions
* predicting model output
* finished backtes recognized
* gym_zmq environment framework
* openAi gtm RL training framework
* example of policy RL as main example
* single variable in constructor
* single variable in constructor
* agnostic rl environment manager
* thinking about connection open ai gym to java using ZeroMqRequester
* fix constant to test rebalance_portfolio_base.py
* skip problematic test
* fix constant to test rebalance_portfolio_base.py
* fix constant to test rebalance_portfolio_base.py
* fix constant to test rebalance_portfolio_base.py
* gnore
* fix unittests
* fix unittests
* fix unittests
* add warning in factor all nan + fix xnorm
* add warning in factor all nan + fix xnorm
* xnorm
* xnorm
* remove ts_norm due to look ahead bias
* update imports
* update imports
* add more nodes to forex normalization
* add more nodes to forex normalization
* more nodes for forex candles
* refactoring move folders factor_investing
* rebalancing degiro
* rebalancing automatic degiro
* change from backtest data WTI
* searching symbols degiro from yahoo
* fix test rebalance portfolio
* avoid repeat nodes training
* training again if node already in portfolio
* gc etf
* template notebooks update
* clean repo notebooks + portfolio
* clean repo notebooks + portfolio
* automating trading degiro rebalance portfolio -> run_service
* password to a env variable
* fix resolu
* autoamtic rebalance portfolio
* portfolio rebalance + test
* regenerate midprice candles + test
* fix resolu
* fix resolu
* fix to regenerate factor for next day
* avoid desynchornization candles custom minute
* fix change in elapsed change of minute
* fix update until now candles/factors + chage prints
* matching candle publisher with backtest minutes
* small fix numunits and check folder exist
* adding tensorflo dependencies to machine learning
* more traces , small changes
* removing sessions operators
* no buy positions error filtering
* run service
* increase std
* p
* fix test + logdelta + clockSession
* depth penalty + max depth increased
* subtree mutation fix
* trying so much find a new number , limiting min std
* enable signLog and SignSqrt again
* transformation_node error plot name
* add signsqrt test and config to fx
* fix for negative delta
* logdelta fix gp
* transformation_node error plot name
* parllelization
* reducing output nodes
* better logs warning
* new session transformations for FX + splitted tests
* SPY eur sector+gold+silver
* SPY sector+gold+silver
* SPY sector
* fix test with max depth bigger
* fix test with max depth bigger
* us eur stocks added + refactoring portfolio
* fix when no dd
* add csvs
* data services downloads
* add prev silver and gold to connector
* commit directory
* plot benchmark if exist!
* plot benchmark if exist!
* GLFT implementation
* comments on GLFT
* fix print
* change gp of fx too
* more crossover fix mutation
* normalize probabilities
* change creation input dirs + adapt warning logs
* fix numeric weights
* fix test position in values columns
* change bars per day
* base is not operating instrument warning
* fix hedged
* adding to dict base
* adding base if not found
* remove cloud
* max_dd days
* training period argument
* add Yahoo Hedged Connector to imports
* genetic_configuration_etf_us_sector_market_neutral
* us_market_neutral config
* run_service print broker name
* add comment to change name of portfolio weight
* degiro portfolio table
* is table
* portfolio table doesnt need it
* fix dd when is zero
* fix dd duration to zero
* fix for zero days
* adapt launch.,sh
* get the final portfolio fix
* live portfolio to another package out of scripts
* remove cash filtered portfolios
* live portfolio class to filter different portfolios
* live portfolio class to filter different portfolios
* refactor factors data connectors
* etf_hedged connector to compare against base
* boundaries in constant mutation operation
* random constants checkin numeric before
* test is numeric
* refactoring repeat and test utils
* refactoring repeat and test utils
* Merge remote-tracking branch 'origin/master'
* upgrade tests asserts to assert
* Update python_test.yml
* fix 2 errors tests
* fix paths
* fix path for unix os
* set database path
* fix path
* fix path
* fix path
* Merge remote-tracking branch 'origin/master'
* remove mlfinlab tests
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* fix tests
* skip test
* fix folder dao static folding_input! + tests fixing + skipping some of them
* fix more tests
* fix more tests
* fix tests
* fix pltting
* publisher remove
* fix more tests
* change name config
* fix some tests still work to do
* Merge remote-tracking branch 'origin/master'
* fix some test databases and move folder path in test to use a small ddbb
* fix tests
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update README.md
* Update python_test.yml
* Update python_test.yml
* Merge remote-tracking branch 'origin/master'
* add pytest coverage
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* Update README.md
* Update README.md
* Update README.md
* Update README.md
* Update python_test.yml
* Update python_test.yml
* Update java_test.yml
* Delete codeql.yml
* Update codeql.yml
* Rename codeql to codeql.yml
* Create codeql
* Update python_test.yml
* Update java_test.yml
* Update java_test.yml
* Update python_test.yml
* Update python_test.yml
* Update python_test.yml
* tick
* empty
* Update python_test.yml
* Update python_test.yml
* Update README.md
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update python_test.yml
* Update java_test.yml
* Update README.md
* Create python_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Update java_test.yml
* Delete blank.yml
* Update java_test.yml
* Update java_test.yml
* Create java_test.yml
* remove it bitbucket workflow
* Create blank.yml
* custom candle minute publisher
* rebalance period add , but nothing done yet
* three minute candles test
* connector for minute candles 1-5
* hourly model
* ix bug fillna
* remove commission
* reformat code
* fillna0 in plot
* remove normpath is not working
* commissions added to tickdb returns
* change order
* override is working
* normPath to download candles
* have the same format as before for tick data
* update concat
* normalizing paths
* read candles backup method using pandas
* Override_days_replace option to download it more
* update darwinex tick deprectaed message
* remove eurjpy its too expensive
* time to print is adjusted
* refactor the code + comments
* eur instead of € for prints
* remove ts_cumprod
* prints and set none
* set folding last training as testing
* best node found
* some checks
* lase section training dont need to plot
* refactoring logs
* change logs prints to notebook and add vertical line folds score
* better logs results
* sortino fix fitness calculation+add experiment text
* best print things
* check max number refactoring
* commission
* some fixes and limitations on max numeric node
* 2nd try fix
* fillna population check to recreate it
* max number os a float
* fix bugs randonConstantMutation
* limit to NumericNode to NumericNode.MAX_NUMBER=25
* remove *
* commission
* less prints backtesting
* factor investing algorithms
* is None fix bug
* first version of sniper Execution algorithm with backtest
* catch some errors calculating returns
* fix open fees baacktest in partial close
* add quantityMultiplier for forex and adapt pnl classes to it
* adjust variable fee to forex
* including commissions to fx
* adding argument commission
* add comission configuration
* change input argument commission to commission_price
* some refactor of names
* fix refactoring instruments
* some tests fix
* template notebook
* some renames of run service inputs
* clean something
* add minute ratios to scoring factors
* warning running service on small test set with walkforward
* fix candle publisher open prices
* logging time in UTC
* template for factor investing notebook
* check none
* last_section_training with cv too fold_gen
* constant spread algorithms print results fix
* remove some concurrentHashMaps + add lock to speed up backtests
* testing time to backtest comment it
* partial close detect if change position , if failed -> continue with remaining
* add jmh + more test in MT
* fix last training error on calcualting sharpes
* remove date
* add column date
* candles generation
* filling missing values in candles + verbose to false on generation
* resetting candles each minute fix
* fix candle factor testing and change probabilities and MutationNumbers
* error checking calcualted - publisher ddbb
* testing candle differences on historical database and publisher
* compare generate historical too
* candle to factor publisher comparison is working+refactoring to combine Nodes all
* comment on run method portfolio
* number of folds change to print it right
* test compare run and factors + porfolio get backtest returns score too +some refactorings
* update darwinex is going to update candles and fix some instruments problems
* refactor configurations test + better logs on folder_dao error+start test_run service
* refactor alpha buy sell
* reduce
* normalizing all outputs methods
* returns normalized!
* change to money invest is only buyers and sellers
* big refactor to factor investing to understand better outputs and combinations
* logging candles and factors+node Combine alpha in generate_factor_historical +  candle_to_factor_publisher + logger print_on_console bool
* generate from 1st january historicals
* update script launch.sh
* some configurations changes and CV fixes
* adjust_to_single_asset_exposure
* fix factors sent
* fix candle publisher
* environ to avoid printing LAMBDA_DATA_INITIALIZED
* fix is numeric node
* fix prints factor investing
* logger is going to print on screen
* add logger
* add instruments_de_giro
* commission into configuration
* commission into configuration
* commission into configuration
* genetic configuration fx
* fx factor publisher launcher
* fx factor publisher launcher
* merging same source of fx
* same backtest python - java factor investing
* fx genetic configuration in same place + fx_tick_db_backtest.py
* fix test
* fix test
* add logger on population.py
* logger has to be called to start on constructor logger = get_factor_investing_logger()
* script with logs
* unique logger settings
* better backtest logs
* time to print is adjusted
* update onWeights with timestamp
* Disruptor update change
* generate historical
* fix candle to factor with right weights treatement
* script to generate historical
* fix deprecated method
* fix deprecated method
* include some junit5 dependencies + fix disruptor publisher
* some changes variables and constructors
* simple ordinary test
* Channels on connector
* not create a push connection per publish
* test failing
* fix iteration instruments onPosition
* update position of zero position too!
* auto close opposite trades as soon as recognized
* get posision before every onFactor + requestPosition synchronous algorithm
* fix other case crossing position ==0
* last market price
* fix bug reducing position partial + fine tune tests
* close All fix symbol in comment
* Disruptor draft
* not create a push connection per publish
* Close_Hedged_Positions into service
* mt command fix null pointer
* add closeAll per instrument detection
* fix close position of symbol
* not create a push connection per publish
* fix null pointer side
* not create a push connection per publish
* not create a push connection per publish
* fix closing position partials
* create one socket per port
* metatrader fix + DisruptorConnectorPublisherProvider strcuture+refactoring MTExecutionReport.java
* multithreading on order request
* update java documentation + some small refactor(AlgorithmParameters.java) and warnings
* portfolio
* test for monday with metratrader done
* update positions if empty too
* getPosition can be synchronized on tradingEngine
* metatrader closing positions seems to be working engine
* fix maps
* REQUEST_POSITION_MS 100 secs
* fix maps
* threads synchronizing portfolios
* timeout setter
* getting position thread and cancelling on timeout not executed
* unknow TypeMessage message
* fix closing positions from both sides + testing it
* refactor method on ExecutionReport treat different kinds
* partial fills closing positions seems to work
* info messages ignoring on zeromq_market_data.py
* onPosition print it
* onPosition set position log
* get initial position on start of algorithm from MT
* getting mt position at initial metatrader engine
* fix maps
* fix print console
* some minor fixes on prints and round qty
* fix maps
* close price on partially close
* remove print testing init
* LiveTrading can work without Factor Provider
* factor_investing logs
* lambda logs in folder
* logs into common path defined env variable LAMBDA_LOGS_PATH
* investing FX
* add method to check double ER in case of required
* received ER on trading engine
* fix metatrader test
* sign for expected position
* remove modulation + print both sides
* fix maps
* flush console writeline
* rounding price and quantity
* fix to use previous data
* fix faster implementation
* residuals calculation
* residuals calculation
* its a numpy array
* tick db connector avoid look ahead
* residuals calculation
* training
* bat scripts too
* launcher ps1 normalize
* update scripts and documents to enable it
* print messages on live trading
* better logs on  trading /metatrader engine
* updating instruments map
* checking quantity before sending
* try catch wrong jsons
* add factor type message
* print sum factors
* remove logs verbose on new candles generation files
* fix to have more historical on candles for
* fix residuals calculations
* close price has to be updated every tick
* check all candles take into account business dates
* check all candles take into account business dates
* add factor provider in AlgoTradingZeroMq
* fix issues for live trading
* timestamp 13 digits
* include leverage + quantity Tick into equations
* remove column error from python
* change variable names to avoid errors
* fix maps
* backtesting factors ... fix some issues so much updates
* as long
* similar columns as generated
* generate factor backtest data
* can be df or series
* residuals returns fillna with 0 returns
* controlling generation candles dates
* business dates to cjeck
* regenerate candles if not exist
* adding run_service to date
* todo message
* add cv
* fx playing
* reformat factor backtesting and logs
* checking time to update factors
* backtesting factors
* searching index
* BacktestFactorProvider initial commit , not finished
* get model name
* routing to factorProviders mock or not
* publisher starting
* ticks as a message in candles
* sending candles in batch all instruments
* change dash dirs
* removing LAMBDA_PARQUET_TICK_DB
* publisher starting
* factor publisher persist it
* better logs skip nans
* persisting factors publisher
* market executor is working
* fix notes
* receiving ER and finishing executions
* warnign if instrument not found
* executing and ccehking las prices
* fixing and refactoring executors per instrument
* backtesting factor investing more instruments
* example factor
* update TableSaw and mockIsBacktesting + trace time to read csv
* fix map
* Factor investing mock is done
* mock factor provider
* MarketExecutor done programming + Algo programming heritance of FacatorConnector
* Factor Investing structure strategy
* change slash
* factor topic after model name
* change system path separators
* factor publisher launcher
* factor publisher sample
* publisher starting
* requester candles working
* candle requester in base candle publisher
* last update to live factor connector
* publisher starting
* example of factor print
* remove warnings start_ts_str and end_ts_str if its empty
* we are publishing factor
* livefactor is generating other df
* run configuration add it + starting publisher factr
* factor publisher changing model path
* creating and appending DF to notify it
* factor publisher starting to look good
* factor publisher class
* reducing
* publisher topic message
* new launcher seconds
* rollback to numba
* fast ewma remove numba
* candle publisher listner
* factor publisher starting to program
* fix bugs on candle and send it on change of minute
* fix candle prices wrong
* add await to avoid error
* xchange modify api of binance
* fix degiro api
* transform_dataframe_index_plot for time plotting
* plot x format
* plot x format
* major format
* plot x format
* compare better
* backtest has to maintain weekends for vertical lines
* compare better
* remove weekends pnl nodes
* compare better
* compare better
* compare better
* plt plot
* compare better
* compare better
* remove weekends plots
* plor only in weekends
* folder dao error more descriptive errors
* empty_cache first
* in threads
* df is unique remove
* traceback.print_exc()
* upload to debug on thor
* republishing candles for all instruments
* time candle publisher for all instruments
* candles requester/replier
* rep/req classes done + candle publisher
* compare better
* kPct
* compare better
* compare better
* Gueant model
* import enums of as
* CandlePublisher class
* zeromq publisher and subscriber working
* zeroMQ reading from marketData publisher
* compare better plots
* notebook base to compare mm
* plt.show()
* get_output_test_df by index method
* add check is not none before plotting
* test with different indexes
* comapre trading algorithms plotting
* comparison trading plotting
* first approach to compare trading strategies + test
* playing with default config
* include commissions on example Avellaneda
* include fees by default
* enable CONTROL_NOT_CROSS_MIDPRICE and example
* imports better
* testing results are the same multithread
* fix imports
* import inside
* tick_db_connector fix data
* get_min_fold_training_days in a method
* update it
* fix rebalancing
* fx_tick_db_script generating candles...
* fix bug data
* fix some columns add
* tickDb for factors
* better logs error prediction
* parameters
* fine tuning model with zscore filter
* fix warning multiMarket
* trend predictor example not working
* better plts
* backtest sharpe is half 2015
* plot backtest results on run_service
* better plts
* not a new figure
* plot backtest results
* remove auto axis
* better plts
* plot individual nodes
* better plts
* plotting better
* better plots
* plot with legends
* tf commented
* imports lambda more
* fix issue
* for prediction
* genetic_factor refactoring for portfolio
* live model wti etf
* tf commented
* rollback to binary_crossentropy
* update data + using tensorflow utils
* adapt name
* get_train_data
* etf nodes for world factors change folders db
* get_train_data
* refactoring method training
* refactoring some methods scaler training
* refactoring parameter tuning by side
* something failed getting
* fix exceptin thrown on test strategy
* onnxModel
* errorPrediction print
* more info on error predicting
* some fixes to train df with data
* installation script python 3.7 with onnx
* instrument_pk can be None
* fix generating bug
* modelsFolder defined
* detecting is FX to get discretastate
* set number of decimals
* multimarket creation + round taDiscrete States
* clean dumpData csvs
* adapt input laba
* better entry logs
* fix state creation from FX
* remove all volume related columns for fx state
* DiscreteTAStateFX implmenetation
* parameter_tuning working in parallel
* training depending on side
* fix return output_Test
* minMsCheckTendence
* check with time
* check state has change to predict
* modelsFolder on test
* aplying same to normalizer
* inferring model input and type of nn
* fix modelsFolder warning
* tf2onnx convert function
* y to dataframe
* training values
* not momentum optimization
* back to sigmoid
* fix output layer bug
* generat
* parameter_tuning in parallel removing tqdm
* refactoring nn options
* classification metric
* index model save
* parameter_tuning results
* generat
* fix imports
* return pt
* raise exceltion
* fix imports TrendPredictor
* fix exit options
* classiffication predictor
* PrintArrayListString
* generating models to backtest
* adding inputLabel
* refactoring to float and parallel batter test
* minDeltaPriceTreshold parameter
* parallel processing onnx test
* sequential prediction
* update python
* complete test onnx
* better saving
* test prediction are working nn
* saving onnx model
* onnx keras still not working
* scripts update
* onnx nn predict output 0
* onnx test not working!
* onnx train script test
* add resources files
* test upload
* fix save model
* example same as default python
* min prob tendence
* OnnxNormalized
* predicting using onnx
* trendpredictor is saving onnx models
* addapt applciation sample
* fix some methods to save model
* fix imports
* fix utils + integrate input target data into algorithm
* trend_predictor creation dump data to train models methods
* valid mid for dump
* print number of columns
* import json for notebooks
* add style import
* update README.md
* refactoring parameters
* backtest_analysis tools + dataframe join differents
* update requirements for tickDB
* fix imports
* bitbucket-pipelines.yml edited online with Bitbucket
* bitbucket-pipelines.yml edited online with Bitbucket
* Initial Bitbucket Pipelines configuration
* pom upddate versions
* PrintArrayListString
* print action list the end+refactor List to string
* ga import configurations
* finished Backtest command
* stop backtest between steps
* timestamps resetting+Threadpools shutdowns on reset
* finishedTrainingIteration
* fix filtering states rl4j
* filter states working RL4j
* gpu update installation
* maxSteps fix
* maxSteps fix
* new implementation script
* joblib and pathos
* add dill
* add DELTA_REWARD and disable SAVE_ZERO_REWARDS options
* add private columns
* add private columns
* print right number of columns
* print right number of columns
* add individual states to getFilteredStates
* testing ga
* reorganize tests + ga test done
* import pnl_utils
* more imports
* more imports
* formatting python
* RL4jAlphaAvellanedaStoikov
* adding Rl4J algorithm
* creation add rl4j
* dqn algorithm rl4j
* plot actions
* max steps training is better training iterations
* targetTrainSteps
* max steps training is better training iterations
* dqn algorithm
* plot force training
* synchronizing Ready and reset states
* finished logs steps
* alpha avellaneda training parameters
* add maxSteps finished training
* qLearning minEpsilon is epsilon
* using MDP environment
* update dl4j version ti 1.0.0M1
* update dl4j version ti 1.0.0M1
* restarting states
* reset episode is working
* timeService reset
* dump last reward
* refactoring on initialization and creation class snapshot
* is restarting the new iteration training
* fix delta reward return
* working on last step forced
* is repeating training
* is repeating training
* starting to create a policy
* removed FINISHED state and using a done parameter
* delta reward option
* remove sl4j warning
* rename to discrete Action + passing through step method
* step is notworking now...
* last rl4j updates
* reset states
* training RL4j algorithm
* training is synchronizing
* retrying backtest on training policy + disabple plot historical by default
* refactoring App methods
* fix refactor at least to run AS
* refactor algorithms out of backtest package
* refactor algorithms out of backtest package
* refactor strategies into different packages
* synchornization with countdown
* synchronization with atomic double rewards
* adding log properties
* default is AlphaAvellaneda normal
* change and remove main
* reinforce change package
* refactoring trading algorithms by type
* big refactoring split into trading_añgorithms
* add onnx
* change name of weka4j module+endOfDay+FinishedState
* remove malmo example
* mean reward print zero if not finite
* refactoring reset to resetAlgorithm
* add rl4j examples
* fix removed projects pom
* remove crypto from portfolio
* playinhg with initialization loading memories
* fix missing private columns
* remove folder python old
* private state with pnls + single instruments
* score inf fix bug
* fix test
* marketState privates with pnl columns
* private state with pnls
* asymmetric_dampened_pnl_to_map
* asymmetric_dampened_pnl_to_map
* pnl to map as ScoreEnum+private states offer
* pnl to map
* remove score as state on filter + add single on filtered
* update on trades also the timestamp
* create individual state
* adding indivual states minutes_to_finish
* including on private states
* including MarketState column minutesToFinish
* prototype of minutes to finished on market state
* hiddenSizeNodesMultiplier
* hiddenSizeNodesMultiplier
* hiddenSizeNodesMultiplier to DQNAbstractSideQuoting
* hiddenSizeNodesMultiplier as parameter
* fix SideQuoting
* PHD_THESIS on alphaAvellaneda
* less min reward treshold 1e-11
* stopActionOnFilled + refactoring endIterationSaveReward
* stopActionOnFilled as a parameter
* fix set default parameters in case of change + print
* trainingStats refactoring only one place
* earlyStopping and parameterTuning by parameters
* earlyStopping and parameterTuning by parameters
* adding dqn parameters parameter tuning
* adding dqn parameters parameter tuning
* fix total cases operation
* parameter tuning default Avellaneda Stoikov
* parameter tuning without early stopping
* parameter tuning without early stopping
* training stats
* training stats
* refactoring parameterTuningValues
* parameter tuning variables
* better training logs
* fix typos printing end
* ignoring parameter
* refactoring DEFAULT_PARAMETERS
* adding default calculations phd
* rename from Dl4jMemoryReplayModel to Dl4jRegressionMemoryReplayModel
* midprice quque controlled min time
* get variances with bias inclded
* refactoring TimeSeries utils and ArrayUtils
* fix set parameters + refactoring trendfollowingSideQuoting
* trendfollowing refactor name
* better logs end of training hp
* setParameters base
* better warning messages on secondKey get Parameter
* fixing avellanedaAction if not kDefault or not ADefault
* fixing avellanedaAction if not kDefault or not ADefault
* update parameters
* update parameters
* update examples deprecated parameters
* less logs on setter
* setting earlyStopping+parameterTuning on AlphaAS
* remove early stopping and parameter tuning by default
* cleaning algos
* big refactoring cleaning useless classess and dl4j classes
* return getPrimaryKey if exist variable
* fix with no a_default k_default
* refactoringh parametertuning+earlystopping
* requirement java added
* upgrade to java 11
* traintype move
* Algorithm market making
* parameter tuning more aggressive faster
* parameter tuning speed of decay sigma
* change reinforce type
* refactor names and parameters
* accepting parameters in java format first!
* set random seed by configuration algorithm
* clean some null pointers
* fix train_type
* fix avellaneda action
* start private as zero
* fix iteration
* fix set defaults
* fix feesCommissionsIncluded
* rollback
* adapt string to bool java and python
* fees_commissions_included by configuration on backtest
* fees can be disabled by config
* RL Type by parameter
* reinforcement learning type by parameter
* default parametertuning parameters base
* gk implementation
* getCandlesDay
* update imports
* gk volatility
* plot params with a and k default
* can get between hours!
* updating methods to calculate
* realized fees
* can combine with other k calculations
* refactor method AS gueant
* including parameters and features for GueantTapia spread calculations and actions on dqn
* including A and K parameters for GueantTapia implementation
* error throw
* more traces and error log
* save delta reward disable , directly the reward
* remove score from private
* remove score from private
* absolute spread and symmetric
* remove control price move midprice
* stop starting in operational time one log
* logging current time
* AS depending of type skew
* skew applied to AS in priceTicks
* fix multimarket
* add multimarket on market states
* fix and improve messages
* fix getMaxBatchSize on creation
* set instrument wil lset state!
  * + print log folder
* trade from ER set verb
* se initial fee avoid null pointer
* better logs error
* realized fees
* using trade verb
* market trades counter
* trades on AS
* fix k value
* normalizer add it to TrendPredictor
* saving models onnx
* train score on feature base_est tra
* limits
* limit take best
* parameter_tuning 1 process at a time
* fix parameter tuning working on nn predictor
* logs before dumping
* fix adding null instruments
* secondsTreshold
* error controlling
* example trendPredictor
* train score on feature base_est tra
* removing file name
* candles_type included and secondsCandles
* custom candleTypeBusiness for time in seconds
* "candleTypeBusiness parameter
* dump data to regenerate later
* comments on inputs
* fix generate dump data
* set parameters dump
* fix start date bug
* loading previous dump data makes no sense
* model type input argument
* model type import
* fix concurrent modification
* generate dump data in parallel
* generate_dump_data one thread complete
* return null on invalid params array
* wrong empty arrays
* using date_utils
* value trim example
* dump filename
* dumpFilename to save it
* better logs in case not found
* fix enum algorithm
* int market horizon save
* int periods
* fix null pointer
* state utils refactoring and fix with new state columns
* dump secoonds as parameter
* loading dump cache fix
* market_candles_conditions
* fix get Candles market values
* less columns states dicreteTAState
* log error loading  dump file
* realized fees
* logs creating parquets
* loading dump data + parquet fix more logs on moving finishing
* DumpCache method in different class
* fixes
* onnx model
* trend_predictor algorithm
* load previous dump data method
* trend Predictor first approach
* more logs
* dumpData
* first version dump data into State
* snappy compression
* change logs
* fix trades + indicators + volume candles on trades
* adding 4 candles indicators based on trade data
* adding SignedTransaction indicators
* csv to parquet cleaning list
* using parallel parameter tuning
* parameter tuning neural network utils
* parameter tuning in parallel first approach
* cancel quoting when conditions ares over
* bounded ER makes no sense
* train score on feature base_est tra
* NumeraiUtils REDUCE_MEMORY_DF
* downloading tournament ids retry different
* numerai weekly script
* going back to old download data
* ack to old method downloading data
* fix download data to predict tournament
* numerai
* fix generating x data error i ncase doesnt exists models
* numerai extradata download
* fix autoencoder
* include train score on df output
* numerai extradata
* default pca value
* fix last df result
* pca defaul to 0.95
* numerai ExtraData
* combining all data on numerai with files
* autoencoder is in numerai file reader
* appending autoencoder data
* autoencoder tqdm iteration parameter tuning
* fix some imports
* parameter tuning validation
* numerai fix notebook
* fix appending and refactoring
* save model ae
* deleting local files
* mse in tf is ok , lower mse is better predictor
* mse greater is better!
* feature_selector fixing
* priting
* parameter_tuning_validation
* join columns
* fix factor investing
* feature selector class
* training data combined with validation
* fix tournament
* autoencoder training with validation
* sharpe ratio calculated por periods
* numerai fix downloader
* numerai reducing memory
* updating data
* numerai less memory usage?
* start training time print
* max 5 minutes training
* max time training on model
* retrain less epochs
* remove imports
* fix mean calculation
* creation utils + new notebook
* possible to load tensorflow models
* controlling nans
* add the last one,on the first item
* controlling when no data better
* fix zscore calculation MultiMarket
* lastMultiMarketTickSave by instrument
* last update fix
* strategy multiMarket
* using instruments on ZeroMQ trading
* fix state column numbers initialization
* fix get states multimarket
* less logs
* better values zscore
* realized fees
* realized fees
* otherInstrumentsStates change
* default number of decimals
* default number of decimals
* including cross states features
* get old version if size is 0
* get state multiMarket
* fix for the future
* MultiMarketDiscreteTA is working on backtest
* MultiMarketState first version + ArrayUtils
* zscore calculation
* MultiMarketState approach
* moving instruments beans to models project
* sharpe ratio calculated por periods
* fix win lose
* include fx fees and real leverage calculations
* closing position with quote quantity
* fix live trading metatrader
* fix exit quoting
* fix cancel as market order
* changes to metatrader engine
* nettingByEngine directly on mt5
* submitting message
* lower memory on numerai submission
* import gc
* import gc;gc.collect() between main scripts
* predcit validation optional
* use local data in second time
* numerai weekly scripts change
* remove h5py
* installation easier java
* annualized sharpe ratio
* fill memory with inf iterations can be possible
* subject better message
* less cryptic messages and yield percent message
* better plots portfolio
* not updating two times data
* update data related with use local files
* is data df
* reducing memory usage
* removed postconstruct
* fx
* script to numerai
* fix runner submissions
* import good
* fix null pointer on close
* discard saving more trades than enough on underlying algo
* metatrader trading engine fix market
* creating free text to quote on market orders
* set candle type of underlying algorithm
* engine zeroMQ
* fixing zeroMq trading
* catch null pointer
* fill memory with inf iterations can be possible
* fill memory with inf iterations can be possible
* submission numerai script
* change script to submit models
* better scripts to submit
* fix method that slowdown everything and less threads by default
* include latency+multithread configuration into algorithm statics
* fill memory with inf iterations can be possible
* including arbitrage backtest
* fixing quote both sides
* arbitrage is working
* disable side only if extraSpread = 666
* calculating minSpread
* using get fee instrument
* common output
* merging results on arbitrage fix final results
* position end makes sense
* fix timestamp of trades set
* sort by timestamp just in case
* adding all trades timestamps modification
* realized fees
* realized fees
* fees multiplied by qty
* fix log
* better controlling ER
* examples changes arbitrage to eur
* fix null pointer
* better logs
* fix null pointer
* more logs
* final print
* realized fees
* positive fees
* fee instrument always >0
* including fees on summary
* refactoring setting backtest settings
* controlling ER quoting
* refactoring ER treatment
* include fees into pnl calculations
* including commissions on pnl calculations
* including fees on isntrument
* input_configuration MultiThreadConfiguration
* more synonims core thread config
* backtest Configuration
* multithreadConfiguration into Backtes options
* rounding quote prices
* fix test
* refresh depth set right price
* rounding quote/order prices
* unify multithread Configuration
* avoid more execisve same quoting
* fix typo
* no multithreading is an option + logs on quoting
* not report qtyFile
* calculating min spread on real data
* calculating minSpread to hedgeBest with fees
* backtest seems better
* disable check quoting on backtest
* removing synchronized notification ER
* quoting
* side upload logs
* better logs
* synchronrized notifyER to join in one thread output
* add double check ER
* update data
* spread is from best of passive
* taker fee pct
* arbitrage by ticks
* clean console
* parameters assymetry
* different spreads per size!
* fix bug with side
* arbitrage min spread parameter
* print pnl better
* Qty Fill below min level discarted
* commit rest of files
* profits pnl print
* just check cf rejected and actives
* not report qtyFile
* add delay_order_ms to backtest options
* add delay slippage to backtest options
* change all EvictingQueues add to offer to keep size
* not report qtyFile
* continue watching
* not notify ER or qtyFill==0
* get Qty Fill
* toString better
* sending market orders
* connect websocket on start
* fix error ER
* connect websocket on start
* better logs fix bugs
* including fees properties +example arbitrage
* starting to program arb algorithm
* using fastparquet
* fill memory with inf iterations can be possible
* fill memory with inf iterations can be possible
* fill memory with inf iterations can be possible
* fill memory with inf iterations can be possible
* parquet dump
* persist.parquet is a property true or false
* add    lmax
* include dependecy
* connecting test
* better message
* error print on Trading engine
* sending orders
* step tick size
* connect websocket on start
* priceReference reffactor
* connectWebSocket in common broker connector instance!
* ExchangeSpecification is a protected variable
* connect websocket on start
* logs change
* connect websocket on start trading engine
* add constructor instruments and connect websocket
* OrderChanger listener method and ER rejection try cath done
* fix issue with level to quote
* update binance api
* api update binance
* coinbase keys
* ER directly
  * TODO listen trades ER filled or CF
* change priceTick and quantityTick crypto instruments
* test trading engine
* fix issue with level to quote
* add another profile for non cuda
* threads are on application.properties
* ignore md publishers
* reduce Depth XChangeMarketDataPublisher
* tester XChangeMarketDataPublisherTest + isntrument new method
* numerai downloader and subimission splitted
* typo log
* add check depth volume on SingleInstrumentAlgorithm
* binance inside exchange connectors
* skewLevel plot always
* numerai_gp_submit
* fix check y validation
* numerai optimization by input
* fix bid error sending qty
* plot params alpha_constant_spread.py
* alphas constant spread default actions
* fix tradingEngineConfiguration setter
* all apps start as GMT by default
* fix concurrent Exception
* subscribing to kraken
* depth remove log
* coinbase connecting market data
* coinbase engine starting to debug
* refactoring to common class
* first prototype to trading on XChange
* add new markets
* adding coinbase marketdata publisher + instruments
* adding XChange library connection brokers
* pnl map function
* fix issue with period limit on queue
* change example style
* remove conservative style move to level
* changing conservative to level entry style
* fix issue with level to quote
* create queue with max periods
* change some setters on actions level to quote and changeSide
* change side setter better
* fix
* is_policy_gradient_algorithm better approach
* default train_type on side
* comment on changing the algo for dqn side
* move to double dq
* set side should be on underlying algorithm!
* better logs and same state action candles on abstract DQN -> prioritize state mananger on register observers
* change levelToQuote name
* levelToQuotes is an action that can be aggressive
* levelToQuotes is an action input
* levelToQuotes is an action that can be aggressive
* fix issue on abstract side
* fix initialization DQN RSI
* fix cloning target reinforce
* plot sharpe
* plot trades and close sharpe
* example change name
* change names examples
* fix LSTM layer
* fix LSTM layer
* change dl4j configur
* default constant spread and skewLEvel
* set initial values marketmaker
* force UTC on startup
* logs in operational time
* fix log issue
* fix order parameters
* send method to old algo
* clean methods
* no filtering states
* common constructor parameters
* memoryReplay.getNumberOfColumns() + remove private state creation
* include seed
* seed loading on initialization
* RANDOM_GENERATOR directly on algorithm
* clean alpha methods
* test constant spread
* using poisson latency engine
* fixed 5 threads publish Orders
* lock latch avoid interlock
* warnings latencies
* double of latency warning
* add lock to protect latch
* delay Thread is not sleeping
* counter time
* adding delay current time
* fixe latency sleep less time, in ns
* threadpriority and logger warn only once
* print real price we send on OrderRequest
* RANDOM_SEED configure and log same method
* round price instrument on AS
* not round prices on quoting
* common static seed RANDOM_GENERATOR in configuration + getNumberDecimalsPrice on instrument
* seed clientOrderId
* fixe latency for testing
* fix multiThread Configuration
* initially starting with max value tick action
* is ready condition for alpha
* AS ready method
* changetrain target clone just in case
* we are ready boolean
* fix logs issue and before starting change action
* one last iteration on training removed if simultaneous_algos<=1
* backtest fix imports
* ms elapsed finished iteration
* better logs con alphas
* first iteration log
* better logs on initial and iteration
* new alpha strategies python
* alpha strategies on abstract algo
* adding skew to constantSpread
* error parquet kill the process
* windows change always plot
* plot params change on windows tick
* upload figures
* changes to README.md
* remove warning
* break on more rows
* periodsStates
* controlling custom columns on Portfolio final
* onCommandUpdate AvellanedaStoikovDQNMarket final
* setting poisson latency by default on orderRequest

## 22.01.26_thesis
* create_date_index from timestamp column if not in index
* clean initial experience
* end of day training
* less qty
* periodsStates
* null pointer fix
* disable fit model on pt
* testing pt rsi_dqn
* fix ga parameter tuning from algo
* documentation and figure
* typo fix
* better approach to actor critic
* training target once
* policy gradient
* policy algorithms train with prob explore =0
* bat files utils
* fix bug with action 0
* periodsStates
* fix merge periods thing
* error training log with path
* logs on number of states and actions
* binary state single columns
* STATE_LIST_PARAMETERS creation
* periodsTAStates
* periodsTAStates
* list
* periods TA are a parameter
* TA periods in a parameter
* market state on binary doesnt change
* market horizon save by default is 15
* horizon tick market default
* market_horizon_save as argument
* market conditions not relative to mid
* change to numberDecimalsState
* change to numberDecimalsState
* state configurations
* stat configurations
* add default "numberDecimalsMarketState":3
* numberDecimalsMarketState to DQN algos
* less market states
* reward array
* customie function
* customie function
* false for training prob
* more logs on training
* more logs on training
* normalize GetTargetTrainValues using probability
* explore on explore prob>1
* force explore on custom actor critic
* remove log disable training
* fill memory with inf iterations can be possible
* fix with None fill_memory_max_iterations
* end of session train target
* target multiplied by prob on targetModel -> critic
* dont need predict model on targetTrainValues
* remove getProb on GetTargetTrainValues
* getTargetTrainValues doesnt take into account prob
* fix multiplication
* cant check inputs
* add warning in case of different inputs model
* Softmax output layer again , sigmoid returns error+trainPrediction with classification
* activation function sigmoid
* fill memory with max iterations can be possible
* fill memory with inf iterations can be possible
* RSI is reinforce type
* plot_training_iterations change to plot on less iterations
* fill memory with logs max_iterations
* fill memory with inf iterations can be possible
* fill_memory_max_iterations is a parameter of training
* fill memory max number of iterations
* explore mode
* force explore on default values
* discount factor makes no sense
* more clear conditions + qlearn example to test
* move script+change script rsi
* clean logs
* fix is memory size enough
* _is_memory_size_enough method
* bash to kill java process
* max time exit to 5 mins
* fill memory is going to finished on less strict measures
* fillna later
* join methods get_memory_size
* merge q matrix is adding also negative rewards!
* test merge
* merge and test merge
* not save on no entry
* EXPLORE_MODE_TRESHOLD to force take other actions
* add     FORMAT_SAVE_NUMBERS='%.18e'
* merge avoid dropna
* fill memory with inf iterations
* single state columns hour_of_the_day_utc
* BINARY_STATE_SINGLE_COLUMNS with only hour
* calculate q value on non existing before val
* get_memory_size with rewards on fill memory
* get_memory_size_with_rewards on the start of trianing
* checking memory size with rewards on fill memory
* reduce binary but add hours
* reduce number of states binary
* better logs rewards
* explore can choose same action as best
* iterate once scores
* force explore other actions
* explore ignore best choices
* same as best values
* learningRate 0.85 q learn
* rsi_dqn testing uptrend q learn
* randomize between best exploit values
* overExplore on more than
* overExplore on more than
* force exploit if we are 20% more exploring
* overExplore on more than
* fix issue with shuffle loading
* remove delta reward
* DQN remove delta
* remove delta reward
* save timeout states rewards!
* binary less periods
* less periods on binary + force exploit on over exploring
* launcher with default output and log path
* get columns for binary
* q Value fix abstract
* testing RSI as q learn
* default parameters like AS optimized
* merge better logs
* rsi_dqn example script
* as script to test
* style is out of json param
* traini iteration plotting
* delta reward true
* logging style on parameters
* create nn with nly one layer
* fix log setting action index
* delta reward is a static var
* pretty print json
* pretty print jsons inputs backtest
* right logs on training
* new version of AlphaAS
* remove early stopping
* CHECK_BEST_EARLY
* training stats better
* plot each iteration
* fix q learn mode
* rsi_dqn good example
* enable shuffle loading memory replay
* plot each iteration option
* slow period max
* refactor and creation DQNMovingAverageSideQuoting.java
* refactor and creation DQNAbstractSideQuoting
* change to protected some variables
* DQNAbstract for the rest of rl algorithms
* fix print message
* system print learninig rate change
* early stopping training enable again
* remove some trace error not needed
* back to single thread to find same result always
* add score enum to plot
* add rewards to plot training + default score is realized pnl
* training more plots reward
* score training default is realized pnl
* add legend
* fix plot training line
* better plots and plot training dqn
* plotting changeSide
* fix plottting
* fix training reducing explore prob on normal
* plot params in execution
* plot params remove double
* plot params better plots
* testing alpha as
* save targetModel on training
* better logs on learnLogic
* removing learnt boolean
* fix on non model
* not saving zero rewards on memory bool
* logs on not trained networks
* warning log
* change of formula to calculate gradients
* change to qTarget values
* new Alpha AS based on refactoring
* new version of AlphaAS
* save model is inside trainig method
* save only if isTrained
* different evals on classification and regression
* change script launchers to delete json file input
* delete file if two arguments
* getProbabilities
* epsilon can be zero
* save models custom actor critics
* training only in parallel with more than 1 algo
* training is fillMemory in parallel + train sequential
* save models custom actor critics
* remove json file on train json too
* remove json if exist
* delete json backtest
* move model to sigmoid on classification
* remove train method
* refactoring
* ge params default expore_prob=0
* change default parameters dqn's
* get probabilities fix
* print number of exploration actions end of backtest
* seeing some results
* save prediction model
* updaeting memory with rewards each iteration
* new action on same state complete new reward row
* train on reward
* adjusting print rows
* not removing empty rewards! can be prior to new state better values
* StateList makes no sense
* fix arbiterClasspath resource
* adding gym dependencies
* interface some methods for rl4j
* de
* meanReward printing
* remove json file
* sigmoid function
* back to version 1.0.0-beta7 because of cuda
* avellaneda_dqn can test with default explore prob
* check isLearnt on training , train returns a boolean
* update dl4j version + cuda by default +matrix data structures from google on algo
* SIGMOID functions
* filter data with qTarget==0
* disable cuda by default
* momentukmNesterov if momentum >0
* start model RELU_UNIFORM
* training on bestAction prob to 1
* training on bestAction prob to 1
* deep q learn is controlling output null
* modify message targetModel
* catn train yet message
* adapting formulas to training
* learn mark as train
* training sometimes works
* training sometimes works
* learning using fitting
* training + learnt logic
* statelist check
* force learn on command stop
* comparing gradients
* getrewards method is going to nn , not the replaybuffer
* load model dl4j
* train each iteration disable by defaault on training
* fix gradient that cant be updated
* fix cloning with path
* cloning a Dl4j is keeping the path
* fix normal training maxBatchSize
* more tests
* bif refactor + test on simple dl4j model
* checking prediction is all nan
* cancel all orders end null pointer except
* fix train on data
* starting to think in gradients training
* cuda
* fix get target model path
* updateGradients split by nn
* refactoring for learning ml + fix tests
* no warnings
* cuda mode activated by default
* gradient remove todo
* update gradient function beta
* adding gradientUpdate methods arquitecture
* merging python with only one faster
* explore_prob can be zero on training
* less nodes on second layer
* error file mark
* dl4j change some things for training
* errors are not market as processed
* more traces for error
* level 0 data required , rest is optional
* error file mark it
* file cant be parsed!
* error in row , skip row not file
* warning
* keep clean parquets
* back to 3 layers only
* remove minibatch iterator
* weight init RELU
* duplicate number of epochs if underfitting
* removing logs from rl dependency
* changin log and relu init weights
* modify weight init for relu
* remove malmo warning
* add malmo example
* adding rl4j on weka
* normalization using setPreprocessor
* back to MSE
* back to sigmoid
* simplify NN
* max minutes training
* overfit increase epoch
* sigmoid hidden layers
* R2 evaluation method on early stopping
* hheader on csv with separator!
* avoid multiple conversions at 12:00+logs
* add synchrnized on save load memory
* going back to dump individually
* dump less than workers
* º
* º
* descending returns by day
* copy files to hdd multiprocess
* imbalance add ref
* microprice fix formula
* fix remove midprice
* fix remove midprice
* print seed start when its random
* adding single state columns
* adding single state columns
* add columns market constructor2
* include new market variables
* including more market variables
* º
* º
* adapt to dqn_algorithm avellaneda
* º
* next version
* shuffle on mergeQMatrix
* SHUFFLE_LOADING_ROWS is an option disable
* º
* the rest
* set expected size on DeepQ
* init is synchronized
* try catch exception reading memory
* º
* º
* remove rows where best is zero on training
* found solution
* going to back to  training basic
* learningRateNN as param justin case
* max batch size is 5000
* the rest
* weka in algorithmic trading framework
* mix autoweka and better documentation
* refactoring weka project
* include weka as commonLib for nn
* rsi_dqn with default prob on test/train to 0
* fill memory backup
* exploratory enable
* training RSI dqn
* trainType on example_inputTrain.json
* trainType on trainInputConfiguration
* fix output path clean memory original name
* include original on merge  fill memory
* fix saving all rows!
* check time training -> commented
* fix training on one iteration
* train with no merging
* add name to get test name
* train fix
* merge include the original df on training
* momentum set to 0 by default
* check before fill if its complete
* fill memory
* momentum set to 0 by default
* better output path
* saving last memory with original name
* reading the number of iterationes to combine
* if algos_per_iteration on merge memory
* merge memory controlled by algos_per_iteration
* train clean
* using get_memory_df
* get_memory_file fix
* train can fill memory before!
* fill memory as another process with more parallelization!
* filling memory before starting
* training is waiting initial fill of the memoryReplay
* example update like in notebook
* fix 2 ER received and first parent on ER
* to double just in case
* min batchsize
* adding backprop type , just in case
* readapting batch size
* momentumNesterov to zero
* train on adam with momentumNesterov set to 0
* score with iterations plotting on test
* not cleaning nn on retrain
* fix title of the
* fix get score realized pnl
* plotting evolution of learning
* auto adapt learning rate
* testin linearly learning
* better documentation
* fast aproxmitaion
* change calculate q value function in case of using discount
* explore makes no sense here
* fix ta default periods
* adjusting score
* returns on equity with pct
* fix log warning
* use custom actor critic
* set custom actor critic
* plot number of trades too
* change get_max_dd in case of zero
* change falcma_ratio
* shuffling memory on reading
* print each iteration train returns
* add the class to modify typeTrain on comment
* clean gpu memory each training iteration
* change type of training
* change trainType comment
* target model is ccopying prediction if not ac
* rsi to deep q learn to see if improvement
* better logs value already present or cant load model
* change output to identity on regression
* EXPLORE_RANDOM_ENABLE is true
* preparing to change actor critic q value method
* removing explore based on random
* default rsiDQN json
* update default json rsiDQN
* refactoring on methods to get correct name predict target
* fix using target and predict
* fix ta default periods
* more periods states 3, 5,7, 9,11, 13,15, 17, 21
* more states 3, 5,7, 9,11, 13,15, 17, 21
* best is not positive case!
* set classification target on non best policy
* all decimals
* more decimals on vpin and imbalance
* not boundaries
* get number of decimals fix
* fix number of decimals for TA state
* default ta periods only one side
* better logs on error assertion
* add todos on priceTick for volume
* default rsiPeriods detect max
* remove rng
* assert candle volumes
* change name columns
* calculator change columns
* classification is training
* error reading lambda data path
* new ta states with volume
* adding ta states of volume
* get_test_name change input arg
  * +
  * train finished on the test name
* dl4j with F1 evaluation
* move import
* print best momentum
* fix number of cases total on hyper parameter tuning
* more learning rates to hyperparameter tuning
* fix getting price
* change launch script
* change launch script
* change launch script
* portfolio change with returns
* change launch script
* fix portfolio price in case realtime is not there
* inlcuding momentum into hp
* removing earlyStoping if needed
* less imports
* adding get depth from pandas
* round the states on classification
* precission is better to discard false positives
* classification is training
* back to F1 to early stoping
* early stopping config
* target_model_it fix bug
* write into logs json received on training
* deep q learning update state is synchronized to avoid same state update
* better logs
* training types include configuration
* include trainType into classes
* using an enumerator with trainType + actorCritic style done
* refactoring trainOnData to TrainNNUtils
* prtected epsilon
* explore exploit Custom actor critic
* DQNRsi starting to use CustomActorCritic
* disable training during session training
* RELU + TANH
* training on bestAction prob to 1
* leaky relu function
* using sigmoid function as hidden layers
* first layer and last linear , hidden LeakyRelu
* emphasize good scores and dismish bad
* output is a tanh function
* default values on avellaneda DQN
* setting default values of phd
* not checking spread or unrealized pnl
* check independent
* less check on unrealized
* spread check size own variable
* get target classification not used
* higher warning level on unrealized + remove output activation
* zscore check on same side
* unrealized pnl control
* using tanh last activation function
* training on bestAction prob to 1
* removing zeros rows
* cleaning rows taking care of previously eliminated
* default value is None
* default test trainingTargetIterationPeriod disable and take from params
* training on bestAction prob to 1
* worst mark as negative score!
* fix checking matrix
* maintain negative values on non best actions
* training on bestAction prob to 1
* some preparing on data for training nn
* chcking order modify and cancel on the depth
* ga column and scores on realized pnl by default but configurable
* adding synchronized to PnlSnapshotOrders + fix null pointer
* fix warning build maven
* add historicalClOrdId
* adding client order id
* appending clientOrder id to portfolio
* paper trading fix number threads publis ER
* fixed latency to get same results + not check unrealized pnl
* catch exception
* desperate measure
* desperate measure of error
* synchronized some methods
* catch Exception indexOutOfBounds
* ER string
* quoteManager print traces
* deep q learning update state is synchronized to avoid same state update
* removing  delays
* latency more controlled *2 on PoissonLatencyEngine
* poissonlatency disable option
* latency on OR of 65 ms
* remove thread sleep on delays
* isFilled trace
* fix bug dl4j set seed
* latencies on MD and ER update the timestamp + ER better format in rejections
* delays on market data and ER
* more tests on OrderMatching Engine
* more decimals on OR print
* rejection print only on aggressive
* default lastQ to zero
* dqn side quoting fix bugs
* exit detect on position ==0
* onnx model set seed
* notify trade if still qtyTrade>0
* setSeed on memoryReplayModel
* MSE as loss function
* fix last layer added for training
* fix SideQuoting aggressive orders backtest
* check OrderRequestFields before sending
* set as static variable
* default orderRequest price is min
* check qty send/modify algorithm
* Merge remote-tracking branch 'origin/master'
* include training seed avellaneda dqn
* removing unnecessary synchronized
* actions array distinct and sorted to avoid errors
* intiial fill cache synchronized
* more logs on null pointer
* update state synchronized
* catch null pointer on get action
* load memory value already present continue
* catch null pointer on get action
* AS add log commented
* notify trades only if not already notified!
* fix bug on trades arrived!
* key set of maps
* UPDATE_HISTORICAL_LOCK lock on update
* include class
* include     END_OF_SESSION=-25
* include class iterationsPeriodTime
* END_OF_SESSION getValue is -25
* including end of session training!
* modifying historicals map is synchronized now
* fix nullpointer on dl4j
* more threads on publishing ER and listening OrderRequests+logs on portfolio getTradesTable
* reject on non valid fields
* rejection print and treatment
* fix a lot of exits
* NN arquitecture change to deep and relu intermediate layers
* remove verb strange thing
* fix error when no trades
* setting not save zero results by default
* add market orders to match engine
* name in algorithm
* Merge remote-tracking branch 'origin/master'
* abstract test strategy and catch exception print it on test
* PortfolioManager catch error on trades treatment file!
* decay from base
* set levels Depth fix
* warning on dropna removing all trades!!
* ga configuration is decaying by list exponentially in algorithm and more crossovers
* default T-t parameter to 1
* calculateTt by param
* IS_SESSION_TIME_AFFECTING boolean
* debugging single thread!
* fixe latency second iter with next update
* changing to OrderMathingEngine + more Threads
* fix concurrent modification
* setting PaperTrading can not return depth
* setting instrument to depth and trade
* faster search FastOrder
* Order Match engine with modifies and cancels
* OrderMathingEngine with junit
* test FastOrderbook
* fastOrderbook implementation v1
* try catch exception + AS back to original skew
* aplying skew on final price
* example AS backtest
* fix T_t
* move to configuration
* minimal configuration BACKTEST on threads
* fix position plotting maxTicks+add 15 minutes locator
* upload notebooks of Phd
* AS by definition
* update next latency if != min value
* Thread sleep is watching nextUpdateMs
* set AS as before with midprice check
* fix poisson delay on next update
* next update on parquet =!0
* AS using Alridge formulas
  * DEBUG is single THREAD without delays
* Trade and Depth can contain next sleep and skip latency engines if lower
* catch error assert
* Algorithm.MAXTICKS_PLOT variable
* fix TT last hour
* variance fix den
* AS on quotes
* comment on risk aversion
* AS alridge implementation
* AS without multiplying currentSpread
* plot with try catch to capture exceptions
* remove adding one hour to trades_df
* disable reasonable limits on AS
* input ml drop duplicates on features
* AS parameter to control midprice cross+portfolio ml path fix
* onnx is training the model
* prediciting weights portfolio
* aplying skew only on reservePrice
* aplying skewPct on reservePrice
* parameter tuning method
* starting to generate input_df for ml model
* check all nulls last column
* better manage error on get_memory_replay_df
* quickfix on errors PnlSnapshot and lastList method
* change ga
* AS example
* fix wrong input
* onnx algorithm
* include exitWaiting map just to be sure
* adding vpin to ta state
* THREAD_MS_WAITING = 1
* poisson latency +multithread backtest
* abstractsideQuoting + adding latency on orderRequest
* is training flag refresh
* update darwinex database more days
* update darwinex database more days
* set weights
* trades reset index
* removing error mlFile not found
* orderbook manager preparing for fast orderbook
* adding latency to OrderRequest in backtest
* method to update quantities from weights
* predict when no training!
* example onnx for eurusd
* adding method to start training on DF
* change algorithm python and new params conventional json
* example update json with last data
* start with seed
* print seed
* set volume candles treshold
* parameters input as conventional json
* state has to be ready
* onnx is reading ml and predicting from states
* fix logger bug
* method to update quantities from weights
* onnx train parameter
* Portfolio Onnx is saving state with TA indicators
* starting to play with ER and OrderRequest of children algos
* change engine to protected instead of private for portfolio
* mockito versions on parent pom
* starting to dump final file onnxportfolio
* OnnxPortfolioAlgorithm on algorithm utils
* starting to create dynamic onnx model weighting
* logs with fixed portfolio name
* set weights algorithms
* fix some initial configuration settings on configuration
* changeSides null param fix
* fix some prints and get array single
* fixPortfolio implementation
* onnx script helper to use sklearn
* fix minors
* trend following strategy!
* overriding output subfolder
* overriding output subfolder
* fix get_max_dd
* force_explore_prob parameter on train
* final pnl q learn test
* setting seed parameters
* useAsQLearn param detected
* fix one algo iteration +  falcma ratio
* fix minors on training and score
* default periods
* seed set only if !=0
* generating random seed method
* change set seed new method
* onExecutionReportUpdate treat rejections before super
* check depth is not found parquet
* reading parquets catch errors
* print in case of error
* retry resend rejected orders!
* remove logs warning unrealized pnl out of bounds
* save memmory no entry
* set seed log
* python set seed
* seed on training parameter is multplied
* seed from parameters
* reduce output in backtest
* discrete added info where to add on py
* adding single state column , hour of the day utc
* adding hour of the day to ta_state
* more prints to find mt error
* verb==null to send new order!
* fix verbToCheckIn check
* enableAutoHedger on SingleInstrumentAlgorithm
* adding hedgePossibility by parameter on DQNRsiSide
* fix scientific mode
* example inputs of the notebook
* fix sides changeSide and different side quantitites
* fix changeSide verbs closePosition
* remove unrealized PNL warn
* hilbert calculator
* more test on new rows deepQLearn and predict
* small change
* print if memory not found
* logs on qlearning with inputs
* setting learningRate and discountFactor for qvalue
* add hedgeManager instruments to list
* integratin hedgeManager instruments to backtest
* first approach to hedgeManager on algorithm integration
* fix get candles
* adapt the example to the new values
* windows installation scripts
* conda requirements lambda
* inlcude seaborn dependency
* update default values
* binary state and q learn by parameter
* map with side on waiting ER to avoid double sending
* fix live trading on metatrader
* close position on mt5 more retries
* error message adjustment
* more message error on execution print
* trying to fix on live trading
* fix open/close mt engine
* remove warning on double ER trading
* try catch on error of the algo
* check null
* change name to volume_treshold_depth
* VOLUME_TRESHOLD
* CandleFromTickUpdater.VOLUME_TRESHOLD
* volume candles set by configuration
* printing when waiting to candles
* reading output path directly
* reducing number of states
* microprice in binary
* discrete TA as binary to reduce states number
* better logs on check memory number of columns
* plot params return a figure
* adding default score
* dd plot with area
* fix initial values and not saving values on timeout
* lastQuantity not set to remainQty
* remove zero returns rows
* fix tests
* replace pct_change on invalid values
* set Q Learn
* less logs
* qLearn
* change backtest launcher max memory
* better memory management on check
* pnl reduce memory usage unrealized pnl
* change launch script
* more opne pnl data
* change launch script
* fix log4j error
* fix benchmarks constant spreads
* using new method to generate test algo name
* fix contant spread error
* fix get Ask get Bid in case of empty
* test results
* trying to remove progressBar error
* avellaneda dqn test on training number
* change side not set fix
* better plots and logs
* better logs and combine q matrix from test
* dependencies first apporach to java 11
* overriding output subfolder
* message header
* better logs
* changin parameter to set RNN
* fix setting
* remove rnn hrizon + change parameters nn
* removing rnn horizon
* setting everything to train on RNN
* change state ready when no candles
* fix state errors on benchmark algorithms + preparing data to train RNN
* fix constant spread states
* warning zscore unrealized
* deply bat binance
* remove one jar
* enable check open pnl + add check spread
* check open pnl enable
* factor investing set size plot
* use las close price degiro
* change launch script
* portfolio script
* imports with seaborn
* portfolio
* portfolio general script
* portfolio fix with negative weight
* use as qlearn
* dictionary search states index + thread Safe map
* fix state search , add new map
* state save fix index of state
* min iterations set to iteration limit
* checking finite score end of train and skip on <0.01 explore prob training
* notebook update
* more levels
* rsi deep q network last update
* reformat last index row
* fix issue on last row of memory not found!
* discount and learning rate set on constructor! + test
* min iterations to train
* test load/save memory states working
* fix and test when the memory replay is full
* microprice avoid mantise
* microprice avoid mantise
* microprice spread ticks 0.5 rounded
* test on new action
* fixing memoryReplay update of rewards!
* add more states on ta states
* trying not to discount too fast
* plt figure
* fine tuning explore prob on early stopping
* plt close on last char
* keep same iteration variable
* train_each_iteration variable
* early stopping training some fine tuning
* joblib
* add more states on ta states
* less max ram limit
* off log tongfei
* trainOnData disable for use as qlearn
* disable hyparparameter tuning from json
* better plots
* plot pie charts
* remove hyperparameter tuning
* removing changeSide from states
* simple case without NN
* fix batchSize temp
* fix close positions
* genetic vonfiguration fx
* less empty spaces and binary states
* remiving column
* memory replay observer data
* RSI deepQNetwork notebook sample
* normalizeing reward on qty
* back to using DQL
* remove logger warn on verb==null for backtest
* round value
* move to ema
* add more states on ta states
* adding microprice indicator + more periods on states
* back to 200M candles
* close position fix
* RSISide closePosition fix different qties
* avoid null pointer on training
* better entry exit position fix max times + QLearn training enable
* Portfolio with no autosave on backtest
* dl4j refactoring methods
* better prints
* print each test
* fix double momentumNesterov
* using adam
* using adam optimizer
* better logs
* print best epoch number
* Merge remote-tracking branch 'origin/master'
* hyperparameter tuning from trainOnData
* default parameters
* candles smaller cum volume
* Merge remote-tracking branch 'origin/master'
* bathSize adapting if is lower size
* notebooks upload empty
* notebooks upload empty
* ga on fx out of sample
* Merge branch 'master' of bitbucket.org:javifalces/market_making_fw
* print out of sample chromosome backtest
* hyperparameter tuning TODO add
* nn parameters separated
* new parameter learningRateNN for training the nn differnet than reiformcent
* Merge remote-tracking branch 'origin/master'
* we are able to skew quantity on parameters + log String formatter
* CV on a monday
* min number of days to train on smaller folds
* training combination makes more sense learning rate as higher as possible
* memory replay fixes
* log4j2 to off errors in progressbar
* remove plot param changeSides
* get parameters before last iteration training
* append last training iteration in the end
* explore exploit fix bug
* avellaneda_dqn combine on max
* combination in the same state max reward
* backtest-fx send ntoebook with index
* folder dao
* remove logger warn on verb==null for backtest
* PATHs in import
* remove file folding input
* fix logs
* verb == null on aggressive style
* fixing multiple market orders sent
* removing beta
* append GMT time to launcher java strategies
* add more data services
* instrument returns minor fix
* fix downloading data and residuals
* fix error alphalens
* plt alphalens
* candles and md filter to my instrument only on Algorithms
* print to close
* keyboard interrupt on script to stop everything
* not closing the app
* zeroMq can choose memory on args
* starting to think on alphalens results
* default rounded state and add changeSide to columns states
* tick database is not updating
* update tick database on daily script
* incrementing_walk_forward can be limited on max size!
* changeSide to states
* batchSize as variable
* adding changeSide to DiscreteTa
* overriding output subfolder
* better logs print on changeSide
* fix method
* fix combination onlyEntrySide and changeSide
* default batchSize to 500
* fix ChangeSides as array parameter + first version on only side
* fix average nodes
* check
* remove logger warn on verb==null for backtest
* falces_marin
* include load best nodes file
* change Sides
* falces_marin
* adding new action array
* "changeSides":[0] into default
* changeSide is an action value
* falces_marin
* portfolio node lead read in class
* backtest fx better with portfolio average node to get returns
* portfolio scripts upload + requirements added
* move prediction average to portfolio_average_node.py
* plot pyfolio test
* update pyfolio and alphalens version
* falces_marin
* combine alphas fix
* ga results into genetic configuration
* batch size on training
* better logs and train on file with batch size in
* fix package script
* commit ps1 scripts to run env
* zeroMQ launching with right output path
* App loads application properties from java header
* better logs on app variables
* error printing
* reduce memory usage
* script to launch it
* set fx instrument properties in xml+change TA state to integer states with distances
* better logs on error
* update numerai data
* update data first then submit
* numerai gp remove from notebooks
* numerai submissions scripts
* gp submission alone
* update numerai gp script + genetic_configuration numerai
* score function is upper
* add Backtest Configuration to factor investing imports
* less parameters for the new ta state
* number of columns states
* clean the other states variables
* dqn using ta binary states
* DiscreteTA binaries
* stateManager with abstractState in constructor
* set Verb on the last business logic
* discrete TA state
* set population growing
* using best , less complex
* setting second best ga
* setting second best ga
* set max population
* set max population
* disable constant mutation
* disable constant mutation
* update with ga optimization results
* update with ga optimization results
* update with ga optimization results
* candle management through this CandleFromTickUpdater observer pattern+TA State
* combine different nodes and script
* include candle volume 200M depth
* random_contant_mutation with probabilities==0
* random_contant_mutation with probabilities==0
* fix population wrong operation
* update darwinex data
* Merge remote-tracking branch 'origin/master'
* paper portfolio on FX
* properties to laptop
* ga of fx
* logger
* logger
* fx_gp_nodes
* check time and save it predictions to input
* remove configuration logger general
* daily prediction
* fx downloader name fix
* assertion error folder_dao
* change genetic_configuration for FX less data more asset exposure
* training optimizing scripts
* include log_settings in some modules
* more gp fixes
* more gp fixes
* fix some test and date time issues
* email connectors to notebook utils
* automatic starter strategies
* zeroMq Launcher from python
* LAMBDA_FACTOR_INVESTING_DB variable for setting the parquets
* input path java
* change variables for path
* LAMBDA_FACTOR_INVESTING_DB variable for setting the parquets
* fix fx library oanda
* fx_oandaLimit script
* all nodes import in one
* fx genetic configuration with nodes
* fx buy+short genetic configuration
* onlyEntryVerb implementation
* factor_investing with gp bring here + requirements
* remove print ER received
* fix error mt5 instruments not working + not discovering on testing dqn
* using parameters final name
* warn only on live trading
* fix test output df
* iteartion on testing not needed
* remove lastClose if disable it on market states
* remove one more side disableLastClose
* cleaner constructor
* generify dqn algortithm + fix copy merge of the right name
* falces_marin
* disable last close + save into final name mem and nn
* fix market state without last close
* fix timestamp wrong year
* remove checn unrealized pnl
* disable last close fix
* marketState removing lastCloseCondition
* candle state manager for midprice candles
* fix closePosition errors
* real RSI _DQN
* fix faster search orders map
* metatrader engine
* mt trader fix lose price on trade
* fix Close trades + strategy tester on ZeroMq
* fix minor close trade
* check already notified
* netting metatrader engine
* netting metatatrader
* algoTradingMq deployment
* tet netting market order metatrader
* fix batch size setting
* redone rsi dqn and training epochs
* remove private states rsiDQN
* fix early stopping and nn training
* netting on metatrader first version
* deploy metratrader bat file
* fix print row trade in line
* close position with market position
* enable mt market orders and fix ER rejecteds+CfTrades queue to avoid double countings
* Cf trade filter on metratrader trading engine
* metatrader volume from tick data mt
* metatrader volume from tick data mt
* metatrader volume from tick data mt
* back to lastFilledVerb
* control already notified CF trades
* forced to close position on the side we are
* metatrader volume from tick data mt
* avoid sending and saving wueh not ready RSI period
* fix metatrader and fx candles + private empty state
* empty private state filling in case
* RSI calculate default value is 50.
* check null instrument
* we have quantities in darwinex
* remove other instrument
* filtering receiving instruments
* pnl completeley tested
* fix periodically train DQNs
* fix training avellaneda dqn after period time
* add periodical training on avellaneda dqn
* ffill custom columns + zscore warning upgrade to 7
* Portfolio manager configurable to return all
* metatrader volume statemanager to zero
* persitance connector disable
* tick data bests for darwinex
* best bid best ask on tick
* changes to liveTrading
* changes to liveTrading
* logname of the algo
* Merge remote-tracking branch 'origin/master'
* AlgoTrading ZeroMq by json input
* fix assert on memory number of columns without open candle
* ZeroMQTrading by json file! + refactoring get algorithm by name
* checking array shape before merging
* remove last comma memoryReplay file
* remove las comma saving memoryReplay
* better logs
* better logs and trades table withou filtering on trades
* fix in case on custom column error
* rsi_dqn example
* better logs training patience counter
* prefix check name
* refactor to work on unrealized pnl real
* Pnl real sorted orders + tests
* fix tests
* PnlSnapshot fix minors with average
* fixing and testing pnl snapshot
* unrealized pnl fix minor
* falces_marin
* falces_marin
* fix mx_dd pct when no dd
* falces_marin get
* falces_marin ratio
* falcma pnl_utils
* set exploration decay in case of early stopping
* train launcher with log name
* log filee by algo
* including log as variable -Dlog.appName on vm options to change it
* get_score refactoring + new parameter rsi_dqn+training early stopping
* maxtimeout in case no changes on memoryReplay
* saturday is not fx day
* PARQUET_PATH_DB by default on darwinex downloader
* fix minor
* update_darwinex_database last week
* fix issue open candles
* plot interactive
* reading number of states from same method
* removing open candles if midprice
* last total pnl fix sum
* check last column on txt
* default dqn with not rounded states
* better logs on not rounded states
* adding prefix to state by type
* add rsiValue to custom columns+plot when the algo is ready
* read memory_replay fix
* more logs on training
* checking boundaries + example json
* documentation on falces marin ratio
* get_candles_midprice_time
* add number of iterations to output df
* training periodically makes more sense
* training periodically makes more sense
* ZERO_VALUE_DEFAULT for equity curves with no dd
* all pnl calculations together and fix falces marin ratio
* trades calculation before!
* falcma ratio on score enum
* fix on one action
* rsi_dqn sample to fx
* darwinex market including leverage and midprice candles for fx
* darwinex can be backtested
* downloading data darwinex
* darwinex downloader data to nas
* creating darwinex instruments
* darwinex downloader data to nas
* min max prices on states in case of error
* comments on pnl to map
* get_max_drawdown
* adding get_sharpe as pnl
* adding metrics final
* adding to imports new algorithms
* linear constant spread algorithm
* linear constant spread
* Linear Constant spread algorithm
* Linear Constant spread algorithm
* isLSTM training
* adding constant spread algorithm + rnn parameter on dqn
* starting new ideas with RNN and constant spread
* better logs for parameter tuning erros
* better logs for parameter tuning erros
* fix parameter tuning on rsi_dqn
* unrealized pnl correction and 4
* Hampel score added
* last total pnl fix sum
* better logs and trading on strategy
* fix plot rsi_dqn
* plot iterations on set action
* disable both sides log once
* actions consider in the exit only
* controlling RSI side with position
* python entry style new param
* python entry style new param
* fix error getString default
* fix error getString default
* quoting styles
* unquoting style on quoting
* maybe no trades generated
* unquoting on trades +
* rsi_dqn training
* unquoting on trades +
* fix exit aggressive
* unrealized Pnl too wrong on 10 z scores
* exit aggressive
* exit aggressive
* exit aggressive
* rsidqn to algotrading zeromq
* rsi_dqn training
* RSI Side with level of and sides working
* rsi_dqn first algo commit
* RSIDQN strategy
* RSIDQN strategy all in one
* RSIDQN strategy all in one
* starting to work on dqn rsi with period rl
* rsi maxPeriod configuration
* mean reversion quoting strategies
* last total pnl fix sum
* last total pnl fix sum
* fix null pointer on init backtest
* fix unrealizedPnl
* fix unrealizedPnl
* subsample unrealized checker
* subsample unrealized checker
* limits of unrealized pnl
* test can train on each periods
* test can train on each periods
* limits of unrealized pnl
* avg open price calculation before setting
* limiting and checking parquet prices
* pnl snapshot chen open pnl
* remove normalization open_pnl
* remove normalization open_pnl
* results based on close data
* plot_open is optional
* normalize open returns by default
* normalize open_returns bool for plotting
* fix parquet data paths for engines
* check suffix ignore the rest
* persistor complete with suffix broker engine
* fixing instruments and metatrader engine
* binance persist by default
* more instruments
* adding metatrader suffix by market
* error on synthetic instrument file
* better print on live
* change list to set InterestedInstruments
* stat ab paper trading
* optimized trading stat arb
* more scores on ga parameter tuning
* pnl combination
* stat arb parameter tuning
* cleaning trades before backtest launched
* portfolio to csv fix
* unrealized pnl add to trades table
* include unrealized last row
* makes more sense on logic
* fix business logc
* logs limit market
* save trades include first trade
* save trades include first trade
* save trades include first trade
* passive quoting starting to make sense
* stat arb quoting seems ok
* stat arb quoting starting to work
* stat arb on trades - profitable backtest , paper not
* stat arb on trades - profitable
* regression into java path
* adding returns on trades for statarb
* fix some things on stat arb launcher + remving positino file
* round price and qty
* round price and qty
* avoid position creation in backtest
* avoid position creation in backtest
* avoid position creation in backtest
* stat arb optimization zentries
* fix error
* backtest for multiple instruments
* adding stat arb to python fw
* end of backtest printing
* end of backtest printing
* remove bakctest portfolio
* stat arb backtest multiple instruments
* stat arb
* fix quantity
* starting to work on stat arb backtest
* switch diff to zscore + console more decimals
* isPaperTrading variable to check time
* paper trading with stat arb logic
* return midprices
* paper trading with stat arb logic
* using returns statarb
* return midprices
* using returns
* first steps on stat arb algorithm
* regression to all portfolio done + strategy
* starting to play with ADF results
* stat_arb package
* stat_arb package
* candle generation using mlfinlab done
* candle generation using mlfinlab done
* candle generation using mlfinlab done
* cadnel generation and persistance time and tick
* paper trading map of instruments positions
* paper trading
* setting initial portfolio from file
* requesting info trading engine implement it
* fixing csv format
* algotradingZeroMq
* more instruments to binance engine
* zeroMq Paper trading
* fix zeromq configuration create socket HWM and linger

## metatrader_done
* fix logs
* fix engine and trading on zeromq
* set levels to 5
* fix backtest +add delay paper
* engine saving parquets directly
* mql5 for more levels on ask fix
* synchronized quote
* synchronized quote
* port mt5
* canceled notified wo error
* trades notified
* trades notified
* reading trades from mql5
* answering back
* receiving ER on Algorithm
* receiving ER on Algorithm
* receiving answers
* sending orders to mt
* limit the number of levels from mt
* starting to work with metatrader , more instruments
* service that send messages
* works like that once
* receiving data from zeromq python
* metatrader market data implemented
* metatrader listening market data
* metatrader listening market data
* add more instruments
* ignore dll in mt folder
* metatrader starting to publish market data
* metatrader starting to appear
* metatrader starting to appear
* metatrader starting to appear
* fix paper trading arquitecture ...mocking the real gateway
* trying to send orders to binance
* Merge remote-tracking branch 'origin/master'
* demo broker interface+keys
* directional fix with values
* not sending on empty side
* MAX bracket price AS + fix paper trading double ER
* paper trading running with results
* paper trading starting to see ok
* live trading with ER running
* live trading with ER running
* live trading with ER running
* live trading with ER running
* starting to live paper trading + changes on levels depth+Candles fix bugs
* better logs on trained nn + change order train and copy to all iterations
* rsi implementation
* rsi exit strategy
* rsi implementation
* rsi implementation
* rsi implementation
* adding RSI strategy with tictactec
* directional algos
* not autoenable it+logs change
* set verb only if change
* add changeSide option
* add changeSide businessLogic
* parameter tuning on directional , be able to not clean experience
* directional more possibilities
* directional more possibilities
* directional more possibilities
* include directional into python
* creating candle Manager + first directional strategy
* parameters.keys check
* synchronized on update state
* better prints
* better prints
* historical actions array
* fix filter state bug with index
* deep learning + explore policy with seed
* clean models in training
* better logs
* state found/not found
* better logs for state found/not found
* better logs
* better logs on loading/saving things
* more logs loading /saving files
* filter states checking number of states
* filter states checking number of states
* get number of state columns fix filter
* epsilon fix
* epsilon fix
* better logs combining memory_replay
* fix method get on limit
* memory replay size fix things
* memory replay size fix things
* memory replay size fix things
* memory replay size fix things
* better logs initialized
* stateExist fix Size
* dqn script
* fixing parameters passing to dqn
* loading model settings from parameters
* check null pointer and synch state row exist
* cuda chan
* cuda chan
* cuda chan
* cuda chan
* better logs
* check index out of bounds
* better logs
* queues synchronized
* checking lastclose
* fix issue with avellaneda action columns
* fix issue with avellaneda action columns
* fix issue with avellaneda action columns
* check training inputs with current memory to train
* fix retries new population
* fix issue with avellaneda action columns
* train parameters
* rmove numer_epoch
* early stoppin
* returns hist
* early stoppin
* fix retries new population
* early stoppin
* early stoppin
* fix retries new population
* plotting params
* adding more columns parameters plotting
* fix retries new population
* fix retries new population
* fix retries new population
* pnl utils
* fix retries new population
* fix retries new population
* early stoppin
* early stoppin
* early stoppin
* early stoppin
* early stoppin
* early stoppin
* fix retries new population
* fix retries new population
* print save /load
* System print
* log to file backtest
* changing csv trades
* fix retries new population
* get current state synchronized
* fix retries new population
* candle model
* set instrument is not changing algo info
* candle model
* candle model
* candle model
* fix batch size error train
* candle model
* test json + train test json
* log number of columns
* market state error
* fix retries new population
* combining looks good
* fix retries new population
* combining memory replays
* candle model
* candle model
* candle model
* custom column saving
* typo
* custom columns
* custom columns in trade csv
* default is not training
* avoid error due to long loading models
* savinf custom column to trades
* fix things
* mutation crossover checking
* fix retries new population
* merge q matrix with memory replay
* fix retries new population
* disable side AvellanedaStoikov
* fix retries new population
* fix ga parameters inmutable dict
* remove input json optional
* print counter algorithms with id
* fix retries new population
* candle model
* candle model
* candles state relative
* fix retries new population
* plotting param dicts in ga parameter  tuning
* eur tether binance
* more fix to time by day
* fix retries new population
* temp path creation properties
* fix filtering in old format
* fix retries new population
* configuration python temp
* filter forcing private states
* parquetdatabase cache CSV
* clean experience with memory replay
* feature importances notebook
* fix mpl error
* fix retries new population
* remove java library path from
* remove java library path from
* remove java library path from
* remove java library path from
* less sigma for each retry
* ga_parameter tuning fix
* fix ga parameter tuning
* remove java library path from
* dropna tickdb
* remove java library path from
* include cvxpy
* remove java library path from
* remove java library path from
* mlfinlab upload it
* plot style white
* remove java library path from
* fix imports
* remove java library path from
* remove java library path from
* remove java library path from
* remove java library path from
* remove java library path from
* logger
* tick db fix
* stateColumnsFilter
* algorithm set parameters
* training stats into training json
* todo method
* training with stats
* reducing loaded data +double check null states
* features importance ready input
* dont ask number states DQLearn
* empty list from python
* candle model
* candle model
* candle model
* private state autofill only if 5 minutes and no changes
* state save
* backtest by hours working
* better logs initialized+backtest by hours also
* default change to market
* fixing candle updates
* candle model
* starting to have candle/market state
* fix lmax version
* candle model
* filtering states
* training java is working now
* training a nn
* jar dl4j seems to be working
* updating cuda deeplearning4j version
* better logs
* fix ui sqlite version
* training stats module + delete java path app
* training a nn
* training a nn
* adding comment to link with python
* training a nn
* starting to work with NN
* memory not loading for AS
* dqn using deeplearning4j
* configuration path
* notebooks to train /test algos
* lambda imports
* email and save
* email and save
* fixing training combine q matrix
* fixing training combine q matrix
* disable logs backtest
* increasing population without elite
* fix ignored keys ga operations
* parameters to string at the end
* parameters to string at the end
* fix arrays
* ga outputs
* ga outputs
* black it format
* fix crossover
* param_dicts output
* fix crossover
* fix crossover
* ga parameter tuning launching
* parameter transformation
* q learn load matrix
* QLearn starting to be launched from python
* QLearn starting to be launched from python
* fix set min max parameters
* print algo detected
* change csv files
* change in parameters things
* backtest with q learn works
* private state not delta
* adjusting number decimals
* loading q state cache
* AvellanedaQ starting to launch it
* AvellanedaQ starting to launch it
* AvellanedaQ starting to launch it
* first Q Learn strategy approach
* tests for states done
* States saving cache of iterations
* abstract state with combinatics seems to be working ...iteration method + incrementing
* junit testing
* first RL approach
* REMOVE FINAL CSV params
* python launching backtest and returning df
* backtesting from java
* inputconfiguration startswith and remove counter
* json reading file
* executing backtest from command line
* launcher jar
* executing backtest from command line
* executing backtest from command line
* executing backtest from command line
* executing backtest from command line
* backtest from output
* BACKTEST autonomous execution with properties for input - output files
* BACKTEST autonomous execution
* backtest of more days
* cancel Rej error fix
* cancel Rej error fix
* command in zeroMQ with repREQ conversation
* less logs , another  new day backtest
* java backtest connected to parquet database
* avellaneda single thread same results
* is finishing zeromq
* initial sleep backtest enable again+ cant quote not started
* fixing ZeroMq backtest way to test it
* Cf trades received less logs
* infer in case of error
* infer in case of error
* orderbook check timestamp updates past
* avoid redundancy on one thread
* removing instrument object for all communications to intrument PK
* log by levels
* initial commit
* less things Thread priority low
* constant spread cant calculate spread
* constant spread for benchmark simple algo
* remove some logs + order to be canceled on disable
* playing with data
* lambda data analysis
* Quote Side Manager working
* trying to fix same backtest always
* not persisting java parquets yet
* fixing reading parquet backtest
* fix set timestamp
* forcing timestamp to int
* backtest more than 1 one
* reading python packages
* csv to parquet
* reading parquets from python
* tima back remove logs
* quoting in same thread
* no errors concurrent
* async log done
* backtest starting to be similar
* cleaning csv file before parquet
* cleaning csv file before parquet
* csv_to_parquet script
* MAp of orders checking manager
* checking requestMap is not blocking
* parquet searching failures
* better logs printing depth in case error
* quotins seems to be working
* stopping side if trade happens
* adding InstrumentManager to work with multiple instruments at algorithm
* logs commented
* logs commented
* log async with debug
* csv_to_parquet script
* csv_to_parquet script
* csv_to_parquet script
* creating parquet from java not working -> disable
* mark to parquet
* move parquet done to raw
* renaming file
* moving file
* moving parquets
* persistor that moves
* add persistor de csv final
* changes
* remove class files to commit
* removing things + log change
* persistor logs as debug
* persistor logs as debug
* fix minors
* persistor logs as debug
* moving market data and trading engine connectors to common
* csv utils logger debug
* persistor logs as debug
* save paruqet compression
* backtest seems better working + logs in console + debug printing
* fixing quoting + logs
* max retires to log
* remove double system separator
* options to hadoop unix
* remove double start / stop
* Threadpools with priorities
* refactor backtest engines , drop csv package
* checking depth Orderbook manager fill depth
* backtest for parquet files configured
* avoid errors on csv with less columns
* fixing pom version errors
* error on reading csv fix
* fix the error on change of day
* try except
* not zipping processed files
* persisting parquets depth + trades
* parquet depth transformation columns
* parquets creation
* delete processed as boolean
* no files checking to processed
* binnace reconnector thread
* zipping files processed
* parquet writing and reading
* including hadoop at resourcers+starting to create parquets
* CSV and parquet data manager new interface
* CSVable DataManager parquet and csv to test it
* swing java wth freechart embedded
* plot parameters each iteration
* starting to have GUI to show orderbook
* plotting orderbook
* plotting gcf added
* training model plotting
* starting to play with GUIs
* from trade fill orderbook filling
* from trade fill orderbook filling
* from trade fill orderbook filling
* from trade fill orderbook filling
* from trade fill orderbook filling
* fixing things with not depth complete+boolean at interface listeners
* fix orderbook bugs
* fix orderbook bugs
* fix
* fixing depth error notificacion backtest
* forcing UTC in java
* saving data in the nas
* script unix
* more properties adding
* less logs on App
* script start saving
* binance engine executable
* creating package
* binance engine looks ok , todo testing
* checking market and trade events by last time
* persitance fix
* csv fix issues
* broker trading engine done
* setting k_default avsellaneda stoikov
* starting binance trading engine
* fix the null issue
* MarketData with persistor
* Binance Market data parsing
* Binance connector for market data
* MarketDataPersistor is working
* file name in utc time
* mock with dates updated + persistos is saving
* csv persitor starting to get shape+App
* date formats in CSV
* backtest seems to be right!
* AS seems to be working fine ... ready to fine tuning it
* avellaneda is working in selected times
* avellaneda with target position
* avellaneda with target position
* dates in plotting + cleaning trades
* persistor to be tested
* error cancelling quote final
* STATISTICS static + fix infinite Report
* TimeService sleep
* TimeService sleep
* time things fix + csv printing Depth + Trade
* first version of commonLib with Lombok!
* first version of commonLib with Lombok!
* command with date
* null pointer fix
* time things
* less trades depending of spread multiplier
* depth can happen in fast way
* Orderbook to Depth synch + better prints
* as
* avellaneda stoikov
* warn on too big reserveprice
* first version of commonLib with Lombok!
* first version of AS in java
* instrument to String change
* Algorithm observer with my orders info
* fix minor execution reports + quote in a thread
* persistor
* plottting results + starting persistor MarketDataConnector
* Configuration default paths
* market maker is cleaning and depth is seem to be around 5
* algorithm notifier/listener + portfolio manager
* portfolio manager implemented
* portfolio manager added
* when stop is received saving trades
* commands to algorithm
* both backtest working but slower
* CSV ZeroMq is not blocking
* getting stuck in backtest
* Ordinary backtest is running
* Constant Spread working
* fix minor
* registering Ordinay is throwing StackOverFlow
* CSV Ordinary BACKTEST starting
* less statistics
* abstract backtest ZeroMQ starting
* save trades method on algorithm
* trading with zero mq
* backtesting
* trading engine not connecting to backtest
* starting to algorithmic trading
* less messages lost on zeroMq republisher
* fixing the app + filtering on topics good
* refactoring name
* ZeroMq connectors working but deleting messages on fast backtest
* playing with zero mq and messages lost
* backtest market trades only algo execution!
* adding Client Order id to paper engine
* same trader fixed
* trading engine listening on paper trading
* more comments and todos
* threads chosen in connector
* quoting an Algorithm abstract class
* finishing market maker backtest
* Execution report notification
* trading engine seems to be working
* timestamp from file
* Depth from snapshot fixed + get Spread formulas
* starting to logic the orderbook
* first version of commonLib with Lombok!
* commit backtest backend engine
* first version of commonLib with Lombok!
* refactoring to trade engine the notify method
* publisher zeroMq with threads
* initial sleep or start receive+command enum
* updating to receive in MarketData provider
* reaching the paper trading engine
* starting to receive data paper
* Observer pattern as connector
* fixing math dependency
* Starting to create backtest/paper arquitecture
* STATS format cleaner
* CSV publisher working
* reading files for backtest
* CSV reading...starting to create Config
* starting reading csv files
* painting
* market data painter not working
* sending/receiveing mock
* Zero Mq Market data connector
* first version of commonLib with Lombok!
* Publishing mock depth + statistics
* publishing depth
* mock market is publishing
* playing with generation synthetic mock depth
* starting to launch MockMarketDataPublisher
* starting to work on market data provider
* get in shape!
* first version of commonLib with Lombok!
* load trained net
* load trained net
* load trained net
* import
* import states into notebook
* add model
* testing phd script
* executing phd binaries
* executing phd binaries
* executing phd binaries
* feature importance generation get columns
* feature importance future data faster
* fix ob update
* fix ob update
* add new algos
* logs better
* save_load clean seems to be fixed
* fix different groups fillna ffill
* saving
* dqn avellaneda seems to be done
* replay buffer reduce + group by with fillnas is done?
* trying q learn that improves
* market state inot qlearn
* fix exploitation q matrix
* fix exploit q learn
* fix exploit q learn
* change main to btc_usd
* avellaneda q learn with private
* none is not set
* remove log
* fix state messy things
* fix minor
* private fixed
* convergence loop done
* clean before
* clean before
* SAVE_SCORE_DIFF_REPLAY_BUFFER as param static
* states better suited
* add stochastic exploit
* nn training better arq
* minors
* score diff
* score diff
* action is only risk aversion
* less nn
* change possible errors at input params
* add check prices to quoting to be sure price is not crossing
* fix minor nan to num
* fix minor nan to num
* fix minor
* empty candles fill with zeros
* fillna before grouping
* relative to midprice optional + fix partial filleds
* use next state score
* train early stopping
* fix quoting bug in error sending
* executable to play better
* trade logs
* trade logs
* fix private column names
* filled backtest
* filled backtest
* filled backtest
* reward diff set by constant
* fix inifinity and zeros
* removing next state score dqn+cache in the method in replaybuffer+save file after test
* removing next state score dqn+cache in the method in replaybuffer+save file after test
* setting explore_prob
* hours in case of bigger plots
* dates import
* plot error
* fix plotting time issues
* fix plotting time issues
* fix saver file
* add some indicators for candles
* remove last change
* save to file not overriding scaler
* saving avellanedaRL to specific file
* better logs
* training in parallel real
* clean trades after testing + better logs
* clean trades after testing + better logs
* fit for boosting fix
* fit for boosting fix
* fit for boosting fix
* lower delta
* better approach to default ealy stopping
* combination error fix
* skew_price_pct_actions can be like normal
* fix bug of fit tf + prepare for pickling?
* fix bug of fit tf + prepare for pickling?
* fix minor
* fix print text
* better plots with texts and no returning plt in function+tf EarlyStopping
* adding purge_embargo to pipelines
* nothing changed...just comment diff
* include horizon periods
* changes to pickle + horizon periods is variable
* load replay buffer
* fixing feature importance
* market_and_minute_candles_state.py and changes related to store it
* skew price
* default skew price actions
* default skew price actions
* trade quantity check reader
* trade quantity check reader
* trade quantity check reader
* trade quantity check reader
* trade quantity check reader
* fix minors
* fix minors
* fix minors
* adding new algoSkew as nn
* new AS with skew
* new AS with skew
* feature importance candles day before
* remove ensemble
* feature importance with previous candles + mlfinlab
* trying te create a starting mode to create df to feature importance
* cant quote quantity<0
* cant quote quantity<0
* pipeline test tradition working
* test sample slowdown
* invert fix
* fix minor
* fix minor
* fix minor
* typo fix
* adding inversion to pipelines to test asc and desc env
* remove small amopunt of trades parameter tuning
* train better logs
* can send negative prices
* avoid error random
* sequential in one proccess
* sequentia training for nn configuration
* resetting algorithm for plotting params
* fix minors - retraining pipeline
* fix minors
* int in max_buffer size
* overbuffering replaybuffer
* removing spaces in names
* get next action only one time
* cleaning models more verbose
* load the rest if replay buffer is corrupted
* setting explore_prob on training declining
* adding possibility of test another phase
* decaying explore pro each training iteration
* decaying explore pro each training iteration
* loading from file parameter tuning
* replay buffer when filled is returning index to zero
* replay_buffer sorting by time arrive
* try_except plotting params
* add as int
* add as int
* change nn arquitecture
* change nn arquitecture
* reward change better than abs value
* fine tuning -> change reward to absolute reward + round states can be removed
* fine tuning -> change reward to absolute reward + round states can be removed
* minimun exporation prob
* minimun exporation prob
* minor fix
* avellaneda stoikov tick data
* dqn change default loss to mse and optimizer to sgd + move bellman
* nn for more inputs
* setting all candles
* mean quantity /10
* fix pickling AS RL
* notify las close trades
* plot model not always ok
* fix extensible array
* reinforcement scikit another check len replay buffer
* trainable periods based on replay_buffer length
* replay_buffer trainer working and avellaneda changed for 38 columns
* replay_buffer saver to analyze
* filtering candles
* replay buffer mark states with futures
* get best candles with midprice in 15 secs
* manually filtering candles avellaneda
* replay_buffer saver  +
* saving replay buffer with future midprice
* minute_candles state in avellaneda_stoikov_rl
* creation models without sequential
* creation models without sequential
* adding mse as metric by default not mae , loss is categorical_crossentropy
* chaging some minor bugs
* unsing next state in replay buffer
* autoencoder generating
* autoencoder is generating something with more sense
* playing with tf and loss function
* instrument info generates instrument_info
* nn creates depth + trades
* generation of trade data poisson done
* generation of trade data poisson done
* transformer to 0-1 standartsized
* save autoencoder + load
* starting trade data
* weights to file!
* vae configurable completed
* vae configurable
* testing vae works
* testing vae works
* testing vae
* fix depth regeneration
* fix depth regeneration
* autoencoder fixing inconsitencies
* method to check inconsistencies depth data
* executing working
* avellaneda has no param updates
* more functions to autoencoder generator
* more functions to autoencoder generator
* ga_parameter_tuning
* AutoEncoder multilayer built
* autoencoder mlp encoder and autoencoder works
* autoencoder
* simple autoencoder done
* fix bug
* ga_parameter_tuning
* adding tensorflow possiblity
* playing with autoencoder
* removing lowest rewards before in replay buffer
* replay buffer removing duplicates rows and remove pandas series
* testing avellaneda _rl
* fixing something in quoting
* starting avellaneda_stoikov_rd + array prealloc class
* remove logger
* ga_parameter_tuning
* ga_parameter_tuningfix
* fixing parameter tuning algorithm
* ga_parameter_tuning
* plotting rolling sharpe
* more comments and fix get_best_algo parameter_tuning
* remove warnings
* adding pnl snapshot and fixing quoting single instrument
* removing min_batch_size to training_iteration_period
* removing min_batch_size to training_iteration_period
* removing min_batch_size to training_iteration_period
* fix tests + checking quoting partial filled already filled
* found issue in reinforcement learning reward objetc update
  * changing pnl snapshot to get orderbook
* fix flow of new ER in trade engine
* checking counter orderbooks
* communicate start_stop optional
* better logs avoid error q_matrix replay buffer
* stop  better logs with algos
* adding multitasking prefix and change common
* common backtest is fixed flow + aggressive algo
* new fix flow in zeromq backtest start to work
* better lgos end of backtest common + errors capture
* portfolio fixing
  * +
  * backtest trade engine always answer first new if filled or partial filled
* common backtest fixin
* removing min_batch_size to training_iteration_period
* fixing portfolio
* checking order exists before deleting
* plotting to tensorboard and better logs in deep q learn
* numpy replay buffer
* numpy q_matrix
* removing epochs
* fixing some things what load - reset - save and ordering backtest
* reinforcement_learning fixing
* fix fix communication protocol
* upload multitasking
* adding multitasking commented
* adding tensorboard to execution
* adding callback interface to deep_reinforcement learning
* removing min_batch_size thing
* model is not None check
* requirements conda+mlfinlab in alpha
* more DEBUG options
* fast console aplication of what
* fast console aplication of what
* fast console aplication of what
* add a better trace
* combination and training test
* adding test tradition to pipeline
* fixing pipeline trades
* try except in get trades df
* no trades return empty df
* phd and combination of ga parameter tuning
* fixing combination and q raw
* trades doesnt exist
* fix executable
* portfolio rl change
* numpy replay buffer
* faster
* q learn measuring time
* q matrix index
* q matrix to numpy
* fixing rest algos self.trades
* fixing rest algos self.trades
* better performance trades dataframe
* optimizing add_trades function
* black it
* fixing boosting algorithm
* verbose to tests
* fixing portfolio_weights
* fixing things for portfolio_rl
* fixing things for cythonization
* before cythonize
* market_making_py
* cython is not helping
* preparing for cythonize
* fixing
* fixing common backtest errors
* adding some logs and prints to fix commonbacktest
* volatility algo add results
* trying to optimize using python , not really improvement and test speed
* cleaining portfolio but not constituents
* add prviders and trade engine
* not loading at begining
* avoid combine pkl files
* fix typos
* load prediction file try except
* fix combination
* clean models with pkl files and norms
* adding model kwarg
* delete if exist always , not checked training
* clean model
* njobs to one in multiple regressor
* some details
* fixing things
* fixing bugs param_dicts
* phd update
* remove deep quantity
* updating notebook with boosting and param_dict in executable
* model in the right place
* pathos single cpu in pool +
* externalize model
* deep bossting algorithm ready
* portfolio train Phase
* portfolio_rl first approach + fix canceling orders
* fix model multipleregressor
* removing todos and epochs and reduce fix
* add option of permutation to differente umbers of repeeats
* first draft of a portfolio_rl with boosting model
* cleaning last_state
* instating only once in server engine
* common backtest for dqn testing
* execution common market
* less speed in test
* pipeline saving with algorithms already trained
* neural network trained error fix
* resetting buffers to add new rows
* error training nn
* trying to solve error Shape_6 has not attr named _class in tensorflow training
* pipeline rest on portfolio test
* review pickling and single_instrument_algorithm reset
* portfolio fix inf price/quantities
* portfolio on modified
* portfolio fix partia filleds
* better logs in case of trade+portfolio score negative => not chosen
* pipeline default portfolio score in open_pnl
* pipeline default portfolio score in open_pnl
* adding snakeviz to profiling notebook
* portfolio ml reduce
* adding reduce for pipelines
* raise exceptio backtest
* raise exception if instrument info has no data
* pathos single cpu in pool +
* notebook with benchmark comparing
* plot is returning the right thing
* printing position in reinforcement learning
* better plot of chart
* pathos single cpu in pool +
* forcing retrain in deep_reinforcement error
* error in gpu
* saving tensorflow normal , not hf5
* forcing share gpu method + error to warning
* logs for cpu,gpu and remove error log in processing order , remove free gpu memory method
* log ok
* better logs in stop cases
* remove forcing use
* changing forcing use cpu in test
* pipeline remove force cpu
* adding comparison with avellaneda
* forcing name is available
* better print in pipeline with folds
* pipeline test algorithm + better plots x -y label
* pathos single cpu in pool +
* reducing name len of pipeline algorithm
* pathos single cpu in pool +
* fix processes and force clean gpu
* free gpu memory starting training sequence
* force use cpu in backtest sequentially
* printing gpu memory usage
* clear session keras
* free gpu in sequential with
* pathos single cpu in pool +
* pathos single cpu in pool +
* try except in saving model
* fix error printing
* free gpu and remove split keras
* pathos single cpu in pool +
* free memory using numba
* sequntial is treat as parallel in pathos
* trying to fix tensorflow error in sequential
* focing gpu in training
* focing gpu in training
* error in quantity controlled to limit
* better logs and try / cathc on notfication of algos portfolio
* more updates on portfolio_ml to train data
* changing default boosting topca +  xgboost
* more comments on portfolio_ml
* focing gpu in training
* include jupyter dependency
* focing gpu in training
* forcing use of cpu in tests dqn
* set a maximun weight in portfolio_ml
* fix some things on fushimi and pipeline naming training reformatting
* seeing common backtest orderbook
* step
* drawdown from pnl no returns
* save pickling portfolio
* overwirte when saving tensorflow
* step
* plotting results backtest
* fixing ga things , more logs
* fixing crossover bug probability
* fix bug
* fixing phd notebook
* updating notebook
* q algo plotting
* adding plotting results of qlearn
* dill save
* including q learn in algos
* plotting instrument + k_default for stoikov
* fix the notebook inputs
* change portfolop
* formatting markdown
* more discretionary algos
* dill save
* fix pipeline parameter tunint and plotting
* dill save
* portfolio refactoring
* change backtest configuration to have more results
* ga_configuration using to configure in the different places
* dill save
* dill save
* plotting and dd
* better plots with dd and text box
* portfolio counting cancels and clean divide zero
* creating rows if algo not in training set , for training and testing later
* fix sending orders fushimi to ob
* fix k calculation
* more traces to get prices
* dill save
* plotting portfolio orderbook if verbose>1
* removing verbosity pipeline of inner algos and adding to portfolio
* avellaneda fix k estimation
* parametrized first hour and last
* fix fushimi gonzalez and no trades error
* formatting
* changes in format , decoration and phd notebook
* fix plotting parameter tuning results
* returning parameter tuning with backtest included in the algo
* returning algorithms directly on backtesting
* warn when adding
* plotting and test plotting last results
* fixing bugs loading from file
* adding pipeline log with number of rows to train
* forcin time to not be str + portfolio_ml saving zero scores
* new classical algos and final notebook defined
* starting to work on classic algos
* fix pipeline and portfolio
* warning when trainingg with no data in portfolio ml
* print weights in portfolio ml + size of pipeline in script
* max retries in algorithm send order
* appending reason in a rejection , not retrying
* warn when adding
* warn when adding
* warn when adding
* commbon backtest with kos with reason in trade engine and retries
* fix script for a lot of dqn + training returns a model now
* fixing tests and q matrix
* pipeline script
* training is training on multiple and combining dataframes + notebook reference
* phd_pipeline
* portfolio ml
* porfolio_ml boosting
* fix send order
* postfolio adding
* checking before deleting
* position reward commit
* json converter and test
* parent class that convert to json
* models from fix xsd implemented
* fixing inventory quantity to make more sense on sign
* fix portfolio modifying
* sharpe inf
* portfolio is appending qty strategies
* print uknown exception in send orders
* deep q learn with quantity
* playin with new reward penalizing position increased
* starting oanda connector
* paper trading showing my orderbook updated
* paper trade cleaner ... todo see my orders on print
* update orderbook live trading with our orders in print
* removing logs update q value
* removing logs update q value
* sequential training seems to be working
* playin with ib again
* fix log error
* training testing period script
* training testing period script
* starting to paper trading with a market data provider
* binance live working...
  * cleanin q learn algos
* working on live trading
* better comments on states
* keras limit memory per process in parameter tuning only
* play with keras shared memory in session in notebook
* play with keras shared memory in session in notebook
* update notebook with deepqlearn
* update notebook with deepqlearn
* removing max iter search
* load and delete keras is a folder
* loading saving keras models integrating with parameter tuning
* fixing deep q learn to discretize it
* fixing q learn and discretize it
* clean models forced optional each iteration
* clean models forced optional each iteration
* parameter tuning thought to RL
* time_horizon_seconds as constructor variable
* addin cufflinks iplot dependencies
* informed algo implemented+instrument info dataframe
* more options to study
* reward staticmethod to get score column name
* better executables
* qvalues are difference in reward of time horizon values
* reduce size of q matrix by best action value
* fixing pnl calculation position small
* more random
* comparison
* cleaning models files
* cleaning models files
* on more log to remove
* from keras to tf
* less logs and close_pnl_reward
* training
* training
* min and max batch size ready
* time horizon training on rl
* time horizon training on rl
* to int a lot of things
* to int a lot of things
* clean models by default
* max batch size of qmatrix and buffer matrix + drop duplicates
* adding kaggle env + recordtype
* changing around how are saved
* adjusting market state to midprice
* private state score diff
* q learn improving...
* adding dd formula
* q learn spread learn params
* no trades
* no trades
* initial state set to zero by default
* better documentation update q values
* reinforcement learning get pnl fast in states
* reinforcement learning get pnl fast in states
* reinforcement learning get pnl fast in states
* private state
* import everything
* import everything
* removing check prices of algorithms + fix portfolio + deep nn cancel before train
* changing fast reward
* fast reward function
* excel manual test fine tuning on open pnl and close pnl
* removing cacheing get_trade_pnl
* better logs and interface to not calcualte 2 times pnl
* fixing close returns .. no infinite
* more  decimals in log
* adding trade better logs
* logs only verbose >2
* jupyter_contrib_nbextensions fot thor error
* black it
* remove todo
* open returns moved to numba
* pnl taking into account last change of position and adding returns
* passing the tests pnl
* open pnl with price
* open pnl with nominal
* taking data by date
* sharpe over close returns
* pnl fix and tests
* remaining position in pnl utils fixing?
* remaining position in pnl utils fixing?
* remaining position in pnl utils fixing?
* fixxing common backtest
* fixxing common backtest
* test separate and common done clean trades df
* fixing number of trades between multiprocess and single
* error is in dictionary of backtest_trade_engin of self.order_ids_sent not found order + logs
* backtest debugging is not sending exec reports with >1cpus
* best_score_trades
* parameter tuning notebook sample
* backtest add number of trades of population
* logger not set variables
* clear cleaning model
* clean models iteration 0
* clean models out at the end of start + add speed -1 to default q_learn
* fix stuff on reduce function
* reward in notebook + less logs on algorithm
* combining temp files and clean orderbook refactoring
* cleaning outputs parameter tuning
* ga parameter tuning + orderbook cleaning
* controlled backtest done
* rejection self trading
* last trade are working for backtest
* black it
* change empty score to -inf
* fixing tests that broke
* deleting file if not exists
* better logs and fix get pnl parameter tuning
* fixing execution reports contruction from trades-> returning lists of order_management
* before changing all outputs of send order in case >1 execution report
* before changing all outputs of send order in case >1 execution report
* before changing all outputs of send order in case >1 execution report
* adding sharpe and pnl to results in ga_parameter_tuning
* fixing tests
* testomg orderbook and fix bug in OrderTree initialization
* requirements update
* remove conda requirement
* remove conda requirement
* remove conda requirement
* remove conda requirement
* remove conda requirement
* remove conda requirement
* update requirements
* fix errors in dill
* moving kwargs to param dicts in reinforcement learning to optimize it
* change to joblib + black it
* change to joblib parallel
* weights error fx
* remove orderbook threadi safe
* score column as ga_configuration
* lock in orderbook to thread safe processing/cancelling/modifying orders
* chcking none
* fix error out of range
* adding sharpe
* fixing backtest multiprocessing stuff
* fixing backtest multiprocessing stuff
* fixing backtest multiprocessing stuff
* notebook imports
* notebook imports
* notebook imports
* notebook imports
* notebook imports
* adding random seed
* adding param dict to logs
* debug logs to find files
* fixing reward result in replaybuffer
* fixing q table overwriting new data
* fixing to have 4 actions
* email uil + fix logger
* more logs and  instrument info
* skipping test takes long
* ga more tests fix some bugs on algorithm send order/modify in rejection
* adding elite to ga algorithm
* notebook for powershell
* removing notebook
* remove binance dependency
* parameter tuning seems working + common backtest class
* parameter tuning seems working + common backtest class
* separate backtest + common backtest
* logs are working in json
* fixing errors in rl algos and readme and paths
* adding logs in trade engine and md
* reformat + black it all code
* backtest lancher with timeout ad logger os algos separate
* start/stop communication working in 1 hour
* copying orderTree
* short backtests are working
* one mock algo to close backtest still frozen one of the algos is lot of queue
* fixing clients bin and replay buffer random action
* closing pool with a leader strategy
* backtest_launcher checking ports before starting
* starting sequentially done
* communicating stop in rep socket and closing the pool is done
* stop communication when backtest file finished to algos
* testing launching process with pout
  * more logs
  * tick size in orderbook
* more logs
* speed multiplier set to zero
* speed multiplier set to zero
* refactoring to have more algos / actions/rewards
* fixing orderbook plotting
* we are launching multiprocess
* reduce and pickling test to have joblib working
* change algorithm init params and start
* fixing the tests
* refactoring configuration to mm_configuration
* update exec report
* fixing cache get pnl
* fixing cache get pnl
* refactoring scripts
* launcher alone
* parllelzing
* parllelzing
* parallelizing start
  * TODO save stats per run
* multi process pathos
* backtest launcher starting to work on
* training deeq learn passing from nn prediction to target with learning rate
* replay buffer seems to be working with deep q learn
* replay buffer seems to be working with deep q learn
* starting to make sense in deep q learn
* bif refactoring on reinforcement , better understanding of deep q learn
* reiceiving trades and execution reports!
* starting to work different algos
* starting to work different algos
* sending trades problem in reception
* sending trades problem in reception
* server backtest implementation v1
* starting to play with zeromq+timer in start+remove sleep times backtest
* starting to play with zeromq+timer in start+remove sleep times backtest
* deep nn plotting
* testing deep table and q matrix
* adding scripts+setup
* running method
* running method
* notebook trains algorithm
* addin deep nn file with q value table
* Merge branch 'master' of bitbucket.org:javifalces/cryptotradingdesk
  * Conflicts:
  * python/market_making/algorithm/machine_learning/reinforcement/deep_reinforcement/deep_nn_reinforcement_algorithm.py
  * python/market_making/algorithm/machine_learning/reinforcement/deep_reinforcement/deep_reinforcement_algorithm.py
* adding market states+documentation general
* deep nn with market state and tests , epochs already included
* adding epoch as input
* deep nn working
  * TODO test all new things
* deep q learn is starting to work
* all instruments saving no ending
* all instruments saving
* start first 4 instruments
* new instruments
* add the new instruments
* changing save script+instruments
* changing save script
* deleting df each new day in bin script
* deleting df each new day in bin script
* adding save model and normalizer as input in models
* more logs qmatrix working
* installing tensorflow 2.0
* deep rl skeleton done
* saving data 23 hours and 55 mins
* saving data 24 hours
* starting to set up deep q learn
* fix bellman function and q learn algo
* fix bellman function and q learn algo
* saving by time and loadig files before to continue updating same day
* saver and loader files to heimdall
* removing datetime type , error
* removing datetime type , error
* datetime.datetime.min
* saving into right folder
* ready to refactor q algo functions and start testing the classes and debugin for errors
* q learning starting to operate
* q learning starting to operate
* q learning starting to operate
* starting to qlearn with private variables
* starting to create reinforcement learning fw
* starting to create reinforcement learning fw
* starting to reinforcement learning algorithms
* add tests on remaining order
* add tests on remaining order
* add tests on remaining order
* fixed numba function and log when filled
* open and close pnl and tests working backtest
* pnl calculated using numba with update of version to use dicts
* imbalance trading 82% coverage
* imbalance market making algo with tests
* portfolio seems to be right
* backtest notify finished
* tqdm backtest percent
* all test passed
* orderbook algo appears
* pnl calculation + test
* fix calculation trades with execution reports
* portfolio sending weighted price and  qty
* starting to portfolio algos
* inventory algo skew done
* test analyzing portfolio pnl algorithm
* test analyzing portfolio pnl algorithm
* test analyzing portfolio pnl algorithm
* backtest reader in a thread
* backtest reader in a thread
* all test passed
* notifies at the end of orderbook sending
* method to get orderbook snapshot from orderbook and fix len
* testing volatility algo with mock
* backtest trade engine test
* backtest trade engine partial filleds works!
* trade engine starting to test
* change orderbook impl
* backtest is operating in ina orderbook ,same as trade
* saving data eth_btc
* market maker historical and live provider , first fw done
* notebook ready to analyze market making
* refactoring
* trade subscription + saving dataframe
* creating series and dataframe of depth book
* change log configuration
* market data updates listener
* first commit with binance provider and snapshot model
* Initial commit

