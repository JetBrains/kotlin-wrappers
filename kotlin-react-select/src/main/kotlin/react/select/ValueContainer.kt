package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ValueContainerProps : PropsWithChildren {
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var isDisabled: Boolean
}
