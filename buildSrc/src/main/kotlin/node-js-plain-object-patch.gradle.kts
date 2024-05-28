private val FUNCTION_PROPERTIES = setOf(
    "construct",
    "read",
    "write",
    "writev",
    "final",
    "destroy",
    "transform",
    "flush",
)

val jsPlainObjectPatch by tasks.registering {
    doLast {
        sequenceOf(
            "node/childProcess/CommonExecOptions.kt",
            "node/childProcess/CommonOptions.kt",
            "node/childProcess/CommonSpawnOptions.kt",
            "node/childProcess/ExecBufferOptions.kt",
            "node/childProcess/ExecFileObjectEncodingOptions.kt",
            "node/childProcess/ExecFileOptions.kt",
            "node/childProcess/ExecFileOptionsWithBufferEncoding.kt",
            "node/childProcess/ExecFileOptionsWithOtherEncoding.kt",
            "node/childProcess/ExecFileOptionsWithStringEncoding.kt",
            "node/childProcess/ExecFileSyncOptions.kt",
            "node/childProcess/ExecFileSyncOptionsWithBufferEncoding.kt",
            "node/childProcess/ExecFileSyncOptionsWithStringEncoding.kt",
            "node/childProcess/ExecObjectEncodingOptions.kt",
            "node/childProcess/ExecOptions.kt",
            "node/childProcess/ExecOptionsWithBufferEncoding.kt",
            "node/childProcess/ExecOptionsWithStringEncoding.kt",
            "node/childProcess/ExecStringOptions.kt",
            "node/childProcess/ExecSyncOptions.kt",
            "node/childProcess/ExecSyncOptionsWithBufferEncoding.kt",
            "node/childProcess/ExecSyncOptionsWithStringEncoding.kt",
            "node/childProcess/ForkOptions.kt",
            "node/childProcess/MessagingOptions.kt",
            "node/childProcess/ProcessEnvOptions.kt",
            "node/childProcess/SpawnOptions.kt",
            "node/childProcess/SpawnOptionsWithStdioTuple.kt",
            "node/childProcess/SpawnOptionsWithoutStdio.kt",
            "node/childProcess/SpawnSyncOptions.kt",
            "node/childProcess/SpawnSyncOptionsWithBufferEncoding.kt",
            "node/childProcess/SpawnSyncOptionsWithStringEncoding.kt",
            "node/crypto/CipherCCMOptions.kt",
            "node/crypto/CipherGCMOptions.kt",
            "node/crypto/CipherOCBOptions.kt",
            "node/crypto/HashOptions.kt",
            "node/dgram/SocketOptions.kt",
            "node/fs/AppendFileOptionsAsync.kt",
            "node/fs/AppendFileOptionsAsync.kt",
            "node/fs/AppendFileOptionsAsync.kt",
            "node/fs/FileHandleAppendFileOptionsAsync.kt",
            "node/fs/FileHandleReadFileOptionsAsync.kt",
            "node/fs/FileHandleWriteFileOptionsAsync.kt",
            "node/fs/ObjectEncodingOptions.kt",
            "node/fs/ReadFileBufferOptions.kt",
            "node/fs/ReadFileBufferOptionsAsync.kt",
            "node/fs/ReadFileOptions.kt",
            "node/fs/ReadFileOptionsAsync.kt",
            "node/fs/ReadFileStringOptions.kt",
            "node/fs/ReadFileStringOptionsAsync.kt",
            "node/fs/ReadFileSyncOptions.kt",
            "node/fs/ReaddirOptions.kt",
            "node/fs/ReaddirOptionsAsync.kt",
            "node/fs/ReaddirSyncOptions.kt",
            "node/fs/ReaddirSyncWithFileTypesOptions.kt",
            "node/fs/ReaddirWithFileTypesOptions.kt",
            "node/fs/ReaddirWithFileTypesOptionsAsync.kt",
            "node/fs/WatchBufferOptions.kt",
            "node/fs/WatchBufferOptionsAsync.kt",
            "node/fs/WatchOptions.kt",
            "node/fs/WriteFileOptionsAsync.kt",
            "node/net/ListenOptions.kt",
            "node/stream/DuplexOptions.kt",
            "node/stream/FinishedOptions.kt",
            "node/stream/ReadableOptions.kt",
            "node/stream/StreamOptions.kt",
            "node/stream/TransformOptions.kt",
            "node/stream/WritableOptions.kt",
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

        sequenceOf(
            "node/stream/DuplexOptions.kt",
            "node/stream/ReadableOptions.kt",
            "node/stream/StreamOptions.kt",
            "node/stream/TransformOptions.kt",
            "node/stream/WritableOptions.kt",
        ).forEach { path ->
            patchFile(path) { content ->
                FUNCTION_PROPERTIES.fold(content) { acc, propertyName ->
                    acc.replace(
                        Regex("""fun $propertyName\((.+?)\): Unit""", RegexOption.DOT_MATCHES_ALL),
                        "var $propertyName: ($1) -> Unit",
                    )
                }
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
