// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.JsUShort
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array)
 */
open external class Uint16Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint16Array<B>, Uint16Array<ArrayBuffer>, B, JsUShort>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array)
     */
    constructor(elements: JsIterable<JsUShort>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array/Uint16Array)
     */
    constructor(elements: ReadonlyArray<JsUShort>)

    companion object : TypedArrayCompanion<Uint16Array<ArrayBuffer>, JsUShort> {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/of)
         */
        /* override */
        operator fun of(
            vararg items: JsUShort,
        ): Uint16Array<ArrayBuffer>
    }
}
