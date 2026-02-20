package web.mcp

import js.internal.InternalApi
import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi
import kotlin.js.JsAny

@ExperimentalWebApi
@SubclassOptInRequired(InternalApi::class)
external interface ToolName<TArgs : JsAny?>

@ExperimentalWebApi
inline fun <TArgs : JsAny?> ToolName(
    value: String,
): ToolName<TArgs> =
    unsafeCast(value)
