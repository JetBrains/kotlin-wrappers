package react.select

import react.PropsWithChildren
import react.RefCallback
import react.dom.html.HTMLAttributes
import web.cssom.Length
import web.html.HTMLDivElement

external interface MenuListProps<Option, Group : GroupBase<Option>> : PropsWithChildren {
    var maxHeight: Length

    /** Reference to the internal element, consumed by the MenuPlacer component */
    var innerRef: RefCallback<HTMLDivElement>
    var focusedOption: Option
    var innerProps: HTMLAttributes<HTMLDivElement>
}
