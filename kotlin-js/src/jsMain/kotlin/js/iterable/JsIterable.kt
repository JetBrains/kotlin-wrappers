@file:Suppress(
    "JS_ACTUAL_EXTERNAL_INTERFACE_WHILE_EXPECT_WITHOUT_JS_NO_RUNTIME",
)

package js.iterable

actual external interface JsIterable<out T> {

    @JsSymbol("iterator")
    fun `[@@iterator]`(): JsIterator<T>

    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    actual interface Mixin<out T> :
        JsIterable<T> {

        override fun `[@@iterator]`(): JsIterator<T> = definedExternally
    }
}
