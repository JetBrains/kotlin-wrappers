plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val coreDefinitionsFile = nodeModules.resolve("@tanstack/virtual-core/dist/esm/index.d.ts")
    val sourceDir = jsGeneratedDir

    sourceDirs.add(sourceDir)

    doLast {
        karakum.virtual.generateKotlinDeclarations(
            coreDefinitionsFile = coreDefinitionsFile.get(),
            sourceDir = sourceDir.get().asFile,
        )
    }
}
