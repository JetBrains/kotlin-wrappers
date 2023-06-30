@file:JsModule("INTERNAL_ENTITY")

package electron

import node.events.EventEmitter as NodeEventEmitter


external class TouchBarSpacer : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/touch-bar-spacer
    /**
     * TouchBarSpacer
     */
    constructor (options: TouchBarSpacerConstructorOptions)

    /**
     * A `string` representing the size of the spacer.  Can be `small`, `large` or
     * `flexible`.
     */
    var size: (TouchBarSpacerSize)
}
