plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val sourceDir = webGeneratedDir

        delete(sourceDir)

        karakum.cesium.generateKotlinDeclarations(
            engineDefinitionsFile = nodeModules.resolve("@cesium/engine/index.d.ts"),
            widgetsDefinitionsFile = nodeModules.resolve("@cesium/widgets/index.d.ts"),
            sourceDir = sourceDir.asFile,
        )
    }
}
