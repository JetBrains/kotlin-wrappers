// Automatically generated - do not modify!

package web.html

import web.http.ReferrerPolicy

abstract external class HTMLScriptElement :
    HTMLElement {
    var async: Boolean
    var crossOrigin: CrossOrigin?

    /** Sets or retrieves the status of the script. */
    var defer: Boolean
    var integrity: String
    var noModule: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/referrerPolicy) */
    var referrerPolicy: ReferrerPolicy

    /** Retrieves the URL to an external file that contains the source code or data. */
    var src: String

    /** Retrieves or sets the text of the object as a string. */
    var text: String

    /** Sets or retrieves the MIME type for the associated scripting engine. */
    var type: String

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/supports_static) */
        fun supports(type: String): Boolean
    }
}
