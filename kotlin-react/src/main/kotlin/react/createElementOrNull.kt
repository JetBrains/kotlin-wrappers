package react

import kotlinx.js.ReadonlyArray

internal fun createElementOrNull(
    block: ChildrenBuilder.() -> Unit,
): ReactElement? {
    val children: ReadonlyArray<ReactNode?> = ChildrenBuilder()
        .apply(block)
        .children
        ?: return null

    if (children.isEmpty())
        return null

    if (children.size == 1) {
        val child = children.single()
            ?: return null

        if (isValidElement(child))
            return child.unsafeCast<ReactElement>()
    }

    return createElement(Fragment, children = children)
}
