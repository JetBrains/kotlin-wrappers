// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface TimelineTriggerActivationRange {
    companion object {
        @JsValue("contain")
        val contain: TimelineTriggerActivationRange

        @JsValue("cover")
        val cover: TimelineTriggerActivationRange

        @JsValue("entry")
        val entry: TimelineTriggerActivationRange

        @JsValue("entry-crossing")
        val entryCrossing: TimelineTriggerActivationRange

        @JsValue("exit")
        val exit: TimelineTriggerActivationRange

        @JsValue("exit-crossing")
        val exitCrossing: TimelineTriggerActivationRange
    }
}
