import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

plugins {
    id("com.android.application") version "8.1.1"
    id("org.jetbrains.kotlin.android") version "1.9.0"
}

val appUrl = "https://script.google.com/macros/s/AKfycbx7KU5Qd0lJ1PIKLwGW0pehL394vXeo8_KGMVynjfbpGGvsvS8OXe3F2_eizPu_UrBc/exec"

configure<BaseAppModuleExtension> {
    namespace = "com.pribadi.webview"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.pribadi.webview"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        buildConfigField("String", "APP_URL", "\"$appUrl\"")
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("AndroidManifest.xml")
            java.srcDirs(".")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        buildConfig = true
    }
}
