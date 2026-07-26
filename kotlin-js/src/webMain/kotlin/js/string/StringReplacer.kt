package js.string

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/replace)
 */
external interface StringReplacer {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/replace)
     */
    @JsSymbol("replace")
    fun `[@@replace]`(
        input: String,
        replaceValue: String,
    ): String
}
