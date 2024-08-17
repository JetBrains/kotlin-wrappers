plugins {
    id("dev.adamko.dokkatoo-html")
}

dokkatoo {
    moduleName = "Kotlin Wrappers API Reference"

    dokkatooPublications.html {
        includes.from("README.md")
    }

    pluginsConfiguration.html {
        homepageLink = "https://github.com/JetBrains/kotlin-wrappers/"
        customAssets.from(
            "assets/homepage.svg",
            "assets/logo-icon.svg",
        )
    }
}

dependencies {
    constraints {
        for (library in getLibraryProjects(rootProject)) {
            dokkatoo(project(library.path))
        }
    }
}
