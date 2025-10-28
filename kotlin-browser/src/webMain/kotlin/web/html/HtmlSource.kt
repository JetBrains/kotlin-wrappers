package web.html

import js.core.JsPrimitives.toKotlinString
import js.reflect.JsExternalInheritorsOnly
import js.reflect.unsafeCast
import js.reflect.upcast
import kotlin.js.JsAny
import kotlin.js.JsString

@JsExternalInheritorsOnly
external interface HtmlSource

inline fun HtmlSource(
    value: String,
): HtmlSource =
    unsafeCast(value)

fun HtmlSource.asStringOrNull(): String? =
    (upcast<JsAny>() as? JsString)?.toKotlinString()
