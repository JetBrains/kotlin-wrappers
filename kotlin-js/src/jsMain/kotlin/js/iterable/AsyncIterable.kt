@file:Suppress(
    "JS_ACTUAL_EXTERNAL_INTERFACE_WHILE_EXPECT_WITHOUT_JS_NO_RUNTIME",
)

package js.iterable

actual external interface AsyncIterable<out T> {

    actual interface Mixin<out T : JsAny?> :
        AsyncIterable<T>
}
