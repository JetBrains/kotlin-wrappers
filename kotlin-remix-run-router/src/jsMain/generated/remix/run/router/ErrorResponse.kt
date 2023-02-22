@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * @private
 * Utility class we use to hold auto-unwrapped 4xx/5xx Response bodies
 */

external class ErrorResponse {
    var status: Double
    var statusText: String
    var data: Any?
    var error: Error?
    var internal: Boolean

    constructor (status: Double, statusText: String?, data: Any?, internal: Boolean = definedExternally)
}

