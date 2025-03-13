package react.select

import react.Props
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface IndicatorSeparatorProps<Option : Any, Group : GroupBase<Option>> : Props {
    var innerProps: HTMLAttributes<HTMLSpanElement>?
    var isFocused: Boolean
    var isDisabled: Boolean
    var selectProps: SelectProps<Option, Group>
}
