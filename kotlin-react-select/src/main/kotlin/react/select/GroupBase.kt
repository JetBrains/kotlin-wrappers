package react.select

import kotlinx.js.ReadonlyArray

external interface GroupBase<Option> {
    var options: ReadonlyArray<Option>
    var label: String?
}
