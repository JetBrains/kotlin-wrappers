package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsUShort
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class Uint16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<Uint16Array<B>, Uint16Array<ArrayBuffer>, B, JsUShort> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsUShort>)
    constructor(elements: ReadonlyArray<JsUShort>)

    companion object : TypedArrayCompanion<Uint16Array<ArrayBuffer>, JsUShort>
}
