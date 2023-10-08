// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/CalendarPickerSkeleton")

package muix.pickers

import mui.material.styles.Theme
import mui.system.SxProps

external interface CalendarPickerSkeletonProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CalendarPickerSkeletonClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Date Picker](https://mui.com/x/react-date-pickers/date-picker/)
 *
 * API:
 *
 * - [CalendarPickerSkeleton API](https://mui.com/x/api/date-pickers/calendar-picker-skeleton/)
 */
@JsName("CalendarPickerSkeleton")
external val CalendarPickerSkeleton: react.FC<CalendarPickerSkeletonProps>
