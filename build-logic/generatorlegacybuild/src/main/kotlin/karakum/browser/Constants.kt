package karakum.browser

private val PKG_MAP = mapOf(
    "console" to "web.console",
    "performance" to "web.performance",

    "crossOriginIsolated" to "web.globals",
    "isSecureContext" to "web.globals",
    "origin" to "web.globals",

    "window" to "web.window",
    "visualViewport" to "web.viewport",

    "document" to "web.dom",

    "customElements" to "web.components",

    "caches" to "web.cache",
    "devicePixelRatio" to "web.device",
    "history" to "web.history",
    "location" to "web.location",
    "navigator" to "web.navigator",
    "scheduler" to "web.scheduling",
    "screen" to "web.screen",
    "speechSynthesis" to "web.speech",
    "localStorage" to "web.storage",
    "sessionStorage" to "web.storage",
    "crypto" to "web.crypto",

    "indexedDB" to "web.idb",
)

internal fun browserConstants(
    content: String,
): Sequence<ConversionResult> =
    content
        .splitToSequence("\ndeclare var ")
        .drop(1)
        .map { it.substringBefore(";\n") }
        .mapNotNull { source ->
            convertConstant(source)
                ?.withComment(
                    fullSource = content,
                    source = "declare var $source;\n"
                )
        }

private fun convertConstant(
    source: String,
): ConversionResult? {
    val (name, typeSource) = source
        .substringBefore(" & ")
        .split(": ")

    val pkg = PKG_MAP[name]
        ?: return null

    val type = when (typeSource) {
        "boolean" -> "Boolean"
        "string" -> "String"
        "number" -> "Double"
        "VisualViewport | null" -> typeSource.substringBefore(" ")
        else -> typeSource
    }

    return ConversionResult(
        name = "$name.val",
        body = "external val $name: $type",
        pkg = pkg
    )
}
