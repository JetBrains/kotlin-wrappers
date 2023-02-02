@file:JsModule("react-router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.RouterState

external fun _renderMatches(matches: Array<RouteMatch<*>>?, parentMatches: Array<RouteMatch<*>> = definedExternally, dataRouterState: RouterState = definedExternally): react.ReactElement<*>?
