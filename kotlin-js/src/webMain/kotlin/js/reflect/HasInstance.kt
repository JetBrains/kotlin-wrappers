package js.reflect

external interface HasInstance {

    @JsSymbol("hasInstance")
    fun `[@@hasInstance]`(
        instance: JsAny?,
    ): Boolean
}
