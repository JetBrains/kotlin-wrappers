@file:Suppress(
    "JS_ACTUAL_EXTERNAL_INTERFACE_WHILE_EXPECT_WITHOUT_JS_NO_RUNTIME",
)

package js.iterable

actual external interface AsyncIterable<out T> {

    @JsSymbol("asyncIterator")
    fun `[@@asyncIterator]`(): AsyncIterator<T>

    @Suppress("NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE")
    actual interface Mixin<out T> :
        AsyncIterable<T> {

        override fun `[@@asyncIterator]`(): AsyncIterator<T> = definedExternally
    }
}
