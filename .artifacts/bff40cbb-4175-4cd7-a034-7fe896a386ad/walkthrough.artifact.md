# Walkthrough - Implementasi Alur Splash, Login, dan Home

Saya telah berhasil mengubah struktur aplikasi Anda agar sesuai dengan panduan tutorial "Bagian 4: Activity Lifecycle & Navigasi". Aplikasi sekarang memiliki alur yang lengkap mulai dari layar pembuka hingga layar utama.

## Perubahan yang Dilakukan

### 1. Konfigurasi Proyek ([build.gradle.kts](file:///D:/project_android/app/build.gradle.kts))
- Mengaktifkan **View Binding**. Ini memungkinkan kita mengakses elemen UI secara langsung tanpa `findViewById`, membuat kode lebih aman dan ringkas.

### 2. Splash Screen (Layar Pembuka)
- **Layout**: [activity_splash.xml](file:///D:/project_android/app/src/main/res/layout/activity_splash.xml) dengan desain latar biru.
- **Logika**: [SplashActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/SplashActivity.kt) menampilkan logo selama 2 detik sebelum otomatis pindah ke layar Login.

### 3. Login Screen (Layar Masuk)
- **Layout**: [activity_login.xml](file:///D:/project_android/app/src/main/res/layout/activity_login.xml) dengan form input Username dan Password.
- **Logika**: [LoginActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/LoginActivity.kt) memvalidasi input.
    - **Username**: `siswa`
    - **Password**: `rpl2026`

### 4. Home Screen (Layar Utama & Kalkulator)
- **Layout**: [activity_home.xml](file:///D:/project_android/app/src/main/res/layout/activity_home.xml) menyambut pengguna dengan nama mereka dan menyediakan fitur Kalkulator yang telah Anda buat sebelumnya.
- **Logika**: [HomeActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/HomeActivity.kt) menangani perhitungan kalkulator dan tombol Logout.

### 5. Pengaturan Manifest ([AndroidManifest.xml](file:///D:/project_android/app/src/main/AndroidManifest.xml))
- Mengatur `SplashActivity` sebagai titik masuk utama aplikasi (`LAUNCHER`).
- Mendaftarkan `LoginActivity` dan `HomeActivity`.

## Verifikasi
- Menjalankan `:app:assembleDebug` dan build berhasil tanpa error.
- Menggunakan View Binding di semua Activity baru sesuai standar tutorial.
- Alur navigasi menggunakan `Intent` dan penutupan Activity (`finish()`) telah diterapkan agar pengguna tidak bisa kembali ke layar login setelah masuk.

> [!TIP]
> Sekarang Anda memiliki struktur aplikasi Android yang profesional. Anda bisa mencoba login dengan username `siswa` dan password `rpl2026` setelah menjalankan aplikasi ini di emulator atau perangkat asli.
