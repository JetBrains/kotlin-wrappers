package remix.run.router

import web.http.Headers

/**
 * Successful result from a loader or action
 */

sealed external interface SuccessResult {
    var type: ResultType /* ResultType.data */
    var data: Any?
    var statusCode: Double?
    var headers: Headers?
}
