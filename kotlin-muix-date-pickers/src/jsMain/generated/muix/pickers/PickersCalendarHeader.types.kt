// Automatically generated - do not modify!

package muix.pickers

import mui.material.SlideDirection
import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface PickersCalendarHeaderProps<TDate> :
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * Overridable component slots.
     * @default {}
     */
    var slots: PickersCalendarHeaderSlots?

    /**
     * The props used for each component slot.
     * @default {}
     */
    var slotProps: PickersCalendarHeaderSlotProps<TDate>?

    var currentMonth: TDate

    var disabled: Boolean?

    var views: dynamic

    var onMonthChange: (date: TDate, slideDirection: SlideDirection) -> Unit

    var view: dynamic

    var reduceAnimations: Boolean

    var onViewChange: ((view: mui.system.Union /* 'year' | 'month' | 'day' */) -> Unit)?

    /**
     * Id of the calendar text element.
     * It is used to establish an `aria-labelledby` relationship with the calendar `grid` element.
     */
    var labelId: String?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PickersCalendarHeaderClasses?

    override var className: ClassName?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface PickersCalendarHeaderSlots {
    /**
     * Button displayed to switch between different calendar views.
     * @default IconButton
     */
    var switchViewButton: react.ElementType<*>?

    /**
     * Icon displayed in the SwitchViewButton. Rotated by 180° when the open view is `year`.
     * @default ArrowDropDown
     */
    var switchViewIcon: react.ElementType<*>?
}

external interface PickersCalendarHeaderSlotProps<TDate> : react.Props {
    var switchViewButton: react.Props?

    var switchViewIcon: react.Props?
}
