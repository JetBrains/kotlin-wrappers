val AFFECTED_PROJECTS = listOf(
    "kotlin-electron",
    "kotlin-node",
    "kotlin-remix-run-router",
    "kotlin-react-router-dom",
    "kotlin-react-router",
)

val wasmPatch by tasks.registering {
    doLast {
        AFFECTED_PROJECTS.asSequence()
            .map { file("$it/src/jsMain/generated") }
            .flatMap { it.walk() }
            .filter { it.isFile && it.extension == "kt" }
            .forEach { file ->
                patchFile(file) { content ->
                    content.replaceFirst(
                        "Promise<Unit>",
                        "Promise<Void>",
                    )
                }
            }

    }
}

fun patchFile(
    file: File,
    transform: (String) -> String,
) {
    val content = file.readText()
    val newContent = transform(content)

    if (newContent != content) {
        file.writeText(newContent)
    }
}
