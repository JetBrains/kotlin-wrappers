@file:JsModule("react-router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


/**
 * Returns the loaderData for the given routeId
 */
external fun useRouteLoaderData(routeId: String): Any?
