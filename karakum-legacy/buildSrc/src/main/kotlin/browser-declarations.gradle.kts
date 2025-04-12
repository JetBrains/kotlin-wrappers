plugins {
    id("declarations")
}

tasks.named("generateDeclarations") {
    doLast {
        val sourceDir = projectDir.resolve("src/commonMain/generated")

        delete(sourceDir)

        val idlDir = nodeModules.resolve("@webref/idl")
        val eventsSourceFile = nodeModules.resolve("@webref/events/events.json")
        val definitionsDir = nodeModules.resolve("typescript/lib")
        val webDefinitionsDir = nodeModules.resolve("@types/web")
        val serviceworkerDefinitionsDir = nodeModules.resolve("@types/serviceworker")
        val audioWorkletDefinitionsDir = nodeModules.resolve("@types/audioworklet")

        karakum.browser.generateKotlinDeclarations(
            idlDir = idlDir,
            eventsSourceFile = eventsSourceFile,
            definitionsDir = definitionsDir,
            webDefinitionsFile = webDefinitionsDir.resolve("index.d.ts"),
            webIterableDefinitionsFile = webDefinitionsDir.resolve("iterable.d.ts"),
            serviceworkerDefinitionsFile = serviceworkerDefinitionsDir.resolve("index.d.ts"),
            serviceworkerIterableDefinitionsFile = serviceworkerDefinitionsDir.resolve("iterable.d.ts"),
            audioWorkletDefinitionsFile = audioWorkletDefinitionsDir.resolve("index.d.ts"),
            sourceDir = sourceDir,
        )
    }
}

val findMissedTypes by tasks.registering {
    doLast {
        val sourceDir = projectDir.resolve("src/jsMain/generated")

        val generatedInterfaces = fileTree(sourceDir)
            .mapNotNull { it.name.removeSuffix(".kt") }
            .flatMap { if (it.endsWith("Event")) sequenceOf(it, "${it}Init") else sequenceOf(it) }
            .toSet()

        val declaredInterfaces = sequenceOf(
            "@types/web",
            "@types/serviceworker",
            "@types/audioworklet",
        ).map { nodeModules.resolve("$it/index.d.ts") }
            .map { it.readText() }
            .plus(karakum.browser.WEB_WORKER_CONTENT)
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
