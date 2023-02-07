package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface SingleValueProps<Option, Group : GroupBase<Option>> : PropsWithChildren {
    var data: Option
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var isDisabled: Boolean
}
