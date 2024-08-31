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
                    content
                        .let(::applyPromisePatch)
                        .let(::applyJsErrorPatch)
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

fun applyPromisePatch(
    content: String,
): String {
    if ("Promise<Unit>" in content) {
        return content
            .replaceFirst(
                "\nimport ",
                "\nimport js.core.Void\nimport "
            )
            .replace(
                "Promise<Unit>",
                "Promise<Void>",
            )
    }

    if ("suspend " in content && "): Unit =" in content) {
        var result = content
            .replaceFirst(
                "\nimport ",
                "\nimport js.core.Void\nimport "
            )

        if (result == content) {
            result = content
                .replaceFirst(
                    "\nsuspend ",
                    "\nimport js.core.Void\n\nsuspend "
                )
        }

        return result.replace(
            "): Unit =",
            "): Void =",
        )
    }

    return content
}

private val JS_ERROR = Regex("""(: Throwable,?)\n?\s+/\* JsError \*/""")

fun applyJsErrorPatch(
    content: String,
): String {
    if (JS_ERROR.containsMatchIn(content)) {
        val afterPackage = content
            .substringAfter("\npackage ")
            .substringAfter("\n")

        return content
            .replaceFirst(
                afterPackage,
                "import js.errors.JsError\n$afterPackage"
            )
            .replace(JS_ERROR) {
                it.groupValues[1].replace("Throwable", "JsError")
            }
    }

    return content
}
