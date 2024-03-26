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
    implementation(Dependency.Common.ALPHA)
    implementation(Dependency.Common.NAVIGATION)
    implementation(Dependency.Ktx.CORE)
    implementation(Dependency.Ktx.RUNTIME)
    implementation(Dependency.Common.ACTIVITY)
    implementation(platform(Dependency.Common.BOM))
    implementation(Dependency.Common.UI)
    implementation(Dependency.Common.GRPAHICS)
    implementation(Dependency.Common.PREVIEW)
    implementation(Dependency.Common.MATERAIL3)
    implementation(project(":presentation"))
    testImplementation(Dependency.Test.junit)
    androidTestImplementation(Dependency.Test.EXTJUNIT)
    androidTestImplementation(Dependency.Test.CORE)
    androidTestImplementation(platform(Dependency.Common.PREVIEW))
    androidTestImplementation(Dependency.Test.UIJUNIT)
    debugImplementation(Dependency.Common.TOOLING)
    debugImplementation(Dependency.Test.MANIFEST)
}