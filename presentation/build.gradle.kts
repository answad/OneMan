plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.chobo.presentation"
    compileSdk = 34

    defaultConfig {
        minSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(Dependency.Compose.ALPHA)
    implementation(Dependency.Compose.NAVIGATION)
    implementation(Dependency.Ktx.CORE)
    implementation(Dependency.Ktx.RUNTIME)
    implementation(Dependency.Compose.ACTIVITY)
    implementation(platform(Dependency.Compose.BOM))
    implementation(Dependency.Compose.UI)
    implementation(Dependency.Compose.GRPAHICS)
    implementation(Dependency.Compose.PREVIEW)
    implementation(Dependency.Compose.MATERAIL3)
    testImplementation(Dependency.Test.junit)
    androidTestImplementation(Dependency.Test.EXTJUNIT)
    androidTestImplementation(Dependency.Test.CORE)
    androidTestImplementation(platform(Dependency.Compose.PREVIEW))
    androidTestImplementation(Dependency.Test.UIJUNIT)
    debugImplementation(Dependency.Compose.TOOLING)
    debugImplementation(Dependency.Test.MANIFEST)
}