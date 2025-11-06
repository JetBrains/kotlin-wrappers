package react

import js.internal.InternalApi
import js.reflect.unsafeCast

@InternalApi
sealed external interface ReactNodeArray :
    ReactNode {
    fun push(node: ReactNode?)
}

internal inline fun ReactNodeArray(
    node: ReactNode?,
): ReactNodeArray =
    unsafeCast(arrayOf(node))
