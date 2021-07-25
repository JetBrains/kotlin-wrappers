package react.router.dom

import react.*
import kotlin.reflect.KClass

fun <P : RProps> withRouter(klazz: KClass<out Component<P, *>>): ComponentClass<P> =
    rawWithRouter(klazz.react)

fun <P : RProps> withRouter(component: FC<P>): ComponentClass<P> =
    rawWithRouter(component)
