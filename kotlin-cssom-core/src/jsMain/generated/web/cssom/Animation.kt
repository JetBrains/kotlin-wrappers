// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

// Globals | DataType.SingleAnimation | (string & {})
sealed external interface Animation

inline fun Animation(
    name: AnimationName,
    duration: Time,
): Animation =
    unsafeCast("$name $duration")

inline fun Animation(
    name: AnimationName,
    duration: Time,
    timingFunction: AnimationTimingFunction,
): Animation =
    unsafeCast("$name $duration $timingFunction")

inline fun Animation(
    name: AnimationName,
    duration: Time,
    timingFunction: AnimationTimingFunction,
    delay: Time,
): Animation =
    unsafeCast("$name $duration $timingFunction $delay")
