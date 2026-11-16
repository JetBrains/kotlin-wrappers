// Automatically generated - do not modify!

package vscode

/**
 * Provides the timelines of files and folders.
 *
 * Commands contributed to the `timeline/title` menu are run with the [Uri] of the file or folder whose
 * timeline is shown, or `undefined` for the workspace timeline. Use the `timelineForWorkspace` context key in
 * their `when` clauses to tell whether the workspace timeline is shown.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineProvider)
 */
external interface TimelineProvider {
    /**
     * An optional event to signal that timelines from this provider have changed. Fire the [uris][Uri]
     * of the files or folders whose timelines changed, or `undefined` to signal that all of them changed.
     *
     * Items that are already shown are requested again, so changed and removed items are updated.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineProvider.onDidChangeTimeline)
     */
    val onDidChangeTimeline: Event<JsAny /* Uri | Uri[] */?>?

    /**
     * Provide [timeline items][TimelineItem] for a file or folder.
     *
     * @param uri The [Uri] of the file or folder to provide the timeline for.
     * @param options Options for this request.
     * @param token A cancellation token.
     * @returns A [Timeline] or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineProvider.provideTimeline)
     */
    fun provideTimeline(
        uri: Uri,
        options: TimelineOptions,
        token: CancellationToken,
    ): ProviderResult<Timeline>
}
