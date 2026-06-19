fun hasKarakumGenerator(): Boolean {
    val kotlinDir = layout.projectDirectory
        .dir("karakum/src/jsMain/kotlin")
        .asFile

    return kotlinDir.exists()
}

val karakumProject: IncludedBuild
    get() = gradle.includedBuild("${project.name}-karakum")

if (hasKarakumGenerator()) {
    val deleteKarakumPackageLock by tasks.register<Delete>("deleteKarakumPackageLock") {
        val lockFile = project.layout.projectDirectory
            .file("karakum/kotlin-js-store/package-lock.json")

        delete(lockFile)
    }

    tasks.register("cleanKarakum") {
        dependsOn(deleteKarakumPackageLock)
        dependsOn(karakumProject.task(":clean"))
    }

    tasks.register("buildKarakum") {
        dependsOn(karakumProject.task(":build"))
    }

    tasks.register("generateKarakumExternals") {
        dependsOn(karakumProject.task(":generateKarakumExternals"))
    }
}
