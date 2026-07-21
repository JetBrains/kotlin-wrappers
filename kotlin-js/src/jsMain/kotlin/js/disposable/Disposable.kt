@file:Suppress(
    "JS_ACTUAL_EXTERNAL_INTERFACE_WHILE_EXPECT_WITHOUT_JS_NO_RUNTIME",
)

package js.disposable

actual external interface Disposable {

    @JsSymbol("dispose")
    fun `[@@dispose]`()

    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    actual interface Mixin : Disposable {

        override fun `[@@dispose]`(): Unit = definedExternally
    }
}
