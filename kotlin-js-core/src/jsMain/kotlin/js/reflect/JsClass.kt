@file:Suppress(
    "JS_ACTUAL_EXTERNAL_INTERFACE_WHILE_EXPECT_WITHOUT_JS_NO_RUNTIME",
)

package js.reflect

actual typealias JsClass<T> = kotlin.js.JsClass<T>

internal actual inline fun <T : JsAny> isInstanceOf(
    value: JsAny,
    jsClass: JsClass<T>,
): Boolean =
    js("value instanceof jsClass")
