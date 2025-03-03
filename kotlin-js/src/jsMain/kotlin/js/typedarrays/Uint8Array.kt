package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Uint8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint8Array<B>, Uint8Array<ArrayBuffer>, B, Short /* UByte */> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Short /* UByte */>)
    constructor(elements: ReadonlyArray<Short /* UByte */>)

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

    companion object : TypedArrayCompanion<Uint8Array<ArrayBuffer>, Short /* UByte */> {
        fun fromBase64(
            string: String,
            options: FromBase64Options = definedExternally,
        )

        fun fromHex(
            string: String,
        )
    }
}
