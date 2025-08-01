plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val coreDefinitionsDir = nodeModules.resolve("@tanstack/table-core/build/lib")
        val sourceDir = webGeneratedDir

        delete(sourceDir)

        karakum.table.generateKotlinDeclarations(
            coreDefinitionsDir = coreDefinitionsDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
