package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsFloat16
import js.iterable.JsIterable
import js.serializable.Serializable
import kotlin.js.definedExternally

open external class Float16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float16Array<B>, Float16Array<ArrayBuffer>, B, JsFloat16>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsFloat16>)
    constructor(elements: ReadonlyArray<JsFloat16>)

    companion object : TypedArrayCompanion<Float16Array<ArrayBuffer>, JsFloat16>
}
