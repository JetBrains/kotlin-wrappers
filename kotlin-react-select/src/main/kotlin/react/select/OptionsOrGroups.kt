package react.select

import kotlinx.js.ReadonlyArray

external interface OptionsOrGroups<Option, Group : GroupBase<Option>>

fun <Option, Group : GroupBase<Option>> OptionsOrGroups(
    options: ReadonlyArray<Option>,
): OptionsOrGroups<Option, Group> =
    options.unsafeCast<OptionsOrGroups<Option, Group>>()

fun <Option, Group : GroupBase<Option>> OptionsOrGroups(
    groups: ReadonlyArray<Group>,
): OptionsOrGroups<Option, Group> =
    groups.unsafeCast<OptionsOrGroups<Option, Group>>()
