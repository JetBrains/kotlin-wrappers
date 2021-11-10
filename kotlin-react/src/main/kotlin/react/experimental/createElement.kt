package react.experimental

import kotlinext.js.ReadonlyArray
import react.*

fun createElement(
    block: Render,
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
