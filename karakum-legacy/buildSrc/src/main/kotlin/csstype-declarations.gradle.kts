plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsFile = nodeModules.resolve("csstype/index.d.ts")
        val commonSourceDir = projectDir.resolve("src/commonMain/generated")
        val jsSourceDir = projectDir.resolve("src/jsMain/generated")

        delete(commonSourceDir)
        delete(jsSourceDir)

        karakum.csstype.generateKotlinDeclarations(
            definitionsFile = definitionsFile,
            commonSourceDir = commonSourceDir,
            jsSourceDir = jsSourceDir,
        )
    }
}
