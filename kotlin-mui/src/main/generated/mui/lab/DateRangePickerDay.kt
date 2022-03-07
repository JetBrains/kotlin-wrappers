// Automatically generated - do not modify!

@file:JsModule("@mui/lab/DateRangePickerDay")
@file:JsNonModule

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface DateRangePickerDayProps<TDate> : mui.system.PropsWithSx {
    /**
     * Set to `true` if the `day` is in a highlighted date range.
     */
    var isHighlighting: Boolean

    /**
     * Set to `true` if the `day` is the end of a highlighted date range.
     */
    var isEndOfHighlighting: Boolean

    /**
     * Set to `true` if the `day` is the start of a highlighted date range.
     */
    var isStartOfHighlighting: Boolean

    /**
     * Set to `true` if the `day` is in a preview date range.
     */
    var isPreviewing: Boolean

    /**
     * Set to `true` if the `day` is the start of a highlighted date range.
     */
    var isEndOfPreviewing: Boolean

    /**
     * Set to `true` if the `day` is the end of a highlighted date range.
     */
    var isStartOfPreviewing: Boolean

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DateRangePickerDayClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface DateRangePickerDayClasses {
    /** Styles applied to the root element. */
    var root: String

    /** Styles applied to the root element if `isHighlighting=true` and `outsideCurrentMonth=false`. */
    var rangeIntervalDayHighlight: String

    /** Styles applied to the root element if `isStartOfHighlighting=true` or `day` is the start of the month. */
    var rangeIntervalDayHighlightStart: String

    /** Styles applied to the root element if `isEndOfHighlighting=true` or `day` is the end of the month. */
    var rangeIntervalDayHighlightEnd: String

    /** Styles applied to the preview element. */
    var rangeIntervalPreview: String

    /** Styles applied to the root element if `isPreviewing=true` and `outsideCurrentMonth=false`. */
    var rangeIntervalDayPreview: String

    /** Styles applied to the root element if `isStartOfPreviewing=true` or `day` is the start of the month. */
    var rangeIntervalDayPreviewStart: String

    /** Styles applied to the root element if `isEndOfPreviewing=true` or `day` is the end of the month. */
    var rangeIntervalDayPreviewEnd: String

    /** Styles applied to the day element. */
    var day: String

    /** Styles applied to the day element if `isHighlighting=false`. */
    var dayOutsideRangeInterval: String

    /** Styles applied to the day element if `selected=false` and `isHighlighting=true`. */
    var dayInsideRangeInterval: String

    /** Styles applied to the day element if `selected=false`. */
    var notSelectedDate: String
}

/**
 *
 * Demos:
 *
 * - [Date Range Picker](https://mui.com/components/date-range-picker/)
 *
 * API:
 *
 * - [DateRangePickerDay API](https://mui.com/api/date-range-picker-day/)
 */
@JsName("default")
external val DateRangePickerDay: react.FC<DateRangePickerDayProps<*>>
