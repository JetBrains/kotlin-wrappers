plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val sourceDir = jsGeneratedDir

    sourceDirs.add(sourceDir)

    val definitionsDir = nodeModules.resolve("@actions")

    doLast {
        karakum.actions.generateKotlinDeclarations(
            definitionsDir = definitionsDir.get(),
            sourceDir = sourceDir.get().asFile,
        )
    }
}
