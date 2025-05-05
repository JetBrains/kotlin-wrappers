package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsInt
import js.iterable.JsIterable
import js.serializable.Serializable
import kotlin.js.definedExternally

open external class Int32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int32Array<B>, Int32Array<ArrayBuffer>, B, JsInt>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsInt>)
    constructor(elements: ReadonlyArray<JsInt>)

    companion object : TypedArrayCompanion<Int32Array<ArrayBuffer>, JsInt>
}
