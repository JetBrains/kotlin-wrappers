package react.select

import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface MultiValueRemoveProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var data: Option
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var selectProps: SelectProps<Option, Group>
}
