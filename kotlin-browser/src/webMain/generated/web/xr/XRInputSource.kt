// Automatically generated - do not modify!

package web.xr

import js.array.ReadonlyArray
import web.gamepad.Gamepad
import kotlin.js.JsString

/**
 * Represents an XR input source, which is any input mechanism which allows the user to perform
 * targeted actions in the same virtual space as the viewer. Example XR input sources include,
 * but are not limited to, handheld controllers, optically tracked hands, and gaze-based input
 * methods that operate on the viewer's pose. Input mechanisms which are not explicitly associated
 * with the XR device, such as traditional gamepads, mice, or keyboards SHOULD NOT be considered
 * XR input sources.
 * ref: https://immersive-web.github.io/webxr/#xrinputsource-interface
 */
open external class XRInputSource
private constructor() {
    val handedness: XRHandedness
    val targetRayMode: XRTargetRayMode
    val targetRaySpace: XRSpace
    val gripSpace: XRSpace?
    val gamepad: Gamepad?
    val profiles: ReadonlyArray<JsString>
    val hand: XRHand?
}
