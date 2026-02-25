import org.gradle.api.Project

private val TARGET_ALIASES = mapOf(
    "react-dom-test-utils" to "react-dom",
)

fun Project.publishVersion(): String =
    listOfNotNull(
        prop("wrappers.version"),
        publishVersionBuild(),
    ).joinToString("-")

private fun Project.publishVersionBuild(): String? {
    val originalTarget = name.removePrefix("kotlin-")
    val target = TARGET_ALIASES[originalTarget] ?: originalTarget
    val npmVersion = propOrNull("$target.npm.version")
        ?: return null

    return npmVersion
        .removePrefix("^")
        .removePrefix("~")
}
