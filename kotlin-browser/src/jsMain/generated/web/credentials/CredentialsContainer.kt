// Automatically generated - do not modify!

package web.credentials

import js.core.Void
import js.promise.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer)
 */
sealed external class CredentialsContainer {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/create) */
    fun create(options: CredentialCreationOptions = definedExternally): Promise<Credential?>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/get) */
    operator fun get(options: CredentialRequestOptions = definedExternally): Promise<Credential?>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/preventSilentAccess) */
    fun preventSilentAccess(): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CredentialsContainer/store) */
    fun store(credential: Credential): Promise<Credential>
}
