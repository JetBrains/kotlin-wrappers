plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val definitionsFile = nodeModules.resolve("csstype/index.d.ts")
    val commonSourceDir = commonGeneratedDir
    val jsSourceDir = jsGeneratedDir

    sourceDirs = listOf(
        commonSourceDir,
        jsSourceDir
    )

    action = {
        karakum.csstype.generateKotlinDeclarations(
            definitionsFile = definitionsFile,
            commonSourceDir = commonSourceDir.asFile,
            jsSourceDir = jsSourceDir.asFile,
        )
    }
}
