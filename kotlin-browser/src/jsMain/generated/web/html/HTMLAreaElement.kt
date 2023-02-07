// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.http.ReferrerPolicy
import web.window.WindowTarget

abstract external class HTMLAreaElement :
    HTMLElement,
    HTMLHyperlinkElementUtils {
    /** Sets or retrieves a text alternative to the graphic. */
    var alt: String

    /** Sets or retrieves the coordinates of the object. */
    var coords: String
    var download: String
    var ping: String
    var referrerPolicy: ReferrerPolicy
    var rel: String
    val relList: DOMTokenList

    /** Sets or retrieves the shape of the object. */
    var shape: String

    /** Sets or retrieves the window or frame at which to target content. */
    var target: WindowTarget
}
