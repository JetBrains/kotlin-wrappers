package web.html

import js.reflect.JsExternalInheritorsOnly
import js.reflect.unsafeCast
import js.reflect.upcast
import kotlin.String
import kotlin.js.JsAny
import kotlin.js.JsString

@JsExternalInheritorsOnly
external interface HtmlSource

inline fun HtmlSource(
    value: String,
): HtmlSource =
    unsafeCast(value)

fun HtmlSource.asStringOrNull(): String? =
    (upcast<JsAny>() as? JsString)?.toString()
