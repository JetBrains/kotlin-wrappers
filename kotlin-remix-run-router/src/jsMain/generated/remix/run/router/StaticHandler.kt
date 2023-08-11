package remix.run.router

import js.promise.Promise
import web.http.Request

/**
 * A StaticHandler instance manages a singular SSR navigation/fetch event
 */

sealed external interface StaticHandler {
    var dataRoutes: js.core.ReadonlyArray<AgnosticDataRouteObject>
    fun query(
        request: Request,
        opts: StaticHandlerQueryOpts = definedExternally,
    ): Promise<Any /* StaticHandlerContext | Response */>

    fun queryRoute(request: Request, opts: StaticHandlerQueryRouteOpts = definedExternally): Promise<Any?>
}
