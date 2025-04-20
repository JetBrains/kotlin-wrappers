package js.objects

import js.core.JsAny

@Deprecated(
    "Legacy API",
    ReplaceWith("js.objects.unsafeJso")
)
inline fun <T : JsAny> jso(
    block: @JsoDsl T.() -> Unit,
): T =
    unsafeJso(block)
