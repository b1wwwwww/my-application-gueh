# Rencana Implementasi - Menambahkan Splash, Login, dan Home Screen

Berdasarkan tutorial "Bagian 4: Activity Lifecycle & Navigasi", saya akan menambahkan tiga layar baru ke aplikasi Anda: **Splash Screen**, **Login Screen**, dan **Home Screen**.

## Tinjauan Pengguna Diperlukan

> [!IMPORTANT]
> Saya akan mengaktifkan **View Binding** di proyek Anda. Ini adalah cara modern yang disarankan tutorial untuk menghubungkan kode Kotlin dengan tampilan XML, menggantikan `findViewById`.
>
> Alur aplikasi akan berubah menjadi:
> `Splash Screen (2 detik)` -> `Login Screen` -> `Home Screen (Kalkulator Anda akan dipindah ke sini)`.

## Perubahan yang Diusulkan

### Konfigurasi Proyek
#### [MODIFY] [build.gradle.kts](file:///D:/project_android/app/build.gradle.kts)
- Menambahkan `viewBinding = true` di dalam blok `buildFeatures`.

### Komponen UI (Layout)
#### [NEW] [activity_splash.xml](file:///D:/project_android/app/src/main/res/layout/activity_splash.xml)
- Tampilan sederhana dengan latar belakang biru dan teks nama aplikasi.
#### [NEW] [activity_login.xml](file:///D:/project_android/app/src/main/res/layout/activity_login.xml)
- Form login dengan input Username dan Password.
#### [NEW] [activity_home.xml](file:///D:/project_android/app/src/main/res/layout/activity_home.xml)
- Layar utama yang menyambut pengguna dan berisi fitur Kalkulator yang sudah Anda buat sebelumnya.

### Komponen Logika (Kotlin)
#### [NEW] [SplashActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/SplashActivity.kt)
- Logika untuk menampilkan splash screen selama 2 detik sebelum berpindah ke Login.
#### [NEW] [LoginActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/LoginActivity.kt)
- Validasi login menggunakan data dummy (Username: `siswa`, Password: `rpl2026`).
#### [NEW] [HomeActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/HomeActivity.kt)
- Menampilkan pesan selamat datang, tombol Logout, dan fungsionalitas Kalkulator.

### Konfigurasi Sistem
#### [MODIFY] [AndroidManifest.xml](file:///D:/project_android/app/src/main/AndroidManifest.xml)
- Mendaftarkan semua Activity baru.
- Menjadikan `SplashActivity` sebagai layar pertama yang muncul saat aplikasi dibuka.

## Rencana Verifikasi
1. Melakukan build proyek untuk memastikan View Binding terkonfigurasi dengan benar.
2. Memastikan navigasi antar Activity (Intent) tertulis dengan benar sesuai siklus hidup Android.
