val jsPlainObjectPatch by tasks.registering {
    doLast {
        sequenceOf(
            "electron/core/NetFetchInit.kt",
            "electron/core/SessionFetchInit.kt",
        ).forEach { path ->
            patchFile(path) { content ->
                if ("@js.objects.JsPlainObject" !in content) {
                    content
                        .replaceFirst(
                            "\nexternal interface ",
                            "\n@js.objects.JsPlainObject\nexternal interface ",
                        )
                        .replaceFirst(
                            "\nsealed external interface ",
                            "\n@js.objects.JsPlainObject\nsealed external interface ",
                        )
                } else content
            }
        }
    }
}

fun patchFile(
    path: String,
    transform: (String) -> String,
) {
    val file = project.file("src/jsMain/generated/$path")
    val content = file.readText()
    file.writeText(transform(content))
}
