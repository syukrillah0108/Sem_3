# About

Pada penelitian ini akan melakukan uji coba eksekusi sintaks SQL untuk mencari sintaks yang lebih optimal bedasarkan waktu eksekusi, lebih kecil waktu eksekusi maka lebih optimal.

# Keterangan database yang digunakan

```SQL
 SHOW TABLES;
```

|   | Tables_in_kode_desa |
| - | ------------------- |
| 0 | desa                |
| 1 | kab                 |
| 2 | kec                 |
| 3 | prov                |

## Tabel prov

```SQL
DESCRIBE prov;
```

|   | Field   | Type        | Null | Key | Default | Extra |
| - | ------- | ----------- | ---- | --- | ------- | ----- |
| 0 | id_prov | varchar(13) | NO   | PRI | None    |       |
| 1 | nm_prov | text        | YES  |     | None    |       |

|   | COUNT(*) |
| - | -------- |
| 0 | 35       |

## Tabel kab

```SQl
DESCRIBE kab;
```

|   | Field   | Type        | Null | Key | Default | Extra |
| - | ------- | ----------- | ---- | --- | ------- | ----- |
| 0 | id_prov | varchar(13) | NO   | MUL | None    |       |
| 1 | id_kab  | varchar(13) | NO   | PRI | None    |       |
| 2 | nm_kab  | text        | YES  |     | None    |       |

|   | COUNT(*) |
| - | -------- |
| 0 | 515      |

## Tabel kec

```SQl
DESCRIBE kec;
```

|   | Field   | Type        | Null | Key | Default | Extra |
| - | ------- | ----------- | ---- | --- | ------- | ----- |
| 0 | id_prov | varchar(13) | NO   | MUL | None    |       |
| 1 | id_kab  | varchar(13) | NO   | MUL | None    |       |
| 2 | id_kec  | varchar(13) | NO   | PRI | None    |       |
| 3 | nm_kec  | text        | YES  |     | None    |       |

|   | COUNT(*) |
| - | -------- |
| 0 | 7203     |

## Tabel desa

```SQl
DESCRIBE desa;
```

|   | Field   | Type        | Null | Key | Default | Extra |
| - | ------- | ----------- | ---- | --- | ------- | ----- |
| 0 | id_desa | varchar(15) | NO   | PRI | None    |       |
| 1 | id_prov | varchar(13) | NO   | MUL | None    |       |
| 2 | id_kab  | varchar(13) | NO   | MUL | None    |       |
| 3 | id_kec  | varchar(13) | NO   | MUL | None    |       |
| 4 | nm_desa | text        | YES  |     | None    |       |
| 5 | st_desa | text        | YES  |     | None    |       |

COUNT 83437

|   | COUNT(*) |
| - | -------- |
| 0 | 83437    |

# Kondisi sistem yang digunakan

System:

    Kernel: 6.1.0-13-amd64 [6.1.55-1] arch: x86_64 bits: 64 compiler: gcc v: 12.2.0
        parameters: BOOT_IMAGE=/boot/vmlinuz-6.1.0-13-amd64 root=UUID=`<filter>` ro quiet splash
    Desktop: Xfce v: 4.18.1 tk: Gtk v: 3.24.36 info: xfce4-panel wm: xfwm v: 4.18.0 vt: 7
        dm: LightDM v: 1.26.0 Distro: MX-23.1_x64 Libretto July 31  2023 base: Debian GNU/Linux 12
        (bookworm)

Machine:

    Type: Laptop System: LENOVO product: 81ST v: Lenovo IdeaPad S145-14AST
        serial:`<superuser required>` Chassis: type: 10 v: Lenovo IdeaPad S145-14AST
        serial: `<superuser required>`
    Mobo: LENOVO model: LNVNB161216 v: SDK0Q55754WIN serial: `<superuser required>` UEFI: LENOVO
        v: AYCN21WW date: 03/05/2020

Battery:

    ID-1: BAT0 charge: 26.9 Wh (99.3%) condition: 27.1/30.6 Wh (88.5%) volts: 8.1 min: 7.6
        model: CPT-COS L16C2PB2 type: Li-poly serial:`<filter>` status: discharging

