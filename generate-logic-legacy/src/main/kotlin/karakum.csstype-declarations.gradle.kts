plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val definitionsFile = nodeModules.resolve("csstype/index.d.ts")
    val commonSourceDir = commonGeneratedDir
    val jsSourceDir = jsGeneratedDir

    sourceDirs.add(commonSourceDir)
    sourceDirs.add(jsSourceDir)

    doLast {
        karakum.csstype.generateKotlinDeclarations(
            definitionsFile = definitionsFile.get(),
            commonSourceDir = commonSourceDir.get().asFile,
            jsSourceDir = jsSourceDir.get().asFile,
        )
    }
}
