@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package react.use

import js.core.Void
import js.reflect.unsafeCast
import react.useRef
import kotlin.reflect.KProperty

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useLatest.ts)
 */
fun <T> useLatest(
    value: T,
): LatestInstance<T> {
    val ref = useRef<T & Any>()
    ref.current = value

    return unsafeCast(ref)
}

sealed external interface LatestInstance<T> {
    inline operator fun getValue(
        thisRef: Void,
        property: KProperty<*>,
    ): T {
        return asDynamic().current
    }
}
