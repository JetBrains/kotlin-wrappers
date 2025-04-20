package js.objects

actual fun <T : JsAny> unsafeJso(): T =
    js("({})")
