package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement
import web.html.HTMLElement

external interface MenuPortalProps : PropsWithChildren {
    var appendTo: HTMLElement?
    var controlElement: HTMLDivElement?
    var innerProps: HTMLAttributes<HTMLDivElement>
    var menuPlacement: MenuPlacement?
    var menuPosition: MenuPosition?
}
