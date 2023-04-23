// Automatically generated - do not modify!

@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package mui.system

import js.core.ReadonlyArray

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
    noinline value: (abs: Int) -> web.cssom.Length,
): SpacingOptions =
    value.unsafeCast<SpacingOptions>()

inline fun SpacingOptions(
    noinline value: (abs: web.cssom.Length) -> web.cssom.Length,
): SpacingOptions =
    value.unsafeCast<SpacingOptions>()

inline fun SpacingOptions(
    value: ReadonlyArray<Int>,
): SpacingOptions =
    value.unsafeCast<SpacingOptions>()

typealias SpacingArgument = Int /* web.cssom.Auto */

sealed interface Spacing {
    inline operator fun invoke(): web.cssom.Length =
        asDynamic()()

    inline operator fun invoke(value: Int): web.cssom.Length =
        asDynamic()(value)

    inline operator fun invoke(topBottom: SpacingArgument, rightLeft: SpacingArgument): web.cssom.Length =
        asDynamic()(topBottom, rightLeft)

    inline operator fun invoke(
        top: SpacingArgument,
        rightLeft: SpacingArgument,
        bottom: SpacingArgument,
    ): web.cssom.Length =
        asDynamic()(top, rightLeft, bottom)

    inline operator fun invoke(
        top: SpacingArgument,
        right: SpacingArgument,
        bottom: SpacingArgument,
        left: SpacingArgument,
    ): web.cssom.Length =
        asDynamic()(top, right, bottom, left)
}
