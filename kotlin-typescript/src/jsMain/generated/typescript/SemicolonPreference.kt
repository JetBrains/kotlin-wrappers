// Automatically generated - do not modify!

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
