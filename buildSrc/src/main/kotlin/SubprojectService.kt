import org.gradle.api.provider.Provider
import org.gradle.api.provider.SetProperty
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters

abstract class SubprojectService : BuildService<BuildServiceParameters.None> {
    abstract val data: SetProperty<SubprojectData>
}

fun <T : Any> SubprojectService.libraries(
    transform: (path: String) -> T,
): Provider<List<T>> =
    data.map { subprojects ->
        subprojects.asSequence()
            .filter { it.type == SubprojectType.LIBRARY }
            .map { it.path }
            .sorted()
            .map(transform)
            .toList()
    }
