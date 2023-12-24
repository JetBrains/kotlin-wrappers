// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.form

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FormStateRestoreMode {
    companion object {
        @JsValue("restore")
        val restore: FormStateRestoreMode

        @JsValue("autocomplete")
        val autocomplete: FormStateRestoreMode
    }
}
