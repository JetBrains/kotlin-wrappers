package react.select

import js.core.ReadonlyArray
import js.core.jso

fun <Option, Group : GroupBase<Option>> Group(
    label: String?,
    options: ReadonlyArray<Option>,
): Group =
    jso {
        this.label = label
        this.options = options
    }
