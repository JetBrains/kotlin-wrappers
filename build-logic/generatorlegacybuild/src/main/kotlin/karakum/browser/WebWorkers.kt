package karakum.browser

private val WORKER_TYPES = setOf(
    "DedicatedWorkerGlobalScope",
    "SharedWorkerGlobalScope",

    "WorkerGlobalScope",
    "WorkerLocation",
    "WorkerNavigator",
)

private val SERVICE_WORKER_TYPES = setOf(
    "Client",
    "Clients",
    "ClientQueryOptions",

    "ServiceWorkerGlobalScope",

    "WindowClient",
)

private val PUSH_TYPES = setOf(
    "PushMessageData",
    "PushMessageDataInit",
)

private val RTC_TYPES = setOf(
    "RTCRtpScriptTransformer",
)

private val FILE_TYPES = setOf(
    "FileReaderSync",
)

private val FS_TYPES = setOf(
    // common
    "FileSystemFileHandle",

    "FileSystemReadWriteOptions",
    "FileSystemSyncAccessHandle",
)

private val WEB_WORKER_TYPES = RTC_TYPES
    .plus(FILE_TYPES)
    .plus(FS_TYPES)
    .plus("DedicatedWorkerGlobalScope")
    .plus("SharedWorkerGlobalScope")

private val PKG_MAP = mapOf(
    "PushMessageDataInit" to "web.push",
    "FrameType" to "web.serviceworker",
)

internal fun webWorkersDeclarations(
    source: String,
): Sequence<ConversionResult> {
    val content = webWorkerContent(source)
    return workersDeclarations(content, typeFilter = { it in WEB_WORKER_TYPES })
}

internal fun serviceWorkersDeclarations(
    source: String,
): Sequence<ConversionResult> {
    val content = serviceWorkerContent(source)
    val interfaces = workersDeclarations(content, typeFilter = { it !in WEB_WORKER_TYPES })

    val types = convertTypes(
        content = content,
        getPkg = PKG_MAP::get,
    ).filter { it.name in PKG_MAP.keys }

    return interfaces + types
}

private fun workersDeclarations(
    content: String,
    typeFilter: (type: String) -> Boolean,
): Sequence<ConversionResult> =
    Regex("""interface .+? \{[\s\S]+?\n}""")
        .findAll(content)
        .map { it.value }
        .mapNotNull { source ->
            val name = source
                .substringAfter(" ")
                .substringBefore(" ")

            if (!typeFilter(name))
                return@mapNotNull null

            val predefinedPkg = when (name) {
                in WORKER_TYPES -> "web.workers"
                in FILE_TYPES -> "web.file"
                in FS_TYPES -> "web.fs"

                in PUSH_TYPES -> "web.push"
                in RTC_TYPES -> "web.rtc"
                in SERVICE_WORKER_TYPES -> "web.serviceworker"

                else -> return@mapNotNull null
            }

            convertInterface(
                source = source,
                getStaticSource = { getStaticSource(it, content) },
                predefinedPkg = predefinedPkg,
            )?.withComment(fullSource = content, source = source)
        }

internal fun webWorkerContent(
    content: String,
): String =
    content
        .replace(", MessageEventTarget<DedicatedWorkerGlobalScope>", ", MessageEventTarget")
        .addStrictPostMessageSupport()

internal fun serviceWorkerContent(
    content: String,
): String =
    content
        .replace(", WindowOrWorkerGlobalScope", "")
        .replace(
            """ReadonlyArray<T["type"] extends "window" ? WindowClient : Client>""",
            "ReadonlyArray<Client /* | WindowClient */>"
        )
        // TEMP
        .replace(
            ", NavigatorConcurrentHardware, NavigatorID",
            ", NavigatorConcurrentHardware, NavigatorGPU, NavigatorID",
        )
        .splitUnion("string | string[]")
        .splitUnion("string | URL")
        .splitUnion("(string | URL)[]", "string[] | URL[]")
        .splitUnion("Response | PromiseLike<Response>")
        .addStrictPostMessageSupport()
