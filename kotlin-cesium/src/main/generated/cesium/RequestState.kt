// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * State of the request.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#RequestState">Online Documentation</a>
 */

external enum class RequestState {

    /**
     * Initial unissued state.
     */
    UNISSUED,

    /**
     * Issued but not yet active. Will become active when open slots are available.
     */
    ISSUED,

    /**
     * Actual http request has been sent.
     */
    ACTIVE,

    /**
     * Request completed successfully.
     */
    RECEIVED,

    /**
     * Request was cancelled, either explicitly or automatically because of low priority.
     */
    CANCELLED,

    /**
     * Request failed.
     */
    FAILED,

    ;

}
