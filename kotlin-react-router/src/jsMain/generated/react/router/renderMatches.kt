@file:JsModule("react-router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


/**
 * Renders the result of `matchRoutes()` into a React element.
 */
external fun renderMatches(matches: js.core.ReadonlyArray<RouteMatch<*>>?): react.ReactElement<*>?
