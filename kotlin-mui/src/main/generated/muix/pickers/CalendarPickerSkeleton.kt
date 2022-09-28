// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/CalendarPickerSkeleton")
@file:JsNonModule

package muix.pickers

import mui.material.styles.Theme
import mui.system.SxProps

external interface CalendarPickerSkeletonProps :
    react.dom.html.HTMLAttributes<dom.html.HTMLDivElement>,
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
external val CalendarPickerSkeleton: react.FC<CalendarPickerSkeletonProps>
