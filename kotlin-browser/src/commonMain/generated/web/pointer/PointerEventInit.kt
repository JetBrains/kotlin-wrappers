// Automatically generated - do not modify!

package web.pointer

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.uievents.MouseEventInit

@JsPlainObject
external interface PointerEventInit :
    MouseEventInit {
    var altitudeAngle: Double?
    var azimuthAngle: Double?
    var coalescedEvents: ReadonlyArray<PointerEvent>?
    var height: Double?
    var isPrimary: Boolean?
    var pointerId: Int?
    var pointerType: String?
    var predictedEvents: ReadonlyArray<PointerEvent>?
    var pressure: Float?
    var tangentialPressure: Float?
    var tiltX: Int?
    var tiltY: Int?
    var twist: Int?
    var width: Double?
}
