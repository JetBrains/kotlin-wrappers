package react

import js.array.ReadonlyArray
import js.objects.unsafeJso

internal fun createElementOrNull(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): ReactElement<*>? {
    val children: ReadonlyArray<ReactNode?> = unsafeJso(block)
        .getChildArray()
        ?: return null

    return createElement(
        type = Fragment,
        children = children,
    )
}
