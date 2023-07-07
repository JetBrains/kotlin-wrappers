@file:JsModule("react-router")

package react.router


/**
 * Renders the result of `matchRoutes()` into a React element.
 */
external fun renderMatches(matches: js.core.ReadonlyArray<RouteMatch<*>>?): react.ReactElement<*>?
