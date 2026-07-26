package js.primitive

external interface ToPrimitive {
    @JsSymbol("toPrimitive")
    fun `[@@toPrimitive]`(
        hint: PrimitiveHint? = definedExternally,
    ): JsAny?
}
