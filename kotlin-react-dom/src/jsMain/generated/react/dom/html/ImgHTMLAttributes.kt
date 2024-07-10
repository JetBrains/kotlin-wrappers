// Automatically generated - do not modify!

package react.dom.html

import web.dom.Element
import web.html.FetchPriority
import web.html.ImageDecoding
import web.html.Loading
import web.http.CrossOrigin
import web.http.ReferrerPolicy

external interface ImgHTMLAttributes<T : Element> : HTMLAttributes<T> {
    var alt: String?
    var crossOrigin: CrossOrigin?
    var decoding: ImageDecoding?
    var fetchPriority: FetchPriority?
    var height: Double?
    var loading: Loading?
    var referrerPolicy: ReferrerPolicy?
    var sizes: String?
    var src: String?
    var srcSet: String?
    var useMap: String?
    var width: Double?
}
