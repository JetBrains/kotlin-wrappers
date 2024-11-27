// Automatically generated - do not modify!

package mui.system

import js.objects.recordOf
import js.reflect.unsafeCast

external interface ResponsiveStyleValue<T : Any>

inline fun <T : Any> responsive(
    value: T,
): ResponsiveStyleValue<T> =
    unsafeCast(value)

@Suppress("BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER")
fun <T : Any, R> responsive(
    vararg values: Pair<Breakpoint, T>,
): R where R : T,
           R : ResponsiveStyleValue<T> =
    unsafeCast(recordOf(pairs = values))
