package react

import js.reflect.unsafeCast

external interface FC<in P : Props> :
    ComponentType<P>,
    HasDisplayName

fun FC(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): FC<Props> =
    unsafeCast(
        provider = { ->
            createElementOrNull(block)
        },
    )

fun <P : Props> FC(
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): FC<P> =
    unsafeCast(
        provider = { props: P ->
            createElementOrNull { block(props) }
        },
    )

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
