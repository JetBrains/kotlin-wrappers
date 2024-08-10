import org.gradle.api.Project
import org.gradle.kotlin.dsl.hasPlugin

private fun isLibraryProject(
    project: Project,
): Boolean =
    sequenceOf(
        KotlinLibraryConventionsPlugin::class,
        KotlinLegacyLibraryConventionsPlugin::class
    ).any(project.plugins::hasPlugin)

fun getLibraryProjects(rootProject: Project): Sequence<Project> =
    rootProject.subprojects.asSequence()
        .filter(::isLibraryProject)
