@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.core

inline fun <T> Array<T>.push(
    item: T,
) {
    asDynamic().push(item)
}
