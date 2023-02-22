@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import web.http.Headers

/**
 * State returned from a server-side query() call
 */

external interface StaticHandlerContext {
    var basename: String?
    var location: Location
    var matches: js.core.ReadonlyArray<AgnosticDataRouteMatch>
    var loaderData: RouteData
    var actionData: RouteData?
    var errors: RouteData?
    var statusCode: Double
    var loaderHeaders: js.core.ReadonlyRecord<String, Headers>
    var actionHeaders: js.core.ReadonlyRecord<String, Headers>
    var activeDeferreds: js.core.ReadonlyRecord<String, DeferredData>?
    var _deepestRenderedBoundaryId: String?
}

