@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

external interface RouteMatchOptions {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var sensitive: Boolean
}

@JsName("useRouteMatch")
external fun rawUseRouteMatch(options: RouteMatchOptions?): Match?
