package react.select

import dom.html.HTMLDivElement
import react.PropsWithChildren
import react.dom.html.HTMLAttributes

external interface SingleValueProps<Option, Group : GroupBase<Option>> : PropsWithChildren {
    var data: Option
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var isDisabled: Boolean
}
