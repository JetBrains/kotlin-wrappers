import org.gradle.api.Project

private val TARGET_ALIASES = mapOf(
    "react-core" to "react",
    "react-dom-legacy" to "react-dom",
    "react-dom-test-utils" to "react-dom",
    "react-legacy" to "react",

    "emotion" to "emotion-react",
)

fun Project.publishVersion(): String {
    val originalTarget = name.removePrefix("kotlin-")
    val target = TARGET_ALIASES[originalTarget] ?: originalTarget

    val version = propOrNull("$target.version")
        ?: prop("$target.npm.version")
            .removePrefix("^")
            .removePrefix("~")

    val build = prop("version.build")

    return "$version-$build"
}
