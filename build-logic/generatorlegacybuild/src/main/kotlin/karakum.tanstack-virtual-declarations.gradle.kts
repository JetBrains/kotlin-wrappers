plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val coreDefinitionsFile = nodeModules.resolve("@tanstack/virtual-core/dist/esm/index.d.ts")
        val reactDefinitionsFile = nodeModules.resolve("@tanstack/react-virtual/dist/esm/index.d.ts")
        val sourceDir = webGeneratedDir

        delete(sourceDir)

        karakum.virtual.generateKotlinDeclarations(
            coreDefinitionsFile = coreDefinitionsFile,
            reactDefinitionsFile = reactDefinitionsFile,
            sourceDir = sourceDir.asFile,
        )
    }
}
