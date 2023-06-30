package electron.core


external interface IgnoreMouseEventsOptions {
    /**
     * If true, forwards mouse move messages to Chromium, enabling mouse related events
     * such as `mouseleave`. Only used when `ignore` is true. If `ignore` is false,
     * forwarding is always disabled regardless of this value.
     *
     * @platform darwin,win32
     */
    var forward: Boolean?
}
