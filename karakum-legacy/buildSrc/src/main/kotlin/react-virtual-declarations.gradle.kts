plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val coreDefinitionsFile = nodeModules.resolve("@tanstack/virtual-core/dist/esm/index.d.ts")
        val sourceDir = jsGeneratedDir

        delete(sourceDir)

        karakum.virtual.generateKotlinDeclarations(
            coreDefinitionsFile = coreDefinitionsFile,
            sourceDir = sourceDir.asFile,
        )
    }
}
