plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsDir = nodeModules.resolve("@popperjs/core/lib")
        val sourceDir = projectDir.resolve("src/commonMain/kotlin")

        delete(sourceDir)

        karakum.popper.generateKotlinDeclarations(
            definitionsDir = definitionsDir,
            sourceDir = sourceDir,
        )
    }
}
