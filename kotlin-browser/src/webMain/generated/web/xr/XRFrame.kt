// Automatically generated - do not modify!

package web.xr

import js.array.ReadonlyArray
import js.promise.Promise
import web.time.DOMHighResTimeStamp

open external class XRFrame
private constructor() {
    val session: XRSession
    val predictedDisplayTime: DOMHighResTimeStamp

    /**
     * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
     * the XRFrame.
     *
     * @param space
     * @param baseSpace
     */
    fun getPose(
        space: XRSpace,
        baseSpace: XRSpace,
    ): XRPose?

    /**
     * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
     * XRFrame's time.
     *
     * @param referenceSpace
     */
    fun getViewerPose(referenceSpace: XRReferenceSpace): XRViewerPose?

    /**
     * All anchors tracked in the frame.
     *
     * At XRFrame creation, the set is initially empty and will be populated by
     * the update anchors algorithm.
     *
     * @see https://immersive-web.github.io/anchors/#dom-xrframe-trackedanchors
     */
    val trackedAnchors: XRAnchorSet?

    /**
     * Creates a new anchor using the given pose in the given reference space.
     *
     * By creating an anchor from frame, the created anchor will not be attached to
     * any particular real world object.
     *
     * If the frame is not active, the promise will be rejected with a InvalidStateError.
     *
     * @see https://immersive-web.github.io/anchors/#dom-xrframe-createanchor
     */
    var createAnchor: ((pose: XRRigidTransform, space: XRSpace) -> Promise<XRAnchor>)?
    fun getHitTestResults(hitTestSource: XRHitTestSource): ReadonlyArray<XRHitTestResult>
    fun getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): ReadonlyArray<XRTransientInputHitTestResult>

    /**
     * XRFrame is extended to contain detectedPlanes attribute which contains
     * all planes that are still tracked in the frame.
     *
     * The set is initially empty and will be populated by the update planes
     * algorithm. If this attribute is accessed when the frame is not active,
     * the user agent MUST throw InvalidStateError.
     *
     * @see https://immersive-web.github.io/real-world-geometry/plane-detection.html#plane-set
     */
    val detectedPlanes: XRPlaneSet?

    /**
     * XRFrame is extended to contain detectedMeshes attribute
     * which contains all meshes that are still tracked in the frame.
     *
     * The set is initially empty and will be populated by the update meshes algorithm.
     * If this attribute is accessed when the frame is not active, the user agent
     * MUST throw InvalidStateError.
     *
     * @see https://immersive-web.github.io/real-world-meshing/#mesh-set
     */
    val detectedMeshes: XRMeshSet?
    var getJointPose: ((joint: XRJointSpace, baseSpace: XRSpace) -> XRJointPose)?
    fun getDepthInformation(view: XRView): XRCPUDepthInformation?
}
