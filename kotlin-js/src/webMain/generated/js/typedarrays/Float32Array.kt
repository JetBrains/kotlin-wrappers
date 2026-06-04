// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.JsFloat
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float32Array)
 */
open external class Float32Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float32Array<B>, Float32Array<ArrayBuffer>, B, JsFloat>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array)
     */
    constructor(elements: JsIterable<JsFloat>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float32Array/Float32Array)
     */
    constructor(elements: ReadonlyArray<JsFloat>)

    companion object : TypedArrayCompanion<Float32Array<ArrayBuffer>, JsFloat> {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of)
         */
        /* override */
        operator fun of(
            vararg items: JsFloat,
        ): Float32Array<ArrayBuffer>
    }
}
