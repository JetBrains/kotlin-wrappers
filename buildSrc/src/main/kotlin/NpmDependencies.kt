import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.DevNpmDependencyExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

internal fun Project.npmVersion(name: String): String {
    val target = name
        .removePrefix("@types/")
        .removePrefix("@")
        .replace("/x-", "x-")
        .replace("/", "-")

    return prop("$target.npm.version")
}

fun Project.npmv(name: String): NpmDependency {
    val npm = dependencies.the<NpmDependencyExtension>()
    return npm(name, npmVersion(name))
}

fun Project.devNpmv(name: String): NpmDependency {
    val devNpm = dependencies.the<DevNpmDependencyExtension>()
    return devNpm(name, npmVersion(name))
}
