package react.select

import react.PropsWithChildren
import react.PropsWithClassName
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ContainerProps : PropsWithChildren, PropsWithClassName {
    var innerProps: HTMLAttributes<HTMLDivElement>
    var isFocused: Boolean
    var isDisabled: Boolean
}
