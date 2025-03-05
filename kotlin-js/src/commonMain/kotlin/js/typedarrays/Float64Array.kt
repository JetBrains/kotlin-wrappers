package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsDouble
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class Float64Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<Float64Array<B>, Float64Array<ArrayBuffer>, B, JsDouble> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsDouble>)
    constructor(elements: ReadonlyArray<JsDouble>)

    companion object : TypedArrayCompanion<Float64Array<ArrayBuffer>, JsDouble>
}
