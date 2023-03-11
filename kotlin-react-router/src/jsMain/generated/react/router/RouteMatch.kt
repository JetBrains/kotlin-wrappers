@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.AgnosticRouteMatch


external interface RouteMatch<RouteObjectType : RouteObject /* default is RouteObject */> : AgnosticRouteMatch<RouteObjectType>
