// Automatically generated - do not modify!

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Notation {
    companion object {
        @JsValue("standard")
        val standard: Notation

        @JsValue("scientific")
        val scientific: Notation

        @JsValue("engineering")
        val engineering: Notation

        @JsValue("compact")
        val compact: Notation
    }
}
