import pandas as pd
import copy


def reduce_memory_usage(df: pd.DataFrame) -> pd.DataFrame:
    '''
    Reduces memory usage of a pandas dataframe
    Parameters
    ----------
    df

    Returns
    -------

    '''
    import numpy as np
    cols = df.select_dtypes(include=[np.float64]).columns
    df[cols] = df[cols].astype(np.float32)
    return df


def join_by_columns(table_1: pd.DataFrame, table_2: pd.DataFrame) -> pd.DataFrame:
    # df1 = df1.join(df2)
    # df1 = pd.concat([df1, df2], axis=1)
    assert table_1.shape[0] == table_2.shape[0]
    try:
        output_df = copy.copy(table_1)
        output_df = output_df.join(table_2)
    except:
        output_df = copy.copy(table_1)
        table_2_columns = []
        for column in list(table_2.columns):
            if column not in table_1.columns:
                table_2_columns = pd.concat([table_2_columns, column], axis=1)
        if len(table_2_columns) > 0:
            output_df = table_1.join(table_2[table_2_columns])

    return output_df


def join_by_row(table_1, table_2) -> pd.DataFrame:
    # Check if either DataFrame is empty
    if table_1.empty:
        return table_2.copy()
    elif table_2.empty:
        return table_1.copy()

    # Both DataFrames are non-empty, proceed with concatenation
    output_df = table_1.copy()
    output_df = pd.concat([output_df, table_2], axis=0)
    return output_df


def join_two_timeseries_different_index_ffill(
        table_1: pd.DataFrame, table_2: pd.DataFrame
):
    table_1 = table_1.loc[~table_1.index.duplicated(keep='first')]
    table_2 = table_2.loc[~table_2.index.duplicated(keep='first')]
    concat_df = pd.concat([table_1, table_2], axis=1)
    concat_df.index = pd.to_datetime(concat_df.index)

    concat_df = concat_df.sort_index()
    concat_df = concat_df.ffill().fillna(0)
    return concat_df


def join_by_columns_two_timeseries_different_index(
        table_1: pd.DataFrame, table_2: pd.DataFrame
):
    table_1 = table_1.loc[~table_1.index.duplicated(keep='first')]
    table_2 = table_2.loc[~table_2.index.duplicated(keep='first')]
    concat_df = pd.concat([table_1, table_2], axis=1)
    concat_df.index = pd.to_datetime(concat_df.index)

    concat_df = concat_df.sort_index()
    return concat_df

def transform_dataframe_index_plot(
        df_in: pd.DataFrame, format='%Y/%m/%d  %H:%M:%s'
) -> pd.DataFrame:
    '''
    Transforms df_in datetime index in a index of strings to avoid blank spaces in plot
    Parameters
    ----------
    df_in

    Returns
    -------

    '''
    df_out = copy.copy(df_in)
    df_out = df_out.rename_axis('index').reset_index()

    time_index = df_out['index']
    time_str_index = time_index.dt.strftime(format)
    df_out['index'] = time_str_index
    df_out.set_index('index', inplace=True)
    return df_out


def align_index(origin_df: pd.DataFrame, target_df: pd.DataFrame) -> pd.DataFrame:
    '''

    Parameters
    ----------
    origin_df we are going to align origin_df index to target_df index
    target_df the index we want to align to

    Returns origin_df aligned to target_df index
    -------

    '''
    closest_series = origin_df.index.searchsorted(target_df.index) - 1
    closest_series = closest_series[closest_series < len(origin_df)]
    output = pd.DataFrame(
        origin_df.values[closest_series, :],
        index=target_df.index,
        columns=origin_df.columns,
    )
    output.fillna(method="ffill", inplace=True)
    return output
