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
    implementation(Dependency.Common.SPLASHSCREEN)
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
    testImplementation(Dependency.Test.junit)
    androidTestImplementation(Dependency.Test.EXTJUNIT)
    androidTestImplementation(Dependency.Test.CORE)
    androidTestImplementation(platform(Dependency.Common.PREVIEW))
    androidTestImplementation(Dependency.Test.UIJUNIT)
    debugImplementation(Dependency.Common.TOOLING)
    debugImplementation(Dependency.Test.MANIFEST)
}