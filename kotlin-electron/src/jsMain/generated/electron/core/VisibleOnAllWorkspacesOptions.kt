package electron.core


external interface VisibleOnAllWorkspacesOptions {
    /**
     * Sets whether the window should be visible above fullscreen windows.
     *
     * @platform darwin
     */
    var visibleOnFullScreen: Boolean?

    /**
     * Calling setVisibleOnAllWorkspaces will by default transform the process type
     * between UIElementApplication and ForegroundApplication to ensure the correct
     * behavior. However, this will hide the window and dock for a short time every
     * time it is called. If your window is already of type UIElementApplication, you
     * can bypass this transformation by passing true to skipTransformProcessType.
     *
     * @platform darwin
     */
    var skipTransformProcessType: Boolean?
}
