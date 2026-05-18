// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.JsUInt
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array)
 */
open external class Uint32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint32Array<B>, Uint32Array<ArrayBuffer>, B, JsUInt>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array/Uint32Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array/Uint32Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array/Uint32Array)
     */
    constructor(elements: JsIterable<JsUInt>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array/Uint32Array)
     */
    constructor(elements: ReadonlyArray<JsUInt>)

    companion object : TypedArrayCompanion<Uint32Array<ArrayBuffer>, JsUInt>
}
