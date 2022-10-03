package react.select

import dom.html.HTMLDivElement
import react.PropsWithChildren
import react.dom.html.HTMLAttributes

external interface MultiValueRemoveProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var data: Option
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var selectProps: SelectProps<Option, Group>
}
