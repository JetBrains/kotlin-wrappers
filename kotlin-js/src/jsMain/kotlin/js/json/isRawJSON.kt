@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
)

package js.json

import kotlin.contracts.contract

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/isRawJSON)
 */
fun isRawJSON(
    value: Any?,
): Boolean {
    contract {
        returns(true) implies (value is RawJSON)
    }

    return JSON.isRawJSON(value)
}

private external object JSON {
    fun isRawJSON(
        value: Any?,
    ): Boolean
}
