plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val sourceDir = commonGeneratedDir

    sourceDirs = listOf(sourceDir)

    action = {
        karakum.cesium.generateKotlinDeclarations(
            engineDefinitionsFile = nodeModules.resolve("@cesium/engine/index.d.ts"),
            widgetsDefinitionsFile = nodeModules.resolve("@cesium/widgets/index.d.ts"),
            sourceDir = sourceDir.asFile,
        )
    }
}
