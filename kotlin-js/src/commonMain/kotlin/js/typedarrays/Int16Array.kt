package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsShort
import js.iterable.JsIterable
import js.serializable.Serializable
import kotlin.js.definedExternally

open external class Int16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int16Array<B>, Int16Array<ArrayBuffer>, B, JsShort>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsShort>)
    constructor(elements: ReadonlyArray<JsShort>)

    companion object : TypedArrayCompanion<Int16Array<ArrayBuffer>, JsShort>
}
