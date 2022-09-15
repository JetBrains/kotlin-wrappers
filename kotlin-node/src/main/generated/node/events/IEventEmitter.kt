// Automatically generated - do not modify!

package node.events

import kotlinx.js.ReadonlyArray

external interface IEventEmitter {
    /**
     * Alias for `emitter.on(eventName, listener)`.
     * @since v0.1.26
     */
    fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * Adds the `listener` function to the end of the listeners array for the
     * event named `eventName`. No checks are made to see if the `listener` has
     * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
     * times.
     *
     * ```js
     * server.on('connection', (stream) => {
     *   console.log('someone connected!');
     * });
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     *
     * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
     * event listener to the beginning of the listeners array.
     *
     * ```js
     * const myEE = new EventEmitter();
     * myEE.on('foo', () => console.log('a'));
     * myEE.prependListener('foo', () => console.log('b'));
     * myEE.emit('foo');
     * // Prints:
     * //   b
     * //   a
     * ```
     * @since v0.1.101
     * @param eventName The name of the event.
     * @param listener The callback function
     */
    fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * Adds a **one-time**`listener` function for the event named `eventName`. The
     * next time `eventName` is triggered, this listener is removed and then invoked.
     *
     * ```js
     * server.once('connection', (stream) => {
     *   console.log('Ah, we have our first user!');
     * });
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     *
     * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
     * event listener to the beginning of the listeners array.
     *
     * ```js
     * const myEE = new EventEmitter();
     * myEE.once('foo', () => console.log('a'));
     * myEE.prependOnceListener('foo', () => console.log('b'));
     * myEE.emit('foo');
     * // Prints:
     * //   b
     * //   a
     * ```
     * @since v0.3.0
     * @param eventName The name of the event.
     * @param listener The callback function
     */
    fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * Removes the specified `listener` from the listener array for the event named`eventName`.
     *
     * ```js
     * const callback = (stream) => {
     *   console.log('someone connected!');
     * };
     * server.on('connection', callback);
     * // ...
     * server.removeListener('connection', callback);
     * ```
     *
     * `removeListener()` will remove, at most, one instance of a listener from the
     * listener array. If any single listener has been added multiple times to the
     * listener array for the specified `eventName`, then `removeListener()` must be
     * called multiple times to remove each instance.
     *
     * Once an event is emitted, all listeners attached to it at the
     * time of emitting are called in order. This implies that any`removeListener()` or `removeAllListeners()` calls _after_ emitting and _before_ the last listener finishes execution
     * will not remove them from`emit()` in progress. Subsequent events behave as expected.
     *
     * ```js
     * const myEmitter = new MyEmitter();
     *
     * const callbackA = () => {
     *   console.log('A');
     *   myEmitter.removeListener('event', callbackB);
     * };
     *
     * const callbackB = () => {
     *   console.log('B');
     * };
     *
     * myEmitter.on('event', callbackA);
     *
     * myEmitter.on('event', callbackB);
     *
     * // callbackA removes listener callbackB but it will still be called.
     * // Internal listener array at time of emit [callbackA, callbackB]
     * myEmitter.emit('event');
     * // Prints:
     * //   A
     * //   B
     *
     * // callbackB is now removed.
     * // Internal listener array [callbackA]
     * myEmitter.emit('event');
     * // Prints:
     * //   A
     * ```
     *
     * Because listeners are managed using an internal array, calling this will
     * change the position indices of any listener registered _after_ the listener
     * being removed. This will not impact the order in which listeners are called,
     * but it means that any copies of the listener array as returned by
     * the `emitter.listeners()` method will need to be recreated.
     *
     * When a single function has been added as a handler multiple times for a single
     * event (as in the example below), `removeListener()` will remove the most
     * recently added instance. In the example the `once('ping')`listener is removed:
     *
     * ```js
     * const ee = new EventEmitter();
     *
     * function pong() {
     *   console.log('pong');
     * }
     *
     * ee.on('ping', pong);
     * ee.once('ping', pong);
     * ee.removeListener('ping', pong);
     *
     * ee.emit('ping');
     * ee.emit('ping');
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v0.1.26
     */
    fun removeListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * Alias for `emitter.removeListener()`.
     * @since v10.0.0
     */
    fun off(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * Removes all listeners, or those of the specified `eventName`.
     *
     * It is bad practice to remove listeners added elsewhere in the code,
     * particularly when the `EventEmitter` instance was created by some other
     * component or module (e.g. sockets or file streams).
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v0.1.26
     */
    fun removeAllListeners(event: EventType = definedExternally) /* : this */

    /**
     * By default `EventEmitter`s will print a warning if more than `10` listeners are
     * added for a particular event. This is a useful default that helps finding
     * memory leaks. The `emitter.setMaxListeners()` method allows the limit to be
     * modified for this specific `EventEmitter` instance. The value can be set to`Infinity` (or `0`) to indicate an unlimited number of listeners.
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v0.3.5
     */
    fun setMaxListeners(n: Number) /* : this */

    /**
     * Returns the current max listener value for the `EventEmitter` which is either
     * set by `emitter.setMaxListeners(n)` or defaults to {@link defaultMaxListeners}.
     * @since v1.0.0
     */
    fun getMaxListeners(): Number

    /**
     * Returns a copy of the array of listeners for the event named `eventName`.
     *
     * ```js
     * server.on('connection', (stream) => {
     *   console.log('someone connected!');
     * });
     * console.log(util.inspect(server.listeners('connection')));
     * // Prints: [ [Function] ]
     * ```
     * @since v0.1.26
     */
    fun listeners(event: EventType): ReadonlyArray<Function<*>>

    /**
     * Returns a copy of the array of listeners for the event named `eventName`,
     * including any wrappers (such as those created by `.once()`).
     *
     * ```js
     * const emitter = new EventEmitter();
     * emitter.once('log', () => console.log('log once'));
     *
     * // Returns a new Array with a function `onceWrapper` which has a property
     * // `listener` which contains the original listener bound above
     * const listeners = emitter.rawListeners('log');
     * const logFnWrapper = listeners[0];
     *
     * // Logs "log once" to the console and does not unbind the `once` event
     * logFnWrapper.listener();
     *
     * // Logs "log once" to the console and removes the listener
     * logFnWrapper();
     *
     * emitter.on('log', () => console.log('log persistently'));
     * // Will return a new Array with a single function bound by `.on()` above
     * const newListeners = emitter.rawListeners('log');
     *
     * // Logs "log persistently" twice
     * newListeners[0]();
     * emitter.emit('log');
     * ```
     * @since v9.4.0
     */
    fun rawListeners(event: EventType): ReadonlyArray<Function<*>>

    /**
     * Synchronously calls each of the listeners registered for the event named`eventName`, in the order they were registered, passing the supplied arguments
     * to each.
     *
     * Returns `true` if the event had listeners, `false` otherwise.
     *
     * ```js
     * const EventEmitter = require('events');
     * const myEmitter = new EventEmitter();
     *
     * // First listener
     * myEmitter.on('event', function firstListener() {
     *   console.log('Helloooo! first listener');
     * });
     * // Second listener
     * myEmitter.on('event', function secondListener(arg1, arg2) {
     *   console.log(`event with parameters ${arg1}, ${arg2} in second listener`);
     * });
     * // Third listener
     * myEmitter.on('event', function thirdListener(...args) {
     *   const parameters = args.join(', ');
     *   console.log(`event with parameters ${parameters} in third listener`);
     * });
     *
     * console.log(myEmitter.listeners('event'));
     *
     * myEmitter.emit('event', 1, 2, 3, 4, 5);
     *
     * // Prints:
     * // [
     * //   [Function: firstListener],
     * //   [Function: secondListener],
     * //   [Function: thirdListener]
     * // ]
     * // Helloooo! first listener
     * // event with parameters 1, 2 in second listener
     * // event with parameters 1, 2, 3, 4, 5 in third listener
     * ```
     * @since v0.1.26
     */
    fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    /**
     * Returns the number of listeners listening to the event named `eventName`.
     * @since v3.2.0
     * @param eventName The name of the event being listened for
     */
    fun listenerCount(event: EventType): Number

    /**
     * Adds the `listener` function to the _beginning_ of the listeners array for the
     * event named `eventName`. No checks are made to see if the `listener` has
     * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
     * times.
     *
     * ```js
     * server.prependListener('connection', (stream) => {
     *   console.log('someone connected!');
     * });
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v6.0.0
     * @param eventName The name of the event.
     * @param listener The callback function
     */
    fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * Adds a **one-time**`listener` function for the event named `eventName` to the _beginning_ of the listeners array. The next time `eventName` is triggered, this
     * listener is removed, and then invoked.
     *
     * ```js
     * server.prependOnceListener('connection', (stream) => {
     *   console.log('Ah, we have our first user!');
     * });
     * ```
     *
     * Returns a reference to the `EventEmitter`, so that calls can be chained.
     * @since v6.0.0
     * @param eventName The name of the event.
     * @param listener The callback function
     */
    fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * Returns an array listing the events for which the emitter has registered
     * listeners. The values in the array are strings or `Symbol`s.
     *
     * ```js
     * const EventEmitter = require('events');
     * const myEE = new EventEmitter();
     * myEE.on('foo', () => {});
     * myEE.on('bar', () => {});
     *
     * const sym = Symbol('symbol');
     * myEE.on(sym, () => {});
     *
     * console.log(myEE.eventNames());
     * // Prints: [ 'foo', 'bar', Symbol(symbol) ]
     * ```
     * @since v6.0.0
     */
    fun eventNames(): ReadonlyArray<String /* | Symbol */>
}
