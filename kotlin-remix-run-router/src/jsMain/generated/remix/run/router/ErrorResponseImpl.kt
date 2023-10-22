@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * @private
 * Utility class we use to hold auto-unwrapped 4xx/5xx Response bodies
 *
 * We don't export the class for public use since it's an implementation
 * detail, but we export the interface above so folks can build their own
 * abstractions around instances via isRouteErrorResponse()
 */

external class ErrorResponseImpl : ErrorResponse {
    constructor (status: Double, statusText: String?, data: Any?, internal: Boolean = definedExternally)

    var status: Double
    var statusText: String
    var data: Any?
}
