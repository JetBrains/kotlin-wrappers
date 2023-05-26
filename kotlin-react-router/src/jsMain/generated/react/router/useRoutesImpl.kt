@file:JsModule("react-router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.Location
import remix.run.router.RouterState

external fun useRoutesImpl(routes: js.core.ReadonlyArray<RouteObject>, locationArg: Location = definedExternally, dataRouterState: RouterState = definedExternally): react.ReactElement<*>?

external fun useRoutesImpl(routes: js.core.ReadonlyArray<RouteObject>, locationArg: String = definedExternally, dataRouterState: RouterState = definedExternally): react.ReactElement<*>?
