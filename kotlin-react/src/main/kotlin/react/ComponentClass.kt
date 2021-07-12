package react

import kotlin.reflect.KClass

// TODO: Should extend RComponentClassStatics, but has problems with generic params
external interface ComponentClass<in P : RProps> :
    ComponentType<P>,
    RComponentClassStatics<RProps, RState, Context<*>?>

typealias RClass<P> = ComponentClass<P>

val <P : RProps> KClass<out Component<P, *>>.rClass: ComponentClass<P>
    get() = js.unsafeCast<ComponentClass<P>>()

external interface RComponentClassStatics<P : RProps, S : RState, C : Context<*>?> {
    var displayName: String?
    var defaultProps: P?
    var contextType: C
    var getDerivedStateFromProps: ((P, S) -> S?)?
    var getDerivedStateFromError: ((Throwable) -> S?)?
}

/**
 * Usage:
 *
 * ```
 * companion object : RStatics<RProps, RState, RComponent, Nothing>(RComponent::class) {
 *     init {
 *         defaultProps = ...
 *         ...
 *     }
 * }
 * ```
 *
 * in your class components
 */
open class RStatics<P : RProps, S : RState, C : Component<P, S>, CTX : Context<*>?>(
    klazz: KClass<C>,
) : RComponentClassStatics<P, S, CTX> by klazz.js.unsafeCast<RComponentClassStatics<P, S, CTX>>()
