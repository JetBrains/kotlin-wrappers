package react

import kotlinext.js.jsObject
import kotlin.reflect.KClass

// Core

fun <P : RProps> RBuilder.child(
    type: Any,
    props: P,
    children: List<Any>
): ReactElement =
    child(createElement(type, props, *children.toTypedArray()))

fun <P : RProps> RBuilder.child(
    type: Any,
    props: P,
    handler: RHandler<P>
): ReactElement {
    val children = with(RElementBuilder(props)) {
        handler()
        childList
    }
    return child(type, props, children)
}

// KClass

fun <P : RProps> RBuilder.child(
    klazz: KClass<out Component<P, *>>,
    handler: RHandler<P>
): ReactElement =
    klazz.rClass.invoke(handler)

fun <T, P : RProps> RBuilder.childFunction(
    klazz: KClass<out Component<P, *>>,
    handler: RHandler<P>,
    children: RBuilder.(T) -> Unit
): ReactElement =
    child(
        type = klazz.rClass,
        props = RElementBuilder(jsObject<P>()).apply(handler).attrs,
        children = listOf { value: T -> buildElement { children(value) } }
    )

fun <P : RProps> RBuilder.node(
    klazz: KClass<out Component<P, *>>,
    props: P,
    children: List<Any> = emptyList()
): ReactElement =
    klazz.rClass.node(props, children)

// Reified Component Type

inline fun <P : RProps, reified C : Component<P, *>> RBuilder.child(
    noinline handler: RHandler<P>
): ReactElement =
    child(C::class, handler)

inline fun <T, P : RProps, reified C : Component<P, *>> RBuilder.childFunction(
    noinline handler: RHandler<P>,
    noinline children: RBuilder.(T) -> Unit
): ReactElement =
    childFunction(C::class, handler, children)

inline fun <P : RProps, reified C : Component<P, *>> RBuilder.node(
    props: P,
    children: List<Any> = emptyList()
): ReactElement =
    node(C::class, props, children)

// Function Component

fun <P : RProps> RBuilder.child(
    component: FC<P>,
    props: P = jsObject(),
    handler: RHandler<P> = {}
): ReactElement =
    child(component.unsafeCast<Any>(), props, handler)

fun <T, P : RProps> RBuilder.childFunction(
    component: FC<P>,
    handler: RHandler<P> = {},
    children: RBuilder.(T) -> Unit
): ReactElement =
    childFunction(component, jsObject<P>(), handler, children)

fun <T, P : RProps> RBuilder.childFunction(
    component: FC<P>,
    props: P,
    handler: RHandler<P> = {},
    children: RBuilder.(T) -> Unit
): ReactElement =
    child(
        type = component,
        props = RElementBuilder(props).apply(handler).attrs,
        children = listOf { value: T -> buildElement { children(value) } }
    )