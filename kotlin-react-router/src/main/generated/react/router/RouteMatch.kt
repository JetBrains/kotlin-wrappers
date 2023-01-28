@file:JsModule("react-router/context")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.AgnosticRouteMatch


external interface RouteMatch<RouteObjectType : RouteObject /* default is RouteObject */> : AgnosticRouteMatch<RouteObjectType>

