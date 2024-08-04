import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.DevNpmDependencyExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

private val NAME_ALIASES = mapOf(
    "@mui/x-date-pickers" to "muix-date-pickers",
    "@mui/x-tree-view" to "muix-tree-view",

    "@popperjs/core" to "popper",

    "@types/node" to "node",
)

private fun Project.npmVersion(name: String): String {
    val finalName = NAME_ALIASES[name]
        ?: name
            .removePrefix("@")
            .replace("/", "-")

    return version(finalName)
}

fun Project.npmv(name: String): NpmDependency {
    val npm = dependencies.the<NpmDependencyExtension>()
    return npm(name, npmVersion(name))
}

fun Project.devNpmv(name: String): NpmDependency {
    val devNpm = dependencies.the<DevNpmDependencyExtension>()
    return devNpm(name, npmVersion(name))
}
