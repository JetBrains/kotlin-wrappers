package react

import js.objects.unsafeJso

internal fun createElementOrNull(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): ReactElement<*>? {
    val children = unsafeJso(block)
        .__children__
        ?: return null

    return createElement(
        type = Fragment,
        children = children,
    )
}
