@file:JsModule("react-router")

package react.router

import remix.run.router.RouterState

external fun _renderMatches(
    matches: js.core.ReadonlyArray<RouteMatch<*>>?,
    parentMatches: js.core.ReadonlyArray<RouteMatch<*>> = definedExternally,
    dataRouterState: (RouterState)? = definedExternally,
): react.ReactElement<*>?
