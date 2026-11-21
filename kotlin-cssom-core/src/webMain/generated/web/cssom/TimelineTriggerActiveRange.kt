// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface TimelineTriggerActiveRange {
    companion object {
        @JsValue("contain")
        val contain: TimelineTriggerActiveRange

        @JsValue("cover")
        val cover: TimelineTriggerActiveRange

        @JsValue("entry")
        val entry: TimelineTriggerActiveRange

        @JsValue("entry-crossing")
        val entryCrossing: TimelineTriggerActiveRange

        @JsValue("exit")
        val exit: TimelineTriggerActiveRange

        @JsValue("exit-crossing")
        val exitCrossing: TimelineTriggerActiveRange

        @JsValue("normal")
        val normal: TimelineTriggerActiveRange
    }
}
