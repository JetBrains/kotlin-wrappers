plugins {
    `maven-publish`
    signing

    id("wrappersbuild.subproject-conventions")
}

project.version = publishVersion()

val emptyJavadocJar by tasks.registering(EmptyJavadocJar::class)

publishing {
    publications {
        withType<MavenPublication>().configureEach {
            configurePom(project)
        }
    }

    repositories {
        maven("https://packages.jetbrains.team/maven/p/kt/kotlin-js-wrappers") {
            name = "kotlinSpace"
            credentials {
                username = project.findProperty("libs.repo.user") as String?
                password = project.findProperty("libs.repo.password") as String?
            }
        }
        // Create a local repo for testing publishing.
        // Run `./gradlew publishAllPublicationsToLocalBuildRepoRepository` and check `$rootDir/build/local-repo`
        maven(rootDir.resolve("build/local-repo")) {
            name = "LocalBuildRepo"
        }
    }
}

pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
    publishing.publications.withType<MavenPublication>().configureEach {
        if (name == "jvm") {
            artifact(emptyJavadocJar)
        }
    }
}

pluginManager.withPlugin("java-platform") {
    publishing.publications.register<MavenPublication>("maven") {
        from(components["javaPlatform"])
    }
}

pluginManager.withPlugin("version-catalog") {
    publishing.publications.register<MavenPublication>("maven") {
        from(components["versionCatalog"])
    }
}

signing {
    val keyId = project.findProperty("libs.sign.key.id") as? String?
    val signingKey = project.findProperty("libs.sign.key.private") as? String?
    val signingKeyPassphrase = project.findProperty("libs.sign.passphrase") as? String?

    useInMemoryPgpKeys(keyId, signingKey, signingKeyPassphrase)

    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications)
}
