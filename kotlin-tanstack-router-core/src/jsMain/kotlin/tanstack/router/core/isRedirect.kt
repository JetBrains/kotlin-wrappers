@file:JsModule("@tanstack/router-core")

@file:Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
)

package tanstack.router.core

import kotlin.contracts.contract

external fun isRedirect(
    value: Any?,
): Boolean {
    contract {
        returns(true) implies (value is Redirect)
    }

    return definedExternally
}
