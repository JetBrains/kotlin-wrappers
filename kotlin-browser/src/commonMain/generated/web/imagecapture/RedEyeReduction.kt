// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.imagecapture

import seskar.js.JsValue

sealed external interface RedEyeReduction {
    companion object {
        @JsValue("always")
        val always: RedEyeReduction

        @JsValue("controllable")
        val controllable: RedEyeReduction

        @JsValue("never")
        val never: RedEyeReduction
    }
}
