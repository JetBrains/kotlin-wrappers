package react.select

sealed external interface ActionMeta<Option> {
    val option: Option?
    val removedValue: Option?
    val removedValues: Options<Option>?
    val name: String?
}
