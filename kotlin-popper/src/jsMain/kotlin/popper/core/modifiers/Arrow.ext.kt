@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import js.core.jso
import popper.core.Padding

inline fun PaddingFunction(
    noinline fn: Provider<Padding>,
): PaddingType = fn.unsafeCast<PaddingType>()

inline fun Padding(
    padding: Double
): PaddingType = padding.unsafeCast<PaddingType>()

inline fun Padding(
    block: Padding.() -> Unit
): PaddingType = jso(block).unsafeCast<PaddingType>()
