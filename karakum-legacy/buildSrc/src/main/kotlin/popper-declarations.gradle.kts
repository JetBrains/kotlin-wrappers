plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsDir = nodeModules.resolve("@popperjs/core/lib")
        val sourceDir = commonGeneratedDir

        delete(sourceDir)

        karakum.popper.generateKotlinDeclarations(
            definitionsDir = definitionsDir,
            sourceDir = sourceDir.asFile,
        )
    }
}
