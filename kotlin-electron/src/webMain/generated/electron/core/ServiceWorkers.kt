// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

external class ServiceWorkers : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/service-workers
    /**
     * Emitted when a service worker logs something to the console.
     */

    /**
     * Emitted when a service worker has been registered. Can occur after a call to
     * `navigator.serviceWorker.register('/sw.js')` successfully resolves or when a
     * Chrome extension is loaded.
     */

    /**
     * Emitted when a service worker's running status has changed.
     *
     * @experimental
     */

    /**
     * @experimental
     */

    /**
     * @experimental
     */

    /**
     * @experimental
     */

    /**
     * @experimental
     */

    /**
     * A ServiceWorkerInfo object where the keys are the service worker version ID and
     * the values are the information about that service worker.
     */
    fun getAllRunning(): js.objects.ReadonlyRecord<Double, ServiceWorkerInfo>

    /**
     * Information about this service worker
     *
     * If the service worker does not exist or is not running this method will throw an
     * exception.
     *
     * **Deprecated:** Use the new `serviceWorkers.getInfoFromVersionID` API.
     *
     * @deprecated
     */
    fun getFromVersionID(versionId: Double): ServiceWorkerInfo

    /**
     * Information about this service worker
     *
     * If the service worker does not exist or is not running this method will throw an
     * exception.
     */
    fun getInfoFromVersionID(versionId: Double): ServiceWorkerInfo

    /**
     * Instance of the service worker associated with the given version ID. If there's
     * no associated version, or its running status has changed to 'stopped', this will
     * return `undefined`.
     *
     * @experimental
     */
    fun getWorkerFromVersionID(versionId: Double): ServiceWorkerMain?

    /**
     * Resolves with the service worker when it's started.
     *
     * Starts the service worker or does nothing if already running.
     *
     * @experimental
     */
    fun startWorkerForScope(scope: String): js.promise.Promise<ServiceWorkerMain>

    @web.events.JsEvent("console-message")
    val consoleMessageEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, MessageDetails>>

    @web.events.JsEvent("registration-completed")
    val registrationCompletedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, RegistrationCompletedDetails>>

    @web.events.JsEvent("running-status-changed")
    val runningStatusChangedEvent:
            node.events.EventInstance<js.array.Tuple1<Event<ServiceWorkersRunningStatusChangedEventParams>>>
}
