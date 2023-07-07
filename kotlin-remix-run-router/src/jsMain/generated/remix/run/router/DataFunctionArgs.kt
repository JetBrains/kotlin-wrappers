package remix.run.router

import web.http.Request

/**
 * @private
 * Arguments passed to route loader/action functions.  Same for now but we keep
 * this as a private implementation detail in case they diverge in the future.
 */

sealed external interface DataFunctionArgs {
    var request: Request
    var params: Params
    var context: Any?
}
