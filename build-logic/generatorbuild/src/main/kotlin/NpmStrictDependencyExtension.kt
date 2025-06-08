import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension
import javax.inject.Inject

abstract class NpmStrictDependencyExtension
@Inject
constructor(
    private val project: Project,
) {
    private fun strictVersion(target: String): String {
        val id = target
            .removePrefix("@")
            .replace("/", "-")

        val version = project.property("${id}.npm.version") as String

        return version
            .removePrefix("^")
            .removePrefix("~")
    }

    operator fun invoke(name: String): NpmDependency {
        val npm = project.dependencies.the<NpmDependencyExtension>()
        return npm(name, strictVersion(name))
    }
}
