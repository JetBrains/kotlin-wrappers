// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * State of the request.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#RequestState">Online Documentation</a>
 */
sealed /* enum */
external interface RequestState {
    companion object {

        /**
         * Initial unissued state.
         *
         * Value - `0`
         */
        val UNISSUED: RequestState

        /**
         * Issued but not yet active. Will become active when open slots are available.
         *
         * Value - `1`
         */
        val ISSUED: RequestState

        /**
         * Actual http request has been sent.
         *
         * Value - `2`
         */
        val ACTIVE: RequestState

        /**
         * Request completed successfully.
         *
         * Value - `3`
         */
        val RECEIVED: RequestState

        /**
         * Request was cancelled, either explicitly or automatically because of low priority.
         *
         * Value - `4`
         */
        val CANCELLED: RequestState

        /**
         * Request failed.
         *
         * Value - `5`
         */
        val FAILED: RequestState
    }
}
