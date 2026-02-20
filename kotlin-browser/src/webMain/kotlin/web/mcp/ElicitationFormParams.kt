package web.mcp

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import kotlin.js.JsString

/**
 * Form-based elicitation request parameters.
 */
@JsPlainObject
@ExperimentalWebApi
external interface ElicitationFormParams :
    ElicitationParams {
    /**
     * Elicitation mode. Omit or set to `'form'` for form input.
     */
    override var mode: String? /* 'form' */

    /**
     * User-facing message.
     */
    override val message: String

    /**
     * Requested form schema.
     */
    var requestedSchema: RequestedSchema

    @JsPlainObject
    interface RequestedSchema {
        /**
         * Root schema type.
         */
        var type: String /* 'object' */

        /**
         * Field definitions.
         */
        var properties: ReadonlyRecord<JsString, InputSchema>
    }
}
