Nama : Syukrillah

Kelas : TIF RP 222PA

NPM : 22552011247


```sql
mysql://root:@localhost:3306
```






```sql
SHOW DATABASES;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Database</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>adm</td>
    </tr>
    <tr>
      <th>1</th>
      <td>information_schema</td>
    </tr>
    <tr>
      <th>2</th>
      <td>kode_desa</td>
    </tr>
    <tr>
      <th>3</th>
      <td>mhs_tif</td>
    </tr>
    <tr>
      <th>4</th>
      <td>mysql</td>
    </tr>
    <tr>
      <th>5</th>
      <td>performance_schema</td>
    </tr>
    <tr>
      <th>6</th>
      <td>phpmyadmin</td>
    </tr>
    <tr>
      <th>7</th>
      <td>test</td>
    </tr>
  </tbody>
</table>


# Penjelasan Singkat Data Base yang digunakan

Data Base yang akan digunakan adalah kode_desa, yang mana ini berisi nama desa, kecamatan, kota dan provinsi di tambah kode setiap wilayah. data tersebut merupakan update per-tahun 2018.


```sql
USE kode_desa;
```


This result object does not return rows. It has been closed automatically.



```sql
SHOW TABLES;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Tables_in_kode_desa</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>desa</td>
    </tr>
    <tr>
      <th>1</th>
      <td>kab</td>
    </tr>
    <tr>
      <th>2</th>
      <td>kec</td>
    </tr>
    <tr>
      <th>3</th>
      <td>prov</td>
    </tr>
  </tbody>
</table>


1. Tabel prov


```sql
DESCRIBE prov;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Field</th>
      <th>Type</th>
      <th>Null</th>
      <th>Key</th>
      <th>Default</th>
      <th>Extra</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>id_prov</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>PRI</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>1</th>
      <td>nm_prov</td>
      <td>text</td>
      <td>YES</td>
      <td></td>
      <td>None</td>
      <td></td>
    </tr>
  </tbody>
</table>



```sql
SELECT COUNT(*) FROM prov;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>COUNT(*)</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>35</td>
    </tr>
  </tbody>
</table>


2. Tabel kab


```sql
DESCRIBE kab;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Field</th>
      <th>Type</th>
      <th>Null</th>
      <th>Key</th>
      <th>Default</th>
      <th>Extra</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>id_prov</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>MUL</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>1</th>
      <td>id_kab</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>PRI</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>2</th>
      <td>nm_kab</td>
      <td>text</td>
      <td>YES</td>
      <td></td>
      <td>None</td>
      <td></td>
    </tr>
  </tbody>
</table>



```sql
SELECT COUNT(*) FROM kab;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>COUNT(*)</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>515</td>
    </tr>
  </tbody>
</table>


3. Tabel kec


```sql
DESCRIBE kec;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Field</th>
      <th>Type</th>
      <th>Null</th>
      <th>Key</th>
      <th>Default</th>
      <th>Extra</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>id_prov</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>MUL</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>1</th>
      <td>id_kab</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>MUL</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>2</th>
      <td>id_kec</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>PRI</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>3</th>
      <td>nm_kec</td>
      <td>text</td>
      <td>YES</td>
      <td></td>
      <td>None</td>
      <td></td>
    </tr>
  </tbody>
</table>



```sql
SELECT COUNT(*) FROM kec;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>COUNT(*)</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>7203</td>
    </tr>
  </tbody>
</table>


4. Tabel desa


```sql
DESCRIBE desa;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Field</th>
      <th>Type</th>
      <th>Null</th>
      <th>Key</th>
      <th>Default</th>
      <th>Extra</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>id_desa</td>
      <td>varchar(15)</td>
      <td>NO</td>
      <td>PRI</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>1</th>
      <td>id_prov</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>MUL</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>2</th>
      <td>id_kab</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>MUL</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>3</th>
      <td>id_kec</td>
      <td>varchar(13)</td>
      <td>NO</td>
      <td>MUL</td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>4</th>
      <td>nm_desa</td>
      <td>text</td>
      <td>YES</td>
      <td></td>
      <td>None</td>
      <td></td>
    </tr>
    <tr>
      <th>5</th>
      <td>st_desa</td>
      <td>text</td>
      <td>YES</td>
      <td></td>
      <td>None</td>
      <td></td>
    </tr>
  </tbody>
</table>



```sql
SELECT COUNT(*) FROM desa;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>COUNT(*)</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>83437</td>
    </tr>
  </tbody>
</table>


Di lihat dari jumlah data yang digunakan cukup banyak, untuk itu akan dilakukan LIMIT untuk membatasi jumlah output.

# Fragmentasi

## Fragmentasi Horizontal

Disini akan menampilkan data kabupaten dan id kabupaten


