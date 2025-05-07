// Automatically generated - do not modify!

package react.dom.html

import react.dom.events.ReactEventHandler
import web.dom.Element

external interface VideoHTMLAttributes<T : Element> : MediaHTMLAttributes<T> {
    var height: Double?
    override var playsInline: Boolean?
    var poster: String?
    var width: Double?
    var disablePictureInPicture: Boolean?
    var disableRemotePlayback: Boolean?
    var onResize: ReactEventHandler<T>?
    var onResizeCapture: ReactEventHandler<T>?
}
