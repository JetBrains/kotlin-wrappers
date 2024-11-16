@file:Suppress(
    "NOTHING_TO_INLINE",
)

package remix.run.router

import js.reflect.unsafeCast

// boolean | ActionFunction<Context>
sealed external interface ActionLike

inline fun ActionLike(
    value: Boolean,
): ActionLike =
    unsafeCast(value)
