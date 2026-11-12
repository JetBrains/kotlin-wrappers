// Automatically generated - do not modify!

package web.xr

import js.promise.Promise

open external class XRHitTestResult
private constructor() {
    /**
     * Creates a new anchor from the hit test result.
     *
     * @see https://immersive-web.github.io/anchors/#dom-xrhittestresult-createanchor
     */
    open var createAnchor: (() -> Promise<XRAnchor>)?
    open fun getPose(baseSpace: XRSpace): XRPose?
}
