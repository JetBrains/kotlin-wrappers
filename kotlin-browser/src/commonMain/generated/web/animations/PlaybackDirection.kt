// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.animations

import seskar.js.JsValue

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
