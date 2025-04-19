plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val sourceDir = jsGeneratedDir

        delete(sourceDir)

        val definitionsDir = nodeModules.resolve("@actions")

        karakum.actions.generateKotlinDeclarations(
            definitionsDir = definitionsDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
