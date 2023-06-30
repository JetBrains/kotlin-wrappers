@file:JsModule("electron/electron")

package electron

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarGroup : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-group
    /**
     * TouchBarGroup
     */
    constructor (options: TouchBarGroupConstructorOptions)
}
