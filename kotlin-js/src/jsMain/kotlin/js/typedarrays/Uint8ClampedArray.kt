@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Uint8ClampedArray(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint8ClampedArray, Byte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Byte>)
    constructor(elements: ReadonlyArray<Byte>)

    companion object : TypedArrayCompanion<Uint8ClampedArray, Byte> {
        val BYTES_PER_ELEMENT: Int
    }
}
