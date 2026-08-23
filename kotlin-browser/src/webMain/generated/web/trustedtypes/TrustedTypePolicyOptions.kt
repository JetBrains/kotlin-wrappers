// Automatically generated - do not modify!

package web.trustedtypes

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy#policyoptions)
 */
@JsPlainObject
external interface TrustedTypePolicyOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy#createHTML)
     */
    var createHTML: CreateHTMLCallback?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy#createScript)
     */
    var createScript: CreateScriptCallback?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy#createScriptURL)
     */
    var createScriptURL: CreateScriptURLCallback?
}
