package react.router.dom

import react.*
import kotlin.reflect.KClass

fun <P : RProps> withRouter(
        module: ReactRouterDom,
        klazz: KClass<out Component<P, *>>
): RClass<P> = module.withRouter(klazz.rClass)

fun <P : RProps> withRouter(klazz: KClass<out Component<P, *>>) = withRouter(ReactRouterDom, klazz)

fun <P : RProps> withRouter(
        module: ReactRouterDom,
        component: FunctionalComponent<P>
): RClass<P> = module.withRouter(component)

fun <P : RProps> withRouter(component: FunctionalComponent<P>) = withRouter(ReactRouterDom, component)
