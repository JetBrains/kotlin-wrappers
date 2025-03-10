// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.audio

import seskar.js.JsValue

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
