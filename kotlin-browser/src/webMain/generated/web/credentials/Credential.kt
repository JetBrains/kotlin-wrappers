// Automatically generated - do not modify!

package web.credentials

import js.promise.Promise
import js.promise.await
import kotlin.js.JsBoolean
import kotlin.js.JsName
import kotlin.js.toBoolean

/**
 * The **`Credential`** interface of the Credential Management API provides information about an entity (usually a user) normally as a prerequisite to a trust decision.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential)
 */
open external class Credential
private constructor() {
    /**
     * The **`id`** read-only property of the Credential interface returns a string containing the credential's identifier. This might be a GUID, username, or email address, or some other value, depending on the type of credential.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential/id)
     */
    val id: String

    /**
     * The **`type`** read-only property of the Credential interface returns a string containing the credential's type. Valid values are password, federated, public-key, identity and otp.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential/type)
     */
    val type: String

    companion object {
        /**
         * The **`isConditionalMediationAvailable()`** static method of the Credential interface returns a Promise which resolves to false.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential/isConditionalMediationAvailable_static)
         */
        @JsName("isConditionalMediationAvailable")
        fun isConditionalMediationAvailableAsync(): Promise<JsBoolean>
    }
}

/**
 * The **`isConditionalMediationAvailable()`** static method of the Credential interface returns a Promise which resolves to false.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Credential/isConditionalMediationAvailable_static)
 */
suspend inline fun Credential.Companion.isConditionalMediationAvailable(): Boolean {
    return isConditionalMediationAvailableAsync().await().toBoolean()
}
