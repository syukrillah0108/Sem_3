<div style="text-align: justify;">

# Latar Belakang

Aplikasi Administrasi Desa Kertamulya adalah respons terhadap kebutuhan
akan pengelolaan administrasi yang efisien dan terintegrasi di tingkat desa. Desa
Kertamulya, yang terletak di wilayah yang berkembang pesat, menghadapi tantangan
dalam mengelola berbagai aspek administrasi, termasuk administrasi penduduk,
keuangan desa, dan pelayanan publik.
Seiring dengan pertumbuhan penduduk dan aktivitas yang semakin kompleks,
tugas-tugas administratif di Desa Kertamulya semakin meningkat. Proses manual yang
sebelumnya digunakan untuk melacak data penduduk, membayar pajak, dan mengelola
layanan publik menjadi tidak efisien dan rentan terhadap kesalahan.
Selain itu, permintaan masyarakat akan pelayanan publik yang lebih baik dan
transparansi dalam pengelolaan keuangan desa semakin meningkat. Untuk mengatasi
tantangan ini, pemerintah desa menyadari perlunya memperkenalkan teknologi
informasi dan komunikasi yang dapat mengotomatisasi proses administrasi dan
meningkatkan aksesibilitas data.
Dalam menghadapi situasi tersebut, Aplikasi Administrasi Desa Kertamulya
dikembangkan. Tujuan utama aplikasi ini adalah untuk meningkatkan efisiensi dan
transparansi dalam pengelolaan administrasi desa. Aplikasi ini dirancang untuk
mengintegrasikan berbagai fungsi administrasi seperti pencatatan data penduduk,
manajemen keuangan desa, pengelolaan layanan publik, serta pelaporan dan
monitoring yang akurat.
Melalui penerapan Aplikasi Administrasi Desa Kertamulya, diharapkan bahwa
proses administratif di Desa Kertamulya akan menjadi lebih terstruktur, efisien, dan
mudah dilacak. Warga desa akan mendapatkan akses yang lebih baik ke layanan publik
dan informasi terkait administrasi desa, sementara pemerintah desa akan memiliki alat
yang kuat untuk mengelola data dan menghasilkan laporan yang diperlukan untuk
pengambilan keputusan yang lebih baik.

# Masalah

- Validitas data kependudukan: Data penduduk yang tercatat dalam sistem administrasi desa sering tidak akurat dan tidak terverifikasi, sehingga menyebabkan kesalahan atau duplikasi data. Hal ini berdampak negatif pada pengambilan keputusan yang berdasarkan data yang tidak andal dan dapat diandalkan.
- Kesulitan dalam pengarsipan dokumen: Dokumen-dokumen penting terkait administrasi desa, seperti surat-surat keputusan desa, akta kelahiran, akta kematian, dan lainnya, masih disimpan dalam bentuk fisik yang membutuhkan ruang penyimpanan yang besar dan berisiko rusak atau hilang. Hal ini menyulitkan aksesibilitas dan keamanan dokumen ketika diperlukan.
- Kurangnya aksesibilitas informasi penting bagi warga desa: Informasi penting terkait administrasi desa, seperti pengumuman desa, kegiatan dan acara, layanan publik, dan informasi lainnya yang relevan bagi warga desa, masih disampaikan dengan cara yang kurang efektif dan efisien. Hal ini mengurangi komunikasi antara pemerintah desa dan warga desa serta membatasi akses warga desa terhadap informasi yang mereka butuhkan.

# Tujuan

