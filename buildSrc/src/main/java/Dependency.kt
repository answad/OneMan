object Dependency {


    object Compose {
        const val ALPHA = "androidx.compose.material3:material3:${Versions.composeVersion}"
        const val NAVIGATION = "androidx.navigation:navigation-compose:${Versions.navigationVersion}"
        const val UI = "androidx.compose.ui:ui"
        const val GRPAHICS = "androidx.compose.ui:ui-graphics"
        const val MATERAIL3 = "androidx.compose.material3:material3"
        const val ACTIVITY = "androidx.activity:activity-compose:${Versions.activityVersion}"
        const val BOM = "androidx.compose:compose-bom:${Versions.bomVersion}"
        const val PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val TOOLING = "androidx.compose.ui:ui-tooling"
        const val MATERIAL1 = "com.google.android.material:material:${Versions.materialVersion}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    }

    object Ktx {
        const val RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
        const val CORE = "androidx.core:core-ktx:${Versions.coreVersion}"
    }

    object Test {
        const val EXTJUNIT = "androidx.test.ext:junit:${Versions.junitVersion}"
        const val junit = "junit:junit:${Versions.junitVersion}"
        const val CORE = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
        const val UIJUNIT = "androidx.compose.ui:ui-test-junit4"
        const val MANIFEST = "androidx.compose.ui:ui-test-manifest"
    }
}
