// COPIED

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

fun KotlinDependencyHandler.npm(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
) {
    val dependency = dependencyNotation.get()
    implementation(
        npm(
            name = dependency.name,
            version = dependency.version!!,
        ),
    )
}

fun KotlinDependencyHandler.devNpm(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
) {
    val dependency = dependencyNotation.get()
    implementation(
        devNpm(
            name = dependency.name,
            version = dependency.version!!,
        ),
    )
}
