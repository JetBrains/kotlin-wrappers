package react.select

import react.Props
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface IndicatorSeparatorProps : Props {
    var innerProps: HTMLAttributes<HTMLSpanElement>?
    var isFocused: Boolean
    var isDisabled: Boolean
}
