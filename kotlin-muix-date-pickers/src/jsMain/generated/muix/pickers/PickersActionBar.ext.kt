// Automatically generated - do not modify!

package muix.pickers

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface PickersActionBarAction {
    companion object {
        @JsValue("clear")
        val clear: PickersActionBarAction

        @JsValue("cancel")
        val cancel: PickersActionBarAction

        @JsValue("accept")
        val accept: PickersActionBarAction

        @JsValue("today")
        val today: PickersActionBarAction
    }
}
