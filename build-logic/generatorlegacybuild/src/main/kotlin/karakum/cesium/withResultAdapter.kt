package karakum.cesium

import karakum.common.TYPED_ARRAYS

private val TYPED_ARRAY_FUNCTION_REGEX = Regex(
    """^fun ([a-zA-Z\d]+)(\(.*\)): ([a-zA-Z\d]+)<\*>$""",
    RegexOption.DOT_MATCHES_ALL,
)

internal fun withResultAdapter(
    source: String,
): Sequence<String> {
    val match = TYPED_ARRAY_FUNCTION_REGEX.find(source)
        ?: return sequenceOf(source)

    val (name, parameters, typedArray) = match.destructured
    if (typedArray !in TYPED_ARRAYS)
        return sequenceOf(source)

    val result = Regex("""(,?\s*) result: $typedArray<\*>(\?(?: = definedExternally)?)?(?=\s*\)$)""")
        .find(parameters)
        ?: return sequenceOf("fun $name$parameters: $typedArray<ArrayBuffer>")

    val (delimiter, optionality) = result.destructured

    val withResult = parameters.replaceRange(result.range, "$delimiter result: $typedArray<B>")
    val withoutResult = parameters.removeRange(result.range)
        .let { if (",\n" in it) it else it.replace("\n", "") }

    return sequenceOf(
        "fun $name$withoutResult: $typedArray<ArrayBuffer>".takeIf { optionality.isNotEmpty() },
        "fun <B : ArrayBufferLike>$name$withResult: $typedArray<B>",
    ).filterNotNull()
}
