import org.gradle.api.Project

fun Project.publishVersion(): String =
    listOfNotNull(
        prop("wrappers.version"),
        publishVersionBuild(),
    ).joinToString("-")

private fun Project.publishVersionBuild(): String? {
    val target = name.removePrefix("kotlin-")
    val npmVersion = propOrNull("$target.npm.version")
        ?: return null

    return npmVersion
        .removePrefix("^")
        .removePrefix("~")
}
