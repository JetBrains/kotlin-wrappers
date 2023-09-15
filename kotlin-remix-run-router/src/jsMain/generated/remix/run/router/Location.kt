package remix.run.router


/**
 * An entry in a history stack. A location contains information about the
 * URL path, as well as possibly some arbitrary state and a key.
 */

sealed external interface Location<State /* default is Any? */> : Path {
    /**
     * A value of arbitrary data associated with this location.
     */
    var state: State

    /**
     * A unique string associated with this location. May be used to safely store
     * and retrieve data in some other storage API, like `localStorage`.
     *
     * Note: This value is always "default" on the initial location.
     */
    var key: String
}
