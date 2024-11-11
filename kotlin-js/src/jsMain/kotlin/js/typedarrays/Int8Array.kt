@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS

open external class Int8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int8Array<B>, B, Byte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Byte>)
    constructor(elements: ReadonlyArray<Byte>)

    @JsAlias(THIS)
    fun asByteArray(): ByteArray

    companion object : TypedArrayCompanion<Int8Array<ArrayBuffer>, Byte>
}
