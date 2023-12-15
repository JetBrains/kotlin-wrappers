// Automatically generated - do not modify!

package muix.pickers

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface CalendarPickerView {
    companion object {
        @JsValue("year")
        val year: CalendarPickerView

        @JsValue("day")
        val day: CalendarPickerView

        @JsValue("month")
        val month: CalendarPickerView
    }
}
