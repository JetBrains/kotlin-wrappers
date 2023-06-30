package electron.core


external interface EnableNetworkEmulationOptions {
    /**
     * Whether to emulate network outage. Defaults to false.
     */
    var offline: Boolean?

    /**
     * RTT in ms. Defaults to 0 which will disable latency throttling.
     */
    var latency: Double?

    /**
     * Download rate in Bps. Defaults to 0 which will disable download throttling.
     */
    var downloadThroughput: Double?

    /**
     * Upload rate in Bps. Defaults to 0 which will disable upload throttling.
     */
    var uploadThroughput: Double?
}
