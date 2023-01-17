@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Check if the given error is an ErrorResponse generated from a 4xx/5xx
 * Response throw from an action/loader
 */
external fun isRouteErrorResponse(e: Any?): Boolean
