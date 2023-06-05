// Automatically generated - do not modify!

package mui.base

external interface SelectOption<TValue> {
    var value: TValue

    var label: react.ReactNode

    var disabled: Boolean?
}

external interface SelectOptionGroup {
    var options: dynamic

    var label: react.ReactNode

    var disabled: Boolean?
}

external interface UseSelectResult<TValue> {
    var buttonActive: Boolean

    var buttonFocusVisible: Boolean

    var disabled: Boolean

    var getButtonProps: react.Props /* <TOther extends EventHandlers = {}>(otherHandlers?: TOther) => UseSelectButtonSlotProps<TOther> */

    var getListboxProps: react.Props /* <TOther extends EventHandlers = {}>(otherHandlers?: TOther) => UseSelectListboxSlotProps<TOther> */

    var contextValue: dynamic
    var registerHighlightChangeHandler: dynamic
    var registerSelectionChangeHandler: dynamic

    var highlightedOption: TValue?

    var open: Boolean

    var value: Any /* SelectValue<TValue, Multiple> */
}
