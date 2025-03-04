package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsDouble
import js.iterable.JsIterable
import kotlin.js.definedExternally

open external class Float64Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float64Array<B>, Float64Array<ArrayBuffer>, B, JsDouble> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsDouble>)
    constructor(elements: ReadonlyArray<JsDouble>)

    companion object : TypedArrayCompanion<Float64Array<ArrayBuffer>, JsDouble>
}
