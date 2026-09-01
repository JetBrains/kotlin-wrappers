plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val coreDefinitionsFile = nodeModules.resolve("@tanstack/virtual-core/dist/esm/index.d.ts")
        val sourceDir = webGeneratedDir

        delete(fileTree(sourceDir) {
            exclude("useVirtualizer.kt")
            exclude("useWindowVirtualizer.kt")
        })

        karakum.virtual.generateKotlinDeclarations(
            coreDefinitionsFile = coreDefinitionsFile,
            sourceDir = sourceDir.asFile,
        )
    }
}
