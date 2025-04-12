plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val coreDefinitionsDir = nodeModules.resolve("@tanstack/table-core/build/lib")
        val sourceDir = projectDir.resolve("src/commonMain/kotlin")

        delete(sourceDir)

        karakum.table.generateKotlinDeclarations(
            coreDefinitionsDir = coreDefinitionsDir,
            sourceDir = sourceDir,
        )
    }
}
