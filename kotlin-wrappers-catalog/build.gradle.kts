plugins {
    `version-catalog`
    id("wrappersbuild.publish-conventions")
}

val aliasHelper = AliasHelper(rootDir)

(rootProject.allprojects - project).forEach {
    evaluationDependsOn(it.path)
}

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
