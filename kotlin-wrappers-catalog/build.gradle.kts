plugins {
    `version-catalog`
    `publish-conventions`
}

catalog {
    versionCatalog {
        for (library in getLibraryProjects(rootProject)) {
            library(
                "wrappers-" + library.name.removePrefix("kotlin-"),
                library.group.toString(),
                library.name,
            ).version(library.publishVersion())
        }
    }
}
