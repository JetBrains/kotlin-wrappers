plugins {
    `java-platform`
    `publish-conventions`
    id("dev.adamko.dokkatoo-html")
}

configurations.api.configure {
    dependencyConstraints.addAllLater(
        subprojectService.data.map { subprojects ->
            subprojects.asSequence()
                .filter { it.type == SubprojectType.LIBRARY }
                .map { it.path }
                .sorted()
                .map { path ->project.dependencies.constraints.create(project(path)) }
                .toList()
        }
    )
}
