plugins {
    `java-platform`
    `publish-conventions`
    id("dev.adamko.dokkatoo-html")
}

addSubprojectDependencies(
    configuration = configurations.api,
    type = SubprojectType.LIBRARY,
)
