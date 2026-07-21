@file:Suppress(
    "JS_ACTUAL_EXTERNAL_INTERFACE_WHILE_EXPECT_WITHOUT_JS_NO_RUNTIME",
)

package js.iterable

actual external interface JsIterable<out T> {

    actual interface Mixin<out T> :
        JsIterable<T>
}
