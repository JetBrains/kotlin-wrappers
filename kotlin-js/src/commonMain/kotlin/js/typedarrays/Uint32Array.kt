package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsUInt
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class Uint32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<Uint32Array<B>, Uint32Array<ArrayBuffer>, B, JsUInt> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsUInt>)
    constructor(elements: ReadonlyArray<JsUInt>)

    companion object : TypedArrayCompanion<Uint32Array<ArrayBuffer>, JsUInt>
}
