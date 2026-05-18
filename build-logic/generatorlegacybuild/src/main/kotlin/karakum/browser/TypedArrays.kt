package karakum.browser

// language=kotlin
private val TEMPLATE = """
open external class __NAME__<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<__NAME__<B>, __NAME__<ArrayBuffer>, B, __T__>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<__T__>)
    constructor(elements: ReadonlyArray<__T__>)

__MEMBERS__

    companion object : TypedArrayCompanion<__NAME__<ArrayBuffer>, __T__> __COMPANION_BODY__
}
""".trimIndent()

// language=kotlin
private val UINT8_MEMBERS = """
fun setFromBase64(
    string: String,
    options: FromBase64Options = definedExternally,
): SetFromResult

fun setFromHex(
    string: String,
): SetFromResult

fun toBase64(
    options: ToBase64Options = definedExternally,
): String

fun toHex(): String
""".trimIndent()

// language=kotlin
private val UINT8_COMPANION = """
{
    fun fromBase64(
        string: String,
        options: FromBase64Options = definedExternally,
    ): __NAME__<ArrayBuffer>

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
