@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import js.array.ReadonlyArray
import js.reflect.unsafeCast

@JsExternalInheritorsOnly
sealed external interface ReactNode

inline fun ReactNode(
    source: ReadonlyArray<ReactNode>,
): ReactNode =
    unsafeCast(source)

inline fun ReactNode(
    source: String,
): ReactNode =
    unsafeCast(source)

inline fun ReactNode(
    source: String?,
): ReactNode? =
    unsafeCast(source)

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
