package react.select

import dom.html.HTMLDivElement
import react.PropsWithChildren
import react.dom.html.HTMLAttributes

external interface ValueContainerProps : PropsWithChildren {
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var isDisabled: Boolean
}
