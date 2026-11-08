// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * The reason a timeline is requested.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineTriggerKind)
 */
/* enum */
external class TimelineTriggerKind
private constructor() {
    /**
     * The user explicitly refreshed the timeline. Providers that cache results should fetch fresh data.
     */
    val Invoke: TimelineTriggerKind // 1

    /**
     * The timeline was requested automatically, for example because the active editor changed,
     * the provider signaled a change, or the user loaded more items.
     */
    val Automatic: TimelineTriggerKind // 2
}
