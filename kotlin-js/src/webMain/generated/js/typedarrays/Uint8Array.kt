// Automatically generated - do not modify!

package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.iterable.JsIterable
import js.numbers.JsUByte
import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array)
 */
open external class Uint8Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Uint8Array<B>, Uint8Array<ArrayBuffer>, B, JsUByte>,
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array)
     */
    constructor()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array)
     */
    constructor(length: Int)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array)
     */
    constructor(elements: JsIterable<JsUByte>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/Uint8Array)
     */
    constructor(elements: ReadonlyArray<JsUByte>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/setFromBase64)
     */
    fun setFromBase64(
        string: String,
        options: FromBase64Options = definedExternally,
    ): SetFromResult

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/setFromHex)
     */
    fun setFromHex(
        string: String,
    ): SetFromResult

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/toBase64)
     */
    fun toBase64(
        options: ToBase64Options = definedExternally,
    ): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/toHex)
     */
    fun toHex(): String

    companion object : TypedArrayCompanion<Uint8Array<ArrayBuffer>, JsUByte> {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromBase64)
         */
        fun fromBase64(
            string: String,
            options: FromBase64Options = definedExternally,
        ): Uint8Array<ArrayBuffer>

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromHex)
         */
        fun fromHex(
            string: String,
        ): Uint8Array<ArrayBuffer>
    }
}
