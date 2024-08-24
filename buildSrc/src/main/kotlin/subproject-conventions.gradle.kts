abstract class SubprojectService : BuildService<BuildServiceParameters.None> {
    /** [Project.path]s of subprojects to include in `kotlin-wrappers-bom`. */
    abstract val bomDependencies: SetProperty<String>
}

val subprojectService: SubprojectService =
    gradle.sharedServices.registerIfAbsent("SubprojectService", SubprojectService::class).get()

extensions.add("subprojectService", subprojectService)

/** Controls whether the current subproject will be included in `kotlin-wrappers-bom`. */
val includeInKotlinWrappersBom: Property<Boolean> =
    objects.property<Boolean>().convention(project.path != ":kotlin-wrappers-bom")
extensions.add<Property<Boolean>>("includeInKotlinWrappersBom", includeInKotlinWrappersBom)

subprojectService.bomDependencies
    .addAll(provider { project.path }.zip(includeInKotlinWrappersBom) { path, enabled ->
        if (enabled) listOf(path) else emptyList()
    })
