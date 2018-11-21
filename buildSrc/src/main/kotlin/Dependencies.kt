object Dependencies {
    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions["kotlin_version"]}"

    val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions["kotlin_version"]}"
    val kotlinxSerializationRuntimeJs = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:${Versions["kotlinx_serialization_version"]}"
    val kotlinxHtmlJs = "org.jetbrains.kotlinx:kotlinx-html-js:${Versions["kotlinx_html_version"]}"

    val kotlinxCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions["kotlinx_coroutines_version"]}"
    val kotlinxCoroutinesCoreCommon = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions["kotlinx_coroutines_version"]}"
    val kotlinxCoroutinesCoreJs = "org.jetbrains.kotlinx:kotlinx-coroutines-core-js:${Versions["kotlinx_coroutines_version"]}"

    val gradleNodePlugin = "com.moowork.gradle:gradle-node-plugin:${Versions["node_plugin_version"]}"
    val gradleBintrayPlugin = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions["bintray_plugin_version"]}"
}