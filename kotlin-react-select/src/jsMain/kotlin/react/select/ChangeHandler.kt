package react.select

typealias ChangeHandler<Option> = (
    newValue: Value<Option>?,
    actionMeta: ActionMeta<Option>,
) -> Unit
