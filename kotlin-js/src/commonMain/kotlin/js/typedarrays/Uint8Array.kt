package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsUByte
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class Uint8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<Uint8Array<B>, Uint8Array<ArrayBuffer>, B, JsUByte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsUByte>)
    constructor(elements: ReadonlyArray<JsUByte>)

    fun setFromBase64(
        string: String,
        options: FromBase64Options = definedExternally_,
    ): SetFromResult

    fun setFromHex(
        string: String,
    ): SetFromResult

    fun toBase64(
        options: ToBase64Options = definedExternally_,
    ): String

    fun toHex(): String

    companion object : TypedArrayCompanion<Uint8Array<ArrayBuffer>, JsUByte> {
        fun fromBase64(
            string: String,
            options: FromBase64Options = definedExternally_,
        )

        fun fromHex(
            string: String,
        )
    }
}
