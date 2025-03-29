package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ClearIndicatorProps<Option : Any, Group : GroupBase<Option>> :
    PropsWithChildren {

    var isFocused: Boolean
    var innerProps: HTMLAttributes<HTMLDivElement>
    var selectProps: SelectProps<Option, Group>
}
