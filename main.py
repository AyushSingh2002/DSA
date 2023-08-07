import pandas as pd
from pandas_profiling import ProfileReport

df = pd.read_csv("train.csv")
print(df)

new_df = df.fillna(method="ffill")
print(new_df)

profile = ProfileReport(new_df)
profile.to_file(output_file="TitanicReport.html")