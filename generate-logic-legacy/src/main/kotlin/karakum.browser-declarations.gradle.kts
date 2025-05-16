plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val sourceDir = commonGeneratedDir

    sourceDirs.add(sourceDir)

    val idlDir = nodeModules.resolve("@webref/idl")
    val eventsSourceFile = nodeModules.resolve("@webref/events/events.json")
    val definitionsDir = nodeModules.resolve("typescript/lib")
    val webDefinitionsDir = nodeModules.resolve("@types/web")
    val webworkerDefinitionsDir = nodeModules.resolve("@types/webworker")
    val serviceworkerDefinitionsDir = nodeModules.resolve("@types/serviceworker")
    val audioWorkletDefinitionsDir = nodeModules.resolve("@types/audioworklet")

    action = {
        karakum.browser.generateKotlinDeclarations(
            idlDir = idlDir.get(),
            eventsSourceFile = eventsSourceFile.get(),
            definitionsDir = definitionsDir.get(),
            webDefinitionsFile = webDefinitionsDir.resolve("index.d.ts").get(),
            webIterableDefinitionsFile = webDefinitionsDir.resolve("iterable.d.ts").get(),
            webworkerDefinitionsFile = webworkerDefinitionsDir.resolve("index.d.ts").get(),
            webworkerIterableDefinitionsFile = webworkerDefinitionsDir.resolve("iterable.d.ts").get(),
            serviceworkerDefinitionsFile = serviceworkerDefinitionsDir.resolve("index.d.ts").get(),
            serviceworkerIterableDefinitionsFile = serviceworkerDefinitionsDir.resolve("iterable.d.ts").get(),
            audioWorkletDefinitionsFile = audioWorkletDefinitionsDir.resolve("index.d.ts").get(),
            sourceDir = sourceDir.get().asFile,
        )
    }
}

val findMissedTypes by tasks.registering(GenerateDeclarationsTask::class) {
    val sourceDir = projectDir.resolve("src/jsMain/generated")

    action = {
        val generatedInterfaces = fileTree(sourceDir)
            .mapNotNull { it.name.removeSuffix(".kt") }
            .flatMap { if (it.endsWith("Event")) sequenceOf(it, "${it}Init") else sequenceOf(it) }
            .toSet()

        val declaredInterfaces = sequenceOf(
            "@types/web",
            "@types/webworker",
            "@types/serviceworker",
            "@types/audioworklet",
        ).map { nodeModules.resolve("$it/index.d.ts").get() }
            .map { it.readText() }
            .flatMap { content ->
                content.splitToSequence("\ninterface ")
                    .flatMap { line ->
                        if (line.endsWith(" */") && "@deprecated" in line.substringAfterLast("/**")) {
                            sequenceOf(line, "--deprecated--")
                        } else {
                            sequenceOf(line)
                        }
                    }
                    .zipWithNext { note, line ->
                        if (note != "--deprecated--" && line != "--deprecated--") line else null
                    }
                    .filterNotNull()
            }
            .map { it.substringBefore(" ").substringBefore("<") }
            .filter { !it.endsWith("EventMap") }
            .filter { !it.endsWith("NameMap") }
            .toSet()

        val missedTypes = (declaredInterfaces - generatedInterfaces).sorted() - karakum.browser.KNOWN_MISSED_TYPES
        println("MISSED TYPES: ${missedTypes.size}")
        println(missedTypes.joinToString("\n"))
    }
}
