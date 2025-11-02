// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSNamespaceRule`** interface describes an object representing a single CSS @namespace at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule)
 */
open external class CSSNamespaceRule
private constructor() :
    CSSRule {
    /**
     * The read-only **`namespaceURI`** property of the CSSNamespaceRule returns a string containing the text of the URI of the given namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/namespaceURI)
     */
    val namespaceURI: String

    /**
     * The read-only **`prefix`** property of the CSSNamespaceRule returns a string with the name of the prefix associated to this namespace. If there is no such prefix, it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/prefix)
     */
    val prefix: String
}
