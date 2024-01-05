@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable

open external class Uint16Array(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint16Array, Short> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Short>)
    constructor(elements: ReadonlyArray<Short>)

    companion object : TypedArrayCompanion<Uint16Array, Short>
}
