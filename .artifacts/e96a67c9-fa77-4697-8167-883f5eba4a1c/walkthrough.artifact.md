# Walkthrough - Navigasi Bawah Sesuai Modul (Kalkulator)

Saya telah merapikan proyek Anda agar sepenuhnya mengikuti struktur dari modul terbaru yang Anda berikan. Sekarang navigasi berada di bagian bawah, `MainActivity` sudah terisi dengan benar, dan tab tengah menggunakan fitur **Kalkulator** (bukan "Data").

## Perubahan Utama

### 1. Navigasi Bawah (Bottom Navigation)
Sekarang menu navigasi sudah terpasang di bagian paling bawah layar sesuai dengan gambar di modul.
- **Menu Kalkulator**: Menggunakan label "Kalkulator" dan icon kalkulator.
- **Label Navigasi**: Label "Home", "Kalkulator", dan "Profile" selalu muncul di bawah icon.

### 2. MainActivity Terisi & Berfungsi
`MainActivity` tidak lagi kosong. Saya telah menerapkan logika navigasi fragment sesuai alur di modul:
- Saat dibuka pertama kali, langsung menampilkan `HomeFragment`.
- Berpindah antar fragment menggunakan fungsi `loadFragment`.
- File: [MainActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/MainActivity.kt)

### 3. Penyesuaian Layout (Modul Style)
Saya menyesuaikan layout fragment agar lebih mirip dengan contoh di modul menggunakan `FrameLayout`:
- **Home**: Menampilkan teks "HALAMAN HOME".
- **Kalkulator**: Tetap berisi fitur Kalkulator Anda.
- **Profile**: Menampilkan teks "HALAMAN PROFILE" dan tombol Logout.

## Verifikasi
- Struktur `activity_main.xml` sudah menggunakan `ConstraintLayout` dengan `BottomNavigationView` yang dikunci di bawah (`bottom_toBottomOf="parent"`).
- ID navigasi di menu XML (`nav_home`, `nav_data`, `nav_profile`) sudah sinkron dengan kode di `MainActivity.kt`.

> [!TIP]
> Sekarang aplikasi Anda sudah memiliki kerangka navigasi yang solid. Anda bisa menambahkan halaman baru dengan menambahkan `item` di `bottom_nav_menu.xml` dan menambah `when` case di `MainActivity.kt`.
