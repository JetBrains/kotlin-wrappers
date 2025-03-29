package react.select

import react.PropsWithChildren
import react.RefCallback
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface MenuProps<Option : Any, Group : GroupBase<Option>> :
    PropsWithChildren {

    /** Reference to the internal element, consumed by the MenuPlacer component */
    var innerRef: RefCallback<HTMLDivElement>
    var innerProps: HTMLAttributes<HTMLDivElement>
    var isLoading: Boolean
    var placement: CoercedMenuPlacement
    var selectProps: SelectProps<Option, Group>
}
