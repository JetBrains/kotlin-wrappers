package react.router

import remix.run.router.AgnosticRouteMatch


sealed external interface RouteMatch<RouteObjectType : RouteObject /* default is RouteObject */> :
    AgnosticRouteMatch<RouteObjectType>
