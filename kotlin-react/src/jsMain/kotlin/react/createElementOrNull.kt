package react

import js.core.ReadonlyArray
import js.core.jso

internal fun createElementOrNull(
    block: ChildrenBuilder.() -> Unit,
): ReactElement<*>? {
    val children: ReadonlyArray<ReactNode?> = jso(block)
        .children
        ?: return null

    if (children.isEmpty())
        return null

    if (children.size == 1) {
        val child = children.single()
            ?: return null

        if (isValidElement(child))
            return child.unsafeCast<ReactElement<*>>()
    }

    return createElement(Fragment, children = children)
}
