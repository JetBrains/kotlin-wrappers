import org.gradle.api.Project

private val TARGET_ALIASES = mapOf(
    "react-css" to "react",
    "react-dom" to "react",
    "styled-components" to "styled",

    "@jetbrains/ring-ui" to "ring-ui",
)

fun Project.version(target: String): String {
    val finalTarget = TARGET_ALIASES[target] ?: target
    return prop("$finalTarget.version")
}

internal fun Project.publishVersion(): String {
    val build = prop("version.build")
        .let { if (it.isNotEmpty()) "-$it" else "" }

    val version = version(name.removePrefix("kotlin-")) + build

    val kotlinVersion: String = version("kotlin")

    return "$version-kotlin-$kotlinVersion"
}
