package react.router.dom

import react.*
import kotlin.reflect.KClass

fun <P : Props> withRouter(klazz: KClass<out Component<P, *>>): ComponentClass<P> =
    rawWithRouter(klazz.react)

fun <P : Props> withRouter(component: FC<P>): ComponentClass<P> =
    rawWithRouter(component)
