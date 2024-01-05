@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",

    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Int8Array(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int8Array, Byte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Byte>)
    constructor(elements: ReadonlyArray<Byte>)

    inline fun asByteArray(): ByteArray =
        unsafeCast<ByteArray>()

    companion object : TypedArrayCompanion<Int8Array, Byte>
}
