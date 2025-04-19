import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.targets.js.npm.DevNpmDependencyExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

operator fun NpmDependencyExtension.invoke(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
): NpmDependency {
    val dependency = dependencyNotation.get()
    return this(
        name = dependency.name,
        version = dependency.version!!,
    )
}

operator fun DevNpmDependencyExtension.invoke(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
): NpmDependency {
    val dependency = dependencyNotation.get()
    return this(
        name = dependency.name,
        version = dependency.version!!,
    )
}
