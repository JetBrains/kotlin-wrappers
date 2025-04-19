plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val tanstackDir = nodeModules.resolve("@tanstack")

        val coreTypesDir = tanstackDir
            .resolve("query-core/build/modern")

        val reactTypesDir = tanstackDir
            .resolve("react-query/build/modern")

        val sourceDir = jsGeneratedDir

        delete(sourceDir)

        karakum.query.generateKotlinDeclarations(
            coreTypesDir = coreTypesDir,
            reactTypesDir = reactTypesDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
