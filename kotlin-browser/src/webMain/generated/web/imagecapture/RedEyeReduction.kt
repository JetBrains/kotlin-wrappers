// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.imagecapture

import js.reflect.unsafeCast

sealed external interface RedEyeReduction {
    companion object
}

inline val RedEyeReduction.Companion.always: RedEyeReduction
    get() = unsafeCast("always")

inline val RedEyeReduction.Companion.controllable: RedEyeReduction
    get() = unsafeCast("controllable")

inline val RedEyeReduction.Companion.never: RedEyeReduction
    get() = unsafeCast("never")
