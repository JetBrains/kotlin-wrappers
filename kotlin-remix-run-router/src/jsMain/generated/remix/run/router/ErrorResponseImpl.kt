@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * @private
 * Utility class we use to hold auto-unwrapped 4xx/5xx Response bodies
 */

external class ErrorResponseImpl {
    constructor (status: Double, statusText: String?, data: Any?, internal: Boolean = definedExternally)

    var status: Double
    var statusText: String
    var data: Any?
}
