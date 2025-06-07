import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension
import java.util.Properties
import javax.inject.Inject

abstract class NpmStrictDependencyExtension
@Inject
constructor(
    private val project: Project,
) {
    private val parentProperties = project.rootProject.file("../../gradle.properties")
        .inputStream()
        .use { Properties().apply { load(it) } }

    private fun strictVersion(target: String): String {
        val id = target
            .removePrefix("@")
            .replace("/", "-")

        val version = parentProperties["${id}.npm.version"] as String

        return version
            .removePrefix("^")
            .removePrefix("~")
    }

    operator fun invoke(name: String): NpmDependency {
        val npm = project.dependencies.the<NpmDependencyExtension>()
        return npm(name, strictVersion(name))
    }
}
