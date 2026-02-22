@file:JsModule("@tanstack/router-core")

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
)

package tanstack.router.core

import kotlin.contracts.contract

/**
 * Determine if a value is a TanStack Router not-found error.
 */
external fun isNotFound(
    value: Any?,
): Boolean {
    contract {
        returns(true) implies (value is NotFoundError)
    }

    return definedExternally
}
