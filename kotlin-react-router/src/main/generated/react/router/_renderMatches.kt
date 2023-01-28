@file:JsModule("react-router/hooks")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


external fun _renderMatches(
    matches: Array<RouteMatch<*>>?,
    parentMatches: Array<RouteMatch<*>> = definedExternally,
    dataRouterState: Any /* RemixRouter["state"] */ = definedExternally
): react.ReactElement<*>?
