// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.html

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Capture {
    companion object {
        @JsValue("false")
        val `false`: Capture

        @JsValue("true")
        val `true`: Capture

        @JsValue("user")
        val user: Capture

        @JsValue("environment")
        val environment: Capture
    }
}
