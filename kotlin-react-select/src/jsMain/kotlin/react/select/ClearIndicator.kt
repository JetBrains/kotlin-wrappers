package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ClearIndicatorProps : PropsWithChildren {
    var isFocused: Boolean
    var innerProps: HTMLAttributes<HTMLDivElement>
}
