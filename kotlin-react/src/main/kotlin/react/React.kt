package react

import kotlinext.js.*
import kotlinx.coroutines.*
import kotlin.js.*
import kotlin.reflect.*

external interface Child

fun Child.isString(): Boolean = asDynamic() is String

fun Child.asStringOrNull(): String? = when {
    isString() -> asDynamic()
    else -> null
}

fun Child.asElementOrNull(): ReactElement? = when {
    asJsObject().hasOwnProperty("\$\$typeof") -> asDynamic()
    else -> null
}

external interface ReactElement : Child {
    val props: RProps
}

fun Children.forEachElement(children: Any?, handler: (ReactElement) -> Unit) =
    forEach(children) {
        val element = it.asElementOrNull()
        element?.let(handler)
    }

inline fun <P : RProps> cloneElement(
    element: ReactElement,
    vararg child: Any?,
    props: P.() -> Unit
): ReactElement = cloneElement(element, jsObject(props), *child)

fun clone(element: dynamic, props: dynamic, child: Any? = null): ReactElement =
    cloneElement(element, props, *Children.toArray(child))

val <P : RProps, T : RComponent<P, *>> KClass<T>.rClass get() =
    js.unsafeCast<RClass<P>>()

// 16.6+
fun <P : RProps> rLazy(loadComponent: suspend () -> RClass<P>): RClass<P> {
    return lazy {
        Promise<RClass<P>> { resolve, reject ->
            GlobalScope.launch {
                try {
                    resolve(loadComponent())
                } catch (e: Throwable) {
                    reject(e)
                }
            }
        }
    }
}

// 16.6+
fun SuspenseProps.fallback(handler: RBuilder.() -> Unit) {
    asDynamic().fallback = buildElements(handler)
}

/**
 * Usage:
 *
 * companion object : ReactStatics<RProps, RState, RComponent, Nothing> {
 *     init {
 *         defaultProps = ...
 *         ...
 *     }
 * }
 *
 * in your class components
 */
open class RStatics<P : RProps, S : RState, C : Component<P, S>, CTX : RContext<Any>?>(
        klazz: KClass<C>
): RComponentClassStatics<P, S, CTX> {
    private val jsClass = klazz.js.asDynamic()

    override var displayName: String?
        get() = jsClass.displayName
        set(value) {
            jsClass.displayName = value
        }

    override var defaultProps: P?
        get() = jsClass.defaultProps
        set(value) {
            jsClass.defaultProps = value
        }

    override var contextType: CTX
        get() = jsClass.contextType
        set(value) {
            jsClass.contextType = value
        }

    override var getDerivedStateFromProps: ((P, S) -> S?)?
        get() = jsClass.getDerivedStateFromProps
        set(value) {
            jsClass.getDerivedStateFromProps = value
        }

    override var getDerivedStateFromError: ((Throwable) -> S?)?
        get() = jsClass.getDerivedStateFromError
        set(value) {
            jsClass.getDerivedStateFromError = value
        }
}
