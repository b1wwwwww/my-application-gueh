# Panduan Struktur dan Alur Proyek Kalkulator

Dokumen ini menjelaskan perubahan yang telah dilakukan dan bagaimana struktur proyek Android Anda bekerja berdasarkan modul tutorial yang Anda ikuti.

## 1. Login: Username & Password
Saat ini, login menggunakan **Data Dummy** (data buatan sementara) sesuai instruksi tutorial Bagian 4.

*   **Username**: `siswa`
*   **Password**: `rpl2026`

> [!TIP]
> Jika Anda ingin mengubahnya, buka file:
> [LoginActivity.kt](file:///D:/project_android/app/src/main/java/com/example/my_first_application/LoginActivity.kt) pada baris ke-11 dan 12.

---

## 2. Alur Jalannya Aplikasi (Flow)
Aplikasi Anda sekarang memiliki sistem navigasi antar layar (Activity) menggunakan **Intent**:

1.  **Splash Screen** ([SplashActivity](file:///D:/project_android/app/src/main/java/com/example/my_first_application/SplashActivity.kt)):
    *   Ini adalah layar pertama yang muncul.
    *   Hanya menampilkan nama aplikasi selama 2000ms (2 detik).
    *   Setelah itu, ia memerintahkan Android untuk pindah ke `LoginActivity`.
2.  **Login Screen** ([LoginActivity](file:///D:/project_android/app/src/main/java/com/example/my_first_application/LoginActivity.kt)):
    *   Tempat pengguna memasukkan identitas.
    *   Jika benar, aplikasi akan pindah ke `HomeActivity` dan membawa data nama pengguna.
3.  **Home Screen** ([HomeActivity](file:///D:/project_android/app/src/main/java/com/example/my_first_application/HomeActivity.kt)):
    *   Layar utama yang menyambut pengguna ("Selamat datang, siswa!").
    *   Di sini saya memindahkan fitur **Kalkulator** yang Anda buat sebelumnya agar aplikasi terlihat seperti aplikasi sungguhan yang memiliki gerbang login.

---

## 3. Struktur Folder Proyek
Agar Anda tidak bingung mencari file, berikut adalah peta sederhananya:

```text
My_first_Application/
├── app/
│   ├── manifests/
│   │   └── AndroidManifest.xml      <-- (KTP Aplikasi: Daftar semua layar)
│   ├── java/com.example.../
│   │   ├── SplashActivity.kt        <-- (Logika layar pembuka)
│   │   ├── LoginActivity.kt         <-- (Logika validasi login)
│   │   └── HomeActivity.kt          <-- (Logika utama & kalkulator)
│   └── res/
│       ├── layout/                  <-- (Semua file desain tampilan)
│       │   ├── activity_splash.xml
│       │   ├── activity_login.xml
│       │   └── activity_home.xml
│       └── values/
│           └── strings.xml          <-- (Tempat menyimpan teks aplikasi)
└── Gradle Scripts/
    └── build.gradle.kts (Module:app) <-- (Konfigurasi fitur seperti View Binding)
```

---

## 4. Perubahan Besar yang Saya Lakukan

### A. Mengaktifkan View Binding
Saya mengubah cara kode Kotlin memanggil tombol atau teks di XML. Sebelumnya Anda menggunakan `findViewById`. Sekarang menggunakan `binding`.
*   **Kenapa?** Sesuai Tutorial Bagian 3, ini lebih aman dari error dan membuat kode lebih pendek.

### B. Pemindahan Kalkulator
Awalnya kalkulator Anda ada di `MainActivity`. Saya memindahkannya ke `HomeActivity` agar alurnya logis: **Login dulu baru bisa pakai Kalkulator**.

---

## 5. Apa itu file .md?
File `Tutorial-Kotlin-Android-Studio 1-4.md` yang Anda kirim adalah file **Markdown**. Ini adalah format dokumen teks yang sering digunakan developer untuk membuat dokumentasi atau modul pelajaran. Di dalamnya terdapat panduan langkah-demi-langkah yang kita gunakan sebagai acuan untuk mengubah aplikasi ini.
