plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsDir = nodeModules.resolve("@popperjs/core/lib")
        val sourceDir = webGeneratedDir

        delete(sourceDir)

        karakum.popper.generateKotlinDeclarations(
            definitionsDir = definitionsDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
