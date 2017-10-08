package react

import kotlinext.js.*

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

fun React.Children.forEachElement(children: Any?, handler: (ReactElement) -> Unit) =
    forEach(children) {
        val element = it.asElementOrNull()
        element?.let(handler)
    }

inline fun <P : RProps> React.cloneElement(
    element: ReactElement,
    vararg child: Any?,
    props: P.() -> Unit
): ReactElement = React.cloneElement(element, jsObject(props), *child)

fun React.clone(element: dynamic, props: dynamic, child: Any? = null): ReactElement =
    React.cloneElement(element, props, *React.Children.toArray(child))

