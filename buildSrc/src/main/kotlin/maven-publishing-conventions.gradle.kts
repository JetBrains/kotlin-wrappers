plugins {
    `maven-publish`
    signing
}

signing {
    sign(configurations.archives.get())
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

                    metadata()
                }

            isKotlinJsProject ->
                create<MavenPublication>("kotlin") {
                    from(components["kotlin"])

                    groupId = project.group.toString()
                    artifactId = project.name
                    version = publishVersion

                    artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))

                    metadata()
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

fun MavenPublication.metadata() {
    pom {
        name.set(project.name)
        description.set(project.description)
        url.set("https://github.com/JetBrains/kotlin-wrappers")

        licenses {
            license {
                name.set("Apache License, Version 2.0")
                url.set("https://github.com/JetBrains/kotlin-wrappers/blob/master/LICENSE")
            }
        }

        developers {
            developer {
                id.set("JetBrains")
                name.set("Leonid Khachaturov")
                email.set("Leonid.Khachaturov@jetbrains.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/JetBrains/kotlin-wrappers.git")
            developerConnection.set("scm:git:git@github.com:JetBrains/kotlin-wrappers.git")
            url.set("https://github.com/JetBrains/kotlin-wrappers")
        }
    }
}