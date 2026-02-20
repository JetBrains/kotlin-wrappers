package web.mcp

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import kotlin.js.JsAny
import kotlin.js.JsString

/**
 * Result returned by an elicitation request.
 */
@JsPlainObject
@ExperimentalWebApi
external interface ElicitationResult {
    /**
     * User decision.
     */
    var action: ElicitationAction

    /**
     * Submitted values when `action` is `'accept'`.
     */
    var content: ReadonlyRecord<JsString, JsAny>
}
