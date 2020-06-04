package react.router.dom

import react.RClass
import react.RProps

external interface ReactRouterDom {
    @JsName("useHistory")
    fun rawUseHistory(): RouteResultHistory
    @JsName("useLocation")
    fun rawUseLocation(): RouteResultLocation
    @JsName("useParams")
    fun rawUseParams(): dynamic
    @JsName("useRouteMatch")
    fun <T : RProps> rawUseRouteMatch(options: dynamic): RouteResultMatch<T>
    @JsName("withRouter")
    fun <T : RProps> rawWithRouter(component: dynamic): RClass<T>
    @Suppress("PropertyName")
    val HashRouter: RClass<RProps>
    @Suppress("PropertyName")
    val BrowserRouter: RClass<RProps>
    @Suppress("PropertyName")
    val Switch: RClass<RProps>
    @Suppress("PropertyName")
    val Route: RClass<dynamic>
    @Suppress("PropertyName")
    val Link: RClass<LinkProps>
    @Suppress("PropertyName")
    val NavLink: RClass<dynamic>
    @Suppress("PropertyName")
    val Redirect : RClass<RedirectProps>
}

@JsModule("react-router-dom")
external val ReactRouterDomModule: ReactRouterDom
