// Automatically generated - do not modify!

@file:JsModule("@mui/x-date-pickers/MonthPicker")
@file:JsNonModule

package muix.pickers

import csstype.ClassName
import kotlinx.js.Void
import mui.material.styles.Theme
import mui.system.SxProps
import kotlin.js.Promise

external interface MonthPickerProps<TDate> :
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * className applied to the root element.
     */
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MonthPickerClasses?

    /** Date value for the MonthPicker */
    var date: TDate?

    /** If `true` picker is disabled */
    var disabled: Boolean?

    /** If `true` past days are disabled. */
    var disablePast: Boolean?

    /** If `true` future days are disabled. */
    var disableFuture: Boolean?

    /** Minimal selectable date. */
    var minDate: TDate

    /** Maximal selectable date. */
    var maxDate: TDate

    /** Callback fired on date change. */
    var onChange: PickerOnChangeFn<TDate>

    /** If `true` picker is readonly */
    var readOnly: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface ExportedMonthPickerProps<TDate> : react.Props {
    /**
     * Callback firing on month change @DateIOType.
     * @template TDate
     * @param {TDate} month The new year.
     * @returns {void|Promise} -
     */
    var onMonthChange: ((month: TDate) -> Promise<Void>?)?

    /**
     * Disable specific months dynamically.
     * Works like `shouldDisableDate` but for month selection view @DateIOType.
     * @template TDate
     * @param {TDate} month The month to check.
     * @returns {boolean} If `true` the month will be disabled.
     */
    var shouldDisableMonth: ((month: TDate) -> Boolean)?
}


external val MonthPicker: react.FC<MonthPickerProps<*>>
