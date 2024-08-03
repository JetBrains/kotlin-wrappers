import NpmDependencyStrategy.MINOR
import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.DevNpmDependencyExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

enum class NpmDependencyStrategy(val prefix: String) {
    EXACT(""),
    PARCH("~"),
    MINOR("^"),

    ;
}

private val STRICT_VERSION_REQUIRED = setOf(
    "@mui/material",
    "@mui/icons-material",
    "@mui/lab",
    "@mui/x-date-pickers",
    "@mui/x-tree-view",
)

private fun Project.npmVersion(name: String, strategy: NpmDependencyStrategy): String {
    val version = version(name)
    if (name in STRICT_VERSION_REQUIRED) {
        return version
    }

    return "${strategy.prefix}$version"
}

fun Project.npmv(name: String, strategy: NpmDependencyStrategy = MINOR): NpmDependency {
    val npm = dependencies.the<NpmDependencyExtension>()
    return npm(name, npmVersion(name, strategy))
}

fun Project.devNpmv(name: String, strategy: NpmDependencyStrategy = MINOR): NpmDependency {
    val devNpm = dependencies.the<DevNpmDependencyExtension>()
    return devNpm(name, npmVersion(name, strategy))
}
