package karakum.virtual

import karakum.common.ConversionResult

private val EXCLUDED_PROPERTIES = setOf(
    "observeElementRect",
    "observeElementOffset",
    "scrollToFn",
)

private val WINDOW_EXCLUDED_PROPERTIES =
    EXCLUDED_PROPERTIES + "getScrollElement"

private const val DIRECT_DOM_UPDATES_MODE = "DirectDomUpdatesMode"

internal fun reactVirtualOptions(
    source: String,
    reactDefinitions: String,
): Sequence<ConversionResult> {
    // `ReactVirtualizerOptions<S, I> = VirtualizerOptions<S, I> & { ... }`
    val reactMembers = reactDefinitions
        .substringAfter("ReactVirtualizerOptions<")
        .substringAfter(" & {\n")
        .substringBefore("\n};")

    val modeUnion = reactMembers
        .substringAfter("directDomUpdatesMode?: ")
        .substringBefore(";")

    val reactBody = convertMembers("\n" + reactMembers.replace(modeUnion, DIRECT_DOM_UPDATES_MODE) + "\n}")
        .replace("var ", "val ")

    val optionsSource = source.replaceFirst("\n}", "\n$reactBody\n}")

    return sequenceOf(
        createVirtualOptions(
            source = optionsSource,
            declaration = "UseVirtualizerOptions<TScrollElement : EventTarget, TItemElement : Element>",
            excludedProperties = EXCLUDED_PROPERTIES,
        ),
        createVirtualOptions(
            source = optionsSource,
            declaration = "UseWindowVirtualizerOptions<TItemElement : Element>",
            excludedProperties = WINDOW_EXCLUDED_PROPERTIES,
            transform = { it.replace("TScrollElement", "Window") },
        ),
        convertUnion(DIRECT_DOM_UPDATES_MODE, modeUnion),
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
