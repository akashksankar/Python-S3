import pandas as pd

data = {
    'Name': ['e','a','a','b','c','d'],
    'Age': [1,2,1,3,3,4],
    'Rank': [0,1,2,3,4,5]
}

df = pd.DataFrame(
    data,
    index=['a1','b1','c1','d1','e1','f1']
)

print(df.to_string())

df.reset_index(inplace=True, drop=True)

print(df.to_string())
