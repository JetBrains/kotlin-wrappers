// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.dom.HTMLOrSVGScriptElement
import web.http.CrossOrigin
import web.http.FetchPriority
import web.http.ReferrerPolicy

/**
 * HTML script elements expose the **`HTMLScriptElement`** interface, which provides special properties and methods for manipulating the behavior and execution of `<script>` elements (beyond the inherited HTMLElement interface).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement)
 */
open external class HTMLScriptElement
protected constructor() :
    HTMLElement,
    HTMLOrSVGScriptElement {
    /**
     * The **`async`** property of the HTMLScriptElement interface is a boolean value that controls how the script should be executed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/async)
     */
    var async: Boolean

    /**
     * The **`blocking`** property of the HTMLScriptElement interface is a string indicating that certain operations should be blocked on the fetching of the script.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/blocking)
     */
    val blocking: DOMTokenList<Blocking>

    /**
     * The **`crossOrigin`** property of the HTMLScriptElement interface reflects the CORS settings for the script element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * The **`defer`** property of the HTMLScriptElement interface is a boolean value that controls how the script should be executed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/defer)
     */
    var defer: Boolean

    /**
     * The **`fetchPriority`** property of the HTMLScriptElement interface represents a hint to the browser indicating how it should prioritize fetching an external script relative to other external scripts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/fetchPriority)
     */
    var fetchPriority: FetchPriority

    /**
     * The **`integrity`** property of the HTMLScriptElement interface is a string that contains inline metadata that a browser can use to verify that a fetched resource has been delivered without unexpected manipulation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/integrity)
     */
    var integrity: String

    /**
     * The **`noModule`** property of the HTMLScriptElement interface is a boolean value that indicates whether the script should be executed in browsers that support ES modules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/noModule)
     */
    var noModule: Boolean

    /**
     * The **`referrerPolicy`** property of the HTMLScriptElement interface reflects the HTML `referrerpolicy` of the script element, which defines how the referrer is set when fetching the script and any scripts it imports.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * The **`src`** property of the HTMLScriptElement interface is a string representing the URL of an external script; this can be used as an alternative to embedding a script directly within a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/src)
     */
    var src: String

    /**
     * The **`text`** property of the HTMLScriptElement interface represents the inline text content of the script element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/text)
     */
    var text: String

    /**
     * The **`type`** property of the HTMLScriptElement interface is a string that reflects the type of the script.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/type)
     */
    var type: String

    companion object {
        /**
         * The **`supports()`** static method of the HTMLScriptElement interface provides a simple and consistent method to feature-detect what types of scripts are supported by the user agent.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/supports_static)
         */
        fun supports(type: String): Boolean
    }
}
