package react.select

import js.array.ReadonlyArray
import js.reflect.unsafeCast

external interface OptionsOrGroups<Option, Group : GroupBase<Option>>

fun <Option, Group : GroupBase<Option>> OptionsOrGroups(
    options: ReadonlyArray<Option>,
): OptionsOrGroups<Option, Group> =
    unsafeCast(options)

fun <Option, Group : GroupBase<Option>> OptionsOrGroups(
    groups: ReadonlyArray<Group>,
): OptionsOrGroups<Option, Group> =
    unsafeCast(groups)
