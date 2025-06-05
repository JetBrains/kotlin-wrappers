package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsUByte
import js.iterable.JsIterable
import js.serialization.Serializable
import kotlin.js.definedExternally

open external class Uint8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint8Array<B>, Uint8Array<ArrayBuffer>, B, JsUByte>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsUByte>)
    constructor(elements: ReadonlyArray<JsUByte>)

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

    companion object : TypedArrayCompanion<Uint8Array<ArrayBuffer>, JsUByte> {
        fun fromBase64(
            string: String,
            options: FromBase64Options = definedExternally,
        ): Uint8Array<ArrayBuffer>

        fun fromHex(
            string: String,
        ): Uint8Array<ArrayBuffer>
    }
}
