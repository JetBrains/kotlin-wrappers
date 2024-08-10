package react.select

import seskar.js.JsValue

sealed external interface FormatOptionLabelContext {
    companion object {
        @JsValue("menu")
        val menu: FormatOptionLabelContext

        @JsValue("value")
        val value: FormatOptionLabelContext
    }
}
