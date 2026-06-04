// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.JsFloat16
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float16Array)
 */
open external class Float16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float16Array<B>, Float16Array<ArrayBuffer>, B, JsFloat16>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float16Array/Float16Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float16Array/Float16Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float16Array/Float16Array)
     */
    constructor(elements: JsIterable<JsFloat16>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Float16Array/Float16Array)
     */
    constructor(elements: ReadonlyArray<JsFloat16>)

    companion object : TypedArrayCompanion<Float16Array<ArrayBuffer>, JsFloat16> {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of)
         */
        override operator fun of(
            vararg items: JsFloat16,
        ): Float16Array<ArrayBuffer>
    }
}
