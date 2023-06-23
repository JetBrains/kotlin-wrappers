// Automatically generated - do not modify!

package web.cssom

/**
 * An object representing a single CSS @namespace at-rule. It implements the CSSRule interface, with a type value of 10 (CSSRule.NAMESPACE_RULE).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule)
 */
sealed external class CSSNamespaceRule :
    CSSRule {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/namespaceURI) */
    val namespaceURI: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/prefix) */
    val prefix: String
}
