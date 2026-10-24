@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package js.json

import js.reflect.TypeGuard

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/JSON/isRawJSON)
 */
external val isRawJSON: TypeGuard<JsAny?, RawJSON>
