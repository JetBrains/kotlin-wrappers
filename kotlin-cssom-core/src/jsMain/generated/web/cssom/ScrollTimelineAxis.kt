// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ScrollTimelineAxis {
    companion object {
        @JsValue("block")
        val block: ScrollTimelineAxis

        @JsValue("horizontal")
        val horizontal: ScrollTimelineAxis

        @JsValue("inline")
        val inline: ScrollTimelineAxis

        @JsValue("vertical")
        val vertical: ScrollTimelineAxis
    }
}
