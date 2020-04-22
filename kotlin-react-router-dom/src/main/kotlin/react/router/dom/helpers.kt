package react.router.dom

import react.*
import kotlin.reflect.KClass

fun <P : RProps> withRouter(klazz: KClass<out Component<P, *>>): RClass<P> =
    rawWithRouter(klazz.rClass)

fun <P : RProps> withRouter(component: FunctionalComponent<P>): RClass<P> =
    rawWithRouter(component)
