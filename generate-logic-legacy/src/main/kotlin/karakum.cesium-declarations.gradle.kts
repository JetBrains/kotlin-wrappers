plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val sourceDir = commonGeneratedDir

    sourceDirs.add(sourceDir)

    action = {
        karakum.cesium.generateKotlinDeclarations(
            engineDefinitionsFile = nodeModules.resolve("@cesium/engine/index.d.ts").get(),
            widgetsDefinitionsFile = nodeModules.resolve("@cesium/widgets/index.d.ts").get(),
            sourceDir = sourceDir.get().asFile,
        )
    }
}
