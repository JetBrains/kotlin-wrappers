package react.select

import dom.html.HTMLDivElement
import dom.html.HTMLElement
import react.PropsWithChildren
import react.dom.html.HTMLAttributes

external interface MenuPortalProps : PropsWithChildren {
    var appendTo: HTMLElement?
    var controlElement: HTMLDivElement?
    var innerProps: HTMLAttributes<HTMLDivElement>
    var menuPlacement: MenuPlacement?
    var menuPosition: MenuPosition?
}
