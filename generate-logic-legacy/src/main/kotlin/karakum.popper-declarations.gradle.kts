plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val definitionsDir = nodeModules.resolve("@popperjs/core/lib")
    val sourceDir = commonGeneratedDir

    sourceDirs = listOf(sourceDir)

    action = {
        karakum.popper.generateKotlinDeclarations(
            definitionsDir = definitionsDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
