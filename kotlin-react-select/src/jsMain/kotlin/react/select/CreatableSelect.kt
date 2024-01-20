@file:JsModule("react-select/creatable")

package react.select

import react.ComponentClass
import react.ReactNode

external interface CreatableSelectProps<Option : Any, Group : GroupBase<Option>> : SelectProps<Option, Group> {
    /** Allow options to be created while the isLoading prop is true. Useful to prevent the "create new ..." option being displayed while async results are still being loaded */
    var allowCreateWhileLoading: Boolean?

    /** Sets the position of the createOption element in your options list. Defaults to 'last' */
    var createOptionPosition: CreateOptionPosition?

    /** Gets the label for the "create new ..." option in the menu. Is given the current input value */
    var formatCreateLabel: ((inputValue: String) -> ReactNode)?

    /** Determines whether the "create new ..." option should be displayed based on the current input value, select value and options array */
    var isValidNewOption: Boolean?

    /** Returns the data for the new option when it is created. Used to display the value, and is passed to onChange */
    var getNewOptionData: GetNewOptionData<Option>?

    /** If provided, this will be called with the input value when a new option is created, and onChange will not be called. Use this when you need more control over what happens when new options are created */
    var onCreateOption: CreateOptionHandler?
}

@JsName("default")
external val CreatableSelect: ComponentClass<CreatableSelectProps<*, *>>
