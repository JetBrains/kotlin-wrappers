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

    companion object : TypedArrayCompanion<__NAME__<ArrayBuffer>, __T__>
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
        "Uint8ClampedArray" to "JsUByte",
        "Uint16Array" to "JsUShort",
        "Uint32Array" to "JsUInt",
    ).map { (name, type) ->
        val body = TEMPLATE
            .replace("__NAME__", name)
            .replace("__T__", type)

        ConversionResult(
            name = name,
            body = body,
            pkg = "js.typedarrays",
        )
    }
