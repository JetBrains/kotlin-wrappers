// Automatically generated - do not modify!

package vscode

import js.void.Void

/**
 * Provides the timeline of the whole workspace, for example the history of the workspace's repositories.
 * In a multi-root workspace, the timeline covers all workspace folders.
 *
 * While the workspace timeline is shown, the `timelineForWorkspace` context key is `true`.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceTimelineProvider)
 */
external interface WorkspaceTimelineProvider {
    /**
     * An optional event to signal that the workspace timeline from this provider has changed.
     *
     * Items that are already shown are requested again, so changed and removed items are updated.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceTimelineProvider.onDidChangeWorkspaceTimeline)
     */
    val onDidChangeWorkspaceTimeline: Event<Void>?

    /**
     * Provide [timeline items][TimelineItem] for the whole workspace.
     *
     * @param options Options for this request.
     * @param token A cancellation token.
     * @returns A [Timeline] or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceTimelineProvider.provideWorkspaceTimeline)
     */
    fun provideWorkspaceTimeline(
        options: TimelineOptions,
        token: CancellationToken,
    ): ProviderResult<Timeline>
}
