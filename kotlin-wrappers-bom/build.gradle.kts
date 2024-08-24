plugins {
    `java-platform`
    `publish-conventions`
    id("dev.adamko.dokkatoo-html")
}

configurations.api.configure {
    dependencyConstraints.addAllLater(
        subprojectService.libraries { path ->
            project.dependencies.constraints.create(project(path))
        }
    )
}
