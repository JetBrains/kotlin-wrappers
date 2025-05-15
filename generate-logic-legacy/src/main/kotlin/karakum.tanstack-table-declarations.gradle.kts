plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val coreDefinitionsDir = nodeModules.resolve("@tanstack/table-core/build/lib")
    val sourceDir = commonGeneratedDir

    sourceDirs.add(sourceDir)

    action = {
        karakum.table.generateKotlinDeclarations(
            coreDefinitionsDir = coreDefinitionsDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
