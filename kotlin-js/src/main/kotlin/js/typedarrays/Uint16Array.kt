package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Uint16Array(
    buffer: ArrayBufferLike,
    byteOffset: Int = definedExternally,
    length: Int = definedExternally,
) : TypedArray<Uint16Array, Short> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Short>)
    constructor(elements: ReadonlyArray<Short>)

    override val byteLength: Int

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
