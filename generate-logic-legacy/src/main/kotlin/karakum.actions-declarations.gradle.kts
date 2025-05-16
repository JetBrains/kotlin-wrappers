plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val sourceDir = jsGeneratedDir

    sourceDirs.add(sourceDir)

    val definitionsDir = nodeModules.resolve("@actions")

    action = {
        karakum.actions.generateKotlinDeclarations(
            definitionsDir = definitionsDir.get(),
            sourceDir = sourceDir.get().asFile,
        )
    }
}
