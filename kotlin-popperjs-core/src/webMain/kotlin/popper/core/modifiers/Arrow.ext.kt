package popper.core.modifiers

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
