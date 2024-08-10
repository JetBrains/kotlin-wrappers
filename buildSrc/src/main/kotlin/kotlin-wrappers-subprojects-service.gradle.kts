/**
 * Create a service for collecting the coordinates of all kotlin-wrappers
 * artifacts that should be included in `kotlin-wrappers-bom`.
 */
abstract class SubprojectsManagerService : BuildService<BuildServiceParameters.None> {
    /** [Project.path]s of subprojects to include in `kotlin-wrappers-bom`. */
    abstract val bomDependencies: SetProperty<String>

    /** [Project.path]s of subprojects to include in the aggregated Dokka docs. */
    abstract val dokkaDependencies: SetProperty<String>
}

val kotlinWrapperSubprojects: SubprojectsManagerService =
    gradle.sharedServices.registerIfAbsent("SubprojectsManagerService", SubprojectsManagerService::class).get()

extensions.add("kotlinWrapperSubprojects", kotlinWrapperSubprojects)

/** Controls whether the current subproject will be included in `kotlin-wrappers-bom`. */
val includeInKotlinWrappersBom: Property<Boolean> =
    objects.property<Boolean>().convention(project.path != ":kotlin-wrappers-bom")
extensions.add<Property<Boolean>>("includeInKotlinWrappersBom", includeInKotlinWrappersBom)

kotlinWrapperSubprojects.bomDependencies
    .addAll(provider { project.path }.zip(includeInKotlinWrappersBom) { path, enabled ->
        if (enabled) listOf(path) else emptyList()
    })

/** Controls whether the current subproject will be included in the aggregated Dokka docs. */
val includeInDokkaDocs: Property<Boolean> =
    objects.property<Boolean>().convention(project.path != ":docs")
extensions.add<Property<Boolean>>("includeInDokkaDocs", includeInDokkaDocs)

kotlinWrapperSubprojects.dokkaDependencies
    .addAll(provider { project.path }.zip(includeInDokkaDocs) { path, enabled ->
        if (enabled) listOf(path) else emptyList()
    })
