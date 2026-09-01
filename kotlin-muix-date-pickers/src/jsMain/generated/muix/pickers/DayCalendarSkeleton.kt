// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/DayCalendarSkeleton")

package muix.pickers

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.FC
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface DayCalendarSkeletonProps :
    HTMLAttributes<HTMLDivElement>,
    PropsWithSx {
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
external val DayCalendarSkeleton: FC<DayCalendarSkeletonProps>
