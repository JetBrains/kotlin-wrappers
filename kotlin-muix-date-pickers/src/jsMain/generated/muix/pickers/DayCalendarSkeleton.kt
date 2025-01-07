// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/DayCalendarSkeleton")

package muix.pickers

import mui.material.styles.Theme
import mui.system.SxProps

external interface DayCalendarSkeletonProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DayCalendarSkeletonClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * Demos:
 *
 * - [DateCalendar](https://mui.com/x/react-date-pickers/date-calendar/)
 *
 * API:
 *
 * - [CalendarPickerSkeleton API](https://mui.com/x/api/date-pickers/calendar-picker-skeleton/)
 */
external val DayCalendarSkeleton: react.FC<DayCalendarSkeletonProps>
