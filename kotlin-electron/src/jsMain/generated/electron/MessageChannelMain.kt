@file:JsModule("electron/electron")

package electron

import node.events.EventEmitter as NodeEventEmitter


open external class MessageChannelMain : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/message-channel-main
    /**
     * A `MessagePortMain` property.
     */
    var port1: MessagePortMain

    /**
     * A `MessagePortMain` property.
     */
    var port2: MessagePortMain
}
