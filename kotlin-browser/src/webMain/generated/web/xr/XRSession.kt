// Automatically generated - do not modify!

package web.xr

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.await
import js.typedarrays.Float32Array
import web.animations.FrameRequestId
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.JsString
import kotlin.js.definedExternally

open external class XRSession
private constructor() :
    EventTarget {
    /**
     * Returns a list of this session's XRInputSources, each representing an input device
     * used to control the camera and/or scene.
     */
    val inputSources: XRInputSourceArray

    /**
     * object which contains options affecting how the imagery is rendered.
     * This includes things such as the near and far clipping planes
     */
    val renderState: XRRenderState
    val environmentBlendMode: XREnvironmentBlendMode
    val visibilityState: XRVisibilityState
    val frameRate: Float?
    val supportedFrameRates: Float32Array<*>?
    val enabledFeatures: ReadonlyArray<JsString>?
    val isSystemKeyboardSupported: Boolean
    val interactionMode: XRInteractionMode?

    /**
     * Removes a callback from the animation frame painting callback from
     * XRSession's set of animation frame rendering callbacks, given the
     * identifying handle returned by a previous call to requestAnimationFrame().
     */
    fun cancelAnimationFrame(id: FrameRequestId)

    /**
     * Ends the WebXR session. Returns a promise which resolves when the
     * session has been shut down.
     */
    @JsName("end")
    fun endAsync(): Promise<Void>

    /**
     * Schedules the specified method to be called the next time the user agent
     * is working on rendering an animation frame for the WebXR device. Returns an
     * integer value which can be used to identify the request for the purposes of
     * canceling the callback using cancelAnimationFrame(). This method is comparable
     * to the Window.requestAnimationFrame() method.
     */
    fun requestAnimationFrame(callback: XRFrameRequestCallback): FrameRequestId

    /**
     * Requests that a new XRReferenceSpace of the specified type be created.
     * Returns a promise which resolves with the XRReferenceSpace or
     * XRBoundedReferenceSpace which was requested, or throws a NotSupportedError if
     * the requested space type isn't supported by the device.
     */
    @JsName("requestReferenceSpace")
    fun requestReferenceSpaceAsync(type: XRReferenceSpaceType): Promise<XRSpace /* XRReferenceSpace | XRBoundedReferenceSpace */>

    @JsName("updateRenderState")
    fun updateRenderStateAsync(renderStateInit: XRRenderStateInit = definedExternally): Promise<Void>

    @JsName("updateTargetFrameRate")
    fun updateTargetFrameRateAsync(rate: Float): Promise<Void>
    var onend: EventHandler<XRSessionEvent, *, *>
    var oninputsourceschange: EventHandler<XRInputSourcesChangeEvent, *, *>
    var onselect: EventHandler<XRInputSourceEvent, *, *>
    var onselectstart: EventHandler<XRInputSourceEvent, *, *>
    var onselectend: EventHandler<XRInputSourceEvent, *, *>
    var onsqueeze: EventHandler<XRInputSourceEvent, *, *>
    var onsqueezestart: EventHandler<XRInputSourceEvent, *, *>
    var onsqueezeend: EventHandler<XRInputSourceEvent, *, *>
    var onvisibilitychange: EventHandler<XRSessionEvent, *, *>
    var onframeratechange: EventHandler<XRSessionEvent, *, *>

    /**
     * A list of the known persistent anchors
     */
    val persistentAnchors: ReadonlyArray<JsString>?

    /**
     * Restores a persistent anchor with the given UUID.
     *
     * If the sessions map of persistent anchors does not contain the given UUID or if the
     * session has ended, the promise will be rejected with a InvalidStateError.
     *
     * @see https://immersive-web.github.io/anchors/#dom-xrsession-restorepersistentanchor
     */
    var restorePersistentAnchor: ((uuid: String) -> Promise<XRAnchor>)?

    /**
     * Deletes the persistent anchor with the given UUID. Also deletes the anchor.
     *
     * If the sessions map of persistent anchors does not contain the given UUID the
     * promise will be rejected with a InvalidStateError.
     *
     * @see https://immersive-web.github.io/anchors/#dom-xrsession-deletepersistentanchor
     */
    var deletePersistentAnchor: ((uuid: String) -> Promise<Void>)?
    var requestHitTestSource: ((options: XRHitTestOptionsInit) -> Promise<XRHitTestSource>)?
    var requestHitTestSourceForTransientInput: ((options: XRTransientInputHitTestOptionsInit) -> Promise<XRTransientInputHitTestSource>)?

    /**
     * Legacy
     */
    var requestHitTest: ((ray: XRRay, referenceSpace: XRReferenceSpace) -> Promise<ReadonlyArray<XRHitResult>>)?

    /**
     * XRSession is extended to contain the initiateRoomCapture method which,
     * if supported, will ask the XR Compositor to capture the current room layout.
     * It is up to the XRCompositor if this will replace or augment the set of tracked planes.
     * The user agent MAY also ignore this call, for instance if it doesn’t support a manual room
     * capture more or if it determines that the room is already set up.
     * The initiateRoomCapture method MUST only be able to be called once per XRSession.
     *
     * @see https://immersive-web.github.io/real-world-geometry/plane-detection.html#plane-set
     */
    var initiateRoomCapture: (() -> Promise<Void>)?
    val domOverlayState: XRDOMOverlayState?
    val depthUsage: XRDepthUsage?
    val depthDataFormat: XRDepthDataFormat?
    val depthType: XRDepthType?
    val depthActive: Boolean?
    val pauseDepthSensing: (() -> Unit)?
    val resumeDepthSensing: (() -> Unit)?
}

/**
 * Ends the WebXR session. Returns a promise which resolves when the
 * session has been shut down.
 */
suspend inline fun XRSession.end() {
    endAsync().await()
}

/**
 * Requests that a new XRReferenceSpace of the specified type be created.
 * Returns a promise which resolves with the XRReferenceSpace or
 * XRBoundedReferenceSpace which was requested, or throws a NotSupportedError if
 * the requested space type isn't supported by the device.
 */
suspend inline fun XRSession.requestReferenceSpace(type: XRReferenceSpaceType): XRSpace /* XRReferenceSpace | XRBoundedReferenceSpace */ {
    return requestReferenceSpaceAsync(
        type = type,
    ).await()
}

suspend inline fun XRSession.updateRenderState() {
    updateRenderStateAsync().await()
}

suspend inline fun XRSession.updateRenderState(renderStateInit: XRRenderStateInit) {
    updateRenderStateAsync(
        renderStateInit = renderStateInit,
    ).await()
}

suspend inline fun XRSession.updateTargetFrameRate(rate: Float) {
    updateTargetFrameRateAsync(
        rate = rate,
    ).await()
}
