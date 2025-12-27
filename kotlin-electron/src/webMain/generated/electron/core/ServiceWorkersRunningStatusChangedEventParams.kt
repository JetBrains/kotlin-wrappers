// Automatically generated - do not modify!

package electron.core

external interface ServiceWorkersRunningStatusChangedEventParams {
    /**
     * ID of the updated service worker version
     */
    var versionId: Double

    /**
     * Running status. Possible values include `starting`, `running`, `stopping`, or
     * `stopped`.
     */
    var runningStatus: (ServiceWorkersRunningStatusChangedEventParamsRunningStatus)
}
