// Automatically generated - do not modify!

package muix.pickers

import js.array.ReadonlyArray
import mui.material.SlideDirection
import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.system.Union
import react.ElementType
import react.Props
import react.PropsWithClassName
import web.cssom.ClassName

external interface PickersCalendarHeaderProps<TDate> :
    PropsWithClassName,
    PropsWithSx {
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

    var views: ReadonlyArray<String /* 'year' | 'month' | 'day' */>

    var onMonthChange: (date: TDate, slideDirection: SlideDirection) -> Unit

    var view: String /* 'year' | 'month' | 'day' */

    var reduceAnimations: Boolean

    var onViewChange: ((view: Union /* 'year' | 'month' | 'day' */) -> Unit)?

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
    var switchViewButton: ElementType<*>?

    /**
     * Icon displayed in the SwitchViewButton. Rotated by 180° when the open view is `year`.
     * @default ArrowDropDown
     */
    var switchViewIcon: ElementType<*>?
}

external interface PickersCalendarHeaderSlotProps<TDate> : Props {
    var switchViewButton: Props?

    var switchViewIcon: Props?
}
