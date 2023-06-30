package electron


external interface RenderProcessGoneDetails {
    /**
     * The reason the render process is gone.  Possible values:
     */
    var reason: (RenderProcessGoneDetailsReason)

    /**
     * The exit code of the process, unless `reason` is `launch-failed`, in which case
     * `exitCode` will be a platform-specific launch failure error code.
     */
    var exitCode: Double
}
