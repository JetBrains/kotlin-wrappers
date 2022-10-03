package react.select

import kotlinx.js.ReadonlyArray
import kotlinx.js.jso

fun <Option, Group : GroupBase<Option>> Group(
    label: String?,
    options: ReadonlyArray<Option>,
): Group =
    jso {
        this.label = label
        this.options = options
    }
