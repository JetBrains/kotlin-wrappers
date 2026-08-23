// Automatically generated - do not modify!

package web.trustedtypes

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy#policyoptions)
 */
@JsPlainObject
external interface TrustedTypePolicyOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy#createhtml)
     */
    var createHTML: CreateHTMLCallback?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy#createscript)
     */
    var createScript: CreateScriptCallback?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedTypePolicyFactory/createPolicy#createscripturl)
     */
    var createScriptURL: CreateScriptURLCallback?
}
