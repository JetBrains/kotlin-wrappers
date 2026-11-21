package react

import kotlin.reflect.KProperty

value class RefValueInstance<T>(
    @PublishedApi
    internal val ref: RefObject<T & Any>,
) {
    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T {
        @Suppress("UNCHECKED_CAST")
        return ref.current as T
    }

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        ref.current = value
    }
}
