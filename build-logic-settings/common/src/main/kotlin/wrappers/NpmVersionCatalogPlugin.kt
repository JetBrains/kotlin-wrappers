package wrappers

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import java.io.File

class NpmVersionCatalogPlugin : Plugin<Settings> {
    override fun apply(target: Settings): Unit = with(target) {
        dependencyResolutionManagement {
            versionCatalogs {
                create("jspkg") {
                    for (library in npmLibraries(rootDir)) {
                        library(library.alias, "npm", library.name)
                            .version(library.version)
                    }
                }
            }
        }
    }

    private fun npmLibraries(rootDir: File): List<NpmLibrary> {
        val propertiesFile = rootDir.resolve("gradle.properties")
        if (!propertiesFile.exists())
            return emptyList()

        return propertiesFile.readLines()
            .windowed(2)
            .mapNotNull { (commentLine, versionLine) -> parseNpmLibrary(commentLine, versionLine) }
    }
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

private class NpmLibrary(
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
}
