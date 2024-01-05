@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.array

inline fun <T> Array<T>.push(
    item: T,
) {
    asDynamic().push(item)
}

inline fun <T> Array<T>.push(
    vararg items: T,
) {
    asDynamic().push.apply(this, items)
}
