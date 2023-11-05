// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface System {
    companion object {
        @JsValue("additive")
        val additive: System

        @JsValue("alphabetic")
        val alphabetic: System

        @JsValue("cyclic")
        val cyclic: System

        @JsValue("fixed")
        val fixed: System

        @JsValue("numeric")
        val numeric: System

        @JsValue("symbolic")
        val symbolic: System
    }
}
