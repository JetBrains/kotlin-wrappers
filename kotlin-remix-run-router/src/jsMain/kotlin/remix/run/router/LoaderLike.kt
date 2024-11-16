@file:Suppress(
    "NOTHING_TO_INLINE",
)

package remix.run.router

import js.reflect.unsafeCast

// boolean | LoaderFunction<Context>
sealed external interface LoaderLike

inline fun LoaderLike(
    value: Boolean,
): LoaderLike =
    unsafeCast(value)
