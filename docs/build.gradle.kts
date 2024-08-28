plugins {
    `subproject-conventions`
    id("dev.adamko.dokkatoo-html")
}

dokkatoo {
    moduleName = "Kotlin Wrappers API Reference"

    dokkatooPublications.html {
        includes.from("README.md")
    }

    pluginsConfiguration.html {
        homepageLink = "https://github.com/JetBrains/kotlin-wrappers/"
        templatesDir.convention(layout.projectDirectory.dir("templates"))
        customAssets.from(
            "assets/homepage.svg",
            "assets/logo-icon.svg",
            "assets/social-preview.png",
        )
    }
}

configurations.dokkatoo.configure {
    dependencies.addAllLater(
        subprojectService.libraries { path ->
            project.dependencies.create(project(path))
        }
    )
}
