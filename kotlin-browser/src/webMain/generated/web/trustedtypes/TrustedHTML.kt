// Automatically generated - do not modify!

package web.trustedtypes

import web.html.HtmlSource

/**
 * The **`TrustedHTML`** interface of the Trusted Types API represents a string that a developer can insert into an injection sink that will render it as HTML.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedHTML)
 */
open external class TrustedHTML
private constructor() :
    HtmlSource {
    /**
     * The **`toJSON()`** method of the TrustedHTML interface returns a JSON representation of the stored data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrustedHTML/toJSON)
     */
    fun toJSON(): String
}
