# Rencana Implementasi: Bottom Navigation dengan Kalkulator (Sesuai Modul)

Saya akan menyesuaikan proyek Anda mengikuti modul Bottom Navigation, namun dengan modifikasi khusus: menu **"Data"** akan diganti sepenuhnya menjadi **"Kalkulator"** sesuai keinginan Anda.

## Perubahan yang Diusulkan

### 1. Navigasi & Menu
*   **[MODIFIKASI] [bottom_nav_menu.xml](file:///D:/project_android/app/src/main/res/menu/bottom_nav_menu.xml)**: Mengubah item menu tengah agar tetap bernama **"Kalkulator"** (ID: `nav_kalkulator`) dan menggunakan icon kalkulator, bukan "Data".

### 2. MainActivity & Tata Letak
*   **[MODIFIKASI] [activity_main.xml](file:///D:/project_android/app/src/main/res/layout/activity_main.xml)**: Memastikan `BottomNavigationView` berada tepat di bagian bawah layar dan `FragmentContainerView` mengisi sisa layar di atasnya, sesuai panduan modul.
*   **[MODIFIKASI] [MainActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/MainActivity.kt)**: Mengisi kode untuk menangani perpindahan antar fragment (Home, Kalkulator, Profile) menggunakan fungsi `loadFragment`.

### 3. Integrasi Fragment
*   **[MODIFIKASI] [HomeFragment.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/HomeFragment.kt)**: Menyederhanakan sesuai modul (menampilkan teks "HALAMAN HOME").
*   **[TETAP] [KalkulatorFragment.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/KalkulatorFragment.kt)**: Mempertahankan logika kalkulator Anda yang sudah ada, namun dipanggil melalui sistem navigasi baru.
*   **[MODIFIKASI] [ProfileFragment.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/ProfileFragment.kt)**: Menyederhanakan sesuai modul (menampilkan teks "HALAMAN PROFILE").

## Rencana Verifikasi

### Tes Otomatis
*   Menjalankan build Gradle untuk memastikan sinkronisasi ID antara menu XML dan kode di `MainActivity`.

### Verifikasi Manual
*   Mengecek apakah saat aplikasi dibuka, halaman Home langsung muncul.
*   Mengecek apakah tombol navigasi di bawah berfungsi untuk berpindah ke fitur Kalkulator dan Profile.
*   Memastikan navigasi tetap berada di bawah layar (tidak tertutup keyboard atau tergeser).

> [!IMPORTANT]
> Saya tidak akan menghapus fitur Kalkulator Anda. Saya hanya akan memasukkannya ke dalam sistem navigasi "bawah" yang Anda minta, menggantikan posisi tab "Data" yang ada di modul.
