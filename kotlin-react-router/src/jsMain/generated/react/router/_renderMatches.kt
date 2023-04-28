@file:JsModule("react-router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.RouterState

external fun _renderMatches(
    matches: js.core.ReadonlyArray<RouteMatch<*>>?,
    parentMatches: js.core.ReadonlyArray<RouteMatch<*>> = definedExternally,
    dataRouterState: RouterState? = definedExternally
): react.ReactElement<*>?
