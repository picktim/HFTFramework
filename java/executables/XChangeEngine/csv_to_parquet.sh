#!/bin/bash
cd "$(dirname "$0")"

python3 csv_to_parquet.py /home/tradeasystems/lambda_temp/xchange_parquet_temp/processed /home/tradeasystems/lambda_data
bash clean_lambda_temp.sh
