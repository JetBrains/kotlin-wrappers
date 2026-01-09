plugins {
    id("generatorbuild.karakum-conventions")
}

karakum {
    library(jspkg.tanstack.history)
}

tasks.generateKarakumExternals {
    doLast {
        addTempGenerationFixes()
    }
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
        "RouterHistory.kt",
        "SubscriberArgs.kt",
    ).forEach { jsoPath ->
        addFix(jsoPath) {
            it.replaceFirst(
                "\nexternal interface ",
                "\nimport js.objects.JsPlainObject\n\n@JsPlainObject" +
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
