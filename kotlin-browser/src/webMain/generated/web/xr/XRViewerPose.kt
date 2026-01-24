// Automatically generated - do not modify!

package web.xr

import js.array.ReadonlyArray

/**
 * An XRPose describing the state of a viewer of the XR scene as tracked by the XR
 * device. A viewer may represent a tracked piece of hardware, the observed position
 * of a user's head relative to the hardware, or some other means of computing a series
 * of viewpoints into the XR scene. XRViewerPoses can only be queried relative to an
 * XRReferenceSpace. It provides, in addition to the XRPose values, an array of views
 * which include rigid transforms to indicate the viewpoint and projection matrices.
 * These values should be used by the application when rendering a frame of an XR scene.
 *
 * ref: https://immersive-web.github.io/webxr/#xrviewerpose-interface
 */
external interface XRViewerPose :
    XRPose {
    val views: ReadonlyArray<XRView>
}
