// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface LineBreak {
    companion object {
        @JsValue("anywhere")
        val anywhere: LineBreak

        @JsValue("loose")
        val loose: LineBreak

        @JsValue("normal")
        val normal: LineBreak

        @JsValue("strict")
        val strict: LineBreak
    }
}
