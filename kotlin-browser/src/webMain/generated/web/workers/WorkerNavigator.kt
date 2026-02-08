// Automatically generated - do not modify!

package web.workers

import web.badge.NavigatorBadge
import web.experimental.ExperimentalWebApi
import web.gpu.NavigatorGPU
import web.locks.NavigatorLocks
import web.mediacapabilities.MediaCapabilities
import web.navigator.NavigatorConcurrentHardware
import web.navigator.NavigatorID
import web.navigator.NavigatorLanguage
import web.navigator.NavigatorOnLine
import web.permissions.Permissions
import web.serviceworker.ServiceWorkerContainer
import web.storage.NavigatorStorage
import web.usb.USB

/**
 * The **`WorkerNavigator`** interface represents a subset of the Navigator interface allowed to be accessed from a Worker. Such an object is initialized for each worker and is available via the self.navigator property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator)
 */
open external class WorkerNavigator
private constructor() :
    NavigatorBadge,
    NavigatorConcurrentHardware,
    NavigatorGPU,
    NavigatorID,
    NavigatorLanguage,
    NavigatorLocks,
    NavigatorOnLine,
    NavigatorStorage {
    /**
     * The read-only **`mediaCapabilities`** property of the WorkerNavigator interface references a MediaCapabilities object that can expose information about the decoding and encoding capabilities for a given format and output capabilities (as defined by the Media Capabilities API).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/mediaCapabilities)
     */
    val mediaCapabilities: MediaCapabilities

    /**
     * The **`permissions`** read-only property of the WorkerNavigator interface returns a Permissions object that can be used to query and update permission status of APIs covered by the Permissions API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/permissions)
     */
    val permissions: Permissions

    /**
     * The **`serviceWorker`** read-only property of the WorkerNavigator interface returns the ServiceWorkerContainer object for the associated document, which provides access to registration, removal, upgrade, and communication with the ServiceWorker.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/serviceWorker)
     */
    val serviceWorker: ServiceWorkerContainer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/usb)
     */
    @ExperimentalWebApi
    val usb: USB
}
