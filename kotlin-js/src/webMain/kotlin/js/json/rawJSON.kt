package js.json

import kotlin.js.JsQualifier

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/JSON/rawJSON)
 */
@JsQualifier("JSON")
external fun rawJSON(
    value: String,
): RawJSON
