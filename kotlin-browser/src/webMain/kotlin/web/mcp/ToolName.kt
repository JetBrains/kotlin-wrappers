package web.mcp

import js.internal.InternalApi
import js.reflect.unsafeCast

@SubclassOptInRequired(InternalApi::class)
external interface ToolName

inline fun ToolName(
    value: String,
): ToolName =
    unsafeCast(value)
