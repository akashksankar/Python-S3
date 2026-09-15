import pandas as pd

data = {
    'cname': ['Company A', 'Company B', 'Company C', 'Company D'],
    'profit': [10000, -5000, 0, 25000]
}

df = pd.DataFrame(data)

df['profit'] = df['profit'] > 0

print(df)
