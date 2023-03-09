@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import js.core.ReadonlyArray

sealed external interface ReactNode

inline fun ReactNode(
    source: ReadonlyArray<ReactNode>,
): ReactNode =
    source.unsafeCast<ReactNode>()

inline fun ReactNode(
    source: String,
): ReactNode =
    source.unsafeCast<ReactNode>()

inline fun ReactNode(
    source: String?,
): ReactNode? =
    source.unsafeCast<ReactNode?>()

inline fun ReactNode(
    source: Char,
): ReactNode =
    ReactNode(source.toString())

fun ReactNode.asStringOrNull(): String? =
    asDynamic() as? String

fun ReactNode.asElementOrNull(): ReactElement<*>? =
    if (isValidElement(this)) {
        unsafeCast<ReactElement<*>>()
    } else null
