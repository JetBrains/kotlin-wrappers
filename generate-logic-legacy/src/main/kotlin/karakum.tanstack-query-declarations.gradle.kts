plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val tanstackDir = nodeModules.resolve("@tanstack")

    val coreTypesDir = tanstackDir
        .resolve("query-core/build/modern")

    val reactTypesDir = tanstackDir
        .resolve("react-query/build/modern")

    val sourceDir = jsGeneratedDir

    sourceDirs = listOf(sourceDir)

    action = {
        karakum.query.generateKotlinDeclarations(
            coreTypesDir = coreTypesDir,
            reactTypesDir = reactTypesDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
