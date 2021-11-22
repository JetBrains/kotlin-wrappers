package react

import kotlin.reflect.KClass

// TODO: Should extend RComponentClassStatics, but has problems with generic params
sealed external interface ComponentClass<in P : Props> :
    ComponentType<P>,
    RComponentClassStatics<Props, State, Context<*>?>

val <P : Props> KClass<out Component<P, *>>.react: ComponentClass<P>
    get() = js.unsafeCast<ComponentClass<P>>()

external interface RComponentClassStatics<P : Props, S : State, C : Context<*>?> {
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
 * companion object : RStatics<Props, State, RComponent, Nothing>(RComponent::class) {
 *     init {
 *         defaultProps = ...
 *         ...
 *     }
 * }
 * ```
 *
 * in your class components
 */
open class RStatics<P : Props, S : State, C : Component<P, S>, CTX : Context<*>?>(
    klazz: KClass<C>,
) : RComponentClassStatics<P, S, CTX> by klazz.js.unsafeCast<RComponentClassStatics<P, S, CTX>>()
