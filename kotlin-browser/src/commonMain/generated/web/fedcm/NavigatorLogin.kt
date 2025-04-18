// Automatically generated - do not modify!

package web.fedcm

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * The **`NavigatorLogin`** interface of the Federated Credential Management (FedCM) API defines login functionality for federated identity providers (IdPs).
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigatorLogin)
 */
external class NavigatorLogin
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigatorLogin/setStatus)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setStatus(status: LoginStatus)

    @JsName("setStatus")
    fun setStatusAsync(status: LoginStatus): Promise<Void>
}
