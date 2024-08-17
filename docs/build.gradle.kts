plugins {
    id("dev.adamko.dokkatoo-html")
    id("kotlin-wrappers-subprojects-service")
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

configurations.dokkatoo.configure {
    // lazily add all documentable subprojects
    dependencies.addAllLater(
        kotlinWrapperSubprojects.dokkaDependencies.map { subproject ->
            logger.info("[$path] adding ${subproject.size} subprojects to Dokkatoo: $subproject")
            subproject.sorted().map { coord ->
                project.dependencies.create(project(coord))
            }
        }
    )
}
