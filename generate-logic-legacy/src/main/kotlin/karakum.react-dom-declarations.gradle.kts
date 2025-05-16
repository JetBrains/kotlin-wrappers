plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val definitionsFile = nodeModules.resolve("@types/react/index.d.ts")
    val sourceDir = jsGeneratedDir

    sourceDirs.add(sourceDir)

    action = {
        karakum.react.generateKotlinDeclarations(
            definitionsFile = definitionsFile.get(),
            sourceDir = sourceDir.get().asFile,
        )
    }
}
