import pandas as pd

details_1 = {
    'eid': [1, 2, 3, 4],
    'ename': ['a', 'b', 'c', 'd'],
    'stipend': [123, 131, 23, 434]
}

details_2 = {
    'eid': [1, 2, 3, 4],
    'designation': ['aa', 'bb', 'cc', 'dd']
}

df_1 = pd.DataFrame(details_1)
df_2 = pd.DataFrame(details_2)

dataframe = pd.merge(df_1, df_2, how='inner', on='eid')

print(dataframe)
