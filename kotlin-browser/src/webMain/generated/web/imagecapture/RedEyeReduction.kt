// Automatically generated - do not modify!

package web.imagecapture

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RedEyeReduction

inline val RedEyeReduction.Companion.always: RedEyeReduction
    get() = unsafeCast("always")

inline val RedEyeReduction.Companion.controllable: RedEyeReduction
    get() = unsafeCast("controllable")

inline val RedEyeReduction.Companion.never: RedEyeReduction
    get() = unsafeCast("never")
