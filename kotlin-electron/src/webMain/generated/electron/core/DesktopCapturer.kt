// Automatically generated - do not modify!

package electron.core

external interface DesktopCapturer {
// Docs: https://electronjs.org/docs/api/desktop-capturer
    /**
     * Resolves with an array of `DesktopCapturerSource` objects, each
     * `DesktopCapturerSource` represents a screen or an individual window that can be
     * captured.
     *
     * > [!NOTE] Capturing the screen contents requires user consent on macOS 10.15
     * Catalina or higher, which can detected by
     * `systemPreferences.getMediaAccessStatus`.
     */
    fun getSources(options: SourcesOptions): js.promise.Promise<js.array.ReadonlyArray<DesktopCapturerSource>>
}
