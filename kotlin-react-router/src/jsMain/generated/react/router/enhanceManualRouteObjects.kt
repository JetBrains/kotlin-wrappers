@file:JsModule("react-router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


/**
 * @private
 * Walk the route tree and add hasErrorBoundary if it's not provided, so that
 * users providing manual route arrays can just specify errorElement
 */

@JsName("UNSAFE_enhanceManualRouteObjects")
external fun enhanceManualRouteObjects(routes: js.core.ReadonlyArray<RouteObject>): js.core.ReadonlyArray<RouteObject>

