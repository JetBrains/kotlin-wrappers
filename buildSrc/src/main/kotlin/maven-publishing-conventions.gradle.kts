plugins {
    `maven-publish`
}

val publishVersion = publishVersion()

configure<PublishingExtension> {
    publications {
        when {
            isKotlinMultiplatformProject ->
                withType<MavenPublication>().configureEach {
                    val artifactName = when (name) {
                        "kotlinMultiplatform" -> ""
                        else -> "-$name"
                    }

                    groupId = project.group.toString()
                    artifactId = "${project.name}$artifactName"
                    version = publishVersion
                }

            isKotlinJsProject ->
                create<MavenPublication>("kotlin") {
                    from(components["kotlin"])
                    groupId = project.group.toString()
                    artifactId = project.name
                    version = publishVersion

                    artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))
                }
        }
    }

    repositories {
        maven {
            name = "kotlinSpace"
            url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
            credentials(org.gradle.api.artifacts.repositories.PasswordCredentials::class)
        }
    }
}
