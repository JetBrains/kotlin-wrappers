// Automatically generated - do not modify!

package web.html

import web.dom.HTMLOrSVGScriptElement
import web.http.CrossOrigin
import web.http.ReferrerPolicy

/**
 * HTML <script> elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of <script> elements (beyond the inherited HTMLElement interface).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement)
 */
open external class HTMLScriptElement
protected constructor() :
    HTMLElement,
    HTMLOrSVGScriptElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/async)
     */
    var async: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * Sets or retrieves the status of the script.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/defer)
     */
    var defer: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/fetchPriority)
     */
    var fetchPriority: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/integrity)
     */
    var integrity: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/noModule)
     */
    var noModule: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * Retrieves the URL to an external file that contains the source code or data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/src)
     */
    var src: String

    /**
     * Retrieves or sets the text of the object as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/text)
     */
    var text: String

    /**
     * Sets or retrieves the MIME type for the associated scripting engine.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/type)
     */
    var type: String

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/supports_static)
         */
        fun supports(type: String): Boolean
    }
}
