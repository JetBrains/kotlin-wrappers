package react

import js.objects.unsafeJso

internal fun createElementOrNull(
    block: @ReactDsl ChildrenBuilder.() -> Unit,
): ReactElement<*>? {
    val childNodes = unsafeJso(block)
        .buildChildren()
        ?: return null

    return Fragment.create {
        children = childNodes
    }
}
