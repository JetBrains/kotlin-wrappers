package react

import js.objects.unsafeJso

internal fun createElementOrNull(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): ReactElement<*>? {
    val childNodes = unsafeJso(block)
        .__children__
        ?: return null

    return Fragment.create {
        children = ReactNode(childNodes)
    }
}
