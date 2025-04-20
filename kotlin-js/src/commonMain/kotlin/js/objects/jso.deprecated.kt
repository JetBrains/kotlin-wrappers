package js.objects

import js.core.JsAny

@Deprecated(
    message = "Legacy API",
    replaceWith = ReplaceWith("js.objects.unsafeJso(block)")
)
inline fun <T : JsAny> jso(
    block: @JsoDsl T.() -> Unit,
): T =
    unsafeJso(block)
