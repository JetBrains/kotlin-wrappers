import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderConvertible
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

operator fun NpmDependencyExtension.invoke(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
): NpmDependency {
    val dependency = dependencyNotation.get()
    return this(
        name = dependency.name,
        version = dependency.version!!,
    )
}

operator fun NpmDependencyExtension.invoke(
    dependencyNotation: ProviderConvertible<MinimalExternalModuleDependency>,
): NpmDependency =
    this(dependencyNotation.asProvider())

operator fun DevNpmDependencyExtension.invoke(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
): NpmDependency {
    val dependency = dependencyNotation.get()
    return this(
        name = dependency.name,
        version = dependency.version!!,
    )
}
