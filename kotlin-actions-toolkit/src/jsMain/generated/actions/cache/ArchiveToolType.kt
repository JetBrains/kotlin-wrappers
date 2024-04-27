// Automatically generated - do not modify!

package actions.cache

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ArchiveToolType {
    companion object {
        @JsValue("gnu")
        val GNU: ArchiveToolType

        @JsValue("bsd")
        val BSD: ArchiveToolType
    }
}
