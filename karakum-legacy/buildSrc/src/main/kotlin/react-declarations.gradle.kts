plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsFile = nodeModules.resolve("@types/react/index.d.ts")
        val sourceDir = projectDir.resolve("src/jsMain/kotlin")

        delete(sourceDir)

        karakum.react.generateKotlinDeclarations(
            definitionsFile = definitionsFile,
            sourceDir = sourceDir,
        )
    }
}
