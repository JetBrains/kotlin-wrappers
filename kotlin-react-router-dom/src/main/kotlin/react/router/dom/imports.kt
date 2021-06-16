@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import kotlinext.js.Record
import react.RClass
import react.RProps

external fun useHistory(): RouteResultHistory

external fun useLocation(): RouteResultLocation

@JsName("useParams")
external fun rawUseParams(): Record<String, String>

@JsName("useRouteMatch")
external fun <T : RProps> rawUseRouteMatch(options: dynamic): RouteResultMatch<T>

@JsName("matchPath")
external fun <T : RProps> rawMatchPath(pathName: String, options: dynamic): RouteResultMatch<T>?

@JsName("withRouter")
external fun <T : RProps> rawWithRouter(component: dynamic): RClass<T>
