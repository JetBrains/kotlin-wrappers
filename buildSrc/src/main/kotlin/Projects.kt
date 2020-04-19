import org.gradle.api.Project
import org.gradle.api.internal.artifacts.dependencies.DefaultProjectDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency

private val IMPLEMENTATION = "implementation"

internal fun Project.relatedProjects(): List<Project> {
    val configuration = configurations.findByName(IMPLEMENTATION)
        ?: return emptyList()

    return configuration
        .allDependencies
        .filterIsInstance<DefaultProjectDependency>()
        .map { it.dependencyProject }
}

internal fun Project.nmpDependencies(): List<NpmDependency> {
    val configuration = configurations.findByName(IMPLEMENTATION)
        ?: return emptyList()

    return configuration
        .allDependencies
        .filterIsInstance<NpmDependency>()
}

internal fun Project.version(target: String): String =
    prop("${target}.version")

fun Project.npmVersion(target: String): String =
    "^${version(target)}"

internal val Project.npmName: String
    get() = "@jetbrains/$name"

internal val Project.npmVersion: String
    get() = version(
        name.removePrefix("kotlin-")
            .takeIf { it != "extensions" }
            ?: "kotlinext"
    ) + npmVersionBuild

private val Project.npmVersionBuild: String
    get() = prop("version.build")
        .let { if (it.isNotEmpty()) "-$it" else "" }

internal val Project.kotlinVersion: String
    get() = version("kotlin")

internal fun Project.publishVersion(): String =
    "$npmVersion-kotlin-$kotlinVersion"
