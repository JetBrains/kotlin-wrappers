@file:JsModule("electron/electron")
@file:JsQualifier("Electron")

package electron

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarOtherItemsProxy : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-other-items-proxy
    /**
     * TouchBarOtherItemsProxy
     */
    constructor ()
}
