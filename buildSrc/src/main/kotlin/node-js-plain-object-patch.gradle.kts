val jsPlainObjectPatch by tasks.registering {
    doLast {
        sequenceOf(
            "node/childProcess/CommonSpawnOptions.kt",
            "node/childProcess/ExecFileOptions.kt",
            "node/childProcess/ForkOptions.kt",
            "node/childProcess/MessagingOptions.kt",
            "node/dgram/SocketOptions.kt",
            "node/fs/FileHandleWriteFileOptionsAsync.kt",
            "node/fs/ReadFileBufferOptions.kt",
            "node/fs/ReadFileBufferOptionsAsync.kt",
            "node/fs/ReadFileOptions.kt",
            "node/fs/ReadFileOptionsAsync.kt",
            "node/fs/ReadFileStringOptions.kt",
            "node/fs/ReadFileStringOptionsAsync.kt",
            "node/fs/WatchOptions.kt",
            "node/fs/WriteFileOptionsAsync.kt",
            "node/net/ListenOptions.kt",
            "node/stream/FinishedOptions.kt",
            "node/stream/StreamOptions.kt",
        ).forEach { path ->
            patchFile(path) { content ->
                content.replaceFirst(
                    "\nsealed external interface ",
                    "\n@js.objects.JsPlainObject\nsealed external interface ",
                )
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
