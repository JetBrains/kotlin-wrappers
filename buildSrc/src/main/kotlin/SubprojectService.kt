import org.gradle.api.NamedDomainObjectProvider
import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration
import org.gradle.api.provider.SetProperty
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.registerIfAbsent

private const val SUBPROJECT_SERVICE = "SubprojectService"

abstract class SubprojectService : BuildService<BuildServiceParameters.None> {
    abstract val data: SetProperty<SubprojectData>
}

internal fun Project.getOrCreateSubprojectService(): SubprojectService {
    val service = gradle.sharedServices
        .registerIfAbsent("SubprojectService", SubprojectService::class)
        .get()

    extensions.add(SUBPROJECT_SERVICE, service)

    return service
}

fun Project.addSubprojectDependencies(
    configuration: NamedDomainObjectProvider<Configuration>,
    type: SubprojectType,
) {
    configuration.configure {
        val subprojectService = extensions[SUBPROJECT_SERVICE] as SubprojectService

        dependencyConstraints.addAllLater(
            subprojectService.data.map { subprojects ->
                subprojects.asSequence()
                    .filter { it.type == type }
                    .map { it.path }
                    .sorted()
                    .map { path -> project.dependencies.constraints.create(project(path)) }
                    .toList()
            }
        )
    }
}
