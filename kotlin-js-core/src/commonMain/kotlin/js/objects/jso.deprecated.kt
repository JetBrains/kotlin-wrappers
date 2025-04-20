package js.objects

import js.core.JsAny

@Deprecated(
    "Legacy API",
    ReplaceWith("js.objects.unsafeJso")
)
fun <T : JsAny> jso(): T =
    unsafeJso()
