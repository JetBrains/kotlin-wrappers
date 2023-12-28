// Automatically generated - do not modify!

package web.workers

/**
 * The absolute location of the script executed by the Worker. Such an object is initialized for each worker and is available via the WorkerGlobalScope.location property obtained by calling self.location.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation)
 */
sealed external class WorkerLocation {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/hash)
     */
    val hash: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/host)
     */
    val host: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/hostname)
     */
    val hostname: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/href)
     */
    val href: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/origin)
     */
    val origin: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/pathname)
     */
    val pathname: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/port)
     */
    val port: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/protocol)
     */
    val protocol: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/search)
     */
    val search: String
}
