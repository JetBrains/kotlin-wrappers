// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ChannelCountMode {
    companion object {
        @JsValue("clamped-max")
        val clampedMax: ChannelCountMode

        @JsValue("explicit")
        val explicit: ChannelCountMode

        @JsValue("max")
        val max: ChannelCountMode
    }
}
