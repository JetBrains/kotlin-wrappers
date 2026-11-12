// Automatically generated - do not modify!

package web.xr

import js.array.ReadonlyArray
import web.geometry.DOMPointReadOnly
import web.time.DOMHighResTimeStamp

open external class XRPlane
private constructor() {
    open var orientation: XRPlaneOrientation
    open var planeSpace: XRSpace
    open var polygon: ReadonlyArray<DOMPointReadOnly>
    open var lastChangedTime: DOMHighResTimeStamp
    open var semanticLabel: String?
}
