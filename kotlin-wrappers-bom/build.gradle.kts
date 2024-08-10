plugins {
    `java-platform`
    `publish-conventions`
}

dependencies {
    constraints {
        for (library in getLibraryProjects(rootProject)) {
            api(project(library.path))
        }
    }
}
