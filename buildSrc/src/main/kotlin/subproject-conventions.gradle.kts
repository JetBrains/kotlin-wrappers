val subprojectService: SubprojectService =
    gradle.sharedServices.registerIfAbsent("SubprojectService", SubprojectService::class).get()

extensions.add("subprojectService", subprojectService)

val subprojectType: Property<SubprojectType> =
    objects.property<SubprojectType>()
        .convention(provider { getSubprojectType() })

subprojectService.data.addAll(
    provider { project.path }
        .zip(subprojectType) { path, type ->
            listOf(SubprojectData(path, type))
        }
)

fun getSubprojectType() = when {
    pluginManager.hasPlugin("org.jetbrains.kotlin.multiplatform") -> SubprojectType.LIBRARY
    pluginManager.hasPlugin("java-platform") -> SubprojectType.BOM
    pluginManager.hasPlugin("version-catalog") -> SubprojectType.VERSION_CATALOG
    project.path == ":docs" -> SubprojectType.DOCS

    else -> throw IllegalStateException("Unknown subproject type")
}
