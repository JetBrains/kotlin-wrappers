@file:Suppress(
    "NOTHING_TO_INLINE",
)

package remix.run.router

// boolean | ActionFunction<Context>
sealed external interface ActionLike

inline fun ActionLike(
    value: Boolean,
): ActionLike =
    value.unsafeCast<ActionLike>()
