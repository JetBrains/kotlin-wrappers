package wrappers

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.api.initialization.dsl.VersionCatalogBuilder
import java.io.File

class NpmVersionCatalogPlugin : Plugin<Settings> {
    override fun apply(target: Settings): Unit = with(target) {
        dependencyResolutionManagement {
            versionCatalogs {
                create("jspkg") {
                    npmLibraries(rootDir)
                }
            }
        }
    }

    fun VersionCatalogBuilder.npmLibraries(rootDir: File) {
        val propertiesFile = rootDir.resolve("gradle.properties")
        if (!propertiesFile.exists())
            return

        val lines = propertiesFile.readLines()

        for ((commentLine, versionLine) in lines.windowed(2)) {
            val version = versionLine
                .substringAfter(".npm.version=", "")
                .ifEmpty { null }
                ?: continue

            val packageName = commentLine
                .removePrefix("# https://www.npmjs.com/package/")
                .takeIf { it != commentLine }
                ?: continue

            val packageAlias = packageName
                .removePrefix("@")
                .replace(
                    regex = Regex("""-(\w)"""),
                    transform = { it.groupValues[1].uppercase() }
                )
                .replace("/", "-")

            library(packageAlias, "npm", packageName).version(version)
        }
    }
}
