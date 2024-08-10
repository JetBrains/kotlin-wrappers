plugins {
    `maven-publish`
    signing
}

val publicationType = when {
    isKotlinMultiplatformProject -> PublicationType.LIBRARY
    project.name == "kotlin-wrappers-bom" -> PublicationType.BOM
    project.name == "kotlin-wrappers-catalog" -> PublicationType.VERSION_CATALOG

    else -> throw IllegalStateException("Unable to calculate publication type for project ${project.path}")
}

val publishVersion = publishVersion()
project.version = publishVersion

val javadocJar = if (publicationType == PublicationType.LIBRARY) {
    tasks.register("emptyJavadocJar", Jar::class) {
        archiveClassifier.set("javadoc")
    }
} else null

configure<PublishingExtension> {
    publications {
        when (publicationType) {
            PublicationType.LIBRARY ->
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

            else ->
                create<MavenPublication>("maven") {
                    when (publicationType) {
                        PublicationType.LIBRARY,
                        -> throw UnsupportedOperationException()

                        PublicationType.BOM,
                        -> from(components["javaPlatform"])

                        PublicationType.VERSION_CATALOG,
                        -> from(components["versionCatalog"])
                    }

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
