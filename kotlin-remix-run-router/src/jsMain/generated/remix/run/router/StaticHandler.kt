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
    var dataRoutes: js.core.ReadonlyArray<AgnosticDataRouteObject>
    fun query(request: Request, opts: StaticHandlerQueryOpts = definedExternally): Promise<Any /* StaticHandlerContext | Response */>
    fun queryRoute(request: Request, opts: StaticHandlerQueryRouteOpts = definedExternally): Promise<Any?>
}

