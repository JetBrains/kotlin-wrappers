package react

import js.reflect.legacyUnsafeCast

fun FC(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): FC<Props> =
    legacyUnsafeCast {
        createElementOrNull(block)
    }

fun <P : Props> FC(
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): FC<P> =
    legacyUnsafeCast { props: P ->
        createElementOrNull { block(props) }
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
