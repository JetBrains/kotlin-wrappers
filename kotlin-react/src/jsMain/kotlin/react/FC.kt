package react

import js.reflect.unsafeCast

fun FC(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): FC<Props> {
    val component = {
        createElementOrNull(block)
    }
    return unsafeCast(component)
}

fun <P : Props> FC(
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = { props: P ->
        createElementOrNull { block(props) }
    }
    return unsafeCast(component)
}

fun FC(
    displayName: String,
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): FC<Props> {
    val component = FC(block)
    component.displayName = displayName
    return component
}

fun <P : Props> FC(
    displayName: String,
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = FC(block)
    component.displayName = displayName
    return component
}
