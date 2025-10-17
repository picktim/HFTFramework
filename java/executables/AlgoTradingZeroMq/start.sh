#!/bin/bash
cd "$(dirname "$0")"
nohup java -Xmx512m -Duser.timezone=GMT -jar AlgoTradingZeroMq.jar parameters_rsi_dqn_eurusd.json&
