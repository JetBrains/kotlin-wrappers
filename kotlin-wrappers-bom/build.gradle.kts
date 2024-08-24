plugins {
    `java-platform`
    `publish-conventions`
    id("dev.adamko.dokkatoo-html")
}

configurations.api.configure {
    // lazily add enabled subprojects to the BOM
    dependencyConstraints.addAllLater(
        subprojectService.bomDependencies.map { subproject ->
            logger.info("[$path] adding ${subproject.size} subprojects to BOM: $subproject")
            subproject.sorted().map { coord ->
                project.dependencies.constraints.create(project(coord))
            }
        }
    )
}
