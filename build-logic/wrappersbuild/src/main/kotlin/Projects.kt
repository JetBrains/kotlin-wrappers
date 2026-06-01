import org.gradle.api.Project

fun Project.publishVersion(): String =
    listOfNotNull(
        property("wrappers.version") as String,
        publishVersionBuild(),
    ).joinToString("-")

private fun Project.publishVersionBuild(): String? {
    val npmVersion = npmVersionOrNull(name.removePrefix("kotlin-"))
        ?: return null

    return npmVersion
        .removePrefix("^")
        .removePrefix("~")
}
