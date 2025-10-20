// Automatically generated - do not modify!

package web.trustedtypes

import kotlin.js.JsAny

/**
 * The **`TrustedTypePolicy`** interface of the Trusted Types API defines a group of functions which create `TrustedType` objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicy)
 */
open external class TrustedTypePolicy
private constructor() {
    /**
     * The **`name`** read-only property of the TrustedTypePolicy interface returns the name of the policy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicy/name)
     */
    val name: String

    /**
     * The **`createHTML()`** method of the TrustedTypePolicy interface creates a TrustedHTML object using a policy created by TrustedTypePolicyFactory.createPolicy().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicy/createHTML)
     */
    fun createHTML(
        input: String,
        vararg arguments: JsAny?,
    ): TrustedHTML

    /**
     * The **`createScript()`** method of the TrustedTypePolicy interface creates a TrustedScript object using a policy created by TrustedTypePolicyFactory.createPolicy().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicy/createScript)
     */
    fun createScript(
        input: String,
        vararg arguments: JsAny?,
    ): TrustedScript

    /**
     * The **`createScriptURL()`** method of the TrustedTypePolicy interface creates a TrustedScriptURL object using a policy created by TrustedTypePolicyFactory.createPolicy().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicy/createScriptURL)
     */
    fun createScriptURL(
        input: String,
        vararg arguments: JsAny?,
    ): TrustedScriptURL
}
