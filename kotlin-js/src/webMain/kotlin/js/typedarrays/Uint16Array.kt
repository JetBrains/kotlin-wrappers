package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsUShort
import js.iterable.JsIterable
import js.serialization.Serializable
import kotlin.js.definedExternally

open external class Uint16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint16Array<B>, Uint16Array<ArrayBuffer>, B, JsUShort>,
    Serializable {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsUShort>)
    constructor(elements: ReadonlyArray<JsUShort>)

    companion object : TypedArrayCompanion<Uint16Array<ArrayBuffer>, JsUShort>
}
