package js.objects

actual inline fun <T : Any> unsafeJso(): T =
    js("({})")
