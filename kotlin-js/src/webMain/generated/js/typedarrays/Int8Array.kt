// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.JsByte
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Int8Array)
 */
open external class Int8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Int8Array<B>, Int8Array<ArrayBuffer>, B, JsByte>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array)
     */
    constructor(elements: JsIterable<JsByte>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Int8Array/Int8Array)
     */
    constructor(elements: ReadonlyArray<JsByte>)

    companion object : TypedArrayCompanion<Int8Array<ArrayBuffer>, JsByte> {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of)
         */
        override operator fun of(
            vararg items: JsByte,
        ): Int8Array<ArrayBuffer>
    }
}
