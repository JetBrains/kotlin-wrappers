@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.Float16
import js.iterable.JsIterable

open external class Float16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float16Array<B>, B, Float16> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Float16>)
    constructor(elements: ReadonlyArray<Float16>)

    companion object : TypedArrayCompanion<Float16Array<ArrayBuffer>, Float16>
}
