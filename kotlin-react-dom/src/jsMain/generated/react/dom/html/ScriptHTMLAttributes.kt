// Automatically generated - do not modify!

package react.dom.html

import web.dom.Element
import web.http.CrossOrigin
import web.http.ReferrerPolicy

external interface ScriptHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var async: Boolean?
    var blocking: ScriptBlocking?
    var crossOrigin: CrossOrigin?
    var defer: Boolean?
    var integrity: String?
    var noModule: Boolean?
    var referrerPolicy: ReferrerPolicy?
    var src: String?
    var type: String?
}
