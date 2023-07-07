package react.router


sealed external interface RouteContextObject {
    var outlet: react.ReactElement<*>?
    var matches: js.core.ReadonlyArray<RouteMatch<*>>
    var isDataRoute: Boolean
}
