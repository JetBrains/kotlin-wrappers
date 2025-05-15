plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val sourceDir = jsGeneratedDir

    sourceDirs = listOf(jsGeneratedDir)

    val definitionsDir = nodeModules.resolve("@actions")

    action = {
        karakum.actions.generateKotlinDeclarations(
            definitionsDir = definitionsDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