CPU:

    Info: model: AMD A4-9125 RADEON R3 4 COMPUTE CORES 2C+2G bits: 64 type: MCP arch: Excavator
        level: v3 note: check built: 2015 process: GF 28nm family: 0x15 (21) model-id: 0x70 (112)
        stepping: 0 microcode: 0x6006705
    Topology: cpus: 1x cores: 2 smt:`<unsupported>` cache: L1: 192 KiB desc: d-2x32 KiB; i-2x64 KiB
        L2: 2 MiB desc: 2x1024 KiB
    Speed (MHz): avg: 1497 min/max: 1300/2300 boost: enabled scaling: driver: acpi-cpufreq
        governor: ondemand cores: 1: 1497 2: 1497 bogomips: 9182
    Flags: avx avx2 ht lm nx pae sse sse2 sse3 sse4_1 sse4_2 sse4a ssse3 svm
    Vulnerabilities:
    Type: gather_data_sampling status: Not affected
    Type: itlb_multihit status: Not affected
    Type: l1tf status: Not affected
    Type: mds status: Not affected
    Type: meltdown status: Not affected
    Type: mmio_stale_data status: Not affected
    Type: retbleed mitigation: untrained return thunk; SMT disabled
    Type: spec_rstack_overflow status: Not affected
    Type: spec_store_bypass mitigation: Speculative Store Bypass disabled via prctl
    Type: spectre_v1 mitigation: usercopy/swapgs barriers and __user pointer sanitization
    Type: spectre_v2 mitigation: Retpolines, IBPB: conditional, STIBP: disabled, RSB filling,
        PBRSB-eIBRS: Not affected
    Type: srbds status: Not affected
    Type: tsx_async_abort status: Not affected

Graphics:

    Device-1: AMD Stoney [Radeon R2/R3/R4/R5 Graphics] vendor: Lenovo driver: amdgpu v: kernel
        arch: GCN-3 code: Volcanic Islands process: TSMC 28nm built: 2014-19 ports: active: eDP-1
        empty: HDMI-A-1 bus-ID: 00:01.0 chip-ID: 1002:98e4 class-ID: 0300
    Device-2: IMC Networks Integrated Camera type: USB driver: uvcvideo bus-ID: 1-1.3:4
        chip-ID: 13d3:5a08 class-ID: 0e02 serial:`<filter>`
    Display: x11 server: X.Org v: 1.21.1.7 compositor: xfwm v: 4.18.0 driver: X: loaded: amdgpu
        unloaded: fbdev,modesetting,vesa dri: radeonsi gpu: amdgpu display-ID: :0.0 screens: 1
    Screen-1: 0 s-res: 1366x768 s-dpi: 96 s-size: 361x203mm (14.21x7.99") s-diag: 414mm (16.31")
    Monitor-1: eDP-1 mapped: eDP model: AU Optronics 0x723c built: 2017 res: 1366x768 hz: 60
        dpi: 112 gamma: 1.2 size: 309x173mm (12.17x6.81") diag: 354mm (13.9") ratio: 16:9 modes:
        max: 1366x768 min: 640x480
    API: OpenGL v: 4.5 Mesa 22.3.6 renderer: AMD Radeon R3 Graphics (stoney LLVM 15.0.6 DRM 3.49
        6.1.0-13-amd64) direct-render: Yes

Audio:

    Device-1: AMD vendor: Lenovo driver: snd_hda_intel v: kernel bus-ID: 00:01.1 chip-ID: 1002:15b3
        class-ID: 0403
    Device-2: AMD Family 15h Audio vendor: Lenovo driver: snd_hda_intel v: kernel bus-ID: 00:09.2
        chip-ID: 1022:157a class-ID: 0403
    API: ALSA v: k6.1.0-13-amd64 status: kernel-api tools: alsamixer,amixer
    Server-1: PipeWire v: 0.3.65 status: active (process) with: 1: pipewire-pulse status: active
        2: wireplumber status: active tools: pw-cat,pw-cli,wpctl
    Server-2: PulseAudio v: 16.1 status: active tools: pacat,pactl,pavucontrol

