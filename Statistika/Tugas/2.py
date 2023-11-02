import numpy as np
import pandas as pd
import scipy.stats as stats

# Data
data = {
    'Tinggi badan (cm)': ['150 - 154', '155 - 159', '160 - 164', '165 - 169', '170 - 174', '175 - 179', '180 - 184', '185 - 189'],
    'fi': [2, 6, 11, 12, 7, 4, 2, 1]
}

df = pd.DataFrame(data)

# Menghitung tepi atas dan tepi bawah kelas interval ke-4
interval = df['Tinggi badan (cm)'][3].split(' - ')
tepi_bawah = int(interval[0])
tepi_atas = int(interval[1])

# Menghitung mean
df['mid'] = df['Tinggi badan (cm)'].apply(lambda x: np.mean([int(i) for i in x.split(' - ')]))
df['fx'] = df['fi'] * df['mid']
mean = df['fx'].sum() / df['fi'].sum()

# Menghitung modus
df['f_prev'] = df['fi'].shift(1, fill_value=0)
df['f_next'] = df['fi'].shift(-1, fill_value=0)
mode_row = df[(df['fi'] > df['f_prev']) & (df['fi'] > df['f_next'])]
L1 = mode_row['mid'].values[0] - (mode_row['mid'].values[0] - df.loc[mode_row.index[0]-1, 'mid']) / 2
L2 = mode_row['mid'].values[0] + (df.loc[mode_row.index[0]+1, 'mid'] - mode_row['mid'].values[0]) / 2
mode = L1 + ((mode_row['fi'].values[0] - mode_row['f_prev'].values[0]) / ((mode_row['fi'].values[0] - mode_row['f_prev'].values[0]) + (mode_row['fi'].values[0] - mode_row['f_next'].values[0]))) * (L2 - L1)

# Menghitung Q2 (median)
n = df['fi'].sum()
F = df['fi'].cumsum()
Q2_row = df[F >= n/2].iloc[0]
L1 = Q2_row['mid'] - (Q2_row['mid'] - df.loc[Q2_row.name-1, 'mid']) / 2
L2 = Q2_row['mid'] + (df.loc[Q2_row.name+1, 'mid'] - Q2_row['mid']) / 2
Q2 = L1 + ((n/2 - F[F < n/2].max()) / Q2_row['fi']) * (L2 - L1)

# Menghitung variansi dan standar deviasi
df['fx_squared'] = df['fi'] * df['mid']**2
variance = df['fx_squared'].sum()/df['fi'].sum() - mean**2
std_dev = np.sqrt(variance)

print(f'Tepi bawah kelas interval ke-4: {tepi_bawah}')
print(f'Tepi atas kelas interval ke-4: {tepi_atas}')
print(f'Mean: {mean}')
print(f'Modus: {mode}')
print(f'Q2 (Median): {Q2}')
print(f'Variansi: {variance}')
print(f'Standar Deviasi: {std_dev}')
