package react.select

import react.PropsWithChildren
import react.Ref
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ControlProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var innerRef: Ref<HTMLDivElement>

    /** The mouse down event and the innerRef to pass down to the controller element. */
    var innerProps: HTMLAttributes<HTMLDivElement>

    /** Whether the select is disabled. */
    var isDisabled: Boolean

    /** Whether the select is focused. */
    var isFocused: Boolean

    /** Whether the select is expanded. */
    var menuIsOpen: Boolean

    var selectProps: SelectProps<Option, Group>
}
