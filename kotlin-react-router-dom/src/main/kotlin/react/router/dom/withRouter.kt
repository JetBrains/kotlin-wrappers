@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass
import react.ComponentType
import react.Props

external fun <P : Props> withRouter(
    component: ComponentType<P>,
): ComponentClass<P>
