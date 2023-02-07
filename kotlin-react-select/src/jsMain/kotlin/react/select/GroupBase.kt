package react.select

import js.core.ReadonlyArray

external interface GroupBase<Option> {
    var options: ReadonlyArray<Option>
    var label: String?
}
