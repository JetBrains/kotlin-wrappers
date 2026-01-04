plugins {
    id("wrappersbuild.subproject-conventions")
    id("org.jetbrains.dokka")
}

dokka {
    moduleName = "Kotlin Wrappers API Reference"

    dokkaPublications.html {
        includes.from("README.md")
    }

    pluginsConfiguration.html {
        homepageLink = KotlinWrappers.PROJECT_URL
        templatesDir.convention(layout.projectDirectory.dir("templates"))
        customAssets.from(
            "assets/homepage.svg",
            "assets/logo-icon.svg",
            "assets/social-preview.png",
        )
    }
}

configurations.dokka.configure {
    dependencies.addAllLater(
        subprojectService.libraries { path ->
            project.dependencies.create(project(path))
        }
    )
}
