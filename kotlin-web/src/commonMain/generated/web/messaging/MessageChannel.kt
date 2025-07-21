// Automatically generated - do not modify!

package web.messaging

/**
 * The **`MessageChannel`** interface of the Channel Messaging API allows us to create a new message channel and send data through it via its two MessagePort properties.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel)
 */
open external class MessageChannel {
    /**
     * The **`port1`** read-only property of the MessageChannel interface returns the first port of the message channel — the port attached to the context that originated the channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel/port1)
     */
    val port1: MessagePort

    /**
     * The **`port2`** read-only property of the MessageChannel interface returns the second port of the message channel — the port attached to the context at the other end of the channel, which the message is initially sent to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel/port2)
     */
    val port2: MessagePort
}
