package react

import js.core.ReadonlyArray
import js.objects.jso

internal fun createElementOrNull(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): ReactElement<*>? {
    val children: ReadonlyArray<ReactNode?> = jso(block)
        .getChildArray()
        ?: return null

    return createElement(
        type = Fragment,
        children = children,
    )
}
