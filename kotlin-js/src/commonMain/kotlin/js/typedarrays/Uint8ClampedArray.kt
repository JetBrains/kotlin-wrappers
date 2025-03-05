package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsUByte
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class Uint8ClampedArray<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<Uint8ClampedArray<B>, Uint8ClampedArray<ArrayBuffer>, B, JsUByte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsUByte>)
    constructor(elements: ReadonlyArray<JsUByte>)

    companion object : TypedArrayCompanion<Uint8ClampedArray<ArrayBuffer>, JsUByte>
}
