// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

// Globals | DataType.SingleAnimation | (string & {})
sealed external interface Animation

inline fun Animation(
    name: AnimationName,
    duration: Time,
): Animation =
    "$name $duration".unsafeCast<Animation>()

inline fun Animation(
    name: AnimationName,
    duration: Time,
    timingFunction: AnimationTimingFunction,
): Animation =
    "$name $duration $timingFunction".unsafeCast<Animation>()

inline fun Animation(
    name: AnimationName,
    duration: Time,
    timingFunction: AnimationTimingFunction,
    delay: Time,
): Animation =
    "$name $duration $timingFunction $delay".unsafeCast<Animation>()
