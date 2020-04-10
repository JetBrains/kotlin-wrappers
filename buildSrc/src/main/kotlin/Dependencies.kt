import org.gradle.api.Project

fun Project.kotlinxHtml(name: String): String =
    "org.jetbrains.kotlinx:kotlinx-html-$name:${version("kotlinx_html")}"

fun Project.kotlinxCoroutines(name: String): String =
    "org.jetbrains.kotlinx:kotlinx-coroutines-$name:${version("kotlinx_coroutines")}"

fun Project.kotlinxSerialization(name: String): String =
    "org.jetbrains.kotlinx:kotlinx-serialization-$name:${version("kotlinx_serialization")}"
