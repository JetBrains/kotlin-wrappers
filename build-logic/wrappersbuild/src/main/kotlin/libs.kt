import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.the

internal fun Project.libVersion(
    alias: String,
): String =
    project.the<VersionCatalogsExtension>()
        .named("libs")
        .findVersion(alias)
        .get()
        .requiredVersion
