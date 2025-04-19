plugins {
    `java-platform`
    id("publish-conventions")
    id("org.jetbrains.dokka")
}

configurations.api.configure {
    dependencyConstraints.addAllLater(
        subprojectService.libraries { path ->
            project.dependencies.constraints.create(project(path))
        }
    )
}
