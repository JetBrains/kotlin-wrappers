// Automatically generated - do not modify!

package web.trustedtypes

import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`TrustedTypePolicyFactory`** interface of the Trusted Types API creates policies and allows the verification of Trusted Type objects against created policies.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory)
 */
open external class TrustedTypePolicyFactory
private constructor() {
    /**
     * The **`defaultPolicy`** read-only property of the TrustedTypePolicyFactory interface returns the default TrustedTypePolicy or null if this is empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/defaultPolicy)
     */
    val defaultPolicy: TrustedTypePolicy?

    /**
     * The **`emptyHTML`** read-only property of the TrustedTypePolicyFactory interface returns a TrustedHTML object containing an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/emptyHTML)
     */
    val emptyHTML: TrustedHTML

    /**
     * The **`emptyScript`** read-only property of the TrustedTypePolicyFactory interface returns a TrustedScript object containing an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/emptyScript)
     */
    val emptyScript: TrustedScript

    /**
     * The **`createPolicy()`** method of the TrustedTypePolicyFactory interface creates a TrustedTypePolicy object that implements the rules passed as `policyOptions`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy)
     */
    fun createPolicy(
        policyName: String,
        policyOptions: TrustedTypePolicyOptions = definedExternally,
    ): TrustedTypePolicy

    /**
     * The **`getAttributeType()`** method of the TrustedTypePolicyFactory interface allows web developers to check if a Trusted Type is required for an element, and if so which Trusted Type is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/getAttributeType)
     */
    fun getAttributeType(
        tagName: String,
        attribute: String,
        elementNs: String? = definedExternally,
        attrNs: String? = definedExternally,
    ): String?

    /**
     * The **`getPropertyType()`** method of the TrustedTypePolicyFactory interface allows web developers to check if a Trusted Type is required for an element's property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/getPropertyType)
     */
    fun getPropertyType(
        tagName: String,
        property: String,
        elementNs: String? = definedExternally,
    ): String?

    /**
     * The **`isHTML()`** method of the TrustedTypePolicyFactory interface returns true if it is passed a valid TrustedHTML object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/isHTML)
     */
    fun isHTML(value: JsAny?): Boolean

    /**
     * The **`isScript()`** method of the TrustedTypePolicyFactory interface returns true if it is passed a valid TrustedScript object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/isScript)
     */
    fun isScript(value: JsAny?): Boolean

    /**
     * The **`isScriptURL()`** method of the TrustedTypePolicyFactory interface returns true if it is passed a valid TrustedScriptURL object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/isScriptURL)
     */
    fun isScriptURL(value: JsAny?): Boolean
}
