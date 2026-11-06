// Automatically generated - do not modify!

package mui.system

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import web.cssom.Length

sealed /* union */
external interface SpacingOptions

inline fun SpacingOptions(
    value: Int,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    value: Length,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    value: Spacing,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    noinline value: (abs: Int) -> Length,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    noinline value: (abs: Length) -> Length,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    value: ReadonlyArray<Int>,
): SpacingOptions =
    unsafeCast(value)

typealias SpacingArgument = Int /* web.cssom.Auto */

sealed external interface Spacing {
    operator fun invoke(): Length

    operator fun invoke(value: SpacingArgument): Length

    operator fun invoke(topBottom: SpacingArgument, rightLeft: SpacingArgument): Length

    operator fun invoke(top: SpacingArgument, rightLeft: SpacingArgument, bottom: SpacingArgument): Length

    operator fun invoke(
        top: SpacingArgument,
        right: SpacingArgument,
        bottom: SpacingArgument,
        left: SpacingArgument,
    ): Length
}
