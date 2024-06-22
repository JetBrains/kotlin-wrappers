package react.select

// Details: https://github.com/JedWatson/react-select/issues/5677
typealias InputChangeHandler = (
    newValue: String,
    actionMeta: InputActionMeta,
) -> String?
