// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PlaybackDirection {
    companion object {
        @JsValue("alternate")
        val alternate: PlaybackDirection

        @JsValue("alternate-reverse")
        val alternateReverse: PlaybackDirection

        @JsValue("normal")
        val normal: PlaybackDirection

        @JsValue("reverse")
        val reverse: PlaybackDirection
    }
}
