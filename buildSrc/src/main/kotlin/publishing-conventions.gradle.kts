import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact

plugins {
    id("com.jfrog.bintray")
    `maven-publish`
}

afterEvaluate {
    artifacts {
        when {
            isKotlinJsProject ->
                archives(tasks.named("JsSourcesJar"))

            isKotlinMultiplatformProject -> {
                archives(tasks.named("jvmSourcesJar"))
                archives(tasks.named("jsSourcesJar"))
            }

            else ->
                archives(tasks.named("kotlinSourcesJar"))
        }
    }
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
    if (isKotlinMultiplatformProject) {
        setPublications("kotlinMultiplatform", "metadata", "js", "jvm")
    } else if (!project.name.contains("kotlin-css")) {
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

                groupId = "org.jetbrains"
                artifactId = "${project.name}$artifactName"
                version = publishVersion
            }
        } else {
            create<MavenPublication>("Publication") {
                from(components["kotlin"])
                groupId = "org.jetbrains"
                artifactId = project.name
                version = publishVersion

                if (isKotlinJsProject) {
                    artifact(tasks.getByName<Zip>("JsSourcesJar"))
                } else {
                    artifact(tasks.getByName<Zip>("kotlinSourcesJar"))
                }
            }
        }
    }
}

class MetadataModuleArtifact(moduleFile: File) : FileBasedMavenArtifact(moduleFile) {
    override fun getDefaultExtension() = "module"
}
