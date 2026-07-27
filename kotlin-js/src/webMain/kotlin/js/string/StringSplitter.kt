package js.string

import js.array.ReadonlyArray

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/split)
 */
external interface StringSplitter {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/split)
     */
    @JsSymbol("split")
    fun `[@@split]`(
        string: String,
        limit: Int = definedExternally,
    ): ReadonlyArray<JsString>
}
