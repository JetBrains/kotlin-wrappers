plugins {
    `maven-publish`
    signing
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
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers") {
            name = "kotlinSpace"
            credentials(org.gradle.api.artifacts.repositories.PasswordCredentials::class)
        }
        // Create a local repo for testing publishing.
        // Run `./gradlew publishToLocalBuildRepo` and check `$rootDir/build/local-repo`
        maven(rootDir.resolve("build/local-repo")) {
            name = "LocalBuildRepo"
        }
    }
}

pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
    publishing.publications.withType<MavenPublication>().configureEach {
        artifact(emptyJavadocJar)
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
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications)
}
