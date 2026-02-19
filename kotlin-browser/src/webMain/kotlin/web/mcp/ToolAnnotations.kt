package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Annotations providing hints about tool behavior.
 *
 * [API Docs](https://spec.modelcontextprotocol.io/specification/server/tools/)
 */
@JsPlainObject
@ExperimentalWebApi
external interface ToolAnnotations {
    /**
     * Optional display title.
     */
    var title: String?

    /**
     * Indicates the tool is read-only.
     */
    var readOnlyHint: Boolean?

    /**
     * Indicates the tool may perform destructive actions.
     */
    var destructiveHint: Boolean?

    /**
     * Indicates the tool can be called repeatedly without changing outcome.
     */
    var idempotentHint: Boolean?

    /**
     * Indicates the tool may reach beyond local context (network, external systems, etc.).
     */
    var openWorldHint: Boolean?
}
