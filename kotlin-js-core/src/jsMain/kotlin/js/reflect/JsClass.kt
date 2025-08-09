package js.reflect

import js.core.JsAny

actual typealias JsClass<T> = kotlin.js.JsClass<T>

internal actual inline fun <T : JsAny> isInstanceOf(
    value: JsAny?,
    jsClass: JsClass<T>,
): Boolean =
    js("value instanceof jsClass")
