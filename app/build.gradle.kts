plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.couchraoke.companion"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.couchraoke.companion"
        minSdk = 28
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    // WebSocket client
    implementation(libs.okhttp)

    // QR code scanning (CameraX + ML Kit)
    implementation(libs.mlkit.barcode.scanning)
    implementation(libs.androidx.camera.camera2)
    implementation(libs.androidx.camera.lifecycle)
    implementation(libs.androidx.camera.view)

    // HTTP file server (Ktor)
    implementation(libs.ktor.server.cio)
    implementation(libs.ktor.server.partial.content)

    // SAF directory listing
    implementation(libs.androidx.documentfile)

    // FFT Operations
    implementation(libs.jtransforms)

    // Settings persistence
    implementation(libs.androidx.datastore.preferences)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}