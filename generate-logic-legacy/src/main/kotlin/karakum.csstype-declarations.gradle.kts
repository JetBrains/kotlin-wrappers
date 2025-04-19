plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsFile = nodeModules.resolve("csstype/index.d.ts")
        val commonSourceDir = commonGeneratedDir
        val jsSourceDir = jsGeneratedDir

        delete(commonSourceDir)
        delete(jsSourceDir)

        karakum.csstype.generateKotlinDeclarations(
            definitionsFile = definitionsFile,
            commonSourceDir = commonSourceDir.asFile,
            jsSourceDir = jsSourceDir.asFile,
        )
    }
}
