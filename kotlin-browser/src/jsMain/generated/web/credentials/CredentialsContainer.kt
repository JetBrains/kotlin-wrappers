// Automatically generated - do not modify!

package web.credentials

import js.core.Void
import kotlin.js.Promise

sealed external class CredentialsContainer {
    fun create(options: CredentialCreationOptions = definedExternally): Promise<Credential?>
    operator fun get(options: CredentialRequestOptions = definedExternally): Promise<Credential?>
    fun preventSilentAccess(): Promise<Void>
    fun store(credential: Credential): Promise<Credential>
}
