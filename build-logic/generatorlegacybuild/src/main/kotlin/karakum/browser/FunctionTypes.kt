package karakum.browser

private val STREAMS_FUNCTION_TYPES = setOf(
    "QueuingStrategySize",
    "ReadableStreamErrorCallback",
    "TransformerFlushCallback",
    "TransformerStartCallback",
    "TransformerTransformCallback",
    "UnderlyingSinkAbortCallback",
    "UnderlyingSinkCloseCallback",
    "UnderlyingSinkStartCallback",
    "UnderlyingSinkWriteCallback",
    "UnderlyingSourceCancelCallback",
    "UnderlyingSourcePullCallback",
    "UnderlyingSourceStartCallback",
)

internal fun browserFunctionTypes(
    content: String,
): Sequence<ConversionResult> =
    Regex("""interface .+? \{\n    \([\s\S]+?\}""")
        .findAll(content)
        .map { it.value }
        .mapNotNull { convertFunctionType(it) }

private fun convertFunctionType(
    source: String,
): ConversionResult? {
    val declaration = source
        .substringAfter(" ")
        .substringBefore(" {")
        .replace(" = any>", ">")

    val name = declaration.substringBefore("<")

    val pkg = when {
        name == "FrameRequestCallback" -> "web.animations"

        name == "VoidFunction" -> "web.function"
        name == "IdleRequestCallback" -> "web.scheduling"
        name == "SchedulerPostTaskCallback" -> "web.scheduling"

        name in STREAMS_FUNCTION_TYPES -> "web.streams"

        name == "PerformanceObserverCallback" -> "web.performance"

        name == "FunctionStringCallback" -> "web.data"

        name == "AudioDataOutputCallback" -> "web.codecs"
        name == "EncodedAudioChunkOutputCallback" -> "web.codecs"
        name == "EncodedVideoChunkOutputCallback" -> "web.codecs"
        name == "VideoFrameOutputCallback" -> "web.codecs"
        name == "WebCodecsErrorCallback" -> "web.codecs"

        name.startsWith("IntersectionObserver") -> "web.intersection"
        name == "MutationCallback" -> "web.mutation"
        name.startsWith("ResizeObserver") -> "web.resize"

        name == "ViewTransitionUpdateCallback" -> "web.viewtransition"

        name == "BlobCallback" -> "web.html"
        name == "VideoFrameRequestCallback" -> "web.html"

        name == "MediaSessionActionHandler" -> "web.mediasession"

        name == "RemotePlaybackAvailabilityCallback" -> "web.remoteplayback"

        name == "ErrorCallback" -> "web.fs"
        name == "FileCallback" -> "web.fs"
        name.startsWith("FileSystem") -> "web.fs"

        name.startsWith("Position") -> "web.geolocation"

        name == "LockGrantedCallback" -> "web.locks"

        name == "NotificationPermissionCallback" -> "web.notifications"

        name == "ReportingObserverCallback" -> "web.reporting"

        name.startsWith("RTC") -> "web.rtc"

        else -> return null
    }

    var bodySource = source.substringAfter("\n    ")
        .substringBefore(";")
        .replace(": boolean", ": Boolean")
        .replace(": string", ": String")
        .replace("?: JsError | undefined)", ": JsError?)")
        .replace("?: JsError)", ": JsError?)")
        .replace(": FileSystemEntry[]", ": ReadonlyArray<FileSystemEntry>")
        .replace(": IntersectionObserverEntry[]", ": ReadonlyArray<IntersectionObserverEntry>")
        .replace(": MutationRecord[]", ": ReadonlyArray<MutationRecord>")
        .replace(": ResizeObserverEntry[]", ": ReadonlyArray<ResizeObserverEntry>")
        .replace(": Report[]", ": ReadonlyArray<Report>")
        .replace("?: EncodedAudioChunkMetadata", ": EncodedAudioChunkMetadata?")
        .replace("?: EncodedVideoChunkMetadata", ": EncodedVideoChunkMetadata?")
        .replace("): void | PromiseLike<void>", ") -> PromiseLike<Void>?")
        // QueuingStrategySize
        .replace("): number", ") -> Int")
        .replace("): void", ") -> Unit")
        .replace("): any", ") -> Unit")
        .replace("): T", ") -> T")
        .replace("?: any", ": JsAny?")
        .replace(" | null", "?")

    if ("()" !in bodySource)
        bodySource = bodySource
            .replaceFirst("(", "(\n")
            .replace(", ", ",\n")

    val body = "typealias $declaration = $bodySource"

    return ConversionResult(
        name = name,
        body = body,
        pkg = pkg
    )
}
