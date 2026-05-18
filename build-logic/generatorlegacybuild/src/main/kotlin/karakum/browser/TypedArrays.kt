package karakum.browser

private fun mdn(
    path: String = "",
): String =
    // language=kotlin
    """
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/__NAME__$path)
 */
""".trimIndent()

// language=kotlin
private val TEMPLATE = """
${mdn()}
open external class __NAME__<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<__NAME__<B>, __NAME__<ArrayBuffer>, B, __T__>,
    Serializable {
    ${mdn("/__NAME__")}
    constructor()
    ${mdn("/__NAME__")}
    constructor(length: Int)
    ${mdn("/__NAME__")}
    constructor(elements: JsIterable<__T__>)
    ${mdn("/__NAME__")}
    constructor(elements: ReadonlyArray<__T__>)

__MEMBERS__

    companion object : TypedArrayCompanion<__NAME__<ArrayBuffer>, __T__> __COMPANION_BODY__
}
""".trimIndent()

// language=kotlin
private val UINT8_MEMBERS = """
${mdn("/setFromBase64")}
fun setFromBase64(
    string: String,
    options: FromBase64Options = definedExternally,
): SetFromResult

${mdn("/setFromHex")}
fun setFromHex(
    string: String,
): SetFromResult

${mdn("/toBase64")}
fun toBase64(
    options: ToBase64Options = definedExternally,
): String

${mdn("/toHex")}
fun toHex(): String
""".trimIndent()

// language=kotlin
private val UINT8_COMPANION = """
{
    ${mdn("/fromBase64")}
    fun fromBase64(
        string: String,
        options: FromBase64Options = definedExternally,
    ): __NAME__<ArrayBuffer>

    ${mdn("/fromHex")}
    fun fromHex(
        string: String,
    ): __NAME__<ArrayBuffer>
}
""".trimIndent()

internal fun typedArraysDeclarations(): Sequence<ConversionResult> =
    sequenceOf(
        "BigInt64Array" to "BigInt",
        "BigUint64Array" to "BigInt",
        "Float16Array" to "JsFloat16",
        "Float32Array" to "JsFloat",
        "Float64Array" to "JsDouble",
        "Int8Array" to "JsByte",
        "Int16Array" to "JsShort",
        "Int32Array" to "JsInt",
        "Uint8Array" to "JsUByte",
        "Uint8ClampedArray" to "JsUByte",
        "Uint16Array" to "JsUShort",
        "Uint32Array" to "JsUInt",
    ).map { (name, type) ->
        val body = TEMPLATE
            .replace(
                "\n__MEMBERS__\n",
                UINT8_MEMBERS.takeIf { name == "Uint8Array" } ?: "",
            )
            .replace(
                "__COMPANION_BODY__",
                UINT8_COMPANION.takeIf { name == "Uint8Array" } ?: "",
            )
            .replace("__NAME__", name)
            .replace("__T__", type)

        ConversionResult(
            name = name,
            body = body,
            pkg = "js.typedarrays",
        )
    }