```sql
SELECT id_kab, nm_kab FROM kab LIMIT 100;
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>id_kab</th>
      <th>nm_kab</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>1101</td>
      <td>ACEH SELATAN</td>
    </tr>
    <tr>
      <th>1</th>
      <td>1102</td>
      <td>ACEH TENGGARA</td>
    </tr>
    <tr>
      <th>2</th>
      <td>1103</td>
      <td>ACEH TIMUR</td>
    </tr>
    <tr>
      <th>3</th>
      <td>1104</td>
      <td>ACEH TENGAH</td>
    </tr>
    <tr>
      <th>4</th>
      <td>1105</td>
      <td>ACEH BARAT</td>
    </tr>
    <tr>
      <th>5</th>
      <td>1106</td>
      <td>ACEH BESAR</td>
    </tr>
    <tr>
      <th>6</th>
      <td>1107</td>
      <td>PIDIE</td>
    </tr>
    <tr>
      <th>7</th>
      <td>1108</td>
      <td>ACEH UTARA</td>
    </tr>
    <tr>
      <th>8</th>
      <td>1109</td>
      <td>SIMEULUE</td>
    </tr>
    <tr>
      <th>9</th>
      <td>1110</td>
      <td>ACEH SINGKIL</td>
    </tr>
    <tr>
      <th>10</th>
      <td>1111</td>
      <td>BIREUEN</td>
    </tr>
    <tr>
      <th>11</th>
      <td>1112</td>
      <td>ACEH BARAT DAYA</td>
    </tr>
    <tr>
      <th>12</th>
      <td>1113</td>
      <td>GAYO LUES</td>
    </tr>
    <tr>
      <th>13</th>
      <td>1114</td>
      <td>ACEH JAYA</td>
    </tr>
    <tr>
      <th>14</th>
      <td>1115</td>
      <td>NAGAN RAYA</td>
    </tr>
    <tr>
      <th>15</th>
      <td>1116</td>
      <td>ACEH TAMIANG</td>
    </tr>
    <tr>
      <th>16</th>
      <td>1117</td>
      <td>BENER MERIAH</td>
    </tr>
    <tr>
      <th>17</th>
      <td>1118</td>
      <td>PIDIE JAYA</td>
    </tr>
    <tr>
      <th>18</th>
      <td>1171</td>
      <td>KOTA BANDA ACEH</td>
    </tr>
    <tr>
      <th>19</th>
      <td>1172</td>
      <td>KOTA SABANG</td>
    </tr>
    <tr>
      <th>20</th>
      <td>1173</td>
      <td>KOTA LHOKSEUMAWE</td>
    </tr>
    <tr>
      <th>21</th>
      <td>1174</td>
      <td>KOTA LANGSA</td>
    </tr>
    <tr>
      <th>22</th>
      <td>1175</td>
      <td>KOTA SUBULUSSALAM</td>
    </tr>
    <tr>
      <th>23</th>
      <td>1201</td>
      <td>TAPANULI  TENGAH</td>
    </tr>
    <tr>
      <th>24</th>
      <td>1202</td>
      <td>TAPANULI  UTARA</td>
    </tr>
    <tr>
      <th>25</th>
      <td>1203</td>
      <td>TAPANULI  SELATAN</td>
    </tr>
    <tr>
      <th>26</th>
      <td>1204</td>
      <td>NIAS</td>
    </tr>
    <tr>
      <th>27</th>
      <td>1205</td>
      <td>LANGKAT</td>
    </tr>
    <tr>
      <th>28</th>
      <td>1206</td>
      <td>KARO</td>
    </tr>
    <tr>
      <th>29</th>
      <td>1207</td>
      <td>DELI SERDANG</td>
    </tr>
    <tr>
      <th>30</th>
      <td>1208</td>
      <td>SIMALUNGUN</td>
    </tr>
    <tr>
      <th>31</th>
      <td>1209</td>
      <td>ASAHAN</td>
    </tr>
    <tr>
      <th>32</th>
      <td>1210</td>
      <td>LABUHANBATU</td>
    </tr>
    <tr>
      <th>33</th>
      <td>1211</td>
      <td>DAIRI</td>
    </tr>
    <tr>
      <th>34</th>
      <td>1212</td>
      <td>TOBA SAMOSIR</td>
    </tr>
    <tr>
      <th>35</th>
      <td>1213</td>
      <td>MANDAILING NATAL</td>
    </tr>
    <tr>
      <th>36</th>
      <td>1214</td>
      <td>NIAS SELATAN</td>
    </tr>
    <tr>
      <th>37</th>
      <td>1215</td>
      <td>PAKPAK BHARAT</td>
    </tr>
    <tr>
      <th>38</th>
      <td>1216</td>
      <td>HUMBANG  HASUNDUTAN</td>
    </tr>
    <tr>
      <th>39</th>
      <td>1217</td>
      <td>SAMOSIR</td>
    </tr>
    <tr>
      <th>40</th>
      <td>1218</td>
      <td>SERDANG  BEDAGAI</td>
    </tr>
    <tr>
      <th>41</th>
      <td>1219</td>
      <td>BATU BARA</td>
    </tr>
    <tr>
      <th>42</th>
      <td>1220</td>
      <td>PADANG LAWAS UTARA</td>
    </tr>
    <tr>
      <th>43</th>
      <td>1221</td>
      <td>PADANG LAWAS</td>
    </tr>
    <tr>
      <th>44</th>
      <td>1222</td>
      <td>LABUHANBATU SELATAN</td>
    </tr>
    <tr>
      <th>45</th>
      <td>1223</td>
      <td>LABUHANBATU UTARA</td>
    </tr>
    <tr>
      <th>46</th>
      <td>1224</td>
      <td>NIAS UTARA</td>
    </tr>
    <tr>
      <th>47</th>
      <td>1225</td>
      <td>NIAS BARAT</td>
    </tr>
    <tr>
      <th>48</th>
      <td>1271</td>
      <td>KOTA MEDAN</td>
    </tr>
    <tr>
      <th>49</th>
      <td>1272</td>
      <td>KOTA PEMATANGSIANTAR</td>
    </tr>
    <tr>
      <th>50</th>
      <td>1273</td>
      <td>KOTA SIBOLGA</td>
    </tr>
    <tr>
      <th>51</th>
      <td>1274</td>
      <td>KOTA TANJUNG  BALAI</td>
    </tr>
    <tr>
      <th>52</th>
      <td>1275</td>
      <td>KOTA BINJAI</td>
    </tr>
    <tr>
      <th>53</th>
      <td>1276</td>
      <td>KOTA BINJAI</td>
    </tr>
    <tr>
      <th>54</th>
      <td>1277</td>
      <td>KOTA PADANGSIDIMPUAN</td>
    </tr>
    <tr>
      <th>55</th>
      <td>1278</td>
      <td>KOTA GUNUNGSITOLI</td>
    </tr>
    <tr>
      <th>56</th>
      <td>1301</td>
      <td>PESISIR SELATAN</td>
    </tr>
    <tr>
      <th>57</th>
      <td>1302</td>
      <td>SOLOK</td>
    </tr>
    <tr>
      <th>58</th>
      <td>1303</td>
      <td>SIJUNJUNG</td>
    </tr>
    <tr>
      <th>59</th>
      <td>1304</td>
      <td>TANAH DATAR</td>
    </tr>
    <tr>
      <th>60</th>
      <td>1305</td>
      <td>PADANG PARIAMAN</td>
    </tr>
    <tr>
      <th>61</th>
      <td>1306</td>
      <td>AGAM</td>
    </tr>
    <tr>
      <th>62</th>
      <td>1307</td>
      <td>LIMA PULUH KOTA</td>
    </tr>
    <tr>
      <th>63</th>
      <td>1308</td>
      <td>PASAMAN</td>
    </tr>
    <tr>
      <th>64</th>
      <td>1309</td>
      <td>KEPULAUAN MENTAWAI</td>
    </tr>
    <tr>
      <th>65</th>
      <td>1310</td>
      <td>DHARMASRAYA</td>
    </tr>
    <tr>
      <th>66</th>
      <td>1311</td>
      <td>SOLOK SELATAN</td>
    </tr>
    <tr>
      <th>67</th>
      <td>1312</td>
      <td>PASAMAN BARAT</td>
    </tr>
    <tr>
      <th>68</th>
      <td>1371</td>
      <td>KOTA PADANG</td>
    </tr>
    <tr>
      <th>69</th>
      <td>1372</td>
      <td>KOTA SOLOK</td>
    </tr>
    <tr>
      <th>70</th>
      <td>1373</td>
      <td>KOTA SAWAHLUNTO</td>
    </tr>
    <tr>
      <th>71</th>
      <td>1374</td>
      <td>KOTA PADANG PANJANG</td>
    </tr>
    <tr>
      <th>72</th>
      <td>1375</td>
      <td>KOTA BUKITTINGGI</td>
    </tr>
    <tr>
      <th>73</th>
      <td>1376</td>
      <td>KOTA PAYAKUMBUH</td>
    </tr>
    <tr>
      <th>74</th>
      <td>1377</td>
      <td>KOTA PARIAMAN</td>
    </tr>
    <tr>
      <th>75</th>
      <td>1401</td>
      <td>KAMPAR</td>
    </tr>
    <tr>
      <th>76</th>
      <td>1402</td>
      <td>INDRAGIRI  HULU</td>
    </tr>
    <tr>
      <th>77</th>
      <td>1403</td>
      <td>BENGKALIS</td>
    </tr>
    <tr>
      <th>78</th>
      <td>1404</td>
      <td>INDRAGIRI  HILIR</td>
    </tr>
    <tr>
      <th>79</th>
      <td>1405</td>
      <td>PELALAWAN</td>
    </tr>
    <tr>
      <th>80</th>
      <td>1406</td>
      <td>ROKAN HULU</td>
    </tr>
    <tr>
      <th>81</th>
      <td>1407</td>
      <td>ROKAN HILIR</td>
    </tr>
    <tr>
      <th>82</th>
      <td>1408</td>
      <td>SIAK</td>
    </tr>
    <tr>
      <th>83</th>
      <td>1409</td>
      <td>KUANTAN SINGINGI</td>
    </tr>
    <tr>
      <th>84</th>
      <td>1410</td>
      <td>KEPULAUAN MERANTI</td>
    </tr>
    <tr>
      <th>85</th>
      <td>1471</td>
      <td>KOTA PEKANBARU</td>
    </tr>
    <tr>
      <th>86</th>
      <td>1472</td>
      <td>KOTA DUMAI</td>
    </tr>
    <tr>
      <th>87</th>
      <td>1501</td>
      <td>KERINCI</td>
    </tr>
    <tr>
      <th>88</th>
      <td>1502</td>
      <td>MERANGIN</td>
    </tr>
    <tr>
      <th>89</th>
      <td>1503</td>
      <td>SAROLANGUN</td>
    </tr>
    <tr>
      <th>90</th>
      <td>1504</td>
      <td>BATANGHARI</td>
    </tr>
    <tr>
      <th>91</th>
      <td>1505</td>
      <td>MUAROJAMBI</td>
    </tr>
    <tr>
      <th>92</th>
      <td>1506</td>
      <td>TANJUNG  JABUNG BARAT</td>
    </tr>
    <tr>
      <th>93</th>
      <td>1507</td>
      <td>TANJUNG  JABUNG TIMUR</td>
    </tr>
    <tr>
      <th>94</th>
      <td>1508</td>
      <td>BUNGO</td>
    </tr>
    <tr>
      <th>95</th>
      <td>1509</td>
      <td>TEBO</td>
    </tr>
    <tr>
      <th>96</th>
      <td>1571</td>
      <td>KOTA JAMBI</td>
    </tr>
    <tr>
      <th>97</th>
      <td>1572</td>
      <td>KOTA SUNGAI PENUH</td>
    </tr>
    <tr>
      <th>98</th>
      <td>1601</td>
      <td>OGAN KOMERING  ULU</td>
    </tr>
    <tr>
      <th>99</th>
      <td>1602</td>
      <td>OGAN KOMERING  ILIR</td>
    </tr>
  </tbody>
</table>


## Fragmentasi Vertikal

Disini akan menampilkan data kabupaten dari ACEH dan SUMATERA UTARA, yang mana id `ACEH` = 11 dan id `SUMATERA UTARA` = 12


```sql
SELECT prov.nm_prov, kab.id_kab, kab.nm_kab
FROM kab
LEFT JOIN prov ON prov.id_prov = 11 OR 12
```


<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>nm_prov</th>
      <th>id_kab</th>
      <th>nm_kab</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>ACEH</td>
      <td>1101</td>
      <td>ACEH SELATAN</td>
    </tr>
    <tr>
      <th>1</th>
      <td>ACEH</td>
      <td>1102</td>
      <td>ACEH TENGGARA</td>
    </tr>
    <tr>
      <th>2</th>
      <td>ACEH</td>
      <td>1103</td>
      <td>ACEH TIMUR</td>
    </tr>
    <tr>
      <th>3</th>
      <td>ACEH</td>
      <td>1104</td>
      <td>ACEH TENGAH</td>
    </tr>
    <tr>
      <th>4</th>
      <td>ACEH</td>
      <td>1105</td>
      <td>ACEH BARAT</td>
    </tr>
    <tr>
      <th>5</th>
      <td>ACEH</td>
      <td>1106</td>
      <td>ACEH BESAR</td>
    </tr>
    <tr>
      <th>6</th>
      <td>ACEH</td>
      <td>1107</td>
      <td>PIDIE</td>
    </tr>
    <tr>
      <th>7</th>
      <td>ACEH</td>
      <td>1108</td>
      <td>ACEH UTARA</td>
    </tr>
    <tr>
      <th>8</th>
      <td>ACEH</td>
      <td>1109</td>
      <td>SIMEULUE</td>
    </tr>
    <tr>
      <th>9</th>
      <td>ACEH</td>
      <td>1110</td>
      <td>ACEH SINGKIL</td>
    </tr>
    <tr>
      <th>10</th>
      <td>ACEH</td>
      <td>1111</td>
      <td>BIREUEN</td>
    </tr>
    <tr>
      <th>11</th>
      <td>ACEH</td>
      <td>1112</td>
      <td>ACEH BARAT DAYA</td>
    </tr>
    <tr>
      <th>12</th>
      <td>ACEH</td>
      <td>1113</td>
      <td>GAYO LUES</td>
    </tr>
    <tr>
      <th>13</th>
      <td>ACEH</td>
      <td>1114</td>
      <td>ACEH JAYA</td>
    </tr>
    <tr>
      <th>14</th>
      <td>ACEH</td>
      <td>1115</td>
      <td>NAGAN RAYA</td>
    </tr>
    <tr>
      <th>15</th>
      <td>ACEH</td>
      <td>1116</td>
      <td>ACEH TAMIANG</td>
    </tr>
    <tr>
      <th>16</th>
      <td>ACEH</td>
      <td>1117</td>
      <td>BENER MERIAH</td>
    </tr>
    <tr>
      <th>17</th>
      <td>ACEH</td>
      <td>1118</td>
      <td>PIDIE JAYA</td>
    </tr>
    <tr>
      <th>18</th>
      <td>ACEH</td>
      <td>1171</td>
      <td>KOTA BANDA ACEH</td>
    </tr>
    <tr>
      <th>19</th>
      <td>ACEH</td>
      <td>1172</td>
      <td>KOTA SABANG</td>
    </tr>
    <tr>
      <th>20</th>
      <td>ACEH</td>
      <td>1173</td>
      <td>KOTA LHOKSEUMAWE</td>
    </tr>
    <tr>
      <th>21</th>
      <td>ACEH</td>
      <td>1174</td>
      <td>KOTA LANGSA</td>
    </tr>
    <tr>
      <th>22</th>
      <td>ACEH</td>
      <td>1175</td>
      <td>KOTA SUBULUSSALAM</td>
    </tr>
    <tr>
      <th>23</th>
      <td>ACEH</td>
      <td>1201</td>
      <td>TAPANULI  TENGAH</td>
    </tr>
    <tr>
      <th>24</th>
      <td>ACEH</td>
      <td>1202</td>
      <td>TAPANULI  UTARA</td>
    </tr>
    <tr>
      <th>25</th>
      <td>ACEH</td>
      <td>1203</td>
      <td>TAPANULI  SELATAN</td>
    </tr>
    <tr>
      <th>26</th>
      <td>ACEH</td>
      <td>1204</td>
      <td>NIAS</td>
    </tr>
    <tr>
      <th>27</th>
      <td>ACEH</td>
      <td>1205</td>
      <td>LANGKAT</td>
    </tr>
    <tr>
      <th>28</th>
      <td>ACEH</td>
      <td>1206</td>
      <td>KARO</td>
    </tr>
    <tr>
      <th>29</th>
      <td>ACEH</td>
      <td>1207</td>
      <td>DELI SERDANG</td>
    </tr>
    <tr>
      <th>30</th>
      <td>ACEH</td>
      <td>1208</td>
      <td>SIMALUNGUN</td>
    </tr>
    <tr>
      <th>31</th>
      <td>ACEH</td>
      <td>1209</td>
      <td>ASAHAN</td>
    </tr>
    <tr>
      <th>32</th>
      <td>ACEH</td>
      <td>1210</td>
      <td>LABUHANBATU</td>
    </tr>
    <tr>
      <th>33</th>
      <td>ACEH</td>
      <td>1211</td>
      <td>DAIRI</td>
    </tr>
    <tr>
      <th>34</th>
      <td>ACEH</td>
      <td>1212</td>
      <td>TOBA SAMOSIR</td>
    </tr>
    <tr>
      <th>35</th>
      <td>ACEH</td>
      <td>1213</td>
      <td>MANDAILING NATAL</td>
    </tr>
    <tr>
      <th>36</th>
      <td>ACEH</td>
      <td>1214</td>
      <td>NIAS SELATAN</td>
    </tr>
    <tr>
      <th>37</th>
      <td>ACEH</td>
      <td>1215</td>
      <td>PAKPAK BHARAT</td>
    </tr>
    <tr>
      <th>38</th>
      <td>ACEH</td>
      <td>1216</td>
      <td>HUMBANG  HASUNDUTAN</td>
    </tr>
    <tr>
      <th>39</th>
      <td>ACEH</td>
      <td>1217</td>
      <td>SAMOSIR</td>
    </tr>
    <tr>
      <th>40</th>
      <td>ACEH</td>
      <td>1218</td>
      <td>SERDANG  BEDAGAI</td>
    </tr>
    <tr>
      <th>41</th>
      <td>ACEH</td>
      <td>1219</td>
      <td>BATU BARA</td>
    </tr>
    <tr>
      <th>42</th>
      <td>ACEH</td>
      <td>1220</td>
      <td>PADANG LAWAS UTARA</td>
    </tr>
    <tr>
      <th>43</th>
      <td>ACEH</td>
      <td>1221</td>
      <td>PADANG LAWAS</td>
    </tr>
    <tr>
      <th>44</th>
      <td>ACEH</td>
      <td>1222</td>
      <td>LABUHANBATU SELATAN</td>
    </tr>
    <tr>
      <th>45</th>
      <td>ACEH</td>
      <td>1223</td>
      <td>LABUHANBATU UTARA</td>
    </tr>
    <tr>
      <th>46</th>
      <td>ACEH</td>
      <td>1224</td>
      <td>NIAS UTARA</td>
    </tr>
    <tr>
      <th>47</th>
      <td>ACEH</td>
      <td>1225</td>
      <td>NIAS BARAT</td>
    </tr>
    <tr>
      <th>48</th>
      <td>ACEH</td>
      <td>1271</td>
      <td>KOTA MEDAN</td>
    </tr>
    <tr>
      <th>49</th>
      <td>ACEH</td>
      <td>1272</td>
      <td>KOTA PEMATANGSIANTAR</td>
    </tr>
    <tr>
      <th>50</th>
      <td>ACEH</td>
      <td>1273</td>
      <td>KOTA SIBOLGA</td>
    </tr>
    <tr>
      <th>51</th>
      <td>ACEH</td>
      <td>1274</td>
      <td>KOTA TANJUNG  BALAI</td>
    </tr>
    <tr>
      <th>52</th>
      <td>ACEH</td>
      <td>1275</td>
      <td>KOTA BINJAI</td>
    </tr>
    <tr>
      <th>53</th>
      <td>ACEH</td>
      <td>1276</td>
      <td>KOTA BINJAI</td>
    </tr>
    <tr>
      <th>54</th>
      <td>ACEH</td>
      <td>1277</td>
      <td>KOTA PADANGSIDIMPUAN</td>
    </tr>
    <tr>
      <th>55</th>
      <td>ACEH</td>
      <td>1278</td>
      <td>KOTA GUNUNGSITOLI</td>
    </tr>
    <tr>
      <th>56</th>
      <td>ACEH</td>
      <td>1301</td>
      <td>PESISIR SELATAN</td>
    </tr>
    <tr>
      <th>57</th>
      <td>ACEH</td>
      <td>1302</td>
      <td>SOLOK</td>
    </tr>
    <tr>
      <th>58</th>
      <td>ACEH</td>
      <td>1303</td>
      <td>SIJUNJUNG</td>
    </tr>
    <tr>
      <th>59</th>
      <td>ACEH</td>
      <td>1304</td>
      <td>TANAH DATAR</td>
    </tr>
    <tr>
      <th>60</th>
      <td>ACEH</td>
      <td>1305</td>
      <td>PADANG PARIAMAN</td>
    </tr>
    <tr>
      <th>61</th>
      <td>ACEH</td>
      <td>1306</td>
      <td>AGAM</td>
    </tr>
    <tr>
      <th>62</th>
      <td>ACEH</td>
      <td>1307</td>
      <td>LIMA PULUH KOTA</td>
    </tr>
    <tr>
      <th>63</th>
      <td>ACEH</td>
      <td>1308</td>
      <td>PASAMAN</td>
    </tr>
    <tr>
      <th>64</th>
      <td>ACEH</td>
      <td>1309</td>
      <td>KEPULAUAN MENTAWAI</td>
    </tr>
    <tr>
      <th>65</th>
      <td>ACEH</td>
      <td>1310</td>
      <td>DHARMASRAYA</td>
    </tr>
    <tr>
      <th>66</th>
      <td>ACEH</td>
      <td>1311</td>
      <td>SOLOK SELATAN</td>
    </tr>
    <tr>
      <th>67</th>
      <td>ACEH</td>
      <td>1312</td>
      <td>PASAMAN BARAT</td>
    </tr>
    <tr>
      <th>68</th>
      <td>ACEH</td>
      <td>1371</td>
      <td>KOTA PADANG</td>
    </tr>
    <tr>
      <th>69</th>
      <td>ACEH</td>
      <td>1372</td>
      <td>KOTA SOLOK</td>
    </tr>
    <tr>
      <th>70</th>
      <td>ACEH</td>
      <td>1373</td>
      <td>KOTA SAWAHLUNTO</td>
    </tr>
    <tr>
      <th>71</th>
      <td>ACEH</td>
      <td>1374</td>
      <td>KOTA PADANG PANJANG</td>
    </tr>
    <tr>
      <th>72</th>
      <td>ACEH</td>
      <td>1375</td>
      <td>KOTA BUKITTINGGI</td>
    </tr>
    <tr>
      <th>73</th>
      <td>ACEH</td>
      <td>1376</td>
      <td>KOTA PAYAKUMBUH</td>
    </tr>
    <tr>
      <th>74</th>
      <td>ACEH</td>
      <td>1377</td>
      <td>KOTA PARIAMAN</td>
    </tr>
    <tr>
      <th>75</th>
      <td>ACEH</td>
      <td>1401</td>
      <td>KAMPAR</td>
    </tr>
    <tr>
      <th>76</th>
      <td>ACEH</td>
      <td>1402</td>
      <td>INDRAGIRI  HULU</td>
    </tr>
    <tr>
      <th>77</th>
      <td>ACEH</td>
      <td>1403</td>
      <td>BENGKALIS</td>
    </tr>
    <tr>
      <th>78</th>
      <td>ACEH</td>
      <td>1404</td>
      <td>INDRAGIRI  HILIR</td>
    </tr>
    <tr>
      <th>79</th>
      <td>ACEH</td>
      <td>1405</td>
      <td>PELALAWAN</td>
    </tr>
    <tr>
      <th>80</th>
      <td>ACEH</td>
      <td>1406</td>
      <td>ROKAN HULU</td>
    </tr>
    <tr>
      <th>81</th>
      <td>ACEH</td>
      <td>1407</td>
      <td>ROKAN HILIR</td>
    </tr>
    <tr>
      <th>82</th>
      <td>ACEH</td>
      <td>1408</td>
      <td>SIAK</td>
    </tr>
    <tr>
      <th>83</th>
      <td>ACEH</td>
      <td>1409</td>
      <td>KUANTAN SINGINGI</td>
    </tr>
    <tr>
      <th>84</th>
      <td>ACEH</td>
      <td>1410</td>
      <td>KEPULAUAN MERANTI</td>
    </tr>
    <tr>
      <th>85</th>
      <td>ACEH</td>
      <td>1471</td>
      <td>KOTA PEKANBARU</td>
    </tr>
    <tr>
      <th>86</th>
      <td>ACEH</td>
      <td>1472</td>
      <td>KOTA DUMAI</td>
    </tr>
    <tr>
      <th>87</th>
      <td>ACEH</td>
      <td>1501</td>
      <td>KERINCI</td>
    </tr>
    <tr>
      <th>88</th>
      <td>ACEH</td>
      <td>1502</td>
      <td>MERANGIN</td>
    </tr>
    <tr>
      <th>89</th>
      <td>ACEH</td>
      <td>1503</td>
      <td>SAROLANGUN</td>
    </tr>
    <tr>
      <th>90</th>
      <td>ACEH</td>
      <td>1504</td>
      <td>BATANGHARI</td>
    </tr>
    <tr>
      <th>91</th>
      <td>ACEH</td>
      <td>1505</td>
      <td>MUAROJAMBI</td>
    </tr>
    <tr>
      <th>92</th>
      <td>ACEH</td>
      <td>1506</td>
      <td>TANJUNG  JABUNG BARAT</td>
    </tr>
    <tr>
      <th>93</th>
      <td>ACEH</td>
      <td>1507</td>
      <td>TANJUNG  JABUNG TIMUR</td>
    </tr>
    <tr>
      <th>94</th>
      <td>ACEH</td>
      <td>1508</td>
      <td>BUNGO</td>
    </tr>
    <tr>
      <th>95</th>
      <td>ACEH</td>
      <td>1509</td>
      <td>TEBO</td>
    </tr>
    <tr>
      <th>96</th>
      <td>ACEH</td>
      <td>1571</td>
      <td>KOTA JAMBI</td>
    </tr>
    <tr>
      <th>97</th>
      <td>ACEH</td>
      <td>1572</td>
      <td>KOTA SUNGAI PENUH</td>
    </tr>
    <tr>
      <th>98</th>
      <td>ACEH</td>
      <td>1601</td>
      <td>OGAN KOMERING  ULU</td>
    </tr>
    <tr>
      <th>99</th>
      <td>ACEH</td>
      <td>1602</td>
      <td>OGAN KOMERING  ILIR</td>
    </tr>
    <tr>
      <th>100</th>
      <td>ACEH</td>
      <td>1603</td>
      <td>MUARA ENIM</td>
    </tr>
    <tr>
      <th>101</th>
      <td>ACEH</td>
      <td>1604</td>
      <td>LAHAT</td>
    </tr>
    <tr>
      <th>102</th>
      <td>ACEH</td>
      <td>1605</td>
      <td>MUSI RAWAS</td>
    </tr>
    <tr>
      <th>103</th>
      <td>ACEH</td>
      <td>1606</td>
      <td>MUSI BANYUASIN</td>
    </tr>
    <tr>
      <th>104</th>
      <td>ACEH</td>
      <td>1607</td>
      <td>BANYUASIN</td>
    </tr>
    <tr>
      <th>105</th>
      <td>ACEH</td>
      <td>1608</td>
      <td>OGAN KOMERING  ULU TIMUR</td>
    </tr>
    <tr>
      <th>106</th>
      <td>ACEH</td>
      <td>1609</td>
      <td>OGAN KOMERING ULU SELATAN</td>
    </tr>
    <tr>
      <th>107</th>
      <td>ACEH</td>
      <td>1610</td>
      <td>OGAN ILIR</td>
    </tr>
    <tr>
      <th>108</th>
      <td>ACEH</td>
      <td>1611</td>
      <td>EMPAT LAWANG</td>
    </tr>
    <tr>
      <th>109</th>
      <td>ACEH</td>
      <td>1612</td>
      <td>PENUKAL ABAB LEMATANG ILIR</td>
    </tr>
    <tr>
      <th>110</th>
      <td>ACEH</td>
      <td>1613</td>
      <td>MUSI RAWAS UTARA</td>
    </tr>
    <tr>
      <th>111</th>
      <td>ACEH</td>
      <td>1671</td>
      <td>KOTA PALEMBANG</td>
    </tr>
    <tr>
      <th>112</th>
      <td>ACEH</td>
      <td>1672</td>
      <td>KOTA PAGAR ALAM</td>
    </tr>
    <tr>
      <th>113</th>
      <td>ACEH</td>
      <td>1673</td>
      <td>KOTA LUBUK LINGGAU</td>
    </tr>
    <tr>
      <th>114</th>
      <td>ACEH</td>
      <td>1674</td>
      <td>KOTA PRABUMULIH</td>
    </tr>
    <tr>
      <th>115</th>
      <td>ACEH</td>
      <td>1701</td>
      <td>BENGKULU  SELATAN</td>
    </tr>
    <tr>
      <th>116</th>
      <td>ACEH</td>
      <td>1702</td>
      <td>REJANG LEBONG</td>
    </tr>
    <tr>
      <th>117</th>
      <td>ACEH</td>
      <td>1703</td>
      <td>BENGKULU UTARA</td>
    </tr>
    <tr>
      <th>118</th>
      <td>ACEH</td>
      <td>1704</td>
      <td>KAUR</td>
    </tr>
    <tr>
      <th>119</th>
      <td>ACEH</td>
      <td>1705</td>
      <td>SELUMA</td>
    </tr>
    <tr>
      <th>120</th>
      <td>ACEH</td>
      <td>1706</td>
      <td>MUKO MUKO</td>
    </tr>
    <tr>
      <th>121</th>
      <td>ACEH</td>
      <td>1707</td>
      <td>LEBONG</td>
    </tr>
    <tr>
      <th>122</th>
      <td>ACEH</td>
      <td>1708</td>
      <td>KEPAHIANG</td>
    </tr>
    <tr>
      <th>123</th>
      <td>ACEH</td>
      <td>1709</td>
      <td>BENGKULU  TENGAH</td>
    </tr>
    <tr>
      <th>124</th>
      <td>ACEH</td>
      <td>1771</td>
      <td>KOTA BENGKULU</td>
    </tr>
    <tr>
      <th>125</th>
      <td>ACEH</td>
      <td>1801</td>
      <td>LAMPUNG  SELATAN</td>
    </tr>
    <tr>
      <th>126</th>
      <td>ACEH</td>
      <td>1802</td>
      <td>LAMPUNG  TENGAH</td>
    </tr>
    <tr>
      <th>127</th>
      <td>ACEH</td>
      <td>1803</td>
      <td>LAMPUNG UTARA</td>
    </tr>
    <tr>
      <th>128</th>
      <td>ACEH</td>
      <td>1804</td>
      <td>LAMPUNG BARAT</td>
    </tr>
    <tr>
      <th>129</th>
      <td>ACEH</td>
      <td>1805</td>
      <td>TULANG BAWANG</td>
    </tr>
    <tr>
      <th>130</th>
      <td>ACEH</td>
      <td>1806</td>
      <td>TANGGAMUS</td>
    </tr>
    <tr>
      <th>131</th>
      <td>ACEH</td>
      <td>1807</td>
      <td>LAMPUNG  TIMUR</td>
    </tr>
    <tr>
      <th>132</th>
      <td>ACEH</td>
      <td>1808</td>
      <td>WAY KANAN</td>
    </tr>
    <tr>
      <th>133</th>
      <td>ACEH</td>
      <td>1809</td>
      <td>PESAWARAN</td>
    </tr>
    <tr>
      <th>134</th>
      <td>ACEH</td>
      <td>1810</td>
      <td>PRINGSEWU</td>
    </tr>
    <tr>
      <th>135</th>
      <td>ACEH</td>
      <td>1811</td>
      <td>MESUJI</td>
    </tr>
    <tr>
      <th>136</th>
      <td>ACEH</td>
      <td>1812</td>
      <td>TULANG BAWANG BARAT</td>
    </tr>
    <tr>
      <th>137</th>
      <td>ACEH</td>
      <td>1813</td>
      <td>PESISIR BARAT</td>
    </tr>
    <tr>
      <th>138</th>
      <td>ACEH</td>
      <td>1871</td>
      <td>KOTA BANDAR LAMPUNG</td>
    </tr>
    <tr>
      <th>139</th>
      <td>ACEH</td>
      <td>1872</td>
      <td>KOTA METRO</td>
    </tr>
    <tr>
      <th>140</th>
      <td>ACEH</td>
      <td>1901</td>
      <td>BANGKA</td>
    </tr>
    <tr>
      <th>141</th>
      <td>ACEH</td>
      <td>1902</td>
      <td>BELITUNG</td>
    </tr>
    <tr>
      <th>142</th>
      <td>ACEH</td>
      <td>1903</td>
      <td>BANGKA SELATAN</td>
    </tr>
    <tr>
      <th>143</th>
      <td>ACEH</td>
      <td>1904</td>
      <td>BANGKA TENGAH</td>
    </tr>
    <tr>
      <th>144</th>
      <td>ACEH</td>
      <td>1905</td>
      <td>BANGKA BARAT</td>
    </tr>
    <tr>
      <th>145</th>
      <td>ACEH</td>
      <td>1906</td>
      <td>BELITUNG TIMUR</td>
    </tr>
    <tr>
      <th>146</th>
      <td>ACEH</td>
      <td>1971</td>
      <td>KOTA PANGKAL PINANG</td>
    </tr>
    <tr>
      <th>147</th>
      <td>ACEH</td>
      <td>2101</td>
      <td>BINTAN</td>
    </tr>
    <tr>
      <th>148</th>
      <td>ACEH</td>
      <td>2102</td>
      <td>KARIMUN</td>
    </tr>
    <tr>
      <th>149</th>
      <td>ACEH</td>
      <td>2103</td>
      <td>NATUNA</td>
    </tr>
    <tr>
      <th>150</th>
      <td>ACEH</td>
      <td>2104</td>
      <td>LINGGA</td>
    </tr>
    <tr>
      <th>151</th>
      <td>ACEH</td>
      <td>2105</td>
      <td>KEPULAUAN ANAMBAS</td>
    </tr>
    <tr>
      <th>152</th>
      <td>ACEH</td>
      <td>2171</td>
      <td>KOTA BATAM</td>
    </tr>
    <tr>
      <th>153</th>
      <td>ACEH</td>
      <td>2172</td>
      <td>KOTA TANJUNG  PINANG</td>
    </tr>
    <tr>
      <th>154</th>
      <td>ACEH</td>
      <td>3101</td>
      <td>ADM KEP SERIBU</td>
    </tr>
    <tr>
      <th>155</th>
      <td>ACEH</td>
      <td>3171</td>
      <td>KOTA ADM JAKARTA PUSAT</td>
    </tr>
    <tr>
      <th>156</th>
      <td>ACEH</td>
      <td>3172</td>
      <td>KOTA ADM JAKARTA UTARA</td>
    </tr>
    <tr>
      <th>157</th>
      <td>ACEH</td>
      <td>3173</td>
      <td>KOTA ADM JAKARTA BARAT</td>
    </tr>
    <tr>
      <th>158</th>
      <td>ACEH</td>
      <td>3174</td>
      <td>KOTA ADM JAKARTA SELATAN</td>
    </tr>
    <tr>
      <th>159</th>
      <td>ACEH</td>
      <td>3175</td>
      <td>KOTA ADM JAKARTA TIMUR</td>
    </tr>
    <tr>
      <th>160</th>
      <td>ACEH</td>
      <td>3201</td>
      <td>BOGOR</td>
    </tr>
    <tr>
      <th>161</th>
      <td>ACEH</td>
      <td>3202</td>
      <td>SUKABUMI</td>
    </tr>
    <tr>
      <th>162</th>
      <td>ACEH</td>
      <td>3203</td>
      <td>CIANJUR</td>
    </tr>
    <tr>
      <th>163</th>
      <td>ACEH</td>
      <td>3204</td>
      <td>BANDUNG</td>
    </tr>
    <tr>
      <th>164</th>
      <td>ACEH</td>
      <td>3205</td>
      <td>GARUT</td>
    </tr>
    <tr>
      <th>165</th>
      <td>ACEH</td>
      <td>3206</td>
      <td>TASIKMALAYA</td>
    </tr>
    <tr>
      <th>166</th>
      <td>ACEH</td>
      <td>3207</td>
      <td>CIAMIS</td>
    </tr>
    <tr>
      <th>167</th>
      <td>ACEH</td>
      <td>3208</td>
      <td>KUNINGAN</td>
    </tr>
    <tr>
      <th>168</th>
      <td>ACEH</td>
      <td>3209</td>
      <td>CIREBON</td>
    </tr>
    <tr>
      <th>169</th>
      <td>ACEH</td>
      <td>3210</td>
      <td>MAJALENGKA</td>
    </tr>
    <tr>
      <th>170</th>
      <td>ACEH</td>
      <td>3211</td>
      <td>SUMEDANG</td>
    </tr>
    <tr>
      <th>171</th>
      <td>ACEH</td>
      <td>3212</td>
      <td>INDRAMAYU</td>
    </tr>
    <tr>
      <th>172</th>
      <td>ACEH</td>
      <td>3213</td>
      <td>SUBANG</td>
    </tr>
    <tr>
      <th>173</th>
      <td>ACEH</td>
      <td>3214</td>
      <td>PURWAKARTA</td>
    </tr>
    <tr>
      <th>174</th>
      <td>ACEH</td>
      <td>3215</td>
      <td>KARAWANG</td>
    </tr>
    <tr>
      <th>175</th>
      <td>ACEH</td>
      <td>3216</td>
      <td>BEKASI</td>
    </tr>
    <tr>
      <th>176</th>
      <td>ACEH</td>
      <td>3217</td>
      <td>BANDUNG  BARAT</td>
    </tr>
    <tr>
      <th>177</th>
      <td>ACEH</td>
      <td>3218</td>
      <td>PANGANDARAN</td>
    </tr>
    <tr>
      <th>178</th>
      <td>ACEH</td>
      <td>3271</td>
      <td>KOTA BOGOR</td>
    </tr>
    <tr>
      <th>179</th>
      <td>ACEH</td>
      <td>3272</td>
      <td>KOTA SUKABUMI</td>
    </tr>
    <tr>
      <th>180</th>
      <td>ACEH</td>
      <td>3273</td>
      <td>KOTA BANDUNG</td>
    </tr>
    <tr>
      <th>181</th>
      <td>ACEH</td>
      <td>3274</td>
      <td>KOTA CIREBON</td>
    </tr>
    <tr>
      <th>182</th>
      <td>ACEH</td>
      <td>3275</td>
      <td>KOTA BEKASI</td>
    </tr>
    <tr>
      <th>183</th>
      <td>ACEH</td>
      <td>3276</td>
      <td>KOTA DEPOK</td>
    </tr>
    <tr>
      <th>184</th>
      <td>ACEH</td>
      <td>3277</td>
      <td>KOTA CIMAHI</td>
    </tr>
    <tr>
      <th>185</th>
      <td>ACEH</td>
      <td>3278</td>
      <td>KOTA TASIKMALAYA</td>
    </tr>
    <tr>
      <th>186</th>
      <td>ACEH</td>
      <td>3279</td>
      <td>KOTA BANJAR</td>
    </tr>
    <tr>
      <th>187</th>
      <td>ACEH</td>
      <td>3301</td>
      <td>CILACAP</td>
    </tr>
    <tr>
      <th>188</th>
      <td>ACEH</td>
      <td>3302</td>
      <td>BANYUMAS</td>
    </tr>
    <tr>
      <th>189</th>
      <td>ACEH</td>
      <td>3303</td>
      <td>PURBALINGGA</td>
    </tr>
    <tr>
      <th>190</th>
      <td>ACEH</td>
      <td>3304</td>
      <td>BANJARNEGARA</td>
    </tr>
    <tr>
      <th>191</th>
      <td>ACEH</td>
      <td>3305</td>
      <td>KEBUMEN</td>
    </tr>
    <tr>
      <th>192</th>
      <td>ACEH</td>
      <td>3306</td>
      <td>PURWOREJO</td>
    </tr>
    <tr>
      <th>193</th>
      <td>ACEH</td>
      <td>3307</td>
      <td>WONOSOBO</td>
    </tr>
    <tr>
      <th>194</th>
      <td>ACEH</td>
      <td>3308</td>
      <td>MAGELANG</td>
    </tr>
    <tr>
      <th>195</th>
      <td>ACEH</td>
      <td>3309</td>
      <td>BOYOLALI</td>
    </tr>
    <tr>
      <th>196</th>
      <td>ACEH</td>
      <td>3310</td>
      <td>KLATEN</td>
    </tr>
    <tr>
      <th>197</th>
      <td>ACEH</td>
      <td>3311</td>
      <td>SUKOHARJO</td>
    </tr>
    <tr>
      <th>198</th>
      <td>ACEH</td>
      <td>3312</td>
      <td>WONOGIRI</td>
    </tr>
    <tr>
      <th>199</th>
      <td>ACEH</td>
      <td>3313</td>
      <td>KARANGANYAR</td>
    </tr>
    <tr>
      <th>200</th>
      <td>ACEH</td>
      <td>3314</td>
      <td>SRAGEN</td>
    </tr>
    <tr>
      <th>201</th>
      <td>ACEH</td>
      <td>3315</td>
      <td>GROBOGAN</td>
    </tr>
    <tr>
      <th>202</th>
      <td>ACEH</td>
      <td>3316</td>
      <td>BLORA</td>
    </tr>
    <tr>
      <th>203</th>
      <td>ACEH</td>
      <td>3317</td>
      <td>REMBANG</td>
    </tr>
    <tr>
      <th>204</th>
      <td>ACEH</td>
      <td>3318</td>
      <td>PATI</td>
    </tr>
    <tr>
      <th>205</th>
      <td>ACEH</td>
      <td>3319</td>
      <td>KUDUS</td>
    </tr>
    <tr>
      <th>206</th>
      <td>ACEH</td>
      <td>3320</td>
      <td>JEPARA</td>
    </tr>
    <tr>
      <th>207</th>
      <td>ACEH</td>
      <td>3321</td>
      <td>DEMAK</td>
    </tr>
    <tr>
      <th>208</th>
      <td>ACEH</td>
      <td>3322</td>
      <td>SEMARANG</td>
    </tr>
    <tr>
      <th>209</th>
      <td>ACEH</td>
      <td>3323</td>
      <td>TEMANGGUNG</td>
    </tr>
    <tr>
      <th>210</th>
      <td>ACEH</td>
      <td>3324</td>
      <td>KENDAL</td>
    </tr>
    <tr>
      <th>211</th>
      <td>ACEH</td>
      <td>3325</td>
      <td>BATANG</td>
    </tr>
    <tr>
      <th>212</th>
      <td>ACEH</td>
      <td>3326</td>
      <td>PEKALONGAN</td>
    </tr>
    <tr>
      <th>213</th>
      <td>ACEH</td>
      <td>3327</td>
      <td>PEMALANG</td>
    </tr>
    <tr>
      <th>214</th>
      <td>ACEH</td>
      <td>3328</td>
      <td>TEGAL</td>
    </tr>
    <tr>
      <th>215</th>
      <td>ACEH</td>
      <td>3329</td>
      <td>BREBES</td>
    </tr>
    <tr>
      <th>216</th>
      <td>ACEH</td>
      <td>3371</td>
      <td>KOTA MAGELANG</td>
    </tr>
    <tr>
      <th>217</th>
      <td>ACEH</td>
      <td>3372</td>
      <td>KOTA SURAKARTA</td>
    </tr>
    <tr>
      <th>218</th>
      <td>ACEH</td>
      <td>3373</td>
      <td>KOTA SALATIGA</td>
    </tr>
    <tr>
      <th>219</th>
      <td>ACEH</td>
      <td>3374</td>
      <td>KOTA SEMARANG</td>
    </tr>
    <tr>
      <th>220</th>
      <td>ACEH</td>
      <td>3375</td>
      <td>KOTA PEKALONGAN</td>
    </tr>
    <tr>
      <th>221</th>
      <td>ACEH</td>
      <td>3376</td>
      <td>KOTA TEGAL</td>
    </tr>
    <tr>
      <th>222</th>
      <td>ACEH</td>
      <td>3401</td>
      <td>KULON PROGO</td>
    </tr>
    <tr>
      <th>223</th>
      <td>ACEH</td>
      <td>3402</td>
      <td>BANTUL</td>
    </tr>
    <tr>
      <th>224</th>
      <td>ACEH</td>
      <td>3403</td>
      <td>GUNUNGKIDUL</td>
    </tr>
    <tr>
      <th>225</th>
      <td>ACEH</td>
      <td>3404</td>
      <td>SLEMAN</td>
    </tr>
    <tr>
      <th>226</th>
      <td>ACEH</td>
      <td>3471</td>
      <td>KOTA YOGYAKARTA</td>
    </tr>
    <tr>
      <th>227</th>
      <td>ACEH</td>
      <td>3501</td>
      <td>PACITAN</td>
    </tr>
    <tr>
      <th>228</th>
      <td>ACEH</td>
      <td>3502</td>
      <td>PONOROGO</td>
    </tr>
    <tr>
      <th>229</th>
      <td>ACEH</td>
      <td>3503</td>
      <td>TRENGGALEK</td>
    </tr>
    <tr>
      <th>230</th>
      <td>ACEH</td>
      <td>3504</td>
      <td>TULUNGAGUNG</td>
    </tr>
    <tr>
      <th>231</th>
      <td>ACEH</td>
      <td>3505</td>
      <td>BLITAR</td>
    </tr>
    <tr>
      <th>232</th>
      <td>ACEH</td>
      <td>3506</td>
      <td>KEDIRI</td>
    </tr>
    <tr>
      <th>233</th>
      <td>ACEH</td>
      <td>3507</td>
      <td>MALANG</td>
    </tr>
    <tr>
      <th>234</th>
      <td>ACEH</td>
      <td>3508</td>
      <td>LUMAJANG</td>
    </tr>
    <tr>
      <th>235</th>
      <td>ACEH</td>
      <td>3509</td>
      <td>JEMBER</td>
    </tr>
    <tr>
      <th>236</th>
      <td>ACEH</td>
      <td>3510</td>
      <td>BANYUWANGI</td>
    </tr>
    <tr>
      <th>237</th>
      <td>ACEH</td>
      <td>3511</td>
      <td>BONDOWOSO</td>
    </tr>
    <tr>
      <th>238</th>
      <td>ACEH</td>
      <td>3512</td>
      <td>SITUBONDO</td>
    </tr>
    <tr>
      <th>239</th>
      <td>ACEH</td>
      <td>3513</td>
      <td>PROBOLINGGO</td>
    </tr>
    <tr>
      <th>240</th>
      <td>ACEH</td>
      <td>3514</td>
      <td>PASURUAN</td>
    </tr>
    <tr>
      <th>241</th>
      <td>ACEH</td>
      <td>3515</td>
      <td>SIDOARJO</td>
    </tr>
    <tr>
      <th>242</th>
      <td>ACEH</td>
      <td>3516</td>
      <td>MOJOKERTO</td>
    </tr>
    <tr>
      <th>243</th>
      <td>ACEH</td>
      <td>3517</td>
      <td>JOMBANG</td>
    </tr>
    <tr>
      <th>244</th>
      <td>ACEH</td>
      <td>3518</td>
      <td>NGANJUK</td>
    </tr>
    <tr>
      <th>245</th>
      <td>ACEH</td>
      <td>3519</td>
      <td>MADIUN</td>
    </tr>
    <tr>
      <th>246</th>
      <td>ACEH</td>
      <td>3520</td>
      <td>MAGETAN</td>
    </tr>
    <tr>
      <th>247</th>
      <td>ACEH</td>
      <td>3521</td>
      <td>NGAWI</td>
    </tr>
    <tr>
      <th>248</th>
      <td>ACEH</td>
      <td>3522</td>
      <td>BOJONEGORO</td>
    </tr>
    <tr>
      <th>249</th>
      <td>ACEH</td>
      <td>3523</td>
      <td>TUBAN</td>
    </tr>
    <tr>
      <th>250</th>
      <td>ACEH</td>
      <td>3524</td>
      <td>LAMONGAN</td>
    </tr>
    <tr>
      <th>251</th>
      <td>ACEH</td>
      <td>3525</td>
      <td>GRESIK</td>
    </tr>
    <tr>
      <th>252</th>
      <td>ACEH</td>
      <td>3526</td>
      <td>BANGKALAN</td>
    </tr>
    <tr>
      <th>253</th>
      <td>ACEH</td>
      <td>3527</td>
      <td>SAMPANG</td>
    </tr>
    <tr>
      <th>254</th>
      <td>ACEH</td>
      <td>3528</td>
      <td>PAMEKASAN</td>
    </tr>
    <tr>
      <th>255</th>
      <td>ACEH</td>
      <td>3529</td>
      <td>SUMENEP</td>
    </tr>
    <tr>
      <th>256</th>
      <td>ACEH</td>
      <td>3571</td>
      <td>KOTA KEDIRI</td>
    </tr>
    <tr>
      <th>257</th>
      <td>ACEH</td>
      <td>3572</td>
      <td>KOTA BLITAR</td>
    </tr>
    <tr>
      <th>258</th>
      <td>ACEH</td>
      <td>3573</td>
      <td>KOTA MALANG</td>
    </tr>
    <tr>
      <th>259</th>
      <td>ACEH</td>
      <td>3574</td>
      <td>KOTA PROBOLINGGO</td>
    </tr>
    <tr>
      <th>260</th>
      <td>ACEH</td>
      <td>3575</td>
      <td>KOTA PASURUAN</td>
    </tr>
    <tr>
      <th>261</th>
      <td>ACEH</td>
      <td>3576</td>
      <td>KOTA MOJOKERTO</td>
    </tr>
    <tr>
      <th>262</th>
      <td>ACEH</td>
      <td>3577</td>
      <td>KOTA MADIUN</td>
    </tr>
    <tr>
      <th>263</th>
      <td>ACEH</td>
      <td>3578</td>
      <td>KOTA SURABAYA</td>
    </tr>
    <tr>
      <th>264</th>
      <td>ACEH</td>
      <td>3579</td>
      <td>KOTA BATU</td>
    </tr>
    <tr>
      <th>265</th>
      <td>ACEH</td>
      <td>3601</td>
      <td>PANDEGLANG</td>
    </tr>
    <tr>
      <th>266</th>
      <td>ACEH</td>
      <td>3602</td>
      <td>LEBAK</td>
    </tr>
    <tr>
      <th>267</th>
      <td>ACEH</td>
      <td>3603</td>
      <td>TANGERANG</td>
    </tr>
    <tr>
      <th>268</th>
      <td>ACEH</td>
      <td>3604</td>
      <td>SERANG</td>
    </tr>
    <tr>
      <th>269</th>
      <td>ACEH</td>
      <td>3671</td>
      <td>KOTA TANGERANG</td>
    </tr>
    <tr>
      <th>270</th>
      <td>ACEH</td>
      <td>3672</td>
      <td>KOTA CILEGON</td>
    </tr>
    <tr>
      <th>271</th>
      <td>ACEH</td>
      <td>3673</td>
      <td>KOTA SERANG</td>
    </tr>
    <tr>
      <th>272</th>
      <td>ACEH</td>
      <td>3674</td>
      <td>KOTA TANGERANG SELATAN</td>
    </tr>
    <tr>
      <th>273</th>
      <td>ACEH</td>
      <td>5101</td>
      <td>JEMBRANA</td>
    </tr>
    <tr>
      <th>274</th>
      <td>ACEH</td>
      <td>5102</td>
      <td>TABANAN</td>
    </tr>
    <tr>
      <th>275</th>
      <td>ACEH</td>
      <td>5103</td>
      <td>BADUNG</td>
    </tr>
    <tr>
      <th>276</th>
      <td>ACEH</td>
      <td>5104</td>
      <td>GIANYAR</td>
    </tr>
    <tr>
      <th>277</th>
      <td>ACEH</td>
      <td>5105</td>
      <td>KLUNGKUNG</td>
    </tr>
    <tr>
      <th>278</th>
      <td>ACEH</td>
      <td>5106</td>
      <td>BANGLI</td>
    </tr>
    <tr>
      <th>279</th>
      <td>ACEH</td>
      <td>5107</td>
      <td>KARANGASEM</td>
    </tr>
    <tr>
      <th>280</th>
      <td>ACEH</td>
      <td>5108</td>
      <td>BULELENG</td>
    </tr>
    <tr>
      <th>281</th>
      <td>ACEH</td>
      <td>5171</td>
      <td>KOTA DENPASAR</td>
    </tr>
    <tr>
      <th>282</th>
      <td>ACEH</td>
      <td>5201</td>
      <td>LOMBOK BARAT</td>
    </tr>
    <tr>
      <th>283</th>
      <td>ACEH</td>
      <td>5202</td>
      <td>LOMBOK TENGAH</td>
    </tr>
    <tr>
      <th>284</th>
      <td>ACEH</td>
      <td>5203</td>
      <td>LOMBOK TIMUR</td>
    </tr>
    <tr>
      <th>285</th>
      <td>ACEH</td>
      <td>5204</td>
      <td>SUMBAWA</td>
    </tr>
    <tr>
      <th>286</th>
      <td>ACEH</td>
      <td>5205</td>
      <td>DOMPU</td>
    </tr>
    <tr>
      <th>287</th>
      <td>ACEH</td>
      <td>5206</td>
      <td>BIMA</td>
    </tr>
    <tr>
      <th>288</th>
      <td>ACEH</td>
      <td>5207</td>
      <td>SUMBAWA BARAT</td>
    </tr>
    <tr>
      <th>289</th>
      <td>ACEH</td>
      <td>5208</td>
      <td>LOMBOK UTARA</td>
    </tr>
    <tr>
      <th>290</th>
      <td>ACEH</td>
      <td>5271</td>
      <td>KOTA MATARAM</td>
    </tr>
    <tr>
      <th>291</th>
      <td>ACEH</td>
      <td>5272</td>
      <td>KOTA BIMA</td>
    </tr>
    <tr>
      <th>292</th>
      <td>ACEH</td>
      <td>5301</td>
      <td>KUPANG</td>
    </tr>
    <tr>
      <th>293</th>
      <td>ACEH</td>
      <td>5302</td>
      <td>KAB TIMOR TENGAH SELATAN</td>
    </tr>
    <tr>
      <th>294</th>
      <td>ACEH</td>
      <td>5303</td>
      <td>TIMOR TENGAH UTARA</td>
    </tr>
    <tr>
      <th>295</th>
      <td>ACEH</td>
      <td>5304</td>
      <td>BELU</td>
    </tr>
    <tr>
      <th>296</th>
      <td>ACEH</td>
      <td>5305</td>
      <td>ALOR</td>
    </tr>
    <tr>
      <th>297</th>
      <td>ACEH</td>
      <td>5306</td>
      <td>FLORES TIMUR</td>
    </tr>
    <tr>
      <th>298</th>
      <td>ACEH</td>
      <td>5307</td>
      <td>SIKKA</td>
    </tr>
    <tr>
      <th>299</th>
      <td>ACEH</td>
      <td>5308</td>
      <td>ENDE</td>
    </tr>
    <tr>
      <th>300</th>
      <td>ACEH</td>
      <td>5309</td>
      <td>NGADA</td>
    </tr>
    <tr>
      <th>301</th>
      <td>ACEH</td>
      <td>5310</td>
      <td>MANGGARAI</td>
    </tr>
    <tr>
      <th>302</th>
      <td>ACEH</td>
      <td>5311</td>
      <td>SUMBA TIMUR</td>
    </tr>
    <tr>
      <th>303</th>
      <td>ACEH</td>
      <td>5312</td>
      <td>SUMBA BARAT</td>
    </tr>
    <tr>
      <th>304</th>
      <td>ACEH</td>
      <td>5313</td>
      <td>LEMBATA</td>
    </tr>
    <tr>
      <th>305</th>
      <td>ACEH</td>
      <td>5314</td>
      <td>ROTE NDAO</td>
    </tr>
    <tr>
      <th>306</th>
      <td>ACEH</td>
      <td>5315</td>
      <td>MANGGARAI BARAT</td>
    </tr>
    <tr>
      <th>307</th>
      <td>ACEH</td>
      <td>5316</td>
      <td>NAGEKEO</td>
    </tr>
    <tr>
      <th>308</th>
      <td>ACEH</td>
      <td>5317</td>
      <td>SUMBA TENGAH</td>
    </tr>
    <tr>
      <th>309</th>
      <td>ACEH</td>
      <td>5318</td>
      <td>SUMBA BARAT DAYA</td>
    </tr>
    <tr>
      <th>310</th>
      <td>ACEH</td>
      <td>5319</td>
      <td>MANGGARAI  TIMUR</td>
    </tr>
    <tr>
      <th>311</th>
      <td>ACEH</td>
      <td>5320</td>
      <td>SABU RAIJUA</td>
    </tr>
    <tr>
      <th>312</th>
      <td>ACEH</td>
      <td>5321</td>
      <td>MALAKA</td>
    </tr>
    <tr>
      <th>313</th>
      <td>ACEH</td>
      <td>5371</td>
      <td>KOTA KUPANG</td>
    </tr>
    <tr>
      <th>314</th>
      <td>ACEH</td>
      <td>6101</td>
      <td>SAMBAS</td>
    </tr>
    <tr>
      <th>315</th>
      <td>ACEH</td>
      <td>6102</td>
      <td>MEMPAWAH</td>
    </tr>
    <tr>
      <th>316</th>
      <td>ACEH</td>
      <td>6103</td>
      <td>SANGGAU</td>
    </tr>
    <tr>
      <th>317</th>
      <td>ACEH</td>
      <td>6104</td>
      <td>KETAPANG</td>
    </tr>
    <tr>
      <th>318</th>
      <td>ACEH</td>
      <td>6105</td>
      <td>SINTANG</td>
    </tr>
    <tr>
      <th>319</th>
      <td>ACEH</td>
      <td>6106</td>
      <td>KAPUAS HULU</td>
    </tr>
    <tr>
      <th>320</th>
      <td>ACEH</td>
      <td>6107</td>
      <td>BENGKAYANG</td>
    </tr>
    <tr>
      <th>321</th>
      <td>ACEH</td>
      <td>6108</td>
      <td>LANDAK</td>
    </tr>
    <tr>
      <th>322</th>
      <td>ACEH</td>
      <td>6109</td>
      <td>SEKADAU</td>
    </tr>
    <tr>
      <th>323</th>
      <td>ACEH</td>
      <td>6110</td>
      <td>MELAWI</td>
    </tr>
    <tr>
      <th>324</th>
      <td>ACEH</td>
      <td>6111</td>
      <td>KAYONG UTARA</td>
    </tr>
    <tr>
      <th>325</th>
      <td>ACEH</td>
      <td>6112</td>
      <td>KUBU RAYA</td>
    </tr>
    <tr>
      <th>326</th>
      <td>ACEH</td>
      <td>6171</td>
      <td>KOTA PONTIANAK</td>
    </tr>
    <tr>
      <th>327</th>
      <td>ACEH</td>
      <td>6172</td>
      <td>KOTA SINGKAWANG</td>
    </tr>
    <tr>
      <th>328</th>
      <td>ACEH</td>
      <td>6201</td>
      <td>KOTAWARINGIN BARAT</td>
    </tr>
    <tr>
      <th>329</th>
      <td>ACEH</td>
      <td>6202</td>
      <td>KOTAWARINGIN TIMUR</td>
    </tr>
    <tr>
      <th>330</th>
      <td>ACEH</td>
      <td>6203</td>
      <td>KAPUAS</td>
    </tr>
    <tr>
      <th>331</th>
      <td>ACEH</td>
      <td>6204</td>
      <td>BARITO SELATAN</td>
    </tr>
    <tr>
      <th>332</th>
      <td>ACEH</td>
      <td>6205</td>
      <td>BARITO UTARA</td>
    </tr>
    <tr>
      <th>333</th>
      <td>ACEH</td>
      <td>6206</td>
      <td>KATINGAN</td>
    </tr>
    <tr>
      <th>334</th>
      <td>ACEH</td>
      <td>6207</td>
      <td>SERUYAN</td>
    </tr>
    <tr>
      <th>335</th>
      <td>ACEH</td>
      <td>6208</td>
      <td>SUKAMARA</td>
    </tr>
    <tr>
      <th>336</th>
      <td>ACEH</td>
      <td>6209</td>
      <td>LAMANDAU</td>
    </tr>
    <tr>
      <th>337</th>
      <td>ACEH</td>
      <td>6210</td>
      <td>GUNUNG MAS</td>
    </tr>
    <tr>
      <th>338</th>
      <td>ACEH</td>
      <td>6211</td>
      <td>PULANG PISAU</td>
    </tr>
    <tr>
      <th>339</th>
      <td>ACEH</td>
      <td>6212</td>
      <td>MURUNG RAYA</td>
    </tr>
    <tr>
      <th>340</th>
      <td>ACEH</td>
      <td>6213</td>
      <td>BARITO TIMUR</td>
    </tr>
    <tr>
      <th>341</th>
      <td>ACEH</td>
      <td>6271</td>
      <td>KOTA PALANGKARAYA</td>
    </tr>
    <tr>
      <th>342</th>
      <td>ACEH</td>
      <td>6301</td>
      <td>TANAH LAUT</td>
    </tr>
    <tr>
      <th>343</th>
      <td>ACEH</td>
      <td>6302</td>
      <td>KOTABARU</td>
    </tr>
    <tr>
      <th>344</th>
      <td>ACEH</td>
      <td>6303</td>
      <td>BANJAR</td>
    </tr>
    <tr>
      <th>345</th>
      <td>ACEH</td>
      <td>6304</td>
      <td>BARITO KUALA</td>
    </tr>
    <tr>
      <th>346</th>
      <td>ACEH</td>
      <td>6305</td>
      <td>TAPIN</td>
    </tr>
    <tr>
      <th>347</th>
      <td>ACEH</td>
      <td>6306</td>
      <td>HULU SUNGAI SELATAN</td>
    </tr>
    <tr>
      <th>348</th>
      <td>ACEH</td>
      <td>6307</td>
      <td>HULU SUNGAI TENGAH</td>
    </tr>
    <tr>
      <th>349</th>
      <td>ACEH</td>
      <td>6308</td>
      <td>HULU SUNGAI UTARA</td>
    </tr>
    <tr>
      <th>350</th>
      <td>ACEH</td>
      <td>6309</td>
      <td>TABALONG</td>
    </tr>
    <tr>
      <th>351</th>
      <td>ACEH</td>
      <td>6310</td>
      <td>TANAH BUMBU</td>
    </tr>
    <tr>
      <th>352</th>
      <td>ACEH</td>
      <td>6311</td>
      <td>BALANGAN</td>
    </tr>
    <tr>
      <th>353</th>
      <td>ACEH</td>
      <td>6371</td>
      <td>KOTA BANJARMASIN</td>
    </tr>
    <tr>
      <th>354</th>
      <td>ACEH</td>
      <td>6372</td>
      <td>KOTA BANJARBARU</td>
    </tr>
    <tr>
      <th>355</th>
      <td>ACEH</td>
      <td>6401</td>
      <td>PASER</td>
    </tr>
    <tr>
      <th>356</th>
      <td>ACEH</td>
      <td>6402</td>
      <td>KUTAI KARTANEGARA</td>
    </tr>
    <tr>
      <th>357</th>
      <td>ACEH</td>
      <td>6403</td>
      <td>BERAU</td>
    </tr>
    <tr>
      <th>358</th>
      <td>ACEH</td>
      <td>6407</td>
      <td>KUTAI BARAT</td>
    </tr>
    <tr>
      <th>359</th>
      <td>ACEH</td>
      <td>6408</td>
      <td>KUTAI TIMUR</td>
    </tr>
    <tr>
      <th>360</th>
      <td>ACEH</td>
      <td>6409</td>
      <td>PENAJAM  PASER UTARA</td>
    </tr>
    <tr>
      <th>361</th>
      <td>ACEH</td>
      <td>6411</td>
      <td>MAHAKAM  ULU</td>
    </tr>
    <tr>
      <th>362</th>
      <td>ACEH</td>
      <td>6471</td>
      <td>KOTA BALIKPAPAN</td>
    </tr>
    <tr>
      <th>363</th>
      <td>ACEH</td>
      <td>6472</td>
      <td>KOTA SAMARINDA</td>
    </tr>
    <tr>
      <th>364</th>
      <td>ACEH</td>
      <td>6474</td>
      <td>KOTA BONTANG</td>
    </tr>
    <tr>
      <th>365</th>
      <td>ACEH</td>
      <td>6501</td>
      <td>BULUNGAN</td>
    </tr>
    <tr>
      <th>366</th>
      <td>ACEH</td>
      <td>6502</td>
      <td>MALINAU</td>
    </tr>
    <tr>
      <th>367</th>
      <td>ACEH</td>
      <td>6503</td>
      <td>NUNUKAN</td>
    </tr>
    <tr>
      <th>368</th>
      <td>ACEH</td>
      <td>6504</td>
      <td>TANA TIDUNG</td>
    </tr>
    <tr>
      <th>369</th>
      <td>ACEH</td>
      <td>6571</td>
      <td>KOTA TARAKAN</td>
    </tr>
    <tr>
      <th>370</th>
      <td>ACEH</td>
      <td>7101</td>
      <td>BOLAANG  MONGONDOW</td>
    </tr>
    <tr>
      <th>371</th>
      <td>ACEH</td>
      <td>7102</td>
      <td>MINAHASA</td>
    </tr>
    <tr>
      <th>372</th>
      <td>ACEH</td>
      <td>7103</td>
      <td>KEPULAUAN  SANGIHE</td>
    </tr>
    <tr>
      <th>373</th>
      <td>ACEH</td>
      <td>7104</td>
      <td>KEPULAUAN TALAUD</td>
    </tr>
    <tr>
      <th>374</th>
      <td>ACEH</td>
      <td>7105</td>
      <td>MINAHASA  SELATAN</td>
    </tr>
    <tr>
      <th>375</th>
      <td>ACEH</td>
      <td>7106</td>
      <td>MINAHASA UTARA</td>
    </tr>
    <tr>
      <th>376</th>
      <td>ACEH</td>
      <td>7107</td>
      <td>MINAHASA TENGGARA</td>
    </tr>
    <tr>
      <th>377</th>
      <td>ACEH</td>
      <td>7108</td>
      <td>BOLAANG  MONGONDOW UTARA</td>
    </tr>
    <tr>
      <th>378</th>
      <td>ACEH</td>
      <td>7109</td>
      <td>KEP SIAU TAGULANDANG BIARO</td>
    </tr>
    <tr>
      <th>379</th>
      <td>ACEH</td>
      <td>7110</td>
      <td>BOLAANG MONGONDOW TIMUR</td>
    </tr>
    <tr>
      <th>380</th>
      <td>ACEH</td>
      <td>7111</td>
      <td>BOLAANG  MONGONDOW SELATAN</td>
    </tr>
    <tr>
      <th>381</th>
      <td>ACEH</td>
      <td>7171</td>
      <td>KOTA MANADO</td>
    </tr>
    <tr>
      <th>382</th>
      <td>ACEH</td>
      <td>7172</td>
      <td>KOTA BITUNG</td>
    </tr>
    <tr>
      <th>383</th>
      <td>ACEH</td>
      <td>7173</td>
      <td>KOTA TOMOHON</td>
    </tr>
    <tr>
      <th>384</th>
      <td>ACEH</td>
      <td>7174</td>
      <td>KOTA KOTAMOBAGU</td>
    </tr>
    <tr>
      <th>385</th>
      <td>ACEH</td>
      <td>7201</td>
      <td>BANGGAI</td>
    </tr>
    <tr>
      <th>386</th>
      <td>ACEH</td>
      <td>7202</td>
      <td>POSO</td>
    </tr>
    <tr>
      <th>387</th>
      <td>ACEH</td>
      <td>7203</td>
      <td>DONGGALA</td>
    </tr>
    <tr>
      <th>388</th>
      <td>ACEH</td>
      <td>7204</td>
      <td>TOLI TOLI</td>
    </tr>
    <tr>
      <th>389</th>
      <td>ACEH</td>
      <td>7205</td>
      <td>BUOL</td>
    </tr>
    <tr>
      <th>390</th>
      <td>ACEH</td>
      <td>7206</td>
      <td>MOROWALI</td>
    </tr>
    <tr>
      <th>391</th>
      <td>ACEH</td>
      <td>7207</td>
      <td>BANGGAI KEPULAUAN</td>
    </tr>
    <tr>
      <th>392</th>
      <td>ACEH</td>
      <td>7208</td>
      <td>PARIGI MOUTONG</td>
    </tr>
    <tr>
      <th>393</th>
      <td>ACEH</td>
      <td>7209</td>
      <td>TOJO UNA UNA</td>
    </tr>
    <tr>
      <th>394</th>
      <td>ACEH</td>
      <td>7210</td>
      <td>SIGI</td>
    </tr>
    <tr>
      <th>395</th>
      <td>ACEH</td>
      <td>7211</td>
      <td>BANGGAI LAUT</td>
    </tr>
    <tr>
      <th>396</th>
      <td>ACEH</td>
      <td>7212</td>
      <td>MOROWALI  UTARA</td>
    </tr>
    <tr>
      <th>397</th>
      <td>ACEH</td>
      <td>7271</td>
      <td>KOTA PALU</td>
    </tr>
    <tr>
      <th>398</th>
      <td>ACEH</td>
      <td>7301</td>
      <td>KEPULAUAN  SELAYAR</td>
    </tr>
    <tr>
      <th>399</th>
      <td>ACEH</td>
      <td>7302</td>
      <td>BULUKUMBA</td>
    </tr>
    <tr>
      <th>400</th>
      <td>ACEH</td>
      <td>7303</td>
      <td>BANTAENG</td>
    </tr>
    <tr>
      <th>401</th>
      <td>ACEH</td>
      <td>7304</td>
      <td>JENEPONTO</td>
    </tr>
    <tr>
      <th>402</th>
      <td>ACEH</td>
      <td>7305</td>
      <td>TAKALAR</td>
    </tr>
    <tr>
      <th>403</th>
      <td>ACEH</td>
      <td>7306</td>
      <td>GOWA</td>
    </tr>
    <tr>
      <th>404</th>
      <td>ACEH</td>
      <td>7307</td>
      <td>SINJAI</td>
    </tr>
    <tr>
      <th>405</th>
      <td>ACEH</td>
      <td>7308</td>
      <td>BONE</td>
    </tr>
    <tr>
      <th>406</th>
      <td>ACEH</td>
      <td>7309</td>
      <td>MAROS</td>
    </tr>
    <tr>
      <th>407</th>
      <td>ACEH</td>
      <td>7310</td>
      <td>PANGKAJENE KEPULAUAN</td>
    </tr>
    <tr>
      <th>408</th>
      <td>ACEH</td>
      <td>7311</td>
      <td>BARRU</td>
    </tr>
    <tr>
      <th>409</th>
      <td>ACEH</td>
      <td>7312</td>
      <td>SOPPENG</td>
    </tr>
    <tr>
      <th>410</th>
      <td>ACEH</td>
      <td>7313</td>
      <td>WAJO</td>
    </tr>
    <tr>
      <th>411</th>
      <td>ACEH</td>
      <td>7314</td>
      <td>SIDENRENG  RAPPANG</td>
    </tr>
    <tr>
      <th>412</th>
      <td>ACEH</td>
      <td>7315</td>
      <td>PINRANG</td>
    </tr>
    <tr>
      <th>413</th>
      <td>ACEH</td>
      <td>7316</td>
      <td>ENREKANG</td>
    </tr>
    <tr>
      <th>414</th>
      <td>ACEH</td>
      <td>7317</td>
      <td>LUWU</td>
    </tr>
    <tr>
      <th>415</th>
      <td>ACEH</td>
      <td>7318</td>
      <td>TANA TORAJA</td>
    </tr>
    <tr>
      <th>416</th>
      <td>ACEH</td>
      <td>7322</td>
      <td>LUWU UTARA</td>
    </tr>
    <tr>
      <th>417</th>
      <td>ACEH</td>
      <td>7324</td>
      <td>LUWU TIMUR</td>
    </tr>
    <tr>
      <th>418</th>
      <td>ACEH</td>
      <td>7326</td>
      <td>TORAJA UTARA</td>
    </tr>
    <tr>
      <th>419</th>
      <td>ACEH</td>
      <td>7371</td>
      <td>KOTA MAKASSAR</td>
    </tr>
    <tr>
      <th>420</th>
      <td>ACEH</td>
      <td>7372</td>
      <td>KOTA PARE PARE</td>
    </tr>
    <tr>
      <th>421</th>
      <td>ACEH</td>
      <td>7373</td>
      <td>KOTA PALOPO</td>
    </tr>
    <tr>
      <th>422</th>
      <td>ACEH</td>
      <td>7401</td>
      <td>KOLAKA</td>
    </tr>
    <tr>
      <th>423</th>
      <td>ACEH</td>
      <td>7402</td>
      <td>KONAWE</td>
    </tr>
    <tr>
      <th>424</th>
      <td>ACEH</td>
      <td>7403</td>
      <td>MUNA</td>
    </tr>
    <tr>
      <th>425</th>
      <td>ACEH</td>
      <td>7404</td>
      <td>BUTON</td>
    </tr>
    <tr>
      <th>426</th>
      <td>ACEH</td>
      <td>7405</td>
      <td>KONAWE SELATAN</td>
    </tr>
    <tr>
      <th>427</th>
      <td>ACEH</td>
      <td>7406</td>
      <td>BOMBANA</td>
    </tr>
    <tr>
      <th>428</th>
      <td>ACEH</td>
      <td>7407</td>
      <td>WAKATOBI</td>
    </tr>
    <tr>
      <th>429</th>
      <td>ACEH</td>
      <td>7408</td>
      <td>KOLAKA UTARA</td>
    </tr>
    <tr>
      <th>430</th>
      <td>ACEH</td>
      <td>7409</td>
      <td>KONAWE UTARA</td>
    </tr>
    <tr>
      <th>431</th>
      <td>ACEH</td>
      <td>7410</td>
      <td>BUTON UTARA</td>
    </tr>
    <tr>
      <th>432</th>
      <td>ACEH</td>
      <td>7411</td>
      <td>KOLAKA TIMUR</td>
    </tr>
    <tr>
      <th>433</th>
      <td>ACEH</td>
      <td>7412</td>
      <td>KONAWE KEPULAUAN</td>
    </tr>
    <tr>
      <th>434</th>
      <td>ACEH</td>
      <td>7413</td>
      <td>MUNA BARAT</td>
    </tr>
    <tr>
      <th>435</th>
      <td>ACEH</td>
      <td>7414</td>
      <td>BUTON TENGAH</td>
    </tr>
    <tr>
      <th>436</th>
      <td>ACEH</td>
      <td>7415</td>
      <td>BUTON SELATAN</td>
    </tr>
    <tr>
      <th>437</th>
      <td>ACEH</td>
      <td>7471</td>
      <td>KOTA KENDARI</td>
    </tr>
    <tr>
      <th>438</th>
      <td>ACEH</td>
      <td>7472</td>
      <td>KOTA BAU BAU</td>
    </tr>
    <tr>
      <th>439</th>
      <td>ACEH</td>
      <td>7501</td>
      <td>GORONTALO</td>
    </tr>
    <tr>
      <th>440</th>
      <td>ACEH</td>
      <td>7502</td>
      <td>BOALEMO</td>
    </tr>
    <tr>
      <th>441</th>
      <td>ACEH</td>
      <td>7503</td>
      <td>BONE BOLANGO</td>
    </tr>
    <tr>
      <th>442</th>
      <td>ACEH</td>
      <td>7504</td>
      <td>PAHUWATO</td>
    </tr>
    <tr>
      <th>443</th>
      <td>ACEH</td>
      <td>7505</td>
      <td>GORONTALO UTARA</td>
    </tr>
    <tr>
      <th>444</th>
      <td>ACEH</td>
      <td>7571</td>
      <td>KOTA GORONTALO</td>
    </tr>
    <tr>
      <th>445</th>
      <td>ACEH</td>
      <td>7601</td>
      <td>MAMUJU UTARA</td>
    </tr>
    <tr>
      <th>446</th>
      <td>ACEH</td>
      <td>7602</td>
      <td>MAMUJU</td>
    </tr>
    <tr>
      <th>447</th>
      <td>ACEH</td>
      <td>7603</td>
      <td>MAMASA</td>
    </tr>
    <tr>
      <th>448</th>
      <td>ACEH</td>
      <td>7604</td>
      <td>POLEWALI  MANDAR</td>
    </tr>
    <tr>
      <th>449</th>
      <td>ACEH</td>
      <td>7605</td>
      <td>MAJENE</td>
    </tr>
    <tr>
      <th>450</th>
      <td>ACEH</td>
      <td>7606</td>
      <td>MAMUJU TENGAH</td>
    </tr>
    <tr>
      <th>451</th>
      <td>ACEH</td>
      <td>8101</td>
      <td>MALUKU TENGAH</td>
    </tr>
    <tr>
      <th>452</th>
      <td>ACEH</td>
      <td>8102</td>
      <td>MALUKU TENGGARA</td>
    </tr>
    <tr>
      <th>453</th>
      <td>ACEH</td>
      <td>8103</td>
      <td>MALUKU TENGGARA BARAT</td>
    </tr>
    <tr>
      <th>454</th>
      <td>ACEH</td>
      <td>8104</td>
      <td>BURU</td>
    </tr>
    <tr>
      <th>455</th>
      <td>ACEH</td>
      <td>8105</td>
      <td>SERAM BAGIAN TIMUR</td>
    </tr>
    <tr>
      <th>456</th>
      <td>ACEH</td>
      <td>8106</td>
      <td>SERAM BAGIAN BARAT</td>
    </tr>
    <tr>
      <th>457</th>
      <td>ACEH</td>
      <td>8107</td>
      <td>KEPULAUAN  ARU</td>
    </tr>
    <tr>
      <th>458</th>
      <td>ACEH</td>
      <td>8108</td>
      <td>MALUKU BARAT DAYA</td>
    </tr>
    <tr>
      <th>459</th>
      <td>ACEH</td>
      <td>8109</td>
      <td>BURU SELATAN</td>
    </tr>
    <tr>
      <th>460</th>
      <td>ACEH</td>
      <td>8171</td>
      <td>KOTA AMBON</td>
    </tr>
    <tr>
      <th>461</th>
      <td>ACEH</td>
      <td>8172</td>
      <td>KOTA TUAL</td>
    </tr>
    <tr>
      <th>462</th>
      <td>ACEH</td>
      <td>8201</td>
      <td>HALMAHERA BARAT</td>
    </tr>
    <tr>
      <th>463</th>
      <td>ACEH</td>
      <td>8202</td>
      <td>HALMAHERA TENGAH</td>
    </tr>
    <tr>
      <th>464</th>
      <td>ACEH</td>
      <td>8203</td>
      <td>HALMAHERA UTARA</td>
    </tr>
    <tr>
      <th>465</th>
      <td>ACEH</td>
      <td>8204</td>
      <td>HALMAHERA SELATAN</td>
    </tr>
    <tr>
      <th>466</th>
      <td>ACEH</td>
      <td>8205</td>
      <td>KEPULAUAN SULA</td>
    </tr>
    <tr>
      <th>467</th>
      <td>ACEH</td>
      <td>8206</td>
      <td>HALMAHERA TIMUR</td>
    </tr>
    <tr>
      <th>468</th>
      <td>ACEH</td>
      <td>8207</td>
      <td>PULAU MOROTAI</td>
    </tr>
    <tr>
      <th>469</th>
      <td>ACEH</td>
      <td>8208</td>
      <td>PULAU TALIABU</td>
    </tr>
    <tr>
      <th>470</th>
      <td>ACEH</td>
      <td>8271</td>
      <td>KOTA TERNATE</td>
    </tr>
    <tr>
      <th>471</th>
      <td>ACEH</td>
      <td>8272</td>
      <td>KOTA TIDORE KEPULAUAN</td>
    </tr>
    <tr>
      <th>472</th>
      <td>ACEH</td>
      <td>9101</td>
      <td>MERAUKE</td>
    </tr>
    <tr>
      <th>473</th>
      <td>ACEH</td>
      <td>9102</td>
      <td>JAYAWIJAYA</td>
    </tr>
    <tr>
      <th>474</th>
      <td>ACEH</td>
      <td>9103</td>
      <td>JAYAPURA</td>
    </tr>
    <tr>
      <th>475</th>
      <td>ACEH</td>
      <td>9104</td>
      <td>NABIRE</td>
    </tr>
    <tr>
      <th>476</th>
      <td>ACEH</td>
      <td>9105</td>
      <td>KEPULAUAN  YAPEN</td>
    </tr>
    <tr>
      <th>477</th>
      <td>ACEH</td>
      <td>9106</td>
      <td>BIAK NUMFOR</td>
    </tr>
    <tr>
      <th>478</th>
      <td>ACEH</td>
      <td>9107</td>
      <td>PUNCAK JAYA</td>
    </tr>
    <tr>
      <th>479</th>
      <td>ACEH</td>
      <td>9108</td>
      <td>PANIAI</td>
    </tr>
    <tr>
      <th>480</th>
      <td>ACEH</td>
      <td>9109</td>
      <td>MIMIKA</td>
    </tr>
    <tr>
      <th>481</th>
      <td>ACEH</td>
      <td>9110</td>
      <td>SARMI</td>
    </tr>
    <tr>
      <th>482</th>
      <td>ACEH</td>
      <td>9111</td>
      <td>KEEROM</td>
    </tr>
    <tr>
      <th>483</th>
      <td>ACEH</td>
      <td>9112</td>
      <td>KAB PEGUNUNGAN BINTANG</td>
    </tr>
    <tr>
      <th>484</th>
      <td>ACEH</td>
      <td>9113</td>
      <td>YAHUKIMO</td>
    </tr>
    <tr>
      <th>485</th>
      <td>ACEH</td>
      <td>9114</td>
      <td>TOLIKARA</td>
    </tr>
    <tr>
      <th>486</th>
      <td>ACEH</td>
      <td>9115</td>
      <td>WAROPEN</td>
    </tr>
    <tr>
      <th>487</th>
      <td>ACEH</td>
      <td>9116</td>
      <td>BOVEN DIGOEL</td>
    </tr>
    <tr>
      <th>488</th>
      <td>ACEH</td>
      <td>9117</td>
      <td>MAPPI</td>
    </tr>
    <tr>
      <th>489</th>
      <td>ACEH</td>
      <td>9118</td>
      <td>ASMAT</td>
    </tr>
    <tr>
      <th>490</th>
      <td>ACEH</td>
      <td>9119</td>
      <td>SUPIORI</td>
    </tr>
    <tr>
      <th>491</th>
      <td>ACEH</td>
      <td>9120</td>
      <td>MAMBERAMO RAYA</td>
    </tr>
    <tr>
      <th>492</th>
      <td>ACEH</td>
      <td>9121</td>
      <td>MAMBERAMO TENGAH</td>
    </tr>
    <tr>
      <th>493</th>
      <td>ACEH</td>
      <td>9122</td>
      <td>YALIMO</td>
    </tr>
    <tr>
      <th>494</th>
      <td>ACEH</td>
      <td>9123</td>
      <td>LANNY JAYA</td>
    </tr>
    <tr>
      <th>495</th>
      <td>ACEH</td>
      <td>9124</td>
      <td>NDUGA</td>
    </tr>
    <tr>
      <th>496</th>
      <td>ACEH</td>
      <td>9125</td>
      <td>PUNCAK</td>
    </tr>
    <tr>
      <th>497</th>
      <td>ACEH</td>
      <td>9126</td>
      <td>DOGIYAI</td>
    </tr>
    <tr>
      <th>498</th>
      <td>ACEH</td>
      <td>9127</td>
      <td>INTAN JAYA</td>
    </tr>
    <tr>
      <th>499</th>
      <td>ACEH</td>
      <td>9128</td>
      <td>DEIYAI</td>
    </tr>
    <tr>
      <th>500</th>
      <td>ACEH</td>
      <td>9171</td>
      <td>KOTA JAYAPURA</td>
    </tr>
    <tr>
      <th>501</th>
      <td>ACEH</td>
      <td>9201</td>
      <td>SORONG</td>
    </tr>
    <tr>
      <th>502</th>
      <td>ACEH</td>
      <td>9202</td>
      <td>MANOKWARI</td>
    </tr>
    <tr>
      <th>503</th>
      <td>ACEH</td>
      <td>9203</td>
      <td>FAK FAK</td>
    </tr>
    <tr>
      <th>504</th>
      <td>ACEH</td>
      <td>9204</td>
      <td>SORONG SELATAN</td>
    </tr>
    <tr>
      <th>505</th>
      <td>ACEH</td>
      <td>9205</td>
      <td>RAJA AMPAT</td>
    </tr>
    <tr>
      <th>506</th>
      <td>ACEH</td>
      <td>9206</td>
      <td>TELUK BINTUNI</td>
    </tr>
    <tr>
      <th>507</th>
      <td>ACEH</td>
      <td>9207</td>
      <td>TELUK WONDAMA</td>
    </tr>
    <tr>
      <th>508</th>
      <td>ACEH</td>
      <td>9208</td>
      <td>KAIMANA</td>
    </tr>
    <tr>
      <th>509</th>
      <td>ACEH</td>
      <td>9209</td>
      <td>TAMBRAUW</td>
    </tr>
    <tr>
      <th>510</th>
      <td>ACEH</td>
      <td>9210</td>
      <td>MAYBRAT</td>
    </tr>
    <tr>
      <th>511</th>
      <td>ACEH</td>
      <td>9211</td>
      <td>MANOKWARI SELATAN</td>
    </tr>
    <tr>
      <th>512</th>
      <td>ACEH</td>
      <td>9212</td>
      <td>PEGUNUNGAN ARFAK</td>
    </tr>
    <tr>
      <th>513</th>
      <td>ACEH</td>
      <td>9271</td>
      <td>KOTA SORONG</td>
    </tr>
    <tr>
      <th>514</th>
      <td>ACEH</td>
      <td>id_kab</td>
      <td>nm_kab</td>
    </tr>
    <tr>
      <th>515</th>
      <td>SUMATERA UTARA</td>
      <td>1101</td>
      <td>ACEH SELATAN</td>
    </tr>
    <tr>
      <th>516</th>
      <td>SUMATERA UTARA</td>
      <td>1102</td>
      <td>ACEH TENGGARA</td>
    </tr>
    <tr>
      <th>517</th>
      <td>SUMATERA UTARA</td>
      <td>1103</td>
      <td>ACEH TIMUR</td>
    </tr>
    <tr>
      <th>518</th>
      <td>SUMATERA UTARA</td>
      <td>1104</td>
      <td>ACEH TENGAH</td>
    </tr>
    <tr>
      <th>519</th>
      <td>SUMATERA UTARA</td>
      <td>1105</td>
      <td>ACEH BARAT</td>
    </tr>
    <tr>
      <th>520</th>
      <td>SUMATERA UTARA</td>
      <td>1106</td>
      <td>ACEH BESAR</td>
    </tr>
    <tr>
      <th>521</th>
      <td>SUMATERA UTARA</td>
      <td>1107</td>
      <td>PIDIE</td>
    </tr>
    <tr>
      <th>522</th>
      <td>SUMATERA UTARA</td>
      <td>1108</td>
      <td>ACEH UTARA</td>
    </tr>
    <tr>
      <th>523</th>
      <td>SUMATERA UTARA</td>
      <td>1109</td>
      <td>SIMEULUE</td>
    </tr>
    <tr>
      <th>524</th>
      <td>SUMATERA UTARA</td>
      <td>1110</td>
      <td>ACEH SINGKIL</td>
    </tr>
    <tr>
      <th>525</th>
      <td>SUMATERA UTARA</td>
      <td>1111</td>
      <td>BIREUEN</td>
    </tr>
    <tr>
      <th>526</th>
      <td>SUMATERA UTARA</td>
      <td>1112</td>
      <td>ACEH BARAT DAYA</td>
    </tr>
    <tr>
      <th>527</th>
      <td>SUMATERA UTARA</td>
      <td>1113</td>
      <td>GAYO LUES</td>
    </tr>
    <tr>
      <th>528</th>
      <td>SUMATERA UTARA</td>
      <td>1114</td>
      <td>ACEH JAYA</td>
    </tr>
    <tr>
      <th>529</th>
      <td>SUMATERA UTARA</td>
      <td>1115</td>
      <td>NAGAN RAYA</td>
    </tr>
    <tr>
      <th>530</th>
      <td>SUMATERA UTARA</td>
      <td>1116</td>
      <td>ACEH TAMIANG</td>
    </tr>
    <tr>
      <th>531</th>
      <td>SUMATERA UTARA</td>
      <td>1117</td>
      <td>BENER MERIAH</td>
    </tr>
    <tr>
      <th>532</th>
      <td>SUMATERA UTARA</td>
      <td>1118</td>
      <td>PIDIE JAYA</td>
    </tr>
    <tr>
      <th>533</th>
      <td>SUMATERA UTARA</td>
      <td>1171</td>
      <td>KOTA BANDA ACEH</td>
    </tr>
    <tr>
      <th>534</th>
      <td>SUMATERA UTARA</td>
      <td>1172</td>
      <td>KOTA SABANG</td>
    </tr>
    <tr>
      <th>535</th>
      <td>SUMATERA UTARA</td>
      <td>1173</td>
      <td>KOTA LHOKSEUMAWE</td>
    </tr>
    <tr>
      <th>536</th>
      <td>SUMATERA UTARA</td>
      <td>1174</td>
      <td>KOTA LANGSA</td>
    </tr>
    <tr>
      <th>537</th>
      <td>SUMATERA UTARA</td>
      <td>1175</td>
      <td>KOTA SUBULUSSALAM</td>
    </tr>
    <tr>
      <th>538</th>
      <td>SUMATERA UTARA</td>
      <td>1201</td>
      <td>TAPANULI  TENGAH</td>
    </tr>
    <tr>
      <th>539</th>
      <td>SUMATERA UTARA</td>
      <td>1202</td>
      <td>TAPANULI  UTARA</td>
    </tr>
    <tr>
      <th>540</th>
      <td>SUMATERA UTARA</td>
      <td>1203</td>
      <td>TAPANULI  SELATAN</td>
    </tr>
    <tr>
      <th>541</th>
      <td>SUMATERA UTARA</td>
      <td>1204</td>
      <td>NIAS</td>
    </tr>
    <tr>
      <th>542</th>
      <td>SUMATERA UTARA</td>
      <td>1205</td>
      <td>LANGKAT</td>
    </tr>
    <tr>
      <th>543</th>
      <td>SUMATERA UTARA</td>
      <td>1206</td>
      <td>KARO</td>
    </tr>
    <tr>
      <th>544</th>
      <td>SUMATERA UTARA</td>
      <td>1207</td>
      <td>DELI SERDANG</td>
    </tr>
    <tr>
      <th>545</th>
      <td>SUMATERA UTARA</td>
      <td>1208</td>
      <td>SIMALUNGUN</td>
    </tr>
    <tr>
      <th>546</th>
      <td>SUMATERA UTARA</td>
      <td>1209</td>
      <td>ASAHAN</td>
    </tr>
    <tr>
      <th>547</th>
      <td>SUMATERA UTARA</td>
      <td>1210</td>
      <td>LABUHANBATU</td>
    </tr>
    <tr>
      <th>548</th>
      <td>SUMATERA UTARA</td>
      <td>1211</td>
      <td>DAIRI</td>
    </tr>
    <tr>
      <th>549</th>
      <td>SUMATERA UTARA</td>
      <td>1212</td>
      <td>TOBA SAMOSIR</td>
    </tr>
    <tr>
      <th>550</th>
      <td>SUMATERA UTARA</td>
      <td>1213</td>
      <td>MANDAILING NATAL</td>
    </tr>
    <tr>
      <th>551</th>
      <td>SUMATERA UTARA</td>
      <td>1214</td>
      <td>NIAS SELATAN</td>
    </tr>
    <tr>
      <th>552</th>
      <td>SUMATERA UTARA</td>
      <td>1215</td>
      <td>PAKPAK BHARAT</td>
    </tr>
    <tr>
      <th>553</th>
      <td>SUMATERA UTARA</td>
      <td>1216</td>
      <td>HUMBANG  HASUNDUTAN</td>
    </tr>
    <tr>
      <th>554</th>
      <td>SUMATERA UTARA</td>
      <td>1217</td>
      <td>SAMOSIR</td>
    </tr>
    <tr>
      <th>555</th>
      <td>SUMATERA UTARA</td>
      <td>1218</td>
      <td>SERDANG  BEDAGAI</td>
    </tr>
    <tr>
      <th>556</th>
      <td>SUMATERA UTARA</td>
      <td>1219</td>
      <td>BATU BARA</td>
    </tr>
    <tr>
      <th>557</th>
      <td>SUMATERA UTARA</td>
      <td>1220</td>
      <td>PADANG LAWAS UTARA</td>
    </tr>
    <tr>
      <th>558</th>
      <td>SUMATERA UTARA</td>
      <td>1221</td>
      <td>PADANG LAWAS</td>
    </tr>
    <tr>
      <th>559</th>
      <td>SUMATERA UTARA</td>
      <td>1222</td>
      <td>LABUHANBATU SELATAN</td>
    </tr>
    <tr>
      <th>560</th>
      <td>SUMATERA UTARA</td>
      <td>1223</td>
      <td>LABUHANBATU UTARA</td>
    </tr>
    <tr>
      <th>561</th>
      <td>SUMATERA UTARA</td>
      <td>1224</td>
      <td>NIAS UTARA</td>
    </tr>
    <tr>
      <th>562</th>
      <td>SUMATERA UTARA</td>
      <td>1225</td>
      <td>NIAS BARAT</td>
    </tr>
    <tr>
      <th>563</th>
      <td>SUMATERA UTARA</td>
      <td>1271</td>
      <td>KOTA MEDAN</td>
    </tr>
    <tr>
      <th>564</th>
      <td>SUMATERA UTARA</td>
      <td>1272</td>
      <td>KOTA PEMATANGSIANTAR</td>
    </tr>
    <tr>
      <th>565</th>
      <td>SUMATERA UTARA</td>
      <td>1273</td>
      <td>KOTA SIBOLGA</td>
    </tr>
    <tr>
      <th>566</th>
      <td>SUMATERA UTARA</td>
      <td>1274</td>
      <td>KOTA TANJUNG  BALAI</td>
    </tr>
    <tr>
      <th>567</th>
      <td>SUMATERA UTARA</td>
      <td>1275</td>
      <td>KOTA BINJAI</td>
    </tr>
    <tr>
      <th>568</th>
      <td>SUMATERA UTARA</td>
      <td>1276</td>
      <td>KOTA BINJAI</td>
    </tr>
    <tr>
      <th>569</th>
      <td>SUMATERA UTARA</td>
      <td>1277</td>
      <td>KOTA PADANGSIDIMPUAN</td>
    </tr>
    <tr>
      <th>570</th>
      <td>SUMATERA UTARA</td>
      <td>1278</td>
      <td>KOTA GUNUNGSITOLI</td>
    </tr>
    <tr>
      <th>571</th>
      <td>SUMATERA UTARA</td>
      <td>1301</td>
      <td>PESISIR SELATAN</td>
    </tr>
    <tr>
      <th>572</th>
      <td>SUMATERA UTARA</td>
      <td>1302</td>
      <td>SOLOK</td>
    </tr>
    <tr>
      <th>573</th>
      <td>SUMATERA UTARA</td>
      <td>1303</td>
      <td>SIJUNJUNG</td>
    </tr>
    <tr>
      <th>574</th>
      <td>SUMATERA UTARA</td>
      <td>1304</td>
      <td>TANAH DATAR</td>
    </tr>
    <tr>
      <th>575</th>
      <td>SUMATERA UTARA</td>
      <td>1305</td>
      <td>PADANG PARIAMAN</td>
    </tr>
    <tr>
      <th>576</th>
      <td>SUMATERA UTARA</td>
      <td>1306</td>
      <td>AGAM</td>
    </tr>
    <tr>
      <th>577</th>
      <td>SUMATERA UTARA</td>
      <td>1307</td>
      <td>LIMA PULUH KOTA</td>
    </tr>
    <tr>
      <th>578</th>
      <td>SUMATERA UTARA</td>
      <td>1308</td>
      <td>PASAMAN</td>
    </tr>
    <tr>
      <th>579</th>
      <td>SUMATERA UTARA</td>
      <td>1309</td>
      <td>KEPULAUAN MENTAWAI</td>
    </tr>
    <tr>
      <th>580</th>
      <td>SUMATERA UTARA</td>
      <td>1310</td>
      <td>DHARMASRAYA</td>
    </tr>
    <tr>
      <th>581</th>
      <td>SUMATERA UTARA</td>
      <td>1311</td>
      <td>SOLOK SELATAN</td>
    </tr>
    <tr>
      <th>582</th>
      <td>SUMATERA UTARA</td>
      <td>1312</td>
      <td>PASAMAN BARAT</td>
    </tr>
    <tr>
      <th>583</th>
      <td>SUMATERA UTARA</td>
      <td>1371</td>
      <td>KOTA PADANG</td>
    </tr>
    <tr>
      <th>584</th>
      <td>SUMATERA UTARA</td>
      <td>1372</td>
      <td>KOTA SOLOK</td>
    </tr>
    <tr>
      <th>585</th>
      <td>SUMATERA UTARA</td>
      <td>1373</td>
      <td>KOTA SAWAHLUNTO</td>
    </tr>
    <tr>
      <th>586</th>
      <td>SUMATERA UTARA</td>
      <td>1374</td>
      <td>KOTA PADANG PANJANG</td>
    </tr>
    <tr>
      <th>587</th>
      <td>SUMATERA UTARA</td>
      <td>1375</td>
      <td>KOTA BUKITTINGGI</td>
    </tr>
    <tr>
      <th>588</th>
      <td>SUMATERA UTARA</td>
      <td>1376</td>
      <td>KOTA PAYAKUMBUH</td>
    </tr>
    <tr>
      <th>589</th>
      <td>SUMATERA UTARA</td>
      <td>1377</td>
      <td>KOTA PARIAMAN</td>
    </tr>
    <tr>
      <th>590</th>
      <td>SUMATERA UTARA</td>
      <td>1401</td>
      <td>KAMPAR</td>
    </tr>
    <tr>
      <th>591</th>
      <td>SUMATERA UTARA</td>
      <td>1402</td>
      <td>INDRAGIRI  HULU</td>
    </tr>
    <tr>
      <th>592</th>
      <td>SUMATERA UTARA</td>
      <td>1403</td>
      <td>BENGKALIS</td>
    </tr>
    <tr>
      <th>593</th>
      <td>SUMATERA UTARA</td>
      <td>1404</td>
      <td>INDRAGIRI  HILIR</td>
    </tr>
    <tr>
      <th>594</th>
      <td>SUMATERA UTARA</td>
      <td>1405</td>
      <td>PELALAWAN</td>
    </tr>
    <tr>
      <th>595</th>
      <td>SUMATERA UTARA</td>
      <td>1406</td>
      <td>ROKAN HULU</td>
    </tr>
    <tr>
      <th>596</th>
      <td>SUMATERA UTARA</td>
      <td>1407</td>
      <td>ROKAN HILIR</td>
    </tr>
    <tr>
      <th>597</th>
      <td>SUMATERA UTARA</td>
      <td>1408</td>
      <td>SIAK</td>
    </tr>
    <tr>
      <th>598</th>
      <td>SUMATERA UTARA</td>
      <td>1409</td>
      <td>KUANTAN SINGINGI</td>
    </tr>
    <tr>
      <th>599</th>
      <td>SUMATERA UTARA</td>
      <td>1410</td>
      <td>KEPULAUAN MERANTI</td>
    </tr>
    <tr>
      <th>600</th>
      <td>SUMATERA UTARA</td>
      <td>1471</td>
      <td>KOTA PEKANBARU</td>
    </tr>
    <tr>
      <th>601</th>
      <td>SUMATERA UTARA</td>
      <td>1472</td>
      <td>KOTA DUMAI</td>
    </tr>
    <tr>
      <th>602</th>
      <td>SUMATERA UTARA</td>
      <td>1501</td>
      <td>KERINCI</td>
    </tr>
    <tr>
      <th>603</th>
      <td>SUMATERA UTARA</td>
      <td>1502</td>
      <td>MERANGIN</td>
    </tr>
    <tr>
      <th>604</th>
      <td>SUMATERA UTARA</td>
      <td>1503</td>
      <td>SAROLANGUN</td>
    </tr>
    <tr>
      <th>605</th>
      <td>SUMATERA UTARA</td>
      <td>1504</td>
      <td>BATANGHARI</td>
    </tr>
    <tr>
      <th>606</th>
      <td>SUMATERA UTARA</td>
      <td>1505</td>
      <td>MUAROJAMBI</td>
    </tr>
    <tr>
      <th>607</th>
      <td>SUMATERA UTARA</td>
      <td>1506</td>
      <td>TANJUNG  JABUNG BARAT</td>
    </tr>
    <tr>
      <th>608</th>
      <td>SUMATERA UTARA</td>
      <td>1507</td>
      <td>TANJUNG  JABUNG TIMUR</td>
    </tr>
    <tr>
      <th>609</th>
      <td>SUMATERA UTARA</td>
      <td>1508</td>
      <td>BUNGO</td>
    </tr>
    <tr>
      <th>610</th>
      <td>SUMATERA UTARA</td>
      <td>1509</td>
      <td>TEBO</td>
    </tr>
    <tr>
      <th>611</th>
      <td>SUMATERA UTARA</td>
      <td>1571</td>
      <td>KOTA JAMBI</td>
    </tr>
    <tr>
      <th>612</th>
      <td>SUMATERA UTARA</td>
      <td>1572</td>
      <td>KOTA SUNGAI PENUH</td>
    </tr>
    <tr>
      <th>613</th>
      <td>SUMATERA UTARA</td>
      <td>1601</td>
      <td>OGAN KOMERING  ULU</td>
    </tr>
    <tr>
      <th>614</th>
      <td>SUMATERA UTARA</td>
      <td>1602</td>
      <td>OGAN KOMERING  ILIR</td>
    </tr>
    <tr>
      <th>615</th>
      <td>SUMATERA UTARA</td>
      <td>1603</td>
      <td>MUARA ENIM</td>
    </tr>
    <tr>
      <th>616</th>
      <td>SUMATERA UTARA</td>
      <td>1604</td>
      <td>LAHAT</td>
    </tr>
    <tr>
      <th>617</th>
      <td>SUMATERA UTARA</td>
      <td>1605</td>
      <td>MUSI RAWAS</td>
    </tr>
    <tr>
      <th>618</th>
      <td>SUMATERA UTARA</td>
      <td>1606</td>
      <td>MUSI BANYUASIN</td>
    </tr>
    <tr>
      <th>619</th>
      <td>SUMATERA UTARA</td>
      <td>1607</td>
      <td>BANYUASIN</td>
    </tr>
    <tr>
      <th>620</th>
      <td>SUMATERA UTARA</td>
      <td>1608</td>
      <td>OGAN KOMERING  ULU TIMUR</td>
    </tr>
    <tr>
      <th>621</th>
      <td>SUMATERA UTARA</td>
      <td>1609</td>
      <td>OGAN KOMERING ULU SELATAN</td>
    </tr>
    <tr>
      <th>622</th>
      <td>SUMATERA UTARA</td>
      <td>1610</td>
      <td>OGAN ILIR</td>
    </tr>
    <tr>
      <th>623</th>
      <td>SUMATERA UTARA</td>
      <td>1611</td>
      <td>EMPAT LAWANG</td>
    </tr>
    <tr>
      <th>624</th>
      <td>SUMATERA UTARA</td>
      <td>1612</td>
      <td>PENUKAL ABAB LEMATANG ILIR</td>
    </tr>
    <tr>
      <th>625</th>
      <td>SUMATERA UTARA</td>
      <td>1613</td>
      <td>MUSI RAWAS UTARA</td>
    </tr>
    <tr>
      <th>626</th>
      <td>SUMATERA UTARA</td>
      <td>1671</td>
      <td>KOTA PALEMBANG</td>
    </tr>
    <tr>
      <th>627</th>
      <td>SUMATERA UTARA</td>
      <td>1672</td>
      <td>KOTA PAGAR ALAM</td>
    </tr>
    <tr>
      <th>628</th>
      <td>SUMATERA UTARA</td>
      <td>1673</td>
      <td>KOTA LUBUK LINGGAU</td>
    </tr>
    <tr>
      <th>629</th>
      <td>SUMATERA UTARA</td>
      <td>1674</td>
      <td>KOTA PRABUMULIH</td>
    </tr>
    <tr>
      <th>630</th>
      <td>SUMATERA UTARA</td>
      <td>1701</td>
      <td>BENGKULU  SELATAN</td>
    </tr>
    <tr>
      <th>631</th>
      <td>SUMATERA UTARA</td>
      <td>1702</td>
      <td>REJANG LEBONG</td>
    </tr>
    <tr>
      <th>632</th>
      <td>SUMATERA UTARA</td>
      <td>1703</td>
      <td>BENGKULU UTARA</td>
    </tr>
    <tr>
      <th>633</th>
      <td>SUMATERA UTARA</td>
      <td>1704</td>
      <td>KAUR</td>
    </tr>
    <tr>
      <th>634</th>
      <td>SUMATERA UTARA</td>
      <td>1705</td>
      <td>SELUMA</td>
    </tr>
    <tr>
      <th>635</th>
      <td>SUMATERA UTARA</td>
      <td>1706</td>
      <td>MUKO MUKO</td>
    </tr>
    <tr>
      <th>636</th>
      <td>SUMATERA UTARA</td>
      <td>1707</td>
      <td>LEBONG</td>
    </tr>
    <tr>
      <th>637</th>
      <td>SUMATERA UTARA</td>
      <td>1708</td>
      <td>KEPAHIANG</td>
    </tr>
    <tr>
      <th>638</th>
      <td>SUMATERA UTARA</td>
      <td>1709</td>
      <td>BENGKULU  TENGAH</td>
    </tr>
    <tr>
      <th>639</th>
      <td>SUMATERA UTARA</td>
      <td>1771</td>
      <td>KOTA BENGKULU</td>
    </tr>
    <tr>
      <th>640</th>
      <td>SUMATERA UTARA</td>
      <td>1801</td>
      <td>LAMPUNG  SELATAN</td>
    </tr>
    <tr>
      <th>641</th>
      <td>SUMATERA UTARA</td>
      <td>1802</td>
      <td>LAMPUNG  TENGAH</td>
    </tr>
    <tr>
      <th>642</th>
      <td>SUMATERA UTARA</td>
      <td>1803</td>
      <td>LAMPUNG UTARA</td>
    </tr>
    <tr>
      <th>643</th>
      <td>SUMATERA UTARA</td>
      <td>1804</td>
      <td>LAMPUNG BARAT</td>
    </tr>
    <tr>
      <th>644</th>
      <td>SUMATERA UTARA</td>
      <td>1805</td>
      <td>TULANG BAWANG</td>
    </tr>
    <tr>
      <th>645</th>
      <td>SUMATERA UTARA</td>
      <td>1806</td>
      <td>TANGGAMUS</td>
    </tr>
    <tr>
      <th>646</th>
      <td>SUMATERA UTARA</td>
      <td>1807</td>
      <td>LAMPUNG  TIMUR</td>
    </tr>
    <tr>
      <th>647</th>
      <td>SUMATERA UTARA</td>
      <td>1808</td>
      <td>WAY KANAN</td>
    </tr>
    <tr>
      <th>648</th>
      <td>SUMATERA UTARA</td>
      <td>1809</td>
      <td>PESAWARAN</td>
    </tr>
    <tr>
      <th>649</th>
      <td>SUMATERA UTARA</td>
      <td>1810</td>
      <td>PRINGSEWU</td>
    </tr>
    <tr>
      <th>650</th>
      <td>SUMATERA UTARA</td>
      <td>1811</td>
      <td>MESUJI</td>
    </tr>
    <tr>
      <th>651</th>
      <td>SUMATERA UTARA</td>
      <td>1812</td>
      <td>TULANG BAWANG BARAT</td>
    </tr>
    <tr>
      <th>652</th>
      <td>SUMATERA UTARA</td>
      <td>1813</td>
      <td>PESISIR BARAT</td>
    </tr>
    <tr>
      <th>653</th>
      <td>SUMATERA UTARA</td>
      <td>1871</td>
      <td>KOTA BANDAR LAMPUNG</td>
    </tr>
    <tr>
      <th>654</th>
      <td>SUMATERA UTARA</td>
      <td>1872</td>
      <td>KOTA METRO</td>
    </tr>
    <tr>
      <th>655</th>
      <td>SUMATERA UTARA</td>
      <td>1901</td>
      <td>BANGKA</td>
    </tr>
    <tr>
      <th>656</th>
      <td>SUMATERA UTARA</td>
      <td>1902</td>
      <td>BELITUNG</td>
    </tr>
    <tr>
      <th>657</th>
      <td>SUMATERA UTARA</td>
      <td>1903</td>
      <td>BANGKA SELATAN</td>
    </tr>
    <tr>
      <th>658</th>
      <td>SUMATERA UTARA</td>
      <td>1904</td>
      <td>BANGKA TENGAH</td>
    </tr>
    <tr>
      <th>659</th>
      <td>SUMATERA UTARA</td>
      <td>1905</td>
      <td>BANGKA BARAT</td>
    </tr>
    <tr>
      <th>660</th>
      <td>SUMATERA UTARA</td>
      <td>1906</td>
      <td>BELITUNG TIMUR</td>
    </tr>
    <tr>
      <th>661</th>
      <td>SUMATERA UTARA</td>
      <td>1971</td>
      <td>KOTA PANGKAL PINANG</td>
    </tr>
    <tr>
      <th>662</th>
      <td>SUMATERA UTARA</td>
      <td>2101</td>
      <td>BINTAN</td>
    </tr>
    <tr>
      <th>663</th>
      <td>SUMATERA UTARA</td>
      <td>2102</td>
      <td>KARIMUN</td>
    </tr>
    <tr>
      <th>664</th>
      <td>SUMATERA UTARA</td>
      <td>2103</td>
      <td>NATUNA</td>
    </tr>
    <tr>
      <th>665</th>
      <td>SUMATERA UTARA</td>
      <td>2104</td>
      <td>LINGGA</td>
    </tr>
    <tr>
      <th>666</th>
      <td>SUMATERA UTARA</td>
      <td>2105</td>
      <td>KEPULAUAN ANAMBAS</td>
    </tr>
    <tr>
      <th>667</th>
      <td>SUMATERA UTARA</td>
      <td>2171</td>
      <td>KOTA BATAM</td>
    </tr>
    <tr>
      <th>668</th>
      <td>SUMATERA UTARA</td>
      <td>2172</td>
      <td>KOTA TANJUNG  PINANG</td>
    </tr>
    <tr>
      <th>669</th>
      <td>SUMATERA UTARA</td>
      <td>3101</td>
      <td>ADM KEP SERIBU</td>
    </tr>
    <tr>
      <th>670</th>
      <td>SUMATERA UTARA</td>
      <td>3171</td>
      <td>KOTA ADM JAKARTA PUSAT</td>
    </tr>
    <tr>
      <th>671</th>
      <td>SUMATERA UTARA</td>
      <td>3172</td>
      <td>KOTA ADM JAKARTA UTARA</td>
    </tr>
    <tr>
      <th>672</th>
      <td>SUMATERA UTARA</td>
      <td>3173</td>
      <td>KOTA ADM JAKARTA BARAT</td>
    </tr>
    <tr>
      <th>673</th>
      <td>SUMATERA UTARA</td>
      <td>3174</td>
      <td>KOTA ADM JAKARTA SELATAN</td>
    </tr>
    <tr>
      <th>674</th>
      <td>SUMATERA UTARA</td>
      <td>3175</td>
      <td>KOTA ADM JAKARTA TIMUR</td>
    </tr>
    <tr>
      <th>675</th>
      <td>SUMATERA UTARA</td>
      <td>3201</td>
      <td>BOGOR</td>
    </tr>
    <tr>
      <th>676</th>
      <td>SUMATERA UTARA</td>
      <td>3202</td>
      <td>SUKABUMI</td>
    </tr>
    <tr>
      <th>677</th>
      <td>SUMATERA UTARA</td>
      <td>3203</td>
      <td>CIANJUR</td>
    </tr>
    <tr>
      <th>678</th>
      <td>SUMATERA UTARA</td>
      <td>3204</td>
      <td>BANDUNG</td>
    </tr>
    <tr>
      <th>679</th>
      <td>SUMATERA UTARA</td>
      <td>3205</td>
      <td>GARUT</td>
    </tr>
    <tr>
      <th>680</th>
      <td>SUMATERA UTARA</td>
      <td>3206</td>
      <td>TASIKMALAYA</td>
    </tr>
    <tr>
      <th>681</th>
      <td>SUMATERA UTARA</td>
      <td>3207</td>
      <td>CIAMIS</td>
    </tr>
    <tr>
      <th>682</th>
      <td>SUMATERA UTARA</td>
      <td>3208</td>
      <td>KUNINGAN</td>
    </tr>
    <tr>
      <th>683</th>
      <td>SUMATERA UTARA</td>
      <td>3209</td>
      <td>CIREBON</td>
    </tr>
    <tr>
      <th>684</th>
      <td>SUMATERA UTARA</td>
      <td>3210</td>
      <td>MAJALENGKA</td>
    </tr>
    <tr>
      <th>685</th>
      <td>SUMATERA UTARA</td>
      <td>3211</td>
      <td>SUMEDANG</td>
    </tr>
    <tr>
      <th>686</th>
      <td>SUMATERA UTARA</td>
      <td>3212</td>
      <td>INDRAMAYU</td>
    </tr>
    <tr>
      <th>687</th>
      <td>SUMATERA UTARA</td>
      <td>3213</td>
      <td>SUBANG</td>
    </tr>
    <tr>
      <th>688</th>
      <td>SUMATERA UTARA</td>
      <td>3214</td>
      <td>PURWAKARTA</td>
    </tr>
    <tr>
      <th>689</th>
      <td>SUMATERA UTARA</td>
      <td>3215</td>
      <td>KARAWANG</td>
    </tr>
    <tr>
      <th>690</th>
      <td>SUMATERA UTARA</td>
      <td>3216</td>
      <td>BEKASI</td>
    </tr>
    <tr>
      <th>691</th>
      <td>SUMATERA UTARA</td>
      <td>3217</td>
      <td>BANDUNG  BARAT</td>
    </tr>
    <tr>
      <th>692</th>
      <td>SUMATERA UTARA</td>
      <td>3218</td>
      <td>PANGANDARAN</td>
    </tr>
    <tr>
      <th>693</th>
      <td>SUMATERA UTARA</td>
      <td>3271</td>
      <td>KOTA BOGOR</td>
    </tr>
    <tr>
      <th>694</th>
      <td>SUMATERA UTARA</td>
      <td>3272</td>
      <td>KOTA SUKABUMI</td>
    </tr>
    <tr>
      <th>695</th>
      <td>SUMATERA UTARA</td>
      <td>3273</td>
      <td>KOTA BANDUNG</td>
    </tr>
    <tr>
      <th>696</th>
      <td>SUMATERA UTARA</td>
      <td>3274</td>
      <td>KOTA CIREBON</td>
    </tr>
    <tr>
      <th>697</th>
      <td>SUMATERA UTARA</td>
      <td>3275</td>
      <td>KOTA BEKASI</td>
    </tr>
    <tr>
      <th>698</th>
      <td>SUMATERA UTARA</td>
      <td>3276</td>
      <td>KOTA DEPOK</td>
    </tr>
    <tr>
      <th>699</th>
      <td>SUMATERA UTARA</td>
      <td>3277</td>
      <td>KOTA CIMAHI</td>
    </tr>
    <tr>
      <th>700</th>
      <td>SUMATERA UTARA</td>
      <td>3278</td>
      <td>KOTA TASIKMALAYA</td>
    </tr>
    <tr>
      <th>701</th>
      <td>SUMATERA UTARA</td>
      <td>3279</td>
      <td>KOTA BANJAR</td>
    </tr>
    <tr>
      <th>702</th>
      <td>SUMATERA UTARA</td>
      <td>3301</td>
      <td>CILACAP</td>
    </tr>
    <tr>
      <th>703</th>
      <td>SUMATERA UTARA</td>
      <td>3302</td>
      <td>BANYUMAS</td>
    </tr>
    <tr>
      <th>704</th>
      <td>SUMATERA UTARA</td>
      <td>3303</td>
      <td>PURBALINGGA</td>
    </tr>
    <tr>
      <th>705</th>
      <td>SUMATERA UTARA</td>
      <td>3304</td>
      <td>BANJARNEGARA</td>
    </tr>
    <tr>
      <th>706</th>
      <td>SUMATERA UTARA</td>
      <td>3305</td>
      <td>KEBUMEN</td>
    </tr>
    <tr>
      <th>707</th>
      <td>SUMATERA UTARA</td>
      <td>3306</td>
      <td>PURWOREJO</td>
    </tr>
    <tr>
      <th>708</th>
      <td>SUMATERA UTARA</td>
      <td>3307</td>
      <td>WONOSOBO</td>
    </tr>
    <tr>
      <th>709</th>
      <td>SUMATERA UTARA</td>
      <td>3308</td>
      <td>MAGELANG</td>
    </tr>
    <tr>
      <th>710</th>
      <td>SUMATERA UTARA</td>
      <td>3309</td>
      <td>BOYOLALI</td>
    </tr>
    <tr>
      <th>711</th>
      <td>SUMATERA UTARA</td>
      <td>3310</td>
      <td>KLATEN</td>
    </tr>
    <tr>
      <th>712</th>
      <td>SUMATERA UTARA</td>
      <td>3311</td>
      <td>SUKOHARJO</td>
    </tr>
    <tr>
      <th>713</th>
      <td>SUMATERA UTARA</td>
      <td>3312</td>
      <td>WONOGIRI</td>
    </tr>
    <tr>
      <th>714</th>
      <td>SUMATERA UTARA</td>
      <td>3313</td>
      <td>KARANGANYAR</td>
    </tr>
    <tr>
      <th>715</th>
      <td>SUMATERA UTARA</td>
      <td>3314</td>
      <td>SRAGEN</td>
    </tr>
    <tr>
      <th>716</th>
      <td>SUMATERA UTARA</td>
      <td>3315</td>
      <td>GROBOGAN</td>
    </tr>
    <tr>
      <th>717</th>
      <td>SUMATERA UTARA</td>
      <td>3316</td>
      <td>BLORA</td>
    </tr>
    <tr>
      <th>718</th>
      <td>SUMATERA UTARA</td>
      <td>3317</td>
      <td>REMBANG</td>
    </tr>
    <tr>
      <th>719</th>
      <td>SUMATERA UTARA</td>
      <td>3318</td>
      <td>PATI</td>
    </tr>
    <tr>
      <th>720</th>
      <td>SUMATERA UTARA</td>
      <td>3319</td>
      <td>KUDUS</td>
    </tr>
    <tr>
      <th>721</th>
      <td>SUMATERA UTARA</td>
      <td>3320</td>
      <td>JEPARA</td>
    </tr>
    <tr>
      <th>722</th>
      <td>SUMATERA UTARA</td>
      <td>3321</td>
      <td>DEMAK</td>
    </tr>
    <tr>
      <th>723</th>
      <td>SUMATERA UTARA</td>
      <td>3322</td>
      <td>SEMARANG</td>
    </tr>
    <tr>
      <th>724</th>
      <td>SUMATERA UTARA</td>
      <td>3323</td>
      <td>TEMANGGUNG</td>
    </tr>
    <tr>
      <th>725</th>
      <td>SUMATERA UTARA</td>
      <td>3324</td>
      <td>KENDAL</td>
    </tr>
    <tr>
      <th>726</th>
      <td>SUMATERA UTARA</td>
      <td>3325</td>
      <td>BATANG</td>
    </tr>
    <tr>
      <th>727</th>
      <td>SUMATERA UTARA</td>
      <td>3326</td>
      <td>PEKALONGAN</td>
    </tr>
    <tr>
      <th>728</th>
      <td>SUMATERA UTARA</td>
      <td>3327</td>
      <td>PEMALANG</td>
    </tr>
    <tr>
      <th>729</th>
      <td>SUMATERA UTARA</td>
      <td>3328</td>
      <td>TEGAL</td>
    </tr>
    <tr>
      <th>730</th>
      <td>SUMATERA UTARA</td>
      <td>3329</td>
      <td>BREBES</td>
    </tr>
    <tr>
      <th>731</th>
      <td>SUMATERA UTARA</td>
      <td>3371</td>
      <td>KOTA MAGELANG</td>
    </tr>
    <tr>
      <th>732</th>
      <td>SUMATERA UTARA</td>
      <td>3372</td>
      <td>KOTA SURAKARTA</td>
    </tr>
    <tr>
      <th>733</th>
      <td>SUMATERA UTARA</td>
      <td>3373</td>
      <td>KOTA SALATIGA</td>
    </tr>
    <tr>
      <th>734</th>
      <td>SUMATERA UTARA</td>
      <td>3374</td>
      <td>KOTA SEMARANG</td>
    </tr>
    <tr>
      <th>735</th>
      <td>SUMATERA UTARA</td>
      <td>3375</td>
      <td>KOTA PEKALONGAN</td>
    </tr>
    <tr>
      <th>736</th>
      <td>SUMATERA UTARA</td>
      <td>3376</td>
      <td>KOTA TEGAL</td>
    </tr>
    <tr>
      <th>737</th>
      <td>SUMATERA UTARA</td>
      <td>3401</td>
      <td>KULON PROGO</td>
    </tr>
    <tr>
      <th>738</th>
      <td>SUMATERA UTARA</td>
      <td>3402</td>
      <td>BANTUL</td>
    </tr>
    <tr>
      <th>739</th>
      <td>SUMATERA UTARA</td>
      <td>3403</td>
      <td>GUNUNGKIDUL</td>
    </tr>
    <tr>
      <th>740</th>
      <td>SUMATERA UTARA</td>
      <td>3404</td>
      <td>SLEMAN</td>
    </tr>
    <tr>
      <th>741</th>
      <td>SUMATERA UTARA</td>
      <td>3471</td>
      <td>KOTA YOGYAKARTA</td>
    </tr>
    <tr>
      <th>742</th>
      <td>SUMATERA UTARA</td>
      <td>3501</td>
      <td>PACITAN</td>
    </tr>
    <tr>
      <th>743</th>
      <td>SUMATERA UTARA</td>
      <td>3502</td>
      <td>PONOROGO</td>
    </tr>
    <tr>
      <th>744</th>
      <td>SUMATERA UTARA</td>
      <td>3503</td>
      <td>TRENGGALEK</td>
    </tr>
    <tr>
      <th>745</th>
      <td>SUMATERA UTARA</td>
      <td>3504</td>
      <td>TULUNGAGUNG</td>
    </tr>
    <tr>
      <th>746</th>
      <td>SUMATERA UTARA</td>
      <td>3505</td>
      <td>BLITAR</td>
    </tr>
    <tr>
      <th>747</th>
      <td>SUMATERA UTARA</td>
      <td>3506</td>
      <td>KEDIRI</td>
    </tr>
    <tr>
      <th>748</th>
      <td>SUMATERA UTARA</td>
      <td>3507</td>
      <td>MALANG</td>
    </tr>
    <tr>
      <th>749</th>
      <td>SUMATERA UTARA</td>
      <td>3508</td>
      <td>LUMAJANG</td>
    </tr>
    <tr>
      <th>750</th>
      <td>SUMATERA UTARA</td>
      <td>3509</td>
      <td>JEMBER</td>
    </tr>
    <tr>
      <th>751</th>
      <td>SUMATERA UTARA</td>
      <td>3510</td>
      <td>BANYUWANGI</td>
    </tr>
    <tr>
      <th>752</th>
      <td>SUMATERA UTARA</td>
      <td>3511</td>
      <td>BONDOWOSO</td>
    </tr>
    <tr>
      <th>753</th>
      <td>SUMATERA UTARA</td>
      <td>3512</td>
      <td>SITUBONDO</td>
    </tr>
    <tr>
      <th>754</th>
      <td>SUMATERA UTARA</td>
      <td>3513</td>
      <td>PROBOLINGGO</td>
    </tr>
    <tr>
      <th>755</th>
      <td>SUMATERA UTARA</td>
      <td>3514</td>
      <td>PASURUAN</td>
    </tr>
    <tr>
      <th>756</th>
      <td>SUMATERA UTARA</td>
      <td>3515</td>
      <td>SIDOARJO</td>
    </tr>
    <tr>
      <th>757</th>
      <td>SUMATERA UTARA</td>
      <td>3516</td>
      <td>MOJOKERTO</td>
    </tr>
    <tr>
      <th>758</th>
      <td>SUMATERA UTARA</td>
      <td>3517</td>
      <td>JOMBANG</td>
    </tr>
    <tr>
      <th>759</th>
      <td>SUMATERA UTARA</td>
      <td>3518</td>
      <td>NGANJUK</td>
    </tr>
    <tr>
      <th>760</th>
      <td>SUMATERA UTARA</td>
      <td>3519</td>
      <td>MADIUN</td>
    </tr>
    <tr>
      <th>761</th>
      <td>SUMATERA UTARA</td>
      <td>3520</td>
      <td>MAGETAN</td>
    </tr>
    <tr>
      <th>762</th>
      <td>SUMATERA UTARA</td>
      <td>3521</td>
      <td>NGAWI</td>
    </tr>
    <tr>
      <th>763</th>
      <td>SUMATERA UTARA</td>
      <td>3522</td>
      <td>BOJONEGORO</td>
    </tr>
    <tr>
      <th>764</th>
      <td>SUMATERA UTARA</td>
      <td>3523</td>
      <td>TUBAN</td>
    </tr>
    <tr>
      <th>765</th>
      <td>SUMATERA UTARA</td>
      <td>3524</td>
      <td>LAMONGAN</td>
    </tr>
    <tr>
      <th>766</th>
      <td>SUMATERA UTARA</td>
      <td>3525</td>
      <td>GRESIK</td>
    </tr>
    <tr>
      <th>767</th>
      <td>SUMATERA UTARA</td>
      <td>3526</td>
      <td>BANGKALAN</td>
    </tr>
    <tr>
      <th>768</th>
      <td>SUMATERA UTARA</td>
      <td>3527</td>
      <td>SAMPANG</td>
    </tr>
    <tr>
      <th>769</th>
      <td>SUMATERA UTARA</td>
      <td>3528</td>
      <td>PAMEKASAN</td>
    </tr>
    <tr>
      <th>770</th>
      <td>SUMATERA UTARA</td>
      <td>3529</td>
      <td>SUMENEP</td>
    </tr>
    <tr>
      <th>771</th>
      <td>SUMATERA UTARA</td>
      <td>3571</td>
      <td>KOTA KEDIRI</td>
    </tr>
    <tr>
      <th>772</th>
      <td>SUMATERA UTARA</td>
      <td>3572</td>
      <td>KOTA BLITAR</td>
    </tr>
    <tr>
      <th>773</th>
      <td>SUMATERA UTARA</td>
      <td>3573</td>
      <td>KOTA MALANG</td>
    </tr>
    <tr>
      <th>774</th>
      <td>SUMATERA UTARA</td>
      <td>3574</td>
      <td>KOTA PROBOLINGGO</td>
    </tr>
    <tr>
      <th>775</th>
      <td>SUMATERA UTARA</td>
      <td>3575</td>
      <td>KOTA PASURUAN</td>
    </tr>
    <tr>
      <th>776</th>
      <td>SUMATERA UTARA</td>
      <td>3576</td>
      <td>KOTA MOJOKERTO</td>
    </tr>
    <tr>
      <th>777</th>
      <td>SUMATERA UTARA</td>
      <td>3577</td>
      <td>KOTA MADIUN</td>
    </tr>
    <tr>
      <th>778</th>
      <td>SUMATERA UTARA</td>
      <td>3578</td>
      <td>KOTA SURABAYA</td>
    </tr>
    <tr>
      <th>779</th>
      <td>SUMATERA UTARA</td>
      <td>3579</td>
      <td>KOTA BATU</td>
    </tr>
    <tr>
      <th>780</th>
      <td>SUMATERA UTARA</td>
      <td>3601</td>
      <td>PANDEGLANG</td>
    </tr>
    <tr>
      <th>781</th>
      <td>SUMATERA UTARA</td>
      <td>3602</td>
      <td>LEBAK</td>
    </tr>
    <tr>
      <th>782</th>
      <td>SUMATERA UTARA</td>
      <td>3603</td>
      <td>TANGERANG</td>
    </tr>
    <tr>
      <th>783</th>
      <td>SUMATERA UTARA</td>
      <td>3604</td>
      <td>SERANG</td>
    </tr>
    <tr>
      <th>784</th>
      <td>SUMATERA UTARA</td>
      <td>3671</td>
      <td>KOTA TANGERANG</td>
    </tr>
    <tr>
      <th>785</th>
      <td>SUMATERA UTARA</td>
      <td>3672</td>
      <td>KOTA CILEGON</td>
    </tr>
    <tr>
      <th>786</th>
      <td>SUMATERA UTARA</td>
      <td>3673</td>
      <td>KOTA SERANG</td>
    </tr>
    <tr>
      <th>787</th>
      <td>SUMATERA UTARA</td>
      <td>3674</td>
      <td>KOTA TANGERANG SELATAN</td>
    </tr>
    <tr>
      <th>788</th>
      <td>SUMATERA UTARA</td>
      <td>5101</td>
      <td>JEMBRANA</td>
    </tr>
    <tr>
      <th>789</th>
      <td>SUMATERA UTARA</td>
      <td>5102</td>
      <td>TABANAN</td>
    </tr>
    <tr>
      <th>790</th>
      <td>SUMATERA UTARA</td>
      <td>5103</td>
      <td>BADUNG</td>
    </tr>
    <tr>
      <th>791</th>
      <td>SUMATERA UTARA</td>
      <td>5104</td>
      <td>GIANYAR</td>
    </tr>
    <tr>
      <th>792</th>
      <td>SUMATERA UTARA</td>
      <td>5105</td>
      <td>KLUNGKUNG</td>
    </tr>
    <tr>
      <th>793</th>
      <td>SUMATERA UTARA</td>
      <td>5106</td>
      <td>BANGLI</td>
    </tr>
    <tr>
      <th>794</th>
      <td>SUMATERA UTARA</td>
      <td>5107</td>
      <td>KARANGASEM</td>
    </tr>
    <tr>
      <th>795</th>
      <td>SUMATERA UTARA</td>
      <td>5108</td>
      <td>BULELENG</td>
    </tr>
    <tr>
      <th>796</th>
      <td>SUMATERA UTARA</td>
      <td>5171</td>
      <td>KOTA DENPASAR</td>
    </tr>
    <tr>
      <th>797</th>
      <td>SUMATERA UTARA</td>
      <td>5201</td>
      <td>LOMBOK BARAT</td>
    </tr>
    <tr>
      <th>798</th>
      <td>SUMATERA UTARA</td>
      <td>5202</td>
      <td>LOMBOK TENGAH</td>
    </tr>
    <tr>
      <th>799</th>
      <td>SUMATERA UTARA</td>
      <td>5203</td>
      <td>LOMBOK TIMUR</td>
    </tr>
    <tr>
      <th>800</th>
      <td>SUMATERA UTARA</td>
      <td>5204</td>
      <td>SUMBAWA</td>
    </tr>
    <tr>
      <th>801</th>
      <td>SUMATERA UTARA</td>
      <td>5205</td>
      <td>DOMPU</td>
    </tr>
    <tr>
      <th>802</th>
      <td>SUMATERA UTARA</td>
      <td>5206</td>
      <td>BIMA</td>
    </tr>
    <tr>
      <th>803</th>
      <td>SUMATERA UTARA</td>
      <td>5207</td>
      <td>SUMBAWA BARAT</td>
    </tr>
    <tr>
      <th>804</th>
      <td>SUMATERA UTARA</td>
      <td>5208</td>
      <td>LOMBOK UTARA</td>
    </tr>
    <tr>
      <th>805</th>
      <td>SUMATERA UTARA</td>
      <td>5271</td>
      <td>KOTA MATARAM</td>
    </tr>
    <tr>
      <th>806</th>
      <td>SUMATERA UTARA</td>
      <td>5272</td>
      <td>KOTA BIMA</td>
    </tr>
    <tr>
      <th>807</th>
      <td>SUMATERA UTARA</td>
      <td>5301</td>
      <td>KUPANG</td>
    </tr>
    <tr>
      <th>808</th>
      <td>SUMATERA UTARA</td>
      <td>5302</td>
      <td>KAB TIMOR TENGAH SELATAN</td>
    </tr>
    <tr>
      <th>809</th>
      <td>SUMATERA UTARA</td>
      <td>5303</td>
      <td>TIMOR TENGAH UTARA</td>
    </tr>
    <tr>
      <th>810</th>
      <td>SUMATERA UTARA</td>
      <td>5304</td>
      <td>BELU</td>
    </tr>
    <tr>
      <th>811</th>
      <td>SUMATERA UTARA</td>
      <td>5305</td>
      <td>ALOR</td>
    </tr>
    <tr>
      <th>812</th>
      <td>SUMATERA UTARA</td>
      <td>5306</td>
      <td>FLORES TIMUR</td>
    </tr>
    <tr>
      <th>813</th>
      <td>SUMATERA UTARA</td>
      <td>5307</td>
      <td>SIKKA</td>
    </tr>
    <tr>
      <th>814</th>
      <td>SUMATERA UTARA</td>
      <td>5308</td>
      <td>ENDE</td>
    </tr>
    <tr>
      <th>815</th>
      <td>SUMATERA UTARA</td>
      <td>5309</td>
      <td>NGADA</td>
    </tr>
    <tr>
      <th>816</th>
      <td>SUMATERA UTARA</td>
      <td>5310</td>
      <td>MANGGARAI</td>
    </tr>
    <tr>
      <th>817</th>
      <td>SUMATERA UTARA</td>
      <td>5311</td>
      <td>SUMBA TIMUR</td>
    </tr>
    <tr>
      <th>818</th>
      <td>SUMATERA UTARA</td>
      <td>5312</td>
      <td>SUMBA BARAT</td>
    </tr>
    <tr>
      <th>819</th>
      <td>SUMATERA UTARA</td>
      <td>5313</td>
      <td>LEMBATA</td>
    </tr>
    <tr>
      <th>820</th>
      <td>SUMATERA UTARA</td>
      <td>5314</td>
      <td>ROTE NDAO</td>
    </tr>
    <tr>
      <th>821</th>
      <td>SUMATERA UTARA</td>
      <td>5315</td>
      <td>MANGGARAI BARAT</td>
    </tr>
    <tr>
      <th>822</th>
      <td>SUMATERA UTARA</td>
      <td>5316</td>
      <td>NAGEKEO</td>
    </tr>
    <tr>
      <th>823</th>
      <td>SUMATERA UTARA</td>
      <td>5317</td>
      <td>SUMBA TENGAH</td>
    </tr>
    <tr>
      <th>824</th>
      <td>SUMATERA UTARA</td>
      <td>5318</td>
      <td>SUMBA BARAT DAYA</td>
    </tr>
    <tr>
      <th>825</th>
      <td>SUMATERA UTARA</td>
      <td>5319</td>
      <td>MANGGARAI  TIMUR</td>
    </tr>
    <tr>
      <th>826</th>
      <td>SUMATERA UTARA</td>
      <td>5320</td>
      <td>SABU RAIJUA</td>
    </tr>
    <tr>
      <th>827</th>
      <td>SUMATERA UTARA</td>
      <td>5321</td>
      <td>MALAKA</td>
    </tr>
    <tr>
      <th>828</th>
      <td>SUMATERA UTARA</td>
      <td>5371</td>
      <td>KOTA KUPANG</td>
    </tr>
    <tr>
      <th>829</th>
      <td>SUMATERA UTARA</td>
      <td>6101</td>
      <td>SAMBAS</td>
    </tr>
    <tr>
      <th>830</th>
      <td>SUMATERA UTARA</td>
      <td>6102</td>
      <td>MEMPAWAH</td>
    </tr>
    <tr>
      <th>831</th>
      <td>SUMATERA UTARA</td>
      <td>6103</td>
      <td>SANGGAU</td>
    </tr>
    <tr>
      <th>832</th>
      <td>SUMATERA UTARA</td>
      <td>6104</td>
      <td>KETAPANG</td>
    </tr>
    <tr>
      <th>833</th>
      <td>SUMATERA UTARA</td>
      <td>6105</td>
      <td>SINTANG</td>
    </tr>
    <tr>
      <th>834</th>
      <td>SUMATERA UTARA</td>
      <td>6106</td>
      <td>KAPUAS HULU</td>
    </tr>
    <tr>
      <th>835</th>
      <td>SUMATERA UTARA</td>
      <td>6107</td>
      <td>BENGKAYANG</td>
    </tr>
    <tr>
      <th>836</th>
      <td>SUMATERA UTARA</td>
      <td>6108</td>
      <td>LANDAK</td>
    </tr>
    <tr>
      <th>837</th>
      <td>SUMATERA UTARA</td>
      <td>6109</td>
      <td>SEKADAU</td>
    </tr>
    <tr>
      <th>838</th>
      <td>SUMATERA UTARA</td>
      <td>6110</td>
      <td>MELAWI</td>
    </tr>
    <tr>
      <th>839</th>
      <td>SUMATERA UTARA</td>
      <td>6111</td>
      <td>KAYONG UTARA</td>
    </tr>
    <tr>
      <th>840</th>
      <td>SUMATERA UTARA</td>
      <td>6112</td>
      <td>KUBU RAYA</td>
    </tr>
    <tr>
      <th>841</th>
      <td>SUMATERA UTARA</td>
      <td>6171</td>
      <td>KOTA PONTIANAK</td>
    </tr>
    <tr>
      <th>842</th>
      <td>SUMATERA UTARA</td>
      <td>6172</td>
      <td>KOTA SINGKAWANG</td>
    </tr>
    <tr>
      <th>843</th>
      <td>SUMATERA UTARA</td>
      <td>6201</td>
      <td>KOTAWARINGIN BARAT</td>
    </tr>
    <tr>
      <th>844</th>
      <td>SUMATERA UTARA</td>
      <td>6202</td>
      <td>KOTAWARINGIN TIMUR</td>
    </tr>
    <tr>
      <th>845</th>
      <td>SUMATERA UTARA</td>
      <td>6203</td>
      <td>KAPUAS</td>
    </tr>
    <tr>
      <th>846</th>
      <td>SUMATERA UTARA</td>
      <td>6204</td>
      <td>BARITO SELATAN</td>
    </tr>
    <tr>
      <th>847</th>
      <td>SUMATERA UTARA</td>
      <td>6205</td>
      <td>BARITO UTARA</td>
    </tr>
    <tr>
      <th>848</th>
      <td>SUMATERA UTARA</td>
      <td>6206</td>
      <td>KATINGAN</td>
    </tr>
    <tr>
      <th>849</th>
      <td>SUMATERA UTARA</td>
      <td>6207</td>
      <td>SERUYAN</td>
    </tr>
    <tr>
      <th>850</th>
      <td>SUMATERA UTARA</td>
      <td>6208</td>
      <td>SUKAMARA</td>
    </tr>
    <tr>
      <th>851</th>
      <td>SUMATERA UTARA</td>
      <td>6209</td>
      <td>LAMANDAU</td>
    </tr>
    <tr>
      <th>852</th>
      <td>SUMATERA UTARA</td>
      <td>6210</td>
      <td>GUNUNG MAS</td>
    </tr>
    <tr>
      <th>853</th>
      <td>SUMATERA UTARA</td>
      <td>6211</td>
      <td>PULANG PISAU</td>
    </tr>
    <tr>
      <th>854</th>
      <td>SUMATERA UTARA</td>
      <td>6212</td>
      <td>MURUNG RAYA</td>
    </tr>
    <tr>
      <th>855</th>
      <td>SUMATERA UTARA</td>
      <td>6213</td>
      <td>BARITO TIMUR</td>
    </tr>
    <tr>
      <th>856</th>
      <td>SUMATERA UTARA</td>
      <td>6271</td>
      <td>KOTA PALANGKARAYA</td>
    </tr>
    <tr>
      <th>857</th>
      <td>SUMATERA UTARA</td>
      <td>6301</td>
      <td>TANAH LAUT</td>
    </tr>
    <tr>
      <th>858</th>
      <td>SUMATERA UTARA</td>
      <td>6302</td>
      <td>KOTABARU</td>
    </tr>
    <tr>
      <th>859</th>
      <td>SUMATERA UTARA</td>
      <td>6303</td>
      <td>BANJAR</td>
    </tr>
    <tr>
      <th>860</th>
      <td>SUMATERA UTARA</td>
      <td>6304</td>
      <td>BARITO KUALA</td>
    </tr>
    <tr>
      <th>861</th>
      <td>SUMATERA UTARA</td>
      <td>6305</td>
      <td>TAPIN</td>
    </tr>
    <tr>
      <th>862</th>
      <td>SUMATERA UTARA</td>
      <td>6306</td>
      <td>HULU SUNGAI SELATAN</td>
    </tr>
    <tr>
      <th>863</th>
      <td>SUMATERA UTARA</td>
      <td>6307</td>
      <td>HULU SUNGAI TENGAH</td>
    </tr>
    <tr>
      <th>864</th>
      <td>SUMATERA UTARA</td>
      <td>6308</td>
      <td>HULU SUNGAI UTARA</td>
    </tr>
    <tr>
      <th>865</th>
      <td>SUMATERA UTARA</td>
      <td>6309</td>
      <td>TABALONG</td>
    </tr>
    <tr>
      <th>866</th>
      <td>SUMATERA UTARA</td>
      <td>6310</td>
      <td>TANAH BUMBU</td>
    </tr>
    <tr>
      <th>867</th>
      <td>SUMATERA UTARA</td>
      <td>6311</td>
      <td>BALANGAN</td>
    </tr>
    <tr>
      <th>868</th>
      <td>SUMATERA UTARA</td>
      <td>6371</td>
      <td>KOTA BANJARMASIN</td>
    </tr>
    <tr>
      <th>869</th>
      <td>SUMATERA UTARA</td>
      <td>6372</td>
      <td>KOTA BANJARBARU</td>
    </tr>
    <tr>
      <th>870</th>
      <td>SUMATERA UTARA</td>
      <td>6401</td>
      <td>PASER</td>
    </tr>
    <tr>
      <th>871</th>
      <td>SUMATERA UTARA</td>
      <td>6402</td>
      <td>KUTAI KARTANEGARA</td>
    </tr>
    <tr>
      <th>872</th>
      <td>SUMATERA UTARA</td>
      <td>6403</td>
      <td>BERAU</td>
    </tr>
    <tr>
      <th>873</th>
      <td>SUMATERA UTARA</td>
      <td>6407</td>
      <td>KUTAI BARAT</td>
    </tr>
    <tr>
      <th>874</th>
      <td>SUMATERA UTARA</td>
      <td>6408</td>
      <td>KUTAI TIMUR</td>
    </tr>
    <tr>
      <th>875</th>
      <td>SUMATERA UTARA</td>
      <td>6409</td>
      <td>PENAJAM  PASER UTARA</td>
    </tr>
    <tr>
      <th>876</th>
      <td>SUMATERA UTARA</td>
      <td>6411</td>
      <td>MAHAKAM  ULU</td>
    </tr>
    <tr>
      <th>877</th>
      <td>SUMATERA UTARA</td>
      <td>6471</td>
      <td>KOTA BALIKPAPAN</td>
    </tr>
    <tr>
      <th>878</th>
      <td>SUMATERA UTARA</td>
      <td>6472</td>
      <td>KOTA SAMARINDA</td>
    </tr>
    <tr>
      <th>879</th>
      <td>SUMATERA UTARA</td>
      <td>6474</td>
      <td>KOTA BONTANG</td>
    </tr>
    <tr>
      <th>880</th>
      <td>SUMATERA UTARA</td>
      <td>6501</td>
      <td>BULUNGAN</td>
    </tr>
    <tr>
      <th>881</th>
      <td>SUMATERA UTARA</td>
      <td>6502</td>
      <td>MALINAU</td>
    </tr>
    <tr>
      <th>882</th>
      <td>SUMATERA UTARA</td>
      <td>6503</td>
      <td>NUNUKAN</td>
    </tr>
    <tr>
      <th>883</th>
      <td>SUMATERA UTARA</td>
      <td>6504</td>
      <td>TANA TIDUNG</td>
    </tr>
    <tr>
      <th>884</th>
      <td>SUMATERA UTARA</td>
      <td>6571</td>
      <td>KOTA TARAKAN</td>
    </tr>
    <tr>
      <th>885</th>
      <td>SUMATERA UTARA</td>
      <td>7101</td>
      <td>BOLAANG  MONGONDOW</td>
    </tr>
    <tr>
      <th>886</th>
      <td>SUMATERA UTARA</td>
      <td>7102</td>
      <td>MINAHASA</td>
    </tr>
    <tr>
      <th>887</th>
      <td>SUMATERA UTARA</td>
      <td>7103</td>
      <td>KEPULAUAN  SANGIHE</td>
    </tr>
    <tr>
      <th>888</th>
      <td>SUMATERA UTARA</td>
      <td>7104</td>
      <td>KEPULAUAN TALAUD</td>
    </tr>
    <tr>
      <th>889</th>
      <td>SUMATERA UTARA</td>
      <td>7105</td>
      <td>MINAHASA  SELATAN</td>
    </tr>
    <tr>
      <th>890</th>
      <td>SUMATERA UTARA</td>
      <td>7106</td>
      <td>MINAHASA UTARA</td>
    </tr>
    <tr>
      <th>891</th>
      <td>SUMATERA UTARA</td>
      <td>7107</td>
      <td>MINAHASA TENGGARA</td>
    </tr>
    <tr>
      <th>892</th>
      <td>SUMATERA UTARA</td>
      <td>7108</td>
      <td>BOLAANG  MONGONDOW UTARA</td>
    </tr>
    <tr>
      <th>893</th>
      <td>SUMATERA UTARA</td>
      <td>7109</td>
      <td>KEP SIAU TAGULANDANG BIARO</td>
    </tr>
    <tr>
      <th>894</th>
      <td>SUMATERA UTARA</td>
      <td>7110</td>
      <td>BOLAANG MONGONDOW TIMUR</td>
    </tr>
    <tr>
      <th>895</th>
      <td>SUMATERA UTARA</td>
      <td>7111</td>
      <td>BOLAANG  MONGONDOW SELATAN</td>
    </tr>
    <tr>
      <th>896</th>
      <td>SUMATERA UTARA</td>
      <td>7171</td>
      <td>KOTA MANADO</td>
    </tr>
    <tr>
      <th>897</th>
      <td>SUMATERA UTARA</td>
      <td>7172</td>
      <td>KOTA BITUNG</td>
    </tr>
    <tr>
      <th>898</th>
      <td>SUMATERA UTARA</td>
      <td>7173</td>
      <td>KOTA TOMOHON</td>
    </tr>
    <tr>
      <th>899</th>
      <td>SUMATERA UTARA</td>
      <td>7174</td>
      <td>KOTA KOTAMOBAGU</td>
    </tr>
    <tr>
      <th>900</th>
      <td>SUMATERA UTARA</td>
      <td>7201</td>
      <td>BANGGAI</td>
    </tr>
    <tr>
      <th>901</th>
      <td>SUMATERA UTARA</td>
      <td>7202</td>
      <td>POSO</td>
    </tr>
    <tr>
      <th>902</th>
      <td>SUMATERA UTARA</td>
      <td>7203</td>
      <td>DONGGALA</td>
    </tr>
    <tr>
      <th>903</th>
      <td>SUMATERA UTARA</td>
      <td>7204</td>
      <td>TOLI TOLI</td>
    </tr>
    <tr>
      <th>904</th>
      <td>SUMATERA UTARA</td>
      <td>7205</td>
      <td>BUOL</td>
    </tr>
    <tr>
      <th>905</th>
      <td>SUMATERA UTARA</td>
      <td>7206</td>
      <td>MOROWALI</td>
    </tr>
    <tr>
      <th>906</th>
      <td>SUMATERA UTARA</td>
      <td>7207</td>
      <td>BANGGAI KEPULAUAN</td>
    </tr>
    <tr>
      <th>907</th>
      <td>SUMATERA UTARA</td>
      <td>7208</td>
      <td>PARIGI MOUTONG</td>
    </tr>
    <tr>
      <th>908</th>
      <td>SUMATERA UTARA</td>
      <td>7209</td>
      <td>TOJO UNA UNA</td>
    </tr>
    <tr>
      <th>909</th>
      <td>SUMATERA UTARA</td>
      <td>7210</td>
      <td>SIGI</td>
    </tr>
    <tr>
      <th>910</th>
      <td>SUMATERA UTARA</td>
      <td>7211</td>
      <td>BANGGAI LAUT</td>
    </tr>
    <tr>
      <th>911</th>
      <td>SUMATERA UTARA</td>
      <td>7212</td>
      <td>MOROWALI  UTARA</td>
    </tr>
    <tr>
      <th>912</th>
      <td>SUMATERA UTARA</td>
      <td>7271</td>
      <td>KOTA PALU</td>
    </tr>
    <tr>
      <th>913</th>
      <td>SUMATERA UTARA</td>
      <td>7301</td>
      <td>KEPULAUAN  SELAYAR</td>
    </tr>
    <tr>
      <th>914</th>
      <td>SUMATERA UTARA</td>
      <td>7302</td>
      <td>BULUKUMBA</td>
    </tr>
    <tr>
      <th>915</th>
      <td>SUMATERA UTARA</td>
      <td>7303</td>
      <td>BANTAENG</td>
    </tr>
    <tr>
      <th>916</th>
      <td>SUMATERA UTARA</td>
      <td>7304</td>
      <td>JENEPONTO</td>
    </tr>
    <tr>
      <th>917</th>
      <td>SUMATERA UTARA</td>
      <td>7305</td>
      <td>TAKALAR</td>
    </tr>
    <tr>
      <th>918</th>
      <td>SUMATERA UTARA</td>
      <td>7306</td>
      <td>GOWA</td>
    </tr>
    <tr>
      <th>919</th>
      <td>SUMATERA UTARA</td>
      <td>7307</td>
      <td>SINJAI</td>
    </tr>
    <tr>
      <th>920</th>
      <td>SUMATERA UTARA</td>
      <td>7308</td>
      <td>BONE</td>
    </tr>
    <tr>
      <th>921</th>
      <td>SUMATERA UTARA</td>
      <td>7309</td>
      <td>MAROS</td>
    </tr>
    <tr>
      <th>922</th>
      <td>SUMATERA UTARA</td>
      <td>7310</td>
      <td>PANGKAJENE KEPULAUAN</td>
    </tr>
    <tr>
      <th>923</th>
      <td>SUMATERA UTARA</td>
      <td>7311</td>
      <td>BARRU</td>
    </tr>
    <tr>
      <th>924</th>
      <td>SUMATERA UTARA</td>
      <td>7312</td>
      <td>SOPPENG</td>
    </tr>
    <tr>
      <th>925</th>
      <td>SUMATERA UTARA</td>
      <td>7313</td>
      <td>WAJO</td>
    </tr>
    <tr>
      <th>926</th>
      <td>SUMATERA UTARA</td>
      <td>7314</td>
      <td>SIDENRENG  RAPPANG</td>
    </tr>
    <tr>
      <th>927</th>
      <td>SUMATERA UTARA</td>
      <td>7315</td>
      <td>PINRANG</td>
    </tr>
    <tr>
      <th>928</th>
      <td>SUMATERA UTARA</td>
      <td>7316</td>
      <td>ENREKANG</td>
    </tr>
    <tr>
      <th>929</th>
      <td>SUMATERA UTARA</td>
      <td>7317</td>
      <td>LUWU</td>
    </tr>
    <tr>
      <th>930</th>
      <td>SUMATERA UTARA</td>
      <td>7318</td>
      <td>TANA TORAJA</td>
    </tr>
    <tr>
      <th>931</th>
      <td>SUMATERA UTARA</td>
      <td>7322</td>
      <td>LUWU UTARA</td>
    </tr>
    <tr>
      <th>932</th>
      <td>SUMATERA UTARA</td>
      <td>7324</td>
      <td>LUWU TIMUR</td>
    </tr>
    <tr>
      <th>933</th>
      <td>SUMATERA UTARA</td>
      <td>7326</td>
      <td>TORAJA UTARA</td>
    </tr>
    <tr>
      <th>934</th>
      <td>SUMATERA UTARA</td>
      <td>7371</td>
      <td>KOTA MAKASSAR</td>
    </tr>
    <tr>
      <th>935</th>
      <td>SUMATERA UTARA</td>
      <td>7372</td>
      <td>KOTA PARE PARE</td>
    </tr>
    <tr>
      <th>936</th>
      <td>SUMATERA UTARA</td>
      <td>7373</td>
      <td>KOTA PALOPO</td>
    </tr>
    <tr>
      <th>937</th>
      <td>SUMATERA UTARA</td>
      <td>7401</td>
      <td>KOLAKA</td>
    </tr>
    <tr>
      <th>938</th>
      <td>SUMATERA UTARA</td>
      <td>7402</td>
      <td>KONAWE</td>
    </tr>
    <tr>
      <th>939</th>
      <td>SUMATERA UTARA</td>
      <td>7403</td>
      <td>MUNA</td>
    </tr>
    <tr>
      <th>940</th>
      <td>SUMATERA UTARA</td>
      <td>7404</td>
      <td>BUTON</td>
    </tr>
    <tr>
      <th>941</th>
      <td>SUMATERA UTARA</td>
      <td>7405</td>
      <td>KONAWE SELATAN</td>
    </tr>
    <tr>
      <th>942</th>
      <td>SUMATERA UTARA</td>
      <td>7406</td>
      <td>BOMBANA</td>
    </tr>
    <tr>
      <th>943</th>
      <td>SUMATERA UTARA</td>
      <td>7407</td>
      <td>WAKATOBI</td>
    </tr>
    <tr>
      <th>944</th>
      <td>SUMATERA UTARA</td>
      <td>7408</td>
      <td>KOLAKA UTARA</td>
    </tr>
    <tr>
      <th>945</th>
      <td>SUMATERA UTARA</td>
      <td>7409</td>
      <td>KONAWE UTARA</td>
    </tr>
    <tr>
      <th>946</th>
      <td>SUMATERA UTARA</td>
      <td>7410</td>
      <td>BUTON UTARA</td>
    </tr>
    <tr>
      <th>947</th>
      <td>SUMATERA UTARA</td>
      <td>7411</td>
      <td>KOLAKA TIMUR</td>
    </tr>
    <tr>
      <th>948</th>
      <td>SUMATERA UTARA</td>
      <td>7412</td>
      <td>KONAWE KEPULAUAN</td>
    </tr>
    <tr>
      <th>949</th>
      <td>SUMATERA UTARA</td>
      <td>7413</td>
      <td>MUNA BARAT</td>
    </tr>
    <tr>
      <th>950</th>
      <td>SUMATERA UTARA</td>
      <td>7414</td>
      <td>BUTON TENGAH</td>
    </tr>
    <tr>
      <th>951</th>
      <td>SUMATERA UTARA</td>
      <td>7415</td>
      <td>BUTON SELATAN</td>
    </tr>
    <tr>
      <th>952</th>
      <td>SUMATERA UTARA</td>
      <td>7471</td>
      <td>KOTA KENDARI</td>
    </tr>
    <tr>
      <th>953</th>
      <td>SUMATERA UTARA</td>
      <td>7472</td>
      <td>KOTA BAU BAU</td>
    </tr>
    <tr>
      <th>954</th>
      <td>SUMATERA UTARA</td>
      <td>7501</td>
      <td>GORONTALO</td>
    </tr>
    <tr>
      <th>955</th>
      <td>SUMATERA UTARA</td>
      <td>7502</td>
      <td>BOALEMO</td>
    </tr>
    <tr>
      <th>956</th>
      <td>SUMATERA UTARA</td>
      <td>7503</td>
      <td>BONE BOLANGO</td>
    </tr>
    <tr>
      <th>957</th>
      <td>SUMATERA UTARA</td>
      <td>7504</td>
      <td>PAHUWATO</td>
    </tr>
    <tr>
      <th>958</th>
      <td>SUMATERA UTARA</td>
      <td>7505</td>
      <td>GORONTALO UTARA</td>
    </tr>
    <tr>
      <th>959</th>
      <td>SUMATERA UTARA</td>
      <td>7571</td>
      <td>KOTA GORONTALO</td>
    </tr>
    <tr>
      <th>960</th>
      <td>SUMATERA UTARA</td>
      <td>7601</td>
      <td>MAMUJU UTARA</td>
    </tr>
    <tr>
      <th>961</th>
      <td>SUMATERA UTARA</td>
      <td>7602</td>
      <td>MAMUJU</td>
    </tr>
    <tr>
      <th>962</th>
      <td>SUMATERA UTARA</td>
      <td>7603</td>
      <td>MAMASA</td>
    </tr>
    <tr>
      <th>963</th>
      <td>SUMATERA UTARA</td>
      <td>7604</td>
      <td>POLEWALI  MANDAR</td>
    </tr>
    <tr>
      <th>964</th>
      <td>SUMATERA UTARA</td>
      <td>7605</td>
      <td>MAJENE</td>
    </tr>
    <tr>
      <th>965</th>
      <td>SUMATERA UTARA</td>
      <td>7606</td>
      <td>MAMUJU TENGAH</td>
    </tr>
    <tr>
      <th>966</th>
      <td>SUMATERA UTARA</td>
      <td>8101</td>
      <td>MALUKU TENGAH</td>
    </tr>
    <tr>
      <th>967</th>
      <td>SUMATERA UTARA</td>
      <td>8102</td>
      <td>MALUKU TENGGARA</td>
    </tr>
    <tr>
      <th>968</th>
      <td>SUMATERA UTARA</td>
      <td>8103</td>
      <td>MALUKU TENGGARA BARAT</td>
    </tr>
    <tr>
      <th>969</th>
      <td>SUMATERA UTARA</td>
      <td>8104</td>
      <td>BURU</td>
    </tr>
    <tr>
      <th>970</th>
      <td>SUMATERA UTARA</td>
      <td>8105</td>
      <td>SERAM BAGIAN TIMUR</td>
    </tr>
    <tr>
      <th>971</th>
      <td>SUMATERA UTARA</td>
      <td>8106</td>
      <td>SERAM BAGIAN BARAT</td>
    </tr>
    <tr>
      <th>972</th>
      <td>SUMATERA UTARA</td>
      <td>8107</td>
      <td>KEPULAUAN  ARU</td>
    </tr>
    <tr>
      <th>973</th>
      <td>SUMATERA UTARA</td>
      <td>8108</td>
      <td>MALUKU BARAT DAYA</td>
    </tr>
    <tr>
      <th>974</th>
      <td>SUMATERA UTARA</td>
      <td>8109</td>
      <td>BURU SELATAN</td>
    </tr>
    <tr>
      <th>975</th>
      <td>SUMATERA UTARA</td>
      <td>8171</td>
      <td>KOTA AMBON</td>
    </tr>
    <tr>
      <th>976</th>
      <td>SUMATERA UTARA</td>
      <td>8172</td>
      <td>KOTA TUAL</td>
    </tr>
    <tr>
      <th>977</th>
      <td>SUMATERA UTARA</td>
      <td>8201</td>
      <td>HALMAHERA BARAT</td>
    </tr>
    <tr>
      <th>978</th>
      <td>SUMATERA UTARA</td>
      <td>8202</td>
      <td>HALMAHERA TENGAH</td>
    </tr>
    <tr>
      <th>979</th>
      <td>SUMATERA UTARA</td>
      <td>8203</td>
      <td>HALMAHERA UTARA</td>
    </tr>
    <tr>
      <th>980</th>
      <td>SUMATERA UTARA</td>
      <td>8204</td>
      <td>HALMAHERA SELATAN</td>
    </tr>
    <tr>
      <th>981</th>
      <td>SUMATERA UTARA</td>
      <td>8205</td>
      <td>KEPULAUAN SULA</td>
    </tr>
    <tr>
      <th>982</th>
      <td>SUMATERA UTARA</td>
      <td>8206</td>
      <td>HALMAHERA TIMUR</td>
    </tr>
    <tr>
      <th>983</th>
      <td>SUMATERA UTARA</td>
      <td>8207</td>
      <td>PULAU MOROTAI</td>
    </tr>
    <tr>
      <th>984</th>
      <td>SUMATERA UTARA</td>
      <td>8208</td>
      <td>PULAU TALIABU</td>
    </tr>
    <tr>
      <th>985</th>
      <td>SUMATERA UTARA</td>
      <td>8271</td>
      <td>KOTA TERNATE</td>
    </tr>
    <tr>
      <th>986</th>
      <td>SUMATERA UTARA</td>
      <td>8272</td>
      <td>KOTA TIDORE KEPULAUAN</td>
    </tr>
    <tr>
      <th>987</th>
      <td>SUMATERA UTARA</td>
      <td>9101</td>
      <td>MERAUKE</td>
    </tr>
    <tr>
      <th>988</th>
      <td>SUMATERA UTARA</td>
      <td>9102</td>
      <td>JAYAWIJAYA</td>
    </tr>
    <tr>
      <th>989</th>
      <td>SUMATERA UTARA</td>
      <td>9103</td>
      <td>JAYAPURA</td>
    </tr>
    <tr>
      <th>990</th>
      <td>SUMATERA UTARA</td>
      <td>9104</td>
      <td>NABIRE</td>
    </tr>
    <tr>
      <th>991</th>
      <td>SUMATERA UTARA</td>
      <td>9105</td>
      <td>KEPULAUAN  YAPEN</td>
    </tr>
    <tr>
      <th>992</th>
      <td>SUMATERA UTARA</td>
      <td>9106</td>
      <td>BIAK NUMFOR</td>
    </tr>
    <tr>
      <th>993</th>
      <td>SUMATERA UTARA</td>
      <td>9107</td>
      <td>PUNCAK JAYA</td>
    </tr>
    <tr>
      <th>994</th>
      <td>SUMATERA UTARA</td>
      <td>9108</td>
      <td>PANIAI</td>
    </tr>
    <tr>
      <th>995</th>
      <td>SUMATERA UTARA</td>
      <td>9109</td>
      <td>MIMIKA</td>
    </tr>
    <tr>
      <th>996</th>
      <td>SUMATERA UTARA</td>
      <td>9110</td>
      <td>SARMI</td>
    </tr>
    <tr>
      <th>997</th>
      <td>SUMATERA UTARA</td>
      <td>9111</td>
      <td>KEEROM</td>
    </tr>
    <tr>
      <th>998</th>
      <td>SUMATERA UTARA</td>
      <td>9112</td>
      <td>KAB PEGUNUNGAN BINTANG</td>
    </tr>
    <tr>
      <th>999</th>
      <td>SUMATERA UTARA</td>
      <td>9113</td>
      <td>YAHUKIMO</td>
    </tr>
  </tbody>
</table>


# Kesimpulan

1. Fragmentasi horizontal menampilkan field atau set kolom tertentu.
2. Fragmentasi vertikan menampilakan dua atau lebih dari Field nya, yang mana hasilnya akan disatukan dalam satu tabel. dari data di atas terdapat 1000 kabupaten dari Aceh dan Sumatra Utara.
