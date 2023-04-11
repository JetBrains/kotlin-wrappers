package react.select

typealias FilterPredicate<Option> = (
    option: FilterOptionOption<Option>,
    inputValue: String,
) -> Boolean
