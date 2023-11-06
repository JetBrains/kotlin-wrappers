// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.aria

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AriaLive {
    companion object {
        @JsValue("off")
        val off: AriaLive

        @JsValue("assertive")
        val assertive: AriaLive

        @JsValue("polite")
        val polite: AriaLive
    }
}
