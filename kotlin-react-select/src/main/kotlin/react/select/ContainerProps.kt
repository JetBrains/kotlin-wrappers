package react.select

import dom.html.HTMLDivElement
import react.PropsWithChildren
import react.PropsWithClassName
import react.dom.html.HTMLAttributes

external interface ContainerProps : PropsWithChildren, PropsWithClassName {
    var innerProps: HTMLAttributes<HTMLDivElement>
    var isFocused: Boolean
    var isDisabled: Boolean
}
