package react.router.dom

import react.*
import kotlin.reflect.KClass

fun <P : RProps, S, T : Component<P, S>> withRouter(klazz: KClass<T>) = rawWithRouter<P>(klazz.js.unsafeCast<RClass<P>>())
fun <P : RProps> withRouter(functionalComponent: FunctionalComponent<P>) = rawWithRouter<P>(functionalComponent)
