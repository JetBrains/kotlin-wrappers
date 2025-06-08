dependencyResolutionManagement {
    versionCatalogs {
        create("jspkg") {
            npmLibraries()
        }
    }
}

fun VersionCatalogBuilder.npmLibraries() {
    val lines = file("gradle.properties").readLines()

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
