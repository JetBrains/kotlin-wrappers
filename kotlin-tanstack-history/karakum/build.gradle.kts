plugins {
    id("generatorbuild.karakum-conventions")
}

karakum {
    library(jspkg.tanstack.history)
}

tasks.kotlinNpmInstall {
    doLast {
        addTempNpmFixes()
    }
}

tasks.generateKarakumExternals {
    doLast {
        addTempGenerationFixes()
    }
}

fun addTempNpmFixes() {
    val file = file("build/js/node_modules/@tanstack/history/dist/esm/index.d.ts")
    var content = file.readText()

    if (": Int" in content)
        return

    content = content
        .replace(": number", ": Int")
        .replace("=> number", "=> Int")

    val oldRouterHistory = content
        .substringAfter("export interface RouterHistory {\n")
        .substringBefore("\n}\n")

    val newRouterHistory = oldRouterHistory
        .splitToSequence("\n")
        .joinToString("\n") {
            if (": (" in it) {
                val result = it.replaceFirst(": (", "(")
                if (") => () => void;" in result) {
                    result.replace(") => () => void;", "): () => void;")
                } else {
                    result.replace(") => ", "): ")
                }
            } else {
                "readonly $it"
            }
        }

    content = content
        .replace(oldRouterHistory, newRouterHistory)

    file.writeText(content)
}

fun addTempGenerationFixes() {
    sequenceOf(
        "BlockerFnArgs.kt",
        "CreateBrowserHistoryOpts.kt",
        "CreateHashHistoryOpts.kt",
        "CreateHistoryOpts.kt",
        "CreateMemoryHistoryOpts.kt",
        "HistoryLocation.kt",
        "NavigateOptions.kt",
        "NavigationBlocker.kt",
        "ParsedHistoryState.kt",
        "ParsedPath.kt",
        "SubscriberArgs.kt",
    ).forEach { jsoPath ->
        addFix(jsoPath) {
            it.replaceFirst(
                "\nexternal interface ",
                "\nimport kotlinx.js.JsPlainObject\n\n@JsPlainObject" +
                        "\nexternal interface ",
            )
        }
    }


}

fun addFix(
    path: String,
    transform: (String) -> String,
) {
    val file = file("../src/webMain/generated/tanstack/history/$path")
    val oldContent = file.readText()
    val newContent = transform(oldContent)
    check(oldContent != newContent) {
        "Transformation fo path `$path` changed nothing!"
    }
    file.writeText(newContent)
}
