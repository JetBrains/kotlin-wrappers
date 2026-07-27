package js.string

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/search)
 */
external interface StringSearcher {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/search)
     */
    @JsSymbol("search")
    fun `[@@search]`(
        string: String,
    ): Int
}

