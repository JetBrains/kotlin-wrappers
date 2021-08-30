package react.router.dom

import react.Component
import react.ComponentClass
import react.Props
import react.react
import kotlin.reflect.KClass

fun <P : Props> withRouter(klazz: KClass<out Component<P, *>>): ComponentClass<P> =
    withRouter(klazz.react)
