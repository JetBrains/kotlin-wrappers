package js.objects

import js.core.JsAny

@Deprecated(
    message = "Legacy API",
    replaceWith = ReplaceWith("js.objects.unsafeJso()")
)
fun <T : JsAny> jso(): T =
    unsafeJso()
