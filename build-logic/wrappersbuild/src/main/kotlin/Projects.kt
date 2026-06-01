import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType
import kotlin.jvm.optionals.getOrNull

fun Project.publishVersion(): String =
    listOfNotNull(
        prop("wrappers.version"),
        publishVersionBuild(),
    ).joinToString("-")

private fun Project.publishVersionBuild(): String? {
    val target = name.removePrefix("kotlin-")
    val npmVersion = extensions.getByType<VersionCatalogsExtension>()
        .named("jspkg")
        .findVersion(target)
        .map { it.requiredVersion }
        .getOrNull()
        ?: return null

    return npmVersion
        .removePrefix("^")
        .removePrefix("~")
}
