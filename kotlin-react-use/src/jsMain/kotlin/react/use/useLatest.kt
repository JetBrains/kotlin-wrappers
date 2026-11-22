package react.use

import js.void.Void
import react.RefObject
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

    return LatestInstance(ref)
}

value class LatestInstance<T>(
    @PublishedApi
    internal val ref: RefObject<T & Any>,
) {
    inline operator fun getValue(
        thisRef: Void,
        property: KProperty<*>,
    ): T {
        @Suppress("UNCHECKED_CAST")
        return ref.current as T
    }
}
