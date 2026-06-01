import org.gradle.api.internal.catalog.DefaultVersionCatalogBuilder

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        val originalJspkg = create("hiddenOriginalJspkg") {
            from(files("../../gradle/jspkg.versions.toml"))
        }

        create("jspkg") {
            from(files("../../gradle/jspkg.versions.toml"))

            val catalog = (originalJspkg as DefaultVersionCatalogBuilder).build()
            for (alias in catalog.versionAliases) {
                val strictVersion = catalog.getVersion(alias)
                    .version
                    .requiredVersion
                    .removePrefix("^")
                    .removePrefix("~")

                version(alias, strictVersion)
            }
        }
    }
}
