@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


external interface RouteContextObject {
    var outlet: react.ReactElement<*>?
    var matches: js.core.ReadonlyArray<RouteMatch<*>>
}

