package karakum.virtual

import karakum.common.ConversionResult

private val EXCLUDED_PROPERTIES = setOf(
    "observeElementRect",
    "observeElementOffset",
    "scrollToFn",
)

private val WINDOW_EXCLUDED_PROPERTIES =
    EXCLUDED_PROPERTIES + "getScrollElement"

internal fun reactVirtualOptions(
    source: String,
): Sequence<ConversionResult> {
    return sequenceOf(
        createVirtualOptions(
            source = source,
            declaration = "UseVirtualizerOptions<TScrollElement : EventTarget, TItemElement : Element>",
            excludedProperties = EXCLUDED_PROPERTIES,
        ),
        createVirtualOptions(
            source = source,
            declaration = "UseWindowVirtualizerOptions<TItemElement : Element>",
            excludedProperties = WINDOW_EXCLUDED_PROPERTIES,
            transform = { it.replace("TScrollElement", "Window") },
        ),
    )
}

private fun createVirtualOptions(
    source: String,
    declaration: String,
    excludedProperties: Set<String>,
    transform: (String) -> String = { it },
): ConversionResult {
    val body = source
        .substringAfter("{\n")
        .substringBefore("\n}")
        .splitToSequence("\n")
        .filter { it.substringBefore(": ").removePrefix("val ") !in excludedProperties }
        .map(transform)
        .joinToString("\n")

    return ConversionResult(
        name = declaration.substringBefore("<"),
        body = "import tanstack.virtual.core.*\n\n@JsPlainObject\nexternal interface $declaration {\n$body\n}",
    )
}
