// Automatically generated - do not modify!

package web.fedcm

import js.core.Void
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * The **`NavigatorLogin`** interface of the Federated Credential Management (FedCM) API defines login functionality for federated identity providers (IdPs). Specifically, it enables a federated identity provider (IdP) to set its login status when a user signs into or out of the IdP.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigatorLogin)
 */
open external class NavigatorLogin
private constructor() {
    /**
     * The **`setStatus()`** method of the NavigatorLogin interface sets the login status of a federated identity provider (IdP), when called from the IdP's origin. By this, we mean "whether any users are logged into the IdP on the current browser or not". This should be called by the IdP site following a user login or logout.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigatorLogin/setStatus)
     */
    @JsName("setStatus")
    fun setStatusAsync(status: LoginStatus): Promise<Void>
}

/**
 * The **`setStatus()`** method of the NavigatorLogin interface sets the login status of a federated identity provider (IdP), when called from the IdP's origin. By this, we mean "whether any users are logged into the IdP on the current browser or not". This should be called by the IdP site following a user login or logout.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigatorLogin/setStatus)
 */
suspend inline fun NavigatorLogin.setStatus(status: LoginStatus) {
    setStatusAsync(
        status = status,
    ).await()
}
