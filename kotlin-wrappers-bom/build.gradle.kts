plugins {
    `java-platform`
    `publish-conventions`
    id("dev.adamko.dokkatoo-html")
}

dependencies {
    constraints {
        for (library in getLibraryProjects()) {
            api(project(library.path))
        }
    }
}

fun isLibraryProject(
    project: Project,
): Boolean =
    sequenceOf(
        KotlinLibraryConventionsPlugin::class,
        KotlinLegacyLibraryConventionsPlugin::class
    ).any(project.plugins::hasPlugin)

fun getLibraryProjects(): Sequence<Project> =
    rootProject.subprojects.asSequence()
        .filter(::isLibraryProject)
