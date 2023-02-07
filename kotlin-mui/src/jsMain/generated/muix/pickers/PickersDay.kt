// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/PickersDay")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package muix.pickers

import mui.material.styles.Theme
import mui.system.SxProps

external interface PickersDayProps<TDate> :
    mui.material.ButtonBaseProps,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PickersDayClasses?

    /**
     * The date to show.
     */
    var day: TDate

    /**
     * If `true`, renders as disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, today's date is rendering without highlighting with circle.
     * @default false
     */
    var disableHighlightToday: Boolean?

    /**
     * If `true`, days are rendering without margin. Useful for displaying linked range of days.
     * @default false
     */
    var disableMargin: Boolean?

    var isAnimating: Boolean?

    var onFocus: ((event: react.dom.events.FocusEvent<web.html.HTMLButtonElement>, day: TDate) -> Unit)?

    var onBlur: ((event: react.dom.events.FocusEvent<web.html.HTMLButtonElement>, day: TDate) -> Unit)?

    var onKeyDown: ((event: react.dom.events.KeyboardEvent<web.html.HTMLButtonElement>, day: TDate) -> Unit)?

    var onDaySelect: (day: TDate, isFinish: PickerSelectionState) -> Unit

    /**
     * If `true`, day is outside of month and will be hidden.
     */
    var outsideCurrentMonth: Boolean

    /**
     * If `true`, renders as selected.
     * @default false
     */
    var selected: Boolean?

    /**
     * If `true`, days that have `outsideCurrentMonth={true}` are displayed.
     * @default false
     */
    var showDaysOutsideCurrentMonth: Boolean?

    /**
     * If `true`, renders as today date.
     * @default false
     */
    var today: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}


external val PickersDay: react.FC<PickersDayProps<*>>
