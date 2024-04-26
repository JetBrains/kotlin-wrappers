@file:Suppress(
    "NOTHING_TO_INLINE",
)

package remix.run.router

// boolean | LoaderFunction<Context>
sealed external interface LoaderLike

inline fun LoaderLike(
    value: Boolean,
): LoaderLike =
    value.unsafeCast<LoaderLike>()
