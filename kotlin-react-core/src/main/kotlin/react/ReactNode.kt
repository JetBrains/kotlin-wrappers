@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlinx.js.ReadonlyArray

sealed external interface ReactNode

inline fun ReactNode(
    source: ReadonlyArray<ReactNode>,
): ReactNode =
    source.unsafeCast<ReactNode>()

inline fun ReactNode(
    source: String,
): ReactNode =
    source.unsafeCast<ReactNode>()

fun ReactNode.asStringOrNull(): String? =
    asDynamic() as? String

fun ReactNode.asElementOrNull(): ReactElement<*>? =
    if (isValidElement(this)) {
        unsafeCast<ReactElement<*>>()
    } else null