Network:

    Device-1: Qualcomm Atheros QCA9377 802.11ac Wireless Network Adapter vendor: Lenovo
        driver: ath10k_pci v: kernel modules: wl pcie: gen: 1 speed: 2.5 GT/s lanes: 1 bus-ID: 02:00.0
        chip-ID: 168c:0042 class-ID: 0280
    IF: wlan0 state: down mac:`<filter>`

Bluetooth:

    Device-1: Qualcomm Atheros type: USB driver: btusb v: 0.8 bus-ID: 1-1.2:3 chip-ID: 0cf3:e500
        class-ID: e001
    Report: hciconfig ID: hci0 rfk-id: 3 state: down bt-service: N/A rfk-block: hardware: no
        software: yes address:`<filter>`
    Info: acl-mtu: 1024:8 sco-mtu: 50:8 link-policy: rswitch hold sniff
        link-mode: peripheral accept

Drives:

    Local Storage: total: 238.47 GiB used: 68.09 GiB (28.6%)
    SMART Message: Unable to run smartctl. Root privileges required.
    ID-1: /dev/sda maj-min: 8:0 model: JOINT SATA 2.5 SSD H500 256GB size: 238.47 GiB block-size:
        physical: 512 B logical: 512 B speed: 6.0 Gb/s type: SSD serial:`<filter>` rev: A25C scheme: GPT

Partition:

    ID-1: / raw-size: 160.1 GiB size: 156.53 GiB (97.77%) used: 68.06 GiB (43.5%) fs: ext4
        dev: /dev/sda2 maj-min: 8:2
    ID-2: /boot/efi raw-size: 256 MiB size: 252 MiB (98.46%) used: 28.6 MiB (11.3%) fs: vfat
        dev: /dev/sda1 maj-min: 8:1

Swap:

    Kernel: swappiness: 15 (default 60) cache-pressure: 100 (default)
    ID-1: swap-1 type: file size: 2 GiB used: 11 MiB (0.5%) priority: -2 file: /swap/swap

Sensors:

    System Temperatures: cpu: 44.5 C mobo: N/A gpu: amdgpu temp: 44.0 C
    Fan Speeds (RPM): N/A

Repos:

    Packages: pm: dpkg pkgs: 3029 libs: 1480 tools: apt,apt-get,aptitude,nala,synaptic pm: rpm
        pkgs: 0 pm: flatpak pkgs: 0
    No active apt repos in: /etc/apt/sources.list
    Active apt repos in: /etc/apt/sources.list.d/chrome-remote-desktop.list
        1: deb [arch=amd64] http://dl.google.com/linux/chrome-remote-desktop/deb/ stable main
    Active apt repos in: /etc/apt/sources.list.d/debian-stable-updates.list
        1: deb http://deb.debian.org/debian bookworm-updates main contrib non-free non-free-firmware
    Active apt repos in: /etc/apt/sources.list.d/debian.list
        1: deb http://deb.debian.org/debian bookworm main contrib non-free non-free-firmware
        2: deb http://security.debian.org/debian-security bookworm-security main contrib non-free non-free-firmware
    Active apt repos in: /etc/apt/sources.list.d/microsoft-edge.list
        1: deb [arch=amd64] https://packages.microsoft.com/repos/edge/ stable main
    Active apt repos in: /etc/apt/sources.list.d/mx.list
        1: deb http://mirrors.rit.edu/mxlinux/mx-packages/mx/repo/ bookworm main non-free
    Active apt repos in: /etc/apt/sources.list.d/playonlinux.list
        1: deb [signed-by=/usr/share/keyrings/playonlinux-archive-keyring.gpg] http://deb.playonlinux.com/ stretch main
    Active apt repos in: /etc/apt/sources.list.d/teamviewer.list
        1: deb [signed-by=/usr/share/keyrings/teamviewer-keyring.gpg] https://linux.teamviewer.com/deb stable main
    Active apt repos in: /etc/apt/sources.list.d/vscode.list
        1: deb [arch=amd64,arm64,armhf] http://packages.microsoft.com/repos/code stable main

