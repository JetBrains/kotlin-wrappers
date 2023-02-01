@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import js.core.Record
import web.http.Headers

/**
 * State returned from a server-side query() call
 */

external interface StaticHandlerContext {
    var basename: String?
    var location: Location
    var matches: Array<AgnosticDataRouteMatch>
    var loaderData: RouteData
    var actionData: RouteData?
    var errors: RouteData?
    var statusCode: Double
    var loaderHeaders: Record<String, Headers>
    var actionHeaders: Record<String, Headers>
    var activeDeferreds: Record<String, DeferredData>?
    var _deepestRenderedBoundaryId: String?
}

