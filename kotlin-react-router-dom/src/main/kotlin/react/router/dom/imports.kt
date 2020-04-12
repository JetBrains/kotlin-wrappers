@file:JsModule("react-router-dom")

package react.router.dom

import react.RClass
import react.RProps

@JsName("useHistory")
external fun useHistory(): RouteResultHistory

@JsName("useLocation")
external fun useLocation(): RouteResultLocation

@JsName("useParams")
external fun rawUseParams(): dynamic

@JsName("useRouteMatch")
external fun <T: RProps> rawUseRouteMatch(options: dynamic): RouteResultMatch<T>

@JsName("withRouter")
external fun <T: RProps> rawWithRouter(component: dynamic): RClass<T>
