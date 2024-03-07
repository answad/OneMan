plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.chobo.oneman"
    compileSdk = ProjectProperties.compileSdk

    defaultConfig {
        applicationId = "com.chobo.oneman"
        minSdk = ProjectProperties.minSdk
        targetSdk = ProjectProperties.targetSdk
        versionCode = ProjectProperties.versionCode
        versionName = ProjectProperties.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ProjectProperties.kotlinCompilerExtensionVersion
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependency.Compose.ALPHA)
    implementation(Dependency.Compose.NAVIGATION)
    implementation(Dependency.Ktx.CORE)
    implementation(Dependency.Ktx.RUNTIME)
    implementation(Dependency.Compose.ACTIVITY)
    implementation(platform(Dependency.Compose.BOM))
    implementation(Dependency.Compose.UI)
    implementation(Dependency.Compose.GRPAHICS)
    implementation(Dependency.Compose.PREVIEW)
    implementation(Dependency.Compose.MATERAIL)
    testImplementation(Dependency.Test.junit)
    androidTestImplementation(Dependency.Test.EXTJUNIT)
    androidTestImplementation(Dependency.Test.CORE)
    androidTestImplementation(platform(Dependency.Compose.PREVIEW))
    androidTestImplementation(Dependency.Test.UIJUNIT)
    debugImplementation(Dependency.Compose.TOOLING)
    debugImplementation(Dependency.Test.MANIFEST)
}