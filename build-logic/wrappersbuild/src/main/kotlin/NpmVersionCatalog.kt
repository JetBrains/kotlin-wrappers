import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.getByType
import kotlin.jvm.optionals.getOrNull

private val ExtensionAware.jspkg: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>()
        .named("jspkg")

internal val ExtensionAware.allNpmDependencies: List<String>
    get() = jspkg.run {
        libraryAliases.map { findLibrary(it).get().get().name }
    }

internal fun ExtensionAware.npmVersion(
    target: String,
): String =
    jspkg.findVersion(target)
        .get()
        .requiredVersion

internal fun ExtensionAware.npmVersionOrNull(
    target: String,
): String? =
    jspkg.findVersion(target)
        .getOrNull()
        ?.requiredVersion
