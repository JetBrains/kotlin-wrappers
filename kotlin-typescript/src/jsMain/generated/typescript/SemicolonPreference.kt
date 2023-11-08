// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SemicolonPreference {
    companion object {
        @JsValue("ignore")
        val Ignore: SemicolonPreference

        @JsValue("insert")
        val Insert: SemicolonPreference

        @JsValue("remove")
        val Remove: SemicolonPreference
    }
}
