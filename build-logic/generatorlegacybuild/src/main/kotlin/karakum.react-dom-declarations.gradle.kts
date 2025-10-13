plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val definitionsFile = nodeModules.resolve("@types/react/index.d.ts")
        val eventsSourceFile = nodeModules.resolve("@webref/events/events.json")
        val sourceDir = jsGeneratedDir

        delete(sourceDir)

        karakum.react.generateKotlinDeclarations(
            definitionsFile = definitionsFile,
            eventsSourceFile = eventsSourceFile,
            sourceDir = sourceDir.asFile,
        )
    }
}
