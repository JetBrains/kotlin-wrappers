// Automatically generated - do not modify!

package muix.pickers

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ClockPickerView {
    companion object {
        @JsValue("hours")
        val hours: ClockPickerView

        @JsValue("minutes")
        val minutes: ClockPickerView

        @JsValue("seconds")
        val seconds: ClockPickerView
    }
}
