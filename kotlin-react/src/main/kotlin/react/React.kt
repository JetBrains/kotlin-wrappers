package react

import kotlinext.js.asJsObject
import kotlinext.js.jsObject

external interface Child

fun Child.asStringOrNull(): String? =
    asDynamic() as? String

fun Child.asElementOrNull(): ReactElement? = when {
    asJsObject().hasOwnProperty("\$\$typeof") -> unsafeCast<ReactElement>()
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

// 16.6+
fun SuspenseProps.fallback(handler: RRender) {
    asDynamic().fallback = buildElements(handler)
}
