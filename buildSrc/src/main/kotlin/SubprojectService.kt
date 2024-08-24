import org.gradle.api.provider.SetProperty
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters

abstract class SubprojectService : BuildService<BuildServiceParameters.None> {
    abstract val data: SetProperty<SubprojectData>
}
