package react.select

import react.ReactNode

typealias GetNewOptionData<Option> = (
    inputValue: String,
    optionLabel: ReactNode,
) -> Option
