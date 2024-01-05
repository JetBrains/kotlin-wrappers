package react.select

import js.array.ReadonlyArray
import react.PropsWithChildren

external interface GroupHeadingProps<Option : Any, Group : GroupBase<Option>> : PropsWithChildren {
    var id: String
    var data: Group
    var options: ReadonlyArray<Option>
    var selectProps: SelectProps<Option, Group>
    var theme: ThemeConfig?
}
