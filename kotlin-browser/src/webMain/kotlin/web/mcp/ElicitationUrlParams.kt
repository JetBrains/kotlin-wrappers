package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * URL-based elicitation request parameters.
 */
@JsPlainObject
@ExperimentalWebApi
external interface ElicitationUrlParams :
    ElicitationParams {
    /**
     * Elicitation mode.
     */
    override var mode: String /* 'url' */

    /**
     * User-facing message.
     */
    override var message: String

    /**
     * Unique elicitation identifier.
     */
    var elicitationId: String

    /**
     * URL to open.
     */
    var url: String
}
