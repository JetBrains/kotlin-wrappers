package js.json

import js.core.JsAny

/**
 * Can transform the value, which was parsed for a particular object key from the JSON input.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#the_reviver_parameter)
 *
 * @param key a property name
 * @param value a property value
 * @return the value to be set in the parsed JSON object
 */
typealias Reviver = (
    key: String,
    value: JsAny?,
) -> JsAny?
