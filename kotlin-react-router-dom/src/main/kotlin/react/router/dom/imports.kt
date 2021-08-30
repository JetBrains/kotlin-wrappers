@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass
import react.Props

external fun useHistory(): History

external fun useLocation(): Location

external fun useParams(): Params

@JsName("useRouteMatch")
external fun rawUseRouteMatch(options: dynamic): Match?

@JsName("withRouter")
external fun <T : Props> rawWithRouter(component: dynamic): ComponentClass<T>
