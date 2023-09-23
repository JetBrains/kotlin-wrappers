package react.select

import js.core.ReadonlyArray
import react.ComponentType
import react.PropsWithChildren
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface GroupProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var Heading: ComponentType<GroupHeadingProps<Option, Group>>
    var headingProps: GroupHeadingProps<Option, Group>
    var innerProps: HTMLAttributes<HTMLDivElement>
    var label: String
    var data: Group
    var options: ReadonlyArray<Option>
    var selectOption: (Option) -> Unit
    var selectProps: SelectProps<Option, Group>
}
