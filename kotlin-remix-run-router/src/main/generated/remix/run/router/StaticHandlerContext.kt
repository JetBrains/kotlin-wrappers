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
    var location: Any /* RouterState["location"] */
    var matches: Any /* RouterState["matches"] */
    var loaderData: Any /* RouterState["loaderData"] */
    var actionData: Any /* RouterState["actionData"] */
    var errors: Any /* RouterState["errors"] */
    var statusCode: Double
    var loaderHeaders: Record<String, Headers>
    var actionHeaders: Record<String, Headers>
    var _deepestRenderedBoundaryId: String?
}

