// Automatically generated - do not modify!

package react.dom.html

import web.dom.Element
import web.html.Blocking
import web.http.CrossOrigin
import web.http.FetchPriority
import web.http.ReferrerPolicy

external interface ScriptHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var async: Boolean?
    var blocking: Blocking?
    var crossOrigin: CrossOrigin?
    var defer: Boolean?
    var fetchPriority: FetchPriority?
    var integrity: String?
    var noModule: Boolean?
    var referrerPolicy: ReferrerPolicy?
    var src: String?
    var type: String?
}
