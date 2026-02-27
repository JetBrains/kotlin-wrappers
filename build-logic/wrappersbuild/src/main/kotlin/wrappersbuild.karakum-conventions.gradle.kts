fun hasKarakumGenerator(): Boolean {
    val kotlinDir = layout.projectDirectory
        .dir("karakum/src/jsMain/kotlin")
        .asFile

    return kotlinDir.exists()
}

val karakumProject: IncludedBuild
    get() = gradle.includedBuild("${project.name}-karakum")

if (hasKarakumGenerator()) {
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
