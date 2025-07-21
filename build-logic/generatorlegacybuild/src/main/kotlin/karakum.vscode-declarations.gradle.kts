plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val sourceDir = commonGeneratedDir

        delete(sourceDir)

        /*
        val definitionFile = nodeModules.resolve("@types/vscode/index.d.ts")

        karakum.vscode.generateKotlinDeclarations(
            definitionFile = definitionFile,
            sourceDir = sourceDir,
        )
        */
    }
}
