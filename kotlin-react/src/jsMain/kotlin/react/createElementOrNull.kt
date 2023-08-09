package react

import js.core.ReadonlyArray
import js.core.jso

internal fun createElementOrNull(
    block: ChildrenBuilder.() -> Unit,
): ReactElement<*>? {
    val children: ReadonlyArray<ReactNode?> = jso(block)
        .childArray
        ?: return null

    return createElement(
        type = Fragment,
        children = children,
    )
}
