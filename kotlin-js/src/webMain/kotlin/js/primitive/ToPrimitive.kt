package js.primitive

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toPrimitive)
 */
external interface ToPrimitive {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toPrimitive)
     */
    @JsSymbol("toPrimitive")
    fun `[@@toPrimitive]`(
        hint: PrimitiveHint? = definedExternally,
    ): JsAny?
}
