// Automatically generated - do not modify!

package mui.system

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import seskar.js.JsNative

sealed external interface SpacingOptions

inline fun SpacingOptions(
    value: Int,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    value: Spacing,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    noinline value: (abs: Int) -> web.cssom.Length,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    noinline value: (abs: web.cssom.Length) -> web.cssom.Length,
): SpacingOptions =
    unsafeCast(value)

inline fun SpacingOptions(
    value: ReadonlyArray<Int>,
): SpacingOptions =
    unsafeCast(value)

typealias SpacingArgument = Int /* web.cssom.Auto */

sealed external interface Spacing {
    @JsNative
    operator fun invoke(): web.cssom.Length

    @JsNative
    operator fun invoke(value: SpacingArgument): web.cssom.Length

    @JsNative
    operator fun invoke(topBottom: SpacingArgument, rightLeft: SpacingArgument): web.cssom.Length

    @JsNative
    operator fun invoke(top: SpacingArgument, rightLeft: SpacingArgument, bottom: SpacingArgument): web.cssom.Length

    @JsNative
    operator fun invoke(
        top: SpacingArgument,
        right: SpacingArgument,
        bottom: SpacingArgument,
        left: SpacingArgument,
    ): web.cssom.Length
}
