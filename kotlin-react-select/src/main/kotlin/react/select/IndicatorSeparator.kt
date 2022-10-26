package react.select

import dom.html.HTMLSpanElement
import react.Props
import react.dom.html.HTMLAttributes

external interface IndicatorSeparatorProps : Props {
    var innerProps: HTMLAttributes<HTMLSpanElement>
    var isFocused: Boolean
    var isDisabled: Boolean
}
