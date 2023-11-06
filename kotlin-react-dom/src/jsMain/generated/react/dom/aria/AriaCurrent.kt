// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.aria

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AriaCurrent {
    companion object {
        @JsValue("false")
        val `false`: AriaCurrent

        @JsValue("true")
        val `true`: AriaCurrent

        @JsValue("page")
        val page: AriaCurrent

        @JsValue("step")
        val step: AriaCurrent

        @JsValue("location")
        val location: AriaCurrent

        @JsValue("date")
        val date: AriaCurrent

        @JsValue("time")
        val time: AriaCurrent
    }
}