- Meningkatkan akurasi data: Dengan fitur validasi data kependudukan, aplikasi ini membantu memastikan bahwa data penduduk yang tercatat dalam sistem administrasi desa akurat dan terverifikasi. Hal ini mengurangi kemungkinan terjadinya kesalahan atau duplikasi data penduduk, sehingga data yang digunakan oleh pemerintah desa menjadi lebih andal dan dapat diandalkan.
- Efisiensi dalam pengelolaan administrasi desa: Aplikasi ini membantu mengotomatisasi proses administrasi desa, seperti validasi data dan pengarsipan dokumen. Hal ini mengurangi beban kerja administratif dan mempercepat pengolahan data serta pengelolaan dokumen. Dengan demikian, pemerintah desa dapat menghemat waktu dan sumber daya yang dapat dialokasikan untuk tugas-tugas lain yang lebih penting.
- Kemudahan akses informasi: Melalui tampilan informasi penting yang disediakan oleh aplikasi, warga desa dapat dengan mudah mengakses informasi terkini tentang kegiatan desa, pengumuman penting, layanan publik, dan informasi lainnya yang relevan. Ini membantu meningkatkan komunikasi antara pemerintah desa dan warga desa serta memastikan warga desa mendapatkan informasi yang mereka butuhkan dengan cepat dan mudah.

# Kebutuhan Fungsional

| Problem                                                            | High Priority                                           | Medium Priority                                                  | Low Priority                                           | No Priority |
| ------------------------------------------------------------------ | ------------------------------------------------------- | ---------------------------------------------------------------- | ------------------------------------------------------ | ----------- |
| 1. Validitas data kependudukan                                     | Validasi data yang sudah ada                            | Validasi data yang sedang di input                               | Menerapkan Fitur auto correct pada kolom form tertentu |             |
| 2. Kesulitan dalam pengarsipan dokumen                             | Mengorganisir dokumen berdasarkan type dan diberikan id | Kolom pencarian dokumen                                          | -                                                      |             |
| 3. Kurangnya aksesibilitas informasi penting bagi warga desa       | Menyediakan website publik                              | Menyediakan informasi di website dengan akun tertentu            | -                                                      |             |
| 4. Tidak ada sistem pelaporan yang terstruktur dan mudah digunakan | Menyediakan template Laporan                            | Menyimpan setiap laporan baik itu yang masuk ataupun yang dibuat | -                                                      |             |

# Kebutuhan no Fungsional

| Quality Attribute | Requirement                                                                                                                          | How/Scope                                                                                                                                                                                                                                                                                  |
| ----------------- | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Usability         | Aplikasi harus mudah digunakan dan intuitif bagi pengguna.                                                                           | Aplikasi harus menyediakan antarmuka pengguna yang jelas dan konsisten, dengan instruksi, label, dan pesan yang sederhana dan mudah dipahami. Aplikasi juga harus menyediakan fitur bantuan dan umpan balik untuk membantu pengguna jika terjadi kesalahan atau kesulitan.                 |
| Efficiency        | Aplikasi harus bekerja dengan baik dan merespons permintaan pengguna dengan cepat.                                                   | Aplikasi harus mengoptimalkan penggunaan sumber daya, seperti memori, CPU, dan bandwidth jaringan. Aplikasi juga harus menangani permintaan bersamaan dan kumpulan data besar tanpa mengurangi kinerja.                                                                                    |
| Functionality     | Aplikasi harus menyediakan fungsi inti untuk memvalidasi, mengarsipkan, dan menampilkan informasi penting terkait pemerintahan desa. | Aplikasi tersebut harus mengimplementasikan fitur validasi data kependudukan, pengarsipan dokumen, dan menampilkan pengumuman, acara, layanan publik, dan informasi lain yang relevan bagi warga desa. Aplikasi juga harus menjamin keakuratan, kelengkapan, dan keamanan data dan dokumen |
| Reliability       | Aplikasi harus dapat diandalkan dan tersedia setiap saat.                                                                            | Aplikasi harus mencegah atau meminimalkan terjadinya kegagalan, kesalahan, atau bug. Aplikasi juga harus menyediakan mekanisme pencadangan dan pemulihan untuk memulihkan data dan dokumen jika hilang atau rusak.                                                                         |

# Perancangan Context diagram dan DFD

</div>
