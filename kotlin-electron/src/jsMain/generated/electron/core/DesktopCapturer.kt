// Generated by Karakum - do not modify it manually!

package electron.core

import js.promise.Promise

external interface DesktopCapturer {
// Docs: https://electronjs.org/docs/api/desktop-capturer
    /**
     * Resolves with an array of `DesktopCapturerSource` objects, each
     * `DesktopCapturerSource` represents a screen or an individual window that can be
     * captured.
     *
     * **Note** Capturing the screen contents requires user consent on macOS 10.15
     * Catalina or higher, which can detected by
     * `systemPreferences.getMediaAccessStatus`.
     */
    fun getSources(options: SourcesOptions): Promise<js.array.ReadonlyArray<DesktopCapturerSource>>
}
