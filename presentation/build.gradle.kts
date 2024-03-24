plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.chobo.presentation"
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

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ProjectProperties.kotlinCompilerExtensionVersion
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