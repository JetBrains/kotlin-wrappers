// Automatically generated - do not modify!

@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
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

sealed interface Spacing {
    inline operator fun invoke(): csstype.Length =
        asDynamic()()

    inline operator fun invoke(value: Int): csstype.Length =
        asDynamic()(value)

    inline operator fun invoke(topBottom: SpacingArgument, rightLeft: SpacingArgument): csstype.Length =
        asDynamic()(topBottom, rightLeft)

    inline operator fun invoke(
        top: SpacingArgument,
        rightLeft: SpacingArgument,
        bottom: SpacingArgument,
    ): csstype.Length =
        asDynamic()(top, rightLeft, bottom)

    inline operator fun invoke(
        top: SpacingArgument,
        right: SpacingArgument,
        bottom: SpacingArgument,
        left: SpacingArgument,
    ): csstype.Length =
        asDynamic()(top, right, bottom, left)
}
