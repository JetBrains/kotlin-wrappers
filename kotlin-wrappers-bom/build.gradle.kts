plugins {
    `java-platform`
    `publish-conventions`
    id("dev.adamko.dokkatoo-html")
}

dependencies {
    constraints {
        for (library in getLibraryProjects(rootProject)) {
            api(project(library.path))
        }
    }
}
