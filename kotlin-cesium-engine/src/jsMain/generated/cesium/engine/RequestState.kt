// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * State of the request.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#RequestState">Online Documentation</a>
 */
sealed external interface RequestState {
    companion object {

        /**
         * Initial unissued state.
         */
        val UNISSUED: RequestState

        /**
         * Issued but not yet active. Will become active when open slots are available.
         */
        val ISSUED: RequestState

        /**
         * Actual http request has been sent.
         */
        val ACTIVE: RequestState

        /**
         * Request completed successfully.
         */
        val RECEIVED: RequestState

        /**
         * Request was cancelled, either explicitly or automatically because of low priority.
         */
        val CANCELLED: RequestState

        /**
         * Request failed.
         */
        val FAILED: RequestState
    }
}
