# Proyek APK Labsoma

Unggah seluruh isi paket ini ke akar repositori **LABSOMA**. Paket ini berisi halaman HTML dengan logo Labsoma di dalam aplikasi, ikon Labsoma untuk layar utama/daftar aplikasi Android, proyek Android WebView, dan workflow GitHub Actions untuk membangun APK. Jangan unggah `Code.gs` atau data spreadsheet ke repositori.

Pastikan hasilnya tersusun seperti ini:

- `.github/workflows/build-apk.yml`
- `app/build.gradle.kts`
- `app/src/main/AndroidManifest.xml`
- `app/src/main/res/...` (ikon aplikasi Labsoma)
- `app/src/main/java/com/pribadi/webview/MainActivity.kt`
- `build.gradle.kts`, `settings.gradle.kts`, dan `gradle.properties`
- `index.html`

Setelah commit, buka **Actions → Build Android APK → Run workflow**. Unduh artifact `aplikasi-android-debug` dari run yang berhasil. APK membuka URL web app Google Apps Script yang sudah ditetapkan di `app/build.gradle.kts`. Agar APK menampilkan versi `index.html` di repositori ini dan tetap bisa memakai fungsi Apps Script, fungsi `doGet()` Apps Script perlu mengambil HTML tersebut dari GitHub.
