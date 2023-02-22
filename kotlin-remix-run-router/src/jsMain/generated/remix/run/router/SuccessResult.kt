@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import web.http.Headers

/**
 * Successful result from a loader or action
 */

external interface SuccessResult {
    var type: ResultType /* ResultType.data */
    var data: Any?
    var statusCode: Double?
    var headers: Headers?
}

