plugins {
    id("declarations")
}

tasks.named<GenerateDeclarationsTask>("generateDeclarations") {
    val sourceDir = commonGeneratedDir

    sourceDirs.add(sourceDir)

    action = {
        val idlDir = nodeModules.resolve("@webref/idl")
        val eventsSourceFile = nodeModules.resolve("@webref/events/events.json")
        val definitionsDir = nodeModules.resolve("typescript/lib")
        val webDefinitionsDir = nodeModules.resolve("@types/web")
        val webworkerDefinitionsDir = nodeModules.resolve("@types/webworker")
        val serviceworkerDefinitionsDir = nodeModules.resolve("@types/serviceworker")
        val audioWorkletDefinitionsDir = nodeModules.resolve("@types/audioworklet")

        karakum.browser.generateKotlinDeclarations(
            idlDir = idlDir,
            eventsSourceFile = eventsSourceFile,
            definitionsDir = definitionsDir,
            webDefinitionsFile = webDefinitionsDir.resolve("index.d.ts"),
            webIterableDefinitionsFile = webDefinitionsDir.resolve("iterable.d.ts"),
            webworkerDefinitionsFile = webworkerDefinitionsDir.resolve("index.d.ts"),
            webworkerIterableDefinitionsFile = webworkerDefinitionsDir.resolve("iterable.d.ts"),
            serviceworkerDefinitionsFile = serviceworkerDefinitionsDir.resolve("index.d.ts"),
            serviceworkerIterableDefinitionsFile = serviceworkerDefinitionsDir.resolve("iterable.d.ts"),
            audioWorkletDefinitionsFile = audioWorkletDefinitionsDir.resolve("index.d.ts"),
            sourceDir = sourceDir.asFile,
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
        ).map { nodeModules.resolve("$it/index.d.ts") }
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
