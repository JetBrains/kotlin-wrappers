package wrappers

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import java.io.File

class NpmVersionCatalogPlugin : Plugin<Settings> {
    override fun apply(target: Settings): Unit = with(target) {
        dependencyResolutionManagement {
            versionCatalogs {
                create("jspkg") {
                    for (library in npmLibraries(target)) {
                        library(library.alias, "npm", library.name)
                            .version(library.version)
                    }
                }
            }
        }
    }
}

private fun npmLibraries(settings: Settings): List<NpmLibrary> {
    val rootDir = settings.rootDir
    var propertiesFile = rootDir.resolve("gradle.properties")
    if (rootDir.name != "karakum")
        return npmLibraries(propertiesFile)

    if (!propertiesFile.exists())
        propertiesFile = rootDir.resolve("../../gradle.properties")

    return npmLibraries(propertiesFile)
        .map { it.withStrictVersion() }
}

private fun npmLibraries(propertiesFile: File): List<NpmLibrary> {
    return propertiesFile.readLines()
        .windowed(2)
        .mapNotNull { (commentLine, versionLine) -> parseNpmLibrary(commentLine, versionLine) }
}

private fun parseNpmLibrary(
    commentLine: String,
    versionLine: String,
): NpmLibrary? {
    val version = versionLine
        .substringAfter(".npm.version=", "")
        .ifEmpty { null }
        ?: return null

    val packageName = commentLine
        .removePrefix("# https://www.npmjs.com/package/")
        .takeIf { it != commentLine }
        ?: return null

    return NpmLibrary(
        name = packageName,
        version = version,
    )
}

private data class NpmLibrary(
    val name: String,
    val version: String,
) {
    val alias = name
        .removePrefix("@")
        .replace(
            regex = Regex("""-(\w)"""),
            transform = { it.groupValues[1].uppercase() }
        )
        .replace("/", "-")

    fun withStrictVersion(): NpmLibrary {
        val strictVersion = version
            .removePrefix("^")
            .removePrefix("~")

        return copy(version = strictVersion)
    }
}
