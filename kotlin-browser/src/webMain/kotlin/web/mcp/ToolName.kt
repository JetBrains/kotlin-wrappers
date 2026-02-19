package web.mcp

import js.internal.InternalApi
import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
@SubclassOptInRequired(InternalApi::class)
external interface ToolName

@ExperimentalWebApi
inline fun ToolName(
    value: String,
): ToolName =
    unsafeCast(value)
