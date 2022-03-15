// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package mui.system

import kotlinx.js.ReadonlyArray

sealed external interface SpacingOptions

inline fun SpacingOptions(
    value: Int,
): SpacingOptions =
    value.unsafeCast<SpacingOptions>()

inline fun SpacingOptions(
    value: Spacing,
): SpacingOptions =
    value.unsafeCast<SpacingOptions>()

inline fun SpacingOptions(
    value: (abs: Int) -> csstype.Length,
): SpacingOptions =
    value.unsafeCast<SpacingOptions>()

inline fun SpacingOptions(
    value: (abs: csstype.Length) -> csstype.Length,
): SpacingOptions =
    value.unsafeCast<SpacingOptions>()

inline fun SpacingOptions(
    value: ReadonlyArray<Int>,
): SpacingOptions =
    value.unsafeCast<SpacingOptions>()

typealias SpacingArgument = Int /* csstype.Auto */
