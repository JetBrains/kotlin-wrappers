// Automatically generated - do not modify!

@file:JsModule("@mui/lab/CalendarPickerSkeleton")
@file:JsNonModule

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface CalendarPickerSkeletonProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CalendarPickerSkeletonClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>?
}

external interface CalendarPickerSkeletonClasses {
    /** Styles applied to the root element. */
    var root: String

    /** Styles applied to the week element. */
    var week: String

    /** Styles applied to the day element. */
    var daySkeleton: String
}

/**
 *
 * Demos:
 *
 * - [Date Picker](https://mui.com/components/date-picker/)
 *
 * API:
 *
 * - [CalendarPickerSkeleton API](https://mui.com/api/calendar-picker-skeleton/)
 */
@JsName("default")
external val CalendarPickerSkeleton: react.FC<CalendarPickerSkeletonProps>
