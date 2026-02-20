package web.mcp

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Context provided to models via provideContext().
 */
@JsPlainObject
@ExperimentalWebApi
external interface ModelContextInput {
    /**
     * Base tool descriptors to expose.
     */
    val tools: ReadonlyArray<ToolDescriptor<*>>?
}
