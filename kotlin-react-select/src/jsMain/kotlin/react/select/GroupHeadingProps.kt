package react.select

import js.core.ReadonlyArray
import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface GroupHeadingProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var isDisabled: Boolean
    var innerProps: HTMLAttributes<HTMLDivElement>?
    var getValue: () -> ReadonlyArray<Option>
    var data: Group
    var options: ReadonlyArray<Option>
    var selectOption: (Option) -> Unit
    var selectProps: SelectProps<Option, Group>
}
