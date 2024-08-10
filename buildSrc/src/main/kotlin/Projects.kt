import org.gradle.api.Project

private val TARGET_ALIASES = mapOf(
    "react-core" to "react",
    "react-dom-legacy" to "react-dom",
    "react-dom-test-utils" to "react-dom",
    "react-legacy" to "react",

    "emotion" to "emotion-react",
)

fun Project.version(target: String): String {
    return prop("$target.version")
}

fun Project.publishVersion(): String {
    val target = name.removePrefix("kotlin-")
    val finalTarget = TARGET_ALIASES[target] ?: target

    val version = version(finalTarget)
        .removePrefix("^")
        .removePrefix("~")

    val build = prop("version.build")

    return "$version-$build"
}
