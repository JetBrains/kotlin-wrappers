package react.select

import dom.html.HTMLElement
import react.PropsWithChildren
import react.dom.html.HTMLAttributes

external interface IndicatorsContainerProps : PropsWithChildren {
    var innerProps: HTMLAttributes<HTMLElement>?
    var isDisabled: Boolean
}
