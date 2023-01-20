@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import web.http.Request
import kotlin.js.Promise

/**
 * A StaticHandler instance manages a singular SSR navigation/fetch event
 */

external interface StaticHandler {
    var dataRoutes: Array<AgnosticDataRouteObject>
    fun query(request: Request, opts: Opts = definedExternally): Promise<Any /* StaticHandlerContext | Response */>
    fun queryRoute(request: Request, opts: Opts = definedExternally): Promise<Any?>
}

