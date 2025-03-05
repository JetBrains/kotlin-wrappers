package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsFloat
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class Float32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<Float32Array<B>, Float32Array<ArrayBuffer>, B, JsFloat> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsFloat>)
    constructor(elements: ReadonlyArray<JsFloat>)

    companion object : TypedArrayCompanion<Float32Array<ArrayBuffer>, JsFloat>
}
