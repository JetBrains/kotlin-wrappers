// Automatically generated - do not modify!

package muix.pickers

typealias PickerSelectionState = String

typealias PickerOnChangeFn = (
    date: PickerValidDate?,
    selectionState: PickerSelectionState?,
) -> Unit

typealias PickerValidDate = Any

typealias PickerValue = Any?

typealias PickerVariant = String

typealias PickerOrientation = String

typealias TimeView = String /* 'hours' | 'minutes' | 'seconds' */

typealias DateView = String /* 'year' | 'month' | 'day' */

external interface PickerOwnerState {
    var isPickerValueEmpty: Boolean
    var isPickerOpen: Boolean
    var isPickerDisabled: Boolean
    var isPickerReadOnly: Boolean
    var pickerVariant: PickerVariant
    var pickerOrientation: PickerOrientation
}
