// Automatically generated - do not modify!

package mui.system

import js.objects.Record

external interface ResponsiveStyleValue<T : Any>

@Suppress("NOTHING_TO_INLINE")
inline fun <T : Any> responsive(
    value: T,
): ResponsiveStyleValue<T> =
    value.unsafeCast<ResponsiveStyleValue<T>>()

@Suppress("BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER")
fun <T : Any, R> responsive(
    vararg values: Pair<Breakpoint, T>,
): R where R : T,
           R : ResponsiveStyleValue<T> =
    Record<Breakpoint, T> {
        for ((key, value) in values) {
            set(key, value)
        }
    }.unsafeCast<R>()
