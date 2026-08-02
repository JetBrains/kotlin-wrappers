package js.reflect

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/hasInstance)
 */
external interface HasInstance {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/hasInstance)
     */
    @JsSymbol("hasInstance")
    fun `[@@hasInstance]`(
        instance: JsAny?,
    ): Boolean
}
