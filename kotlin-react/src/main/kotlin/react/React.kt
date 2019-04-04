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
 * companion object : ReactStatics<RProps, RState> {
 *     ...
 * }
 *
 * in your class components
 */
abstract class ReactStatics<P : RProps, S : RState> : RClass<P> {
    val defaultProps: P? = undefined

    // 16.3+
    val getDerivedStateFromProps: ((P, S) -> S?)? = undefined

    // 16.6+
    val getDerivedStateFromError: ((Throwable) -> S?)? = undefined
    val contextType: RContext<*>? = undefined
}
