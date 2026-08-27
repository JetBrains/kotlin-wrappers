// COPIED

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

fun KotlinDependencyHandler.npm(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
): Dependency {
    val dependency = dependencyNotation.get()
    return npm(
        name = dependency.name,
        version = dependency.version!!,
    )
}

fun KotlinDependencyHandler.devNpm(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
): Dependency {
    val dependency = dependencyNotation.get()
    return devNpm(
        name = dependency.name,
        version = dependency.version!!,
    )
}
