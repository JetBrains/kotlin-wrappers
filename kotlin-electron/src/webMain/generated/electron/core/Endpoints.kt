// Automatically generated - do not modify!

package electron.core

external interface Endpoints {
    /**
     * this endpoint's "endpoint number" which is a value from 1 to 15.
     */
    var endpointNumber: Double

    /**
     * the direction in which this endpoint transfers data - can be either 'in' or
     * 'out'.
     */
    var direction: String

    /**
     * the type of this endpoint - can be either 'bulk', 'interrupt', or 'isochronous'.
     */
    var type: String

    /**
     * the size of the packets that data sent through this endpoint will be divided
     * into.
     */
    var packetSize: Double
}
