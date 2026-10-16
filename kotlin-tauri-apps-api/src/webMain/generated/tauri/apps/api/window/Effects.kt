// Automatically generated - do not modify!

package tauri.apps.api.window

/** The window effects configuration object
 *
 * @since 2.0.0
 */
external interface Effects {
    /**
     * List of Window effects to apply to the Window.
     *
     * Generally, conflicting effects will apply the first one and ignore the rest but
     * on macOS you can specify one Liquid Glass style and one Visual Effect material at the same time
     * to make Tauri fallback to the latter on macOS 15 and below.
     */
    var effects: js.array.ReadonlyArray<Effect>

    /**
     * Window effect state **macOS Only**. Ignored for Liquid Glass Effects.
     */
    var state: EffectState?

    /**
     * Window effect corner radius **macOS Only**
     */
    var radius: Double?

    /**
     *  Window effect color.
     *
     * #### Platform-specific
     *
     * - **Windows**: Affects {@link Effect.Blur} and {@link Effect.Acrylic} only
     * on Windows 10 v1903+. Doesn't have any effect on Windows 7 or Windows 11.
     * - **macOS**: Only affects Liquid Glass effects.
     */
    var color: Color?

    /**
     * Enables interactive glass behavior, which adds a visual response to user interactions.
     *
     * **macOS 27.0+**. Only affects Liquid Glass effects.
     */
    var interactive: Boolean?
}
