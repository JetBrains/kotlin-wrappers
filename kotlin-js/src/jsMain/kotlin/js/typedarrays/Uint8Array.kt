@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
    "INLINE_EXTERNAL_DECLARATION",
    "INLINE_CLASS_IN_EXTERNAL_DECLARATION_WARNING",
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "NOTHING_TO_INLINE",
)

package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.ReadonlyArray
import js.iterable.JsIterable

open external class Uint8Array(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint8Array, Byte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Byte>)
    constructor(elements: ReadonlyArray<Byte>)

    inline fun toByteArray(): ByteArray =
        Int8Array(buffer, byteOffset, length).asByteArray()

    inline fun toUByteArray(): UByteArray =
        toByteArray().asUByteArray()

    companion object : TypedArrayCompanion<Uint8Array, Byte>
}
