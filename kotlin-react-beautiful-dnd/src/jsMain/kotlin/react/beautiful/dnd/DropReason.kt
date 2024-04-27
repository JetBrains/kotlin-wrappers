package react.beautiful.dnd

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface DropReason {
    companion object {
        @JsValue("DROP")
        val DROP: DropReason

        @JsValue("CANCEL")
        val CANCEL: DropReason
    }
}
