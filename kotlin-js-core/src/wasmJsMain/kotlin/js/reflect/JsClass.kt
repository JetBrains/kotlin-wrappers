package js.reflect

actual external interface JsClass<T : JsAny> :
    JsAny {

    actual val name: String
}

internal actual fun <T : JsAny> isInstanceOf(
    value: JsAny,
    jsClass: JsClass<T>,
): Boolean =
    js("value instanceof jsClass")

