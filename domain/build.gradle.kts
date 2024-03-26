plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.chobo.domain"
    compileSdk = ProjectProperties.compileSdk

    defaultConfig {
        minSdk = ProjectProperties.minSdk

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
        jvmTarget = ProjectProperties.jvmTarget
    }
}

dependencies {
    implementation(Dependency.Ktx.CORE)
    implementation(Dependency.Common.APPCOMPAT)
    implementation(Dependency.Common.MATERIAL1)
    testImplementation(Dependency.Test.junit)
    androidTestImplementation(Dependency.Test.EXTJUNIT)
    androidTestImplementation(Dependency.Test.CORE)
}