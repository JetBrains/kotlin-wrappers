package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsUInt
import js.iterable.JsIterable
import js.serializable.Serializable
import kotlin.js.definedExternally

open external class Uint32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint32Array<B>, Uint32Array<ArrayBuffer>, B, JsUInt>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsUInt>)
    constructor(elements: ReadonlyArray<JsUInt>)

    companion object : TypedArrayCompanion<Uint32Array<ArrayBuffer>, JsUInt>
}
