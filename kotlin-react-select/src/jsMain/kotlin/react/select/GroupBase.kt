package react.select

import js.array.ReadonlyArray

external interface GroupBase<Option> {
    var options: ReadonlyArray<Option>
    var label: String?
}
