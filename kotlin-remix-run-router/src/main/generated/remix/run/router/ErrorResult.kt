@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import web.http.Headers

/**
 * Unsuccessful result from a loader or action
 */

external interface ErrorResult {
    var type: ResultType /* ResultType.error */
    var error: Any?
    var headers: Headers?
}

