plugins {
    `maven-publish`
    signing
}

val publishVersion = publishVersion()
project.version = publishVersion

val javadocJar = if (isKotlinMultiplatformProject) {
    tasks.register("emptyJavadocJar", Jar::class) {
        archiveClassifier.set("javadoc")
    }
} else null

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

                    if (name == "jvm") {
                        artifact(javadocJar!!.get())
                    }

                    configurePom(project)
                }

            isKotlinJsProject ->
                create<MavenPublication>("kotlin") {
                    from(components["kotlin"])

                    groupId = project.group.toString()
                    artifactId = project.name
                    version = publishVersion

                    artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))

                    configurePom(project)
                }

            else ->
                create<MavenPublication>("bom") {
                    from(components["javaPlatform"])

                    groupId = project.group.toString()
                    artifactId = project.name
                    version = publishVersion

                    configurePom(project)
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

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications)
}
