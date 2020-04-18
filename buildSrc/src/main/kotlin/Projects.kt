import org.gradle.api.Project
import org.gradle.api.internal.artifacts.dependencies.DefaultProjectDependency

private val IMPLEMENTATION = "implementation"

internal fun Project.relatedProjects(): List<Project> {
    val configuration = configurations.findByName(IMPLEMENTATION)
        ?: return emptyList()

    return configuration
        .allDependencies
        .filterIsInstance<DefaultProjectDependency>()
        .map { it.dependencyProject }
}

internal fun Project.version(target: String): String =
    property("${target}.version") as String

internal val Project.npmName: String
    get() = "@jetbrains/$name"

internal val Project.npmVersion: String
    get() = version(
        name.removePrefix("kotlin-")
            .takeIf { it != "extensions" }
            ?: "kotlinext"
    )

internal val Project.kotlinVersion: String
    get() = version("kotlin")

internal fun Project.publishVersion(): String =
    "$npmVersion-kotlin-$kotlinVersion"
