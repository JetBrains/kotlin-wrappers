// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.JsDouble
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float64Array)
 */
open external class Float64Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float64Array<B>, Float64Array<ArrayBuffer>, B, JsDouble>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array)
     */
    constructor(elements: JsIterable<JsDouble>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array)
     */
    constructor(elements: ReadonlyArray<JsDouble>)

    companion object : TypedArrayCompanion<Float64Array<ArrayBuffer>, JsDouble>
}
