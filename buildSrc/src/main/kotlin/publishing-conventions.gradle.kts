import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact

plugins {
    id("com.jfrog.bintray")
    `maven-publish`
}

val publishVersion = publishVersion()

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_KEY")
    publish = true
    with(pkg) {
        repo = "kotlin-js-wrappers"
        name = project.name
        userOrg = "kotlin"
        setLicenses("Apache-2.0")
        vcsUrl = "https://github.com/JetBrains/kotlin-wrappers.git"
        with(version) {
            name = publishVersion
        }
    }

    when {
        isKotlinMultiplatformProject ->
            setPublications("kotlinMultiplatform", "metadata", "js", "jvm")

        "kotlin-css" !in project.name ->
            setPublications("Publication")
    }
}

// to publish gradle metadata
tasks.named("bintrayUpload") {
    doFirst {
        publishing.publications
            .withType<MavenPublication>()
            .forEach { publication ->
                val moduleFile = buildDir.resolve("publications/${publication.name}/module.json")
                if (moduleFile.exists()) {
                    publication.artifact(MetadataModuleArtifact(moduleFile))
                }
            }
    }
}

publishing {
    publications {
        if (isKotlinMultiplatformProject) {
            withType<MavenPublication>().all {
                val artifactName = when (name) {
                    "kotlinMultiplatform" -> ""
                    else -> "-$name"
                }

                groupId = project.group.toString()
                artifactId = "${project.name}$artifactName"
                version = publishVersion
            }
        } else {
            create<MavenPublication>("Publication") {
                from(components["kotlin"])
                groupId = project.group.toString()
                artifactId = project.name
                version = publishVersion

                when {
                    isKotlinJsProject ->
                        artifact(tasks.getByName<Zip>("JsSourcesJar"))

                    isKotlinJvmProject ->
                        artifact(tasks.getByName<Zip>("kotlinSourcesJar"))
                }
            }
        }
    }
}

class MetadataModuleArtifact(moduleFile: File) : FileBasedMavenArtifact(moduleFile) {
    override fun getDefaultExtension() = "module"
}
