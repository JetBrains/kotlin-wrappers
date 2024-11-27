package react

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import js.reflect.upcast

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
    upcast<Any>() as? String

fun ReactNode.asElementOrNull(): ReactElement<*>? =
    if (isValidElement(this)) {
        unsafeCast<ReactElement<*>>(this)
    } else null
