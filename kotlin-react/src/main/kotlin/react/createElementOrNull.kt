package react

import kotlinx.js.ReadonlyArray

internal fun createElementOrNull(
    block: ChildrenBuilder.() -> Unit,
): ReactElement? {
    val children: ReadonlyArray<ReactNode>? = ChildrenBuilder()
        .apply(block)
        .children

    return when {
        children == null -> null
        children.size == 0 -> null
        children.size == 1 && isValidElement(children.first()) -> children.first().unsafeCast<ReactElement>()
        else -> createElement(Fragment, children = children)
    }
}
