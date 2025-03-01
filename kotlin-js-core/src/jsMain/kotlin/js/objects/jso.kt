package js.objects

actual inline fun <T : Any> jso(): T =
    js("({})")
