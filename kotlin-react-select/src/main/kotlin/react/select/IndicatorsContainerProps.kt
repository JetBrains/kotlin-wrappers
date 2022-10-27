package react.select

import dom.html.HTMLElement
import react.Props
import react.PropsWithChildren
import react.dom.html.HTMLAttributes

external interface IndicatorsContainerProps : PropsWithChildren {
    var innerProps: Props?
    var isDisabled: Boolean
}
