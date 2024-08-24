plugins {
    `version-catalog`
    `publish-conventions`
}

catalog {
    versionCatalog {
        val libraries = subprojectService
            .libraries { path -> project(path) }
            .get()

        for (library in libraries) {
            library(
                "wrappers-" + library.name.removePrefix("kotlin-"),
                library.group.toString(),
                library.name,
            ).version(library.publishVersion())
        }
    }
}
