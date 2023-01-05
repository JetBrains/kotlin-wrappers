// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.window.WindowTarget

abstract external class HTMLAnchorElement :
    HTMLElement,
    HTMLHyperlinkElementUtils {
    var download: String

    /** Sets or retrieves the language code of the object. */
    var hreflang: String
    var ping: String
    var referrerPolicy: String

    /** Sets or retrieves the relationship between the object and the destination of the link. */
    var rel: String
    val relList: DOMTokenList

    /** Sets or retrieves the window or frame at which to target content. */
    var target: WindowTarget

    /** Retrieves or sets the text of the object as a string. */
    var text: String
    var type: String
}
