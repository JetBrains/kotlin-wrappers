plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val definitionsDir = nodeModules.resolve("@popperjs/core/lib")
    val sourceDir = commonGeneratedDir

    sourceDirs.add(sourceDir)

    action = {
        karakum.popper.generateKotlinDeclarations(
            definitionsDir = definitionsDir.get(),
            sourceDir = sourceDir.get().asFile,
        )
    }
}
