fun hasKarakumGenerator(): Boolean {
    val kotlinDir = layout.projectDirectory
        .dir("karakum/src/jsMain/kotlin")
        .asFile

    return kotlinDir.exists()
}

afterEvaluate {
    if (hasKarakumGenerator()) {
        val karakumProject = gradle.includedBuild("${project.name}-karakum")

        val deleteKarakumPackageLock by tasks.registering(Delete::class) {
            val lockFile = project.layout.projectDirectory
                .file("karakum/kotlin-js-store/package-lock.json")

            delete(lockFile)
        }

        val cleanKarakum by tasks.registering {
            dependsOn(deleteKarakumPackageLock)
            dependsOn(karakumProject.task(":clean"))
        }

        val buildKarakum by tasks.registering {
            dependsOn(karakumProject.task(":build"))
        }
    }
}
