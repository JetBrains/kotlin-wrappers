plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsFile = nodeModules.resolve("csstype/index.d.ts")

        delete(webGeneratedDir)

        karakum.csstype.generateKotlinDeclarations(
            definitionsFile = definitionsFile,
            sourceDir = webGeneratedDir.asFile,
        )
    }
}
