package react

import js.reflect.unsafeCast

fun FC(
    block: context(ChildrenBuilder) () -> Unit,
): FC<Props> =
    unsafeCast(
        provider = { ->
            createElement(block)
        },
    )

fun <P : Props> FC(
    block: context(ChildrenBuilder) (props: P) -> Unit,
): FC<P> =
    unsafeCast(
        provider = { props: P ->
            createElement { block(props) }
        },
    )

fun FC(
    displayName: String,
    block: context(ChildrenBuilder) () -> Unit,
): FC<Props> {
    val component = FC(block)
    component.displayName = displayName
    return component
}

fun <P : Props> FC(
    displayName: String,
    block: context(ChildrenBuilder) (props: P) -> Unit,
): FC<P> {
    val component = FC(block)
    component.displayName = displayName
    return component
}
