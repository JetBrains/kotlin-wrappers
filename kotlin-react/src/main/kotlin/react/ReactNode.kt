@file:Suppress("NOTHING_TO_INLINE")

package react

sealed external interface ReactNode

inline fun ReactNode(string: String): ReactNode =
    string.unsafeCast<ReactNode>()

fun ReactNode.asStringOrNull(): String? =
    asDynamic() as? String

fun ReactNode.asElementOrNull(): ReactElement? =
    if (isValidElement(this)) {
        unsafeCast<ReactElement>()
    } else null
