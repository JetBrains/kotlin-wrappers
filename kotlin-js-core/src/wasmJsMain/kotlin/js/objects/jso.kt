@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.objects

actual fun <T : Any> jso(): T =
    js("({})")
