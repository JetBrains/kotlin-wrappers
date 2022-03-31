@file:Suppress(
    "NOTHING_TO_INLINE",
)
package popper.core.modifiers

import kotlinx.js.jso
import popper.core.Padding

typealias PaddingFunction = (
    options: OffsetsFunctionOptions,
) -> PaddingType

inline fun Padding(
    fn: PaddingFunction,
): PaddingType =
    fn.unsafeCast<PaddingType>()

inline fun Padding(
    padding: Double
): PaddingType =
    padding.unsafeCast<PaddingType>()

inline fun Padding(
    padding: Padding.()->Unit
): PaddingType =
    jso(padding).unsafeCast<PaddingType>()
