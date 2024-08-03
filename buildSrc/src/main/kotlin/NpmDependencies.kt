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

private fun Project.npmVersion(name: String, strategy: NpmDependencyStrategy): String {
    return "${strategy.prefix}${version(name)}"
}

fun Project.npmv(name: String, strategy: NpmDependencyStrategy = MINOR): NpmDependency {
    val npm = dependencies.the<NpmDependencyExtension>()
    return npm(name, npmVersion(name, strategy))
}

fun Project.devNpmv(name: String, strategy: NpmDependencyStrategy = MINOR): NpmDependency {
    val devNpm = dependencies.the<DevNpmDependencyExtension>()
    return devNpm(name, npmVersion(name, strategy))
}
