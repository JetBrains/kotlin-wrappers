plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val coreDefinitionsFile = nodeModules.resolve("@tanstack/virtual-core/dist/esm/index.d.ts")
        val sourceDir = projectDir.resolve("src/jsMain/kotlin")

        delete(sourceDir)

        karakum.virtual.generateKotlinDeclarations(
            coreDefinitionsFile = coreDefinitionsFile,
            sourceDir = sourceDir,
        )
    }
}
