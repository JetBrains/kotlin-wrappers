package js.json

import kotlin.js.JsAny

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#the_replacer_parameter)
 */
typealias Replacer = (
    key: String,
    value: JsAny?,
) -> JsAny?
