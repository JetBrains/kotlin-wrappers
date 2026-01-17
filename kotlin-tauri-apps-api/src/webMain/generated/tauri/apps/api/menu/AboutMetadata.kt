// Automatically generated - do not modify!

package tauri.apps.api.menu


/** A metadata for the about predefined menu item. */
external interface AboutMetadata {
    /** Sets the application name. */
    var name: String?

    /** The application version. */
    var version: String?

    /**
     * The short version, e.g. "1.0".
     *
     * #### Platform-specific
     *
     * - **Windows / Linux:** Appended to the end of `version` in parentheses.
     */
    var shortVersion: String?

    /**
     * The authors of the application.
     *
     * #### Platform-specific
     *
     * - **macOS:** Unsupported.
     */
    var authors: js.array.ReadonlyArray<String>?

    /**
     * Application comments.
     *
     * #### Platform-specific
     *
     * - **macOS:** Unsupported.
     */
    var comments: String?

    /** The copyright of the application. */
    var copyright: String?

    /**
     * The license of the application.
     *
     * #### Platform-specific
     *
     * - **macOS:** Unsupported.
     */
    var license: String?

    /**
     * The application website.
     *
     * #### Platform-specific
     *
     * - **macOS:** Unsupported.
     */
    var website: String?

    /**
     * The website label.
     *
     * #### Platform-specific
     *
     * - **macOS:** Unsupported.
     */
    var websiteLabel: String?

    /**
     * The credits.
     *
     * #### Platform-specific
     *
     * - **Windows / Linux:** Unsupported.
     */
    var credits: String?

    /**
     * The application icon.
     *
     * #### Platform-specific
     *
     * - **Windows:** Unsupported.
     */
    var icon: (Any /* string | Uint8Array | ArrayBuffer | number[] | Image */)?
}
