import org.gradle.api.provider.SetProperty
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters

abstract class SubprojectService : BuildService<BuildServiceParameters.None> {
    /** [Project.path]s of subprojects to include in `kotlin-wrappers-bom`. */
    abstract val bomDependencies: SetProperty<String>
}
