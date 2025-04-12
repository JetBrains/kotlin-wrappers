plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsFile = nodeModules.resolve("csstype/index.d.ts")
        val commonSourceDir = projectDir.resolve("src/commonMain/kotlin")
        val jsSourceDir = projectDir.resolve("src/jsMain/kotlin")

        delete(commonSourceDir)
        delete(jsSourceDir)

        karakum.csstype.generateKotlinDeclarations(
            definitionsFile = definitionsFile,
            commonSourceDir = commonSourceDir,
            jsSourceDir = jsSourceDir,
        )
    }
}
