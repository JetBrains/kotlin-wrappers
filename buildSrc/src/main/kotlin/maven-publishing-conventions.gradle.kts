plugins {
    id("com.jfrog.bintray")
    id("bintray-metadata")
    `maven-publish`
}

if (isKotlinJsProject) {
    tasks.named<Zip>("JsJar") {
        val dependencyJson = temporaryDir.resolve("package.json")
        from(dependencyJson)

        doFirst {
            dependencyJson.writeText(generateDependencyJson())
        }
    }
}

val publishVersion = publishVersion()

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_KEY")
    publish = true
    pkg.run {
        repo = "kotlin-js-wrappers"
        name = project.name
        userOrg = "kotlin"
        setLicenses("Apache-2.0")
        vcsUrl = "https://github.com/JetBrains/kotlin-wrappers.git"
        version.name = publishVersion
    }

    when {
        isKotlinMultiplatformProject ->
            setPublications("kotlinMultiplatform", "metadata", "js", "jvm")

        isKotlinJsProject ->
            setPublications("kotlin")
    }
}

publishing.publications {
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

                artifact(tasks.getByName<Zip>("JsSourcesJar"))
            }
    }
}
