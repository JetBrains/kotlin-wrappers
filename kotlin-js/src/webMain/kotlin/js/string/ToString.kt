package js.string

external interface ToString {

    @JsSymbol("toStringTag")
    fun `[@@toStringTag]`(): String
}
