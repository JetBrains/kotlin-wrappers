@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import js.objects.jso
import js.reflect.unsafeCast
import popper.core.Padding

inline fun PaddingFunction(
    noinline fn: Provider<Padding>,
): PaddingType =
    unsafeCast(fn)

inline fun Padding(
    padding: Double,
): PaddingType =
    unsafeCast(padding)

inline fun Padding(
    block: Padding.() -> Unit,
): PaddingType =
    unsafeCast(jso<Padding>(block))
