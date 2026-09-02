// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/PickerDay")

package muix.pickers

import kotlinx.js.JsPlainObject
import web.cssom.ClassName

@JsPlainObject
external interface PickerDayClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `outsideCurrentMonth=true` and `showDaysOutsideCurrentMonth=true`. */
    val dayOutsideMonth: ClassName

    /** Styles applied to the root element if `outsideCurrentMonth=true` and `showDaysOutsideCurrentMonth=false`. */
    val fillerCell: ClassName

    /** Styles applied to the root element if `disableHighlightToday=false` and `today=true`. */
    val today: ClassName

    /** State class applied to the root element if `selected=true`. */
    val selected: ClassName

    /** State class applied to the root element if `disabled=true`. */
    val disabled: ClassName
}

external val pickerDayClasses: PickerDayClasses
