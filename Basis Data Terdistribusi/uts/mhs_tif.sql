/*markdown
# Membuat Tabel Data
*/

CREATE TABLE `mhs_tif` (
  `no` int(11) NOT NULL PRIMARY KEY,
  `nim` char(50) NOT NULL,
  `nama` text NOT NULL,
  `tempat_lahir` text NOT NULL,
  `jkl` varchar(1) NOT NULL
);

INSERT INTO `mhs_tif` (`no`, `nim`, `nama`, `tempat_lahir`, `jkl`) VALUES
(1, '22552011226', 'Ripan Gunawan', 'Bandung', 'L'),
(2, '22552011091', 'Rismanda Fauziah', 'Garut', 'P'),
(3, '22552011095', 'Riswanto', 'Pemalang', 'L'),
(4, '22552011045', 'Rival Muhammad Dzikri', 'Bandung', 'L'),
(5, '22552011109', 'Rizal', 'Bandung', 'L'),
(6, '22552011156', 'RIZAL ZAELANI', 'Cianjur', 'L'),
(7, '22552011211', 'Rizky Muhammad Akmal', 'Bandung', 'L'),
(8, '22552011099', 'Rizqiyana Nur Hafizh', 'Bandung', 'L'),
(9, '22552011033', 'Robertho F Potowapea', 'Semarang', 'L'),
(10, '22552011126', 'Saepul Hidayat', 'Karawang', 'L'),
(11, '22552011127', 'Safira Nur Rizqa martalegawa', 'Bandung', 'P'),
(12, '22552011239', 'SAHRUL GUNAWAN', 'Bandung', 'L'),
(13, '22552011157', 'SALSABILA APRILIA', 'SUBANG', 'P'),
(14, '22552011172', 'Sandesh Arya Sandhika', 'Kota Cimahi', 'L'),
(15, '22552011218', 'Sapari Putra Pamungkas', 'Jakarta', 'L'),
(16, '22552011289', 'Sella Ashari', 'Indramayu', 'P'),
(17, '22552011237', 'Septi Liani Dewi', 'Garut', 'P'),
(18, '22552011072', 'Shaiful Anam', 'Cilacap', 'L'),
(19, '22552011297', 'Shela', 'Sei manyam sintang', 'P'),
(20, '22552011294', 'Shella Fristika', 'Karawang', 'P'),
(21, '22552011122', 'Sheryl Pricilla Daniela Elizabeth Silalahi', 'Depok', 'P'),
(22, '22552011069', 'Shesy Cikaliyana Putri', 'Bandung', 'P'),
(23, '22552012013', 'Sigit Farhan Schohib', '', 'L'),
(24, '22552011158', 'SITI HAJAR AZHARI', 'Bandung', 'P'),
(25, '22552011335', 'Siti Sokawati', 'Purwakarta', 'P'),
(26, '22552011079', 'Suci Yuniarti Aisiyah', 'Bandung', 'P'),
(27, '22552011220', 'Syahrul Hidayat', 'Karawang', 'L'),
(28, '22552011247', 'SYUKRILLAH', 'Bogor ', 'L'),
(29, '22552012022', 'TAMLICA MUHAIMIN', 'Banda Aceh', 'L'),
(30, '22552011159', 'TASYA FAUZIA FERNANDA', 'Bandung', 'P'),
(31, '22552011268', 'TAUFIQ RAHMAN AL HADID', 'Ciamis', 'L'),
(32, '22552012008', 'TEUKU ULUL AZMI', 'Banda Aceh', 'L');