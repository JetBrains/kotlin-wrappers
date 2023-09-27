package react.select

sealed external interface ActionMeta<Option> {
    var action: String
    var option: Option?
    var removedValue: Option?
    var removedValues: Options<Option>?
    var name: String?
}
