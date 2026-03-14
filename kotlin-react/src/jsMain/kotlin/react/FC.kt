package react

import js.reflect.unsafeCast

external interface FC<in P : Props> :
    ComponentType<P>,
    HasDisplayName

fun FC(
    block: ChildrenBuilder.() -> Unit,
): FC<Props> =
    unsafeCast(
        provider = { ->
            createElementOrNull(block)
        },
    )

fun <P : Props> FC(
    block: ChildrenBuilder.(props: P) -> Unit,
): FC<P> =
    unsafeCast(
        provider = { props: P ->
            createElementOrNull { block(props) }
        },
    )

fun FC(
    displayName: String,
    block: ChildrenBuilder.() -> Unit,
): FC<Props> {
    val component = FC(block)
    component.displayName = displayName
    return component
}

fun <P : Props> FC(
    displayName: String,
    block: ChildrenBuilder.(props: P) -> Unit,
): FC<P> {
    val component = FC(block)
    component.displayName = displayName
    return component
}
