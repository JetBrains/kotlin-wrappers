// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
