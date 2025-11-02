// Automatically generated - do not modify!

package web.workers

/**
 * The **`WorkerLocation`** interface defines the absolute location of the script executed by the Worker. Such an object is initialized for each worker and is available via the WorkerGlobalScope.location property obtained by calling self.location.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation)
 */
open external class WorkerLocation
private constructor() {
    /**
     * The **`hash`** property of a WorkerLocation object returns the hash part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/hash)
     */
    val hash: String

    /**
     * The **`host`** property of a WorkerLocation object returns the host part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/host)
     */
    val host: String

    /**
     * The **`hostname`** property of a WorkerLocation object returns the hostname part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/hostname)
     */
    val hostname: String

    /**
     * The **`href`** property of a WorkerLocation object returns a string containing the serialized URL for the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/href)
     */
    val href: String

    /**
     * The **`origin`** property of a WorkerLocation object returns the worker's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/origin)
     */
    val origin: String

    /**
     * The **`pathname`** property of a WorkerLocation object returns the pathname part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/pathname)
     */
    val pathname: String

    /**
     * The **`port`** property of a WorkerLocation object returns the port part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/port)
     */
    val port: String

    /**
     * The **`protocol`** property of a WorkerLocation object returns the protocol part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/protocol)
     */
    val protocol: String

    /**
     * The **`search`** property of a WorkerLocation object returns the search part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/search)
     */
    val search: String
}
