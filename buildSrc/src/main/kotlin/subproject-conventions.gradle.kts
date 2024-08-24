val subprojectType: Property<SubprojectType> =
    objects.property<SubprojectType>()
        .convention(provider { getSubprojectType() })

val subprojectService = getOrCreateSubprojectService()
subprojectService.data.add(
    provider { project.path }
        .zip(subprojectType, ::SubprojectData)
)

fun getSubprojectType(): SubprojectType =
    when {
        pluginManager.hasPlugin("org.jetbrains.kotlin.multiplatform") -> SubprojectType.LIBRARY
        pluginManager.hasPlugin("java-platform") -> SubprojectType.BOM
        pluginManager.hasPlugin("version-catalog") -> SubprojectType.VERSION_CATALOG
        project.path == ":docs" -> SubprojectType.DOCS

        else -> throw IllegalStateException("Unknown subproject type")
    }
