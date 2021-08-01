@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import kotlinext.js.Record
import react.ComponentClass
import react.RProps

external fun useHistory(): History

external fun useLocation(): Location

@JsName("useParams")
external fun rawUseParams(): Record<String, String>

@JsName("useRouteMatch")
external fun <T : RProps> rawUseRouteMatch(options: dynamic): Match<T>

@JsName("matchPath")
external fun <T : RProps> rawMatchPath(pathName: String, options: dynamic): Match<T>?

@JsName("withRouter")
external fun <T : RProps> rawWithRouter(component: dynamic): ComponentClass<T>
