plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val sourceDir = webGeneratedDir

        delete(sourceDir)

        val definitionFile = nodeModules.resolve("@types/vscode/index.d.ts")

        karakum.vscode.generateKotlinDeclarations(
            definitionsFile = definitionFile,
            sourceDir = sourceDir.asFile,
        )
    }
}
