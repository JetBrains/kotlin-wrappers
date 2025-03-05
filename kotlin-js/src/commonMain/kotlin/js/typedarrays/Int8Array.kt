package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.JsByte
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class Int8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<Int8Array<B>, Int8Array<ArrayBuffer>, B, JsByte> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<JsByte>)
    constructor(elements: ReadonlyArray<JsByte>)

    companion object : TypedArrayCompanion<Int8Array<ArrayBuffer>, JsByte>
}
