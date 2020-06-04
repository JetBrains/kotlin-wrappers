@file:Suppress("PropertyName")

package react.router.dom

import react.RClass
import react.RProps

@JsModule("react-router-dom")
external object ReactRouterDom {
    fun useHistory(): RouteResultHistory
    fun useLocation(): RouteResultLocation
    fun useParams(): dynamic
    fun <T : RProps> useRouteMatch(options: dynamic): RouteResultMatch<T>
    fun <T : RProps> withRouter(component: dynamic): RClass<T>
    val HashRouter: RClass<RProps>
    val BrowserRouter: RClass<RProps>
    val Switch: RClass<RProps>
    val Route: RClass<dynamic>
    val Link: RClass<LinkProps>
    val NavLink: RClass<dynamic>
    val Redirect : RClass<RedirectProps>
}
