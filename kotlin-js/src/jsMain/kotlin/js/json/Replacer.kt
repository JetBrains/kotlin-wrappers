package js.json

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#the_replacer_parameter)
 */
typealias Replacer = (
    key: String,
    value: Any?,
) -> Any?
