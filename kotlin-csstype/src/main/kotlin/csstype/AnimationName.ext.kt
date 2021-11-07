@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun AnimationName(
    value: String,
): AnimationName =
    value.unsafeCast<AnimationName>()
