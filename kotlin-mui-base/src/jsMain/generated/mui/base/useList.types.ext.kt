// Automatically generated - do not modify!

package mui.base

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FocusManagementType {
    companion object {
        @JsValue("DOM")
        val DOM: FocusManagementType

        @JsValue("activeDescendant")
        val activeDescendant: FocusManagementType
    }
}

@JsVirtual
sealed external interface SelectionMode {
    companion object {
        @JsValue("none")
        val none: SelectionMode

        @JsValue("single")
        val single: SelectionMode

        @JsValue("multiple")
        val multiple: SelectionMode
    }
}
