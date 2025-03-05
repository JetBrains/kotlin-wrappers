package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsShort
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class Int16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<Int16Array<B>, Int16Array<ArrayBuffer>, B, JsShort> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsShort>)
    constructor(elements: ReadonlyArray<JsShort>)

    companion object : TypedArrayCompanion<Int16Array<ArrayBuffer>, JsShort>
}
