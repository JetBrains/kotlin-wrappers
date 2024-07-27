// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/PickersDay")

package muix.pickers

import web.cssom.ClassName

sealed external interface PickersDayClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `disableMargin=false`. */
    val dayWithMargin: ClassName

    /** Styles applied to the root element if `outsideCurrentMonth=true` and `showDaysOutsideCurrentMonth=true`. */
    val dayOutsideMonth: ClassName

    /** Styles applied to the root element if `outsideCurrentMonth=true` and `showDaysOutsideCurrentMonth=false`. */
    val hiddenDaySpacingFiller: ClassName

    /** Styles applied to the root element if `disableHighlightToday=false` and `today=true`. */
    val today: ClassName

    /** State class applied to the root element if `selected=true`. */
    val selected: ClassName

    /** State class applied to the root element if `disabled=true`. */
    val disabled: ClassName
}

external val pickersDayClasses: PickersDayClasses
