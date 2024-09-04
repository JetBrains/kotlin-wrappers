plugins {
    `version-catalog`
    `publish-conventions`
}

val aliasHelper = AliasHelper(rootDir)

catalog {
    versionCatalog {
        val libraries = subprojectService
            .libraries { path -> project(path) }
            .get()

        for (library in libraries) {
            library(
                aliasHelper.getAlias(library.name),
                library.group.toString(),
                library.name,
            ).version(library.publishVersion())
        }
    }
}
