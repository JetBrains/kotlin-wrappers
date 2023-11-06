// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.aria

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AriaInvalid {
    companion object {
        @JsValue("false")
        val `false`: AriaInvalid

        @JsValue("true")
        val `true`: AriaInvalid

        @JsValue("grammar")
        val grammar: AriaInvalid

        @JsValue("spelling")
        val spelling: AriaInvalid
    }
}
