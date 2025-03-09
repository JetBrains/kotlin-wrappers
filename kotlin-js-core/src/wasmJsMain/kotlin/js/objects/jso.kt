package js.objects

actual fun <T : JsAny> jso(): T =
    js("({})")
