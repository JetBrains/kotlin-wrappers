// Automatically generated - do not modify!

package web.credentials

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.abort.AbortController
import web.abort.internal.awaitCancellable
import web.abort.internal.createAbortable
import web.abort.internal.patchAbortOptions
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`CredentialsContainer`** interface of the Credential Management API exposes methods to request credentials and notify the user agent when events such as successful sign in or sign out happen. This interface is accessible from Navigator.credentials.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer)
 */
open external class CredentialsContainer
private constructor() {
    /**
     * The **`create()`** method of the CredentialsContainer interface creates a new credential, which can then be stored and later retrieved using the navigator.credentials.get() method. The retrieved credential can then be used by a website to authenticate a user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/create)
     */
    @JsName("create")
    fun createAsync(options: CredentialCreationOptions = definedExternally): Promise<Credential?>

    /**
     * The **`get()`** method of the CredentialsContainer interface returns a Promise that fulfills with a single credential, which can then be used to authenticate a user to a website.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/get)
     */
    @JsName("get")
    fun getAsync(options: CredentialRequestOptions = definedExternally): Promise<Credential?>

    /**
     * The **`preventSilentAccess()`** method of the CredentialsContainer interface sets a flag that specifies whether automatic log in is allowed for future visits to the current origin, then returns a Promise that resolves to undefined. For example, you might call this, after a user signs out of a website to ensure that they aren't automatically signed in on the next site visit. Mediation varies by origin, and is an added check point of browser stored credentials, informing a user of an account login status. This method is typically called after a user signs out of a website, ensuring this user's login information is not automatically passed on the next site visit.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/preventSilentAccess)
     */
    @JsName("preventSilentAccess")
    fun preventSilentAccessAsync(): Promise<Void>

    /**
     * The **`store()`** method of the CredentialsContainer stores a set of credentials for the user inside a Credential instance, returning this in a Promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/store)
     */
    @JsName("store")
    fun storeAsync(credential: Credential): Promise<Void>
}

/**
 * The **`create()`** method of the CredentialsContainer interface creates a new credential, which can then be stored and later retrieved using the navigator.credentials.get() method. The retrieved credential can then be used by a website to authenticate a user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/create)
 */
suspend fun CredentialsContainer.create(): Credential? {
    val controller = AbortController()
    return createAsync(
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

/**
 * The **`create()`** method of the CredentialsContainer interface creates a new credential, which can then be stored and later retrieved using the navigator.credentials.get() method. The retrieved credential can then be used by a website to authenticate a user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/create)
 */
suspend fun CredentialsContainer.create(options: CredentialCreationOptions): Credential? {
    val controller = AbortController()
    return createAsync(
        options = patchAbortOptions(options, controller),
    ).awaitCancellable(controller)
}

/**
 * The **`get()`** method of the CredentialsContainer interface returns a Promise that fulfills with a single credential, which can then be used to authenticate a user to a website.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/get)
 */
suspend fun CredentialsContainer.get(): Credential? {
    val controller = AbortController()
    return getAsync(
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

/**
 * The **`get()`** method of the CredentialsContainer interface returns a Promise that fulfills with a single credential, which can then be used to authenticate a user to a website.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/get)
 */
suspend fun CredentialsContainer.get(options: CredentialRequestOptions): Credential? {
    val controller = AbortController()
    return getAsync(
        options = patchAbortOptions(options, controller),
    ).awaitCancellable(controller)
}

/**
 * The **`preventSilentAccess()`** method of the CredentialsContainer interface sets a flag that specifies whether automatic log in is allowed for future visits to the current origin, then returns a Promise that resolves to undefined. For example, you might call this, after a user signs out of a website to ensure that they aren't automatically signed in on the next site visit. Mediation varies by origin, and is an added check point of browser stored credentials, informing a user of an account login status. This method is typically called after a user signs out of a website, ensuring this user's login information is not automatically passed on the next site visit.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/preventSilentAccess)
 */
suspend inline fun CredentialsContainer.preventSilentAccess() {
    preventSilentAccessAsync().await()
}

/**
 * The **`store()`** method of the CredentialsContainer stores a set of credentials for the user inside a Credential instance, returning this in a Promise.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/store)
 */
suspend inline fun CredentialsContainer.store(credential: Credential) {
    storeAsync(
        credential = credential,
    ).await()
}
