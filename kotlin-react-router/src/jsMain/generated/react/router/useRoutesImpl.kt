@file:JsModule("react-router")

package react.router

import remix.run.router.Location
import remix.run.router.RouterState

external fun useRoutesImpl(
    routes: js.core.ReadonlyArray<RouteObject>,
    locationArg: Location = definedExternally,
    dataRouterState: RouterState = definedExternally,
): react.ReactElement<*>?

external fun useRoutesImpl(
    routes: js.core.ReadonlyArray<RouteObject>,
    locationArg: String = definedExternally,
    dataRouterState: RouterState = definedExternally,
): react.ReactElement<*>?
