plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val definitionsFile = nodeModules.resolve("@types/react/index.d.ts")
    val sourceDir = jsGeneratedDir

    sourceDirs = listOf(sourceDir)

    action = {
        karakum.react.generateKotlinDeclarations(
            definitionsFile = definitionsFile,
            sourceDir = sourceDir.asFile,
        )
    }
}
