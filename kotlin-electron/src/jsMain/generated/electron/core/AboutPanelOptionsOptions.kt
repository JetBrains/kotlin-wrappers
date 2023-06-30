package electron.core


external interface AboutPanelOptionsOptions {
    /**
     * The app's name.
     */
    var applicationName: String?

    /**
     * The app's version.
     */
    var applicationVersion: String?

    /**
     * Copyright information.
     */
    var copyright: String?

    /**
     * The app's build version number.
     *
     * @platform darwin
     */
    var version: String?

    /**
     * Credit information.
     *
     * @platform darwin,win32
     */
    var credits: String?

    /**
     * List of app authors.
     *
     * @platform linux
     */
    var authors: js.core.ReadonlyArray<String>?

    /**
     * The app's website.
     *
     * @platform linux
     */
    var website: String?

    /**
     * Path to the app's icon in a JPEG or PNG file format. On Linux, will be shown as
     * 64x64 pixels while retaining aspect ratio.
     *
     * @platform linux,win32
     */
    var iconPath: String?
}
