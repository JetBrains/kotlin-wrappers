package popper.core.modifiers

import js.reflect.unsafeCast
import js.reflect.legacyUnsafeCast
import popper.core.Padding

inline fun PaddingFunction(
    noinline fn: Provider<Padding>,
): PaddingType =
    legacyUnsafeCast(fn)

inline fun Padding(
    padding: Double,
): PaddingType =
    unsafeCast(padding)
