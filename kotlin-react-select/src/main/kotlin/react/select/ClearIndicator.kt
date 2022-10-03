package react.select

import dom.html.HTMLDivElement
import react.PropsWithChildren
import react.dom.html.HTMLAttributes

external interface ClearIndicatorProps : PropsWithChildren {
    var isFocused: Boolean
    var innerProps: HTMLAttributes<HTMLDivElement>
}
