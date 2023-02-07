@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.use

import js.core.Void
import react.useRef
import kotlin.reflect.KProperty

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useLatest.ts)
 */
fun <T : Any> useLatest(
    value: T,
): LatestInstance<T> {
    val ref = useRef(value)
    ref.current = value

    return ref.unsafeCast<LatestInstance<T>>()
}

// TODO: make external in IR
class LatestInstance<T>
private constructor() {
    inline operator fun getValue(
        thisRef: Void,
        property: KProperty<*>,
    ): T {
        return asDynamic().current
    }
}
