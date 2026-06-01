import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType
import kotlin.jvm.optionals.getOrNull

private val Project.jspkg: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>()
        .named("jspkg")

internal fun Project.npmVersion(
    target: String,
): String =
    jspkg.findVersion(target)
        .get()
        .requiredVersion

internal fun Project.npmVersionOrNull(
    target: String,
): String? =
    jspkg.findVersion(target)
        .getOrNull()
        ?.requiredVersion
