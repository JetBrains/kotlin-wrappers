package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface PlaceholderProps<Option : Any, Group : GroupBase<Option>> :
    PropsWithChildren {

    var innerProps: HTMLAttributes<HTMLDivElement>
    var isFocused: Boolean
    var isDisabled: Boolean
    var selectProps: SelectProps<Option, Group>
}
