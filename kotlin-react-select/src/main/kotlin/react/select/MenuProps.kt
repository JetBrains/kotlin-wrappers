package react.select

import dom.html.HTMLDivElement
import react.PropsWithChildren
import react.RefCallback
import react.dom.html.HTMLAttributes

external interface MenuProps : PropsWithChildren {
    /** Reference to the internal element, consumed by the MenuPlacer component */
    var innerRef: RefCallback<HTMLDivElement>
    var innerProps: HTMLAttributes<HTMLDivElement>
    var isLoading: Boolean
    var placement: CoercedMenuPlacement
}
