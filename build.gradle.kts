import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

plugins {
    id("com.android.application") version "8.1.1"
}

configure<BaseAppModuleExtension> {
    namespace = "com.pribadi.webview"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.pribadi.webview"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    sourceSets {
        getByName("main") {
            assets.srcDirs("src/main/assets")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