Info:

    Processes: 246 Uptime: 13m wakeups: 16999 Memory: 3.22 GiB used: 2.75 GiB (85.3%) Init: SysVinit
    v: 3.06 runlevel: 5 default: graphical tool: systemctl Compilers: gcc: 12.2.0 alt: 12
    clang: 14.0.6 Client: shell wrapper v: 5.2.15-release inxi: 3.3.26

Boot Mode: UEFI

DBMS:

    database: Sqlite3
    management: MySQL Shell for VS Code

# Eksekusi

## SELECT

* Eksekusi 1

```SQL
SELECT * FROM prov;
```

* Eksekusi 2

```SQL
SELECT nm_prov FROM prov;
```

Result

| time | 1     | 2     |
| ---- | ----- | ----- |
| 1    | 0.424 | 0.179 |
| 2    | 0.22  | 0.212 |
| 3    | 0.102 | 0.094 |
| 4    | 0.13  | 0.161 |
| 5    | 0.093 | 0.082 |
| 6    | 0.091 | 0.086 |
| 7    | 0.092 | 0.092 |
| 8    | 0.073 | 0.073 |
| 9    | 0.282 | 0.186 |
| 10   | 0.185 | 0.122 |

| time | 2     | 1     |
| ---- | ----- | ----- |
| 1    | 0.924 | 0.238 |
| 2    | 0.149 | 0.131 |
| 3    | 0.1   | 0.086 |
| 4    | 0.083 | 0.113 |
| 5    | 0.178 | 0.1   |
| 6    | 0.111 | 0.077 |
| 7    | 0.102 | 0.551 |
| 8    | 0.109 | 0.205 |
| 9    | 0.092 | 0.337 |
| 10   | 0.162 | 0.097 |

Kesimpulan : Dengan hanya mengambil kolom tertentu akan lebih optimal.

## WHERE

### Data Type Match

* Eksekusi 1

  ```SQL
  SELECT nm_kab FROM kab
  WHERE id_prov='32';
  ```
* Eksekusi 2

  ```SQL
  SELECT nm_kab FROM kab
  WHERE id_prov=32;
  ```

| time | 1     | 2     |
| ---- | ----- | ----- |
| 1    | 0.377 | 0.205 |
| 2    | 0.219 | 0.148 |
| 3    | 0.133 | 0.133 |
| 4    | 0.191 | 0.141 |
| 5    | 0.148 | 0.139 |
| 6    | 0.101 | 0.213 |
| 7    | 0.351 | 0.206 |
| 8    | 0.121 | 0.149 |
| 9    | 0.148 | 0.166 |
| 10   | 0.345 | 0.099 |

| time | 2     | 1     |
| ---- | ----- | ----- |
| 1    | 0.225 | 0.133 |
| 2    | 0.1   | 0.127 |
| 3    | 0.101 | 0.132 |
| 4    | 0.169 | 0.191 |
| 5    | 0.133 | 0.132 |
| 6    | 0.147 | 0.134 |
| 7    | 0.16  | 0.117 |
| 8    | 0.62  | 0.114 |
| 9    | 1.264 | 0.111 |
| 10   | 0.096 | 0.095 |

Kesimpulan: Jika variabel kondisi bertipe sama dengan data yang di cari, maka akan lebih optimal

# ByteByteGo: Secret To Optimizing SQL Queries - Understand The SQL Execution Order

```SQL
SELECT
FROM
JOIN
ON
WHERE
GROUP BY
HAVING
ORDER BY
LIMIT
```

Kode di atas merupakan saran Susunan Eksekusi untuk mengoptimalkan waktu yang dibutuhkan

## WHERE | HAVING

# Kesimpulan Umum

Dari kombinasi ekseskusi yang dilakukan berpengaruh terhadap waktu yang di butuhkan, hal tersebut menandakan memory temporary sangant berpengaruh.
