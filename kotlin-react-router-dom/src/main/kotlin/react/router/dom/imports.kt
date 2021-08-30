@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

external fun useHistory(): History

external fun useLocation(): Location

external fun useParams(): Params

@JsName("useRouteMatch")
external fun rawUseRouteMatch(options: dynamic): Match?

@JsName("matchPath")
external fun rawMatchPath(pathName: String, options: dynamic): Match?

