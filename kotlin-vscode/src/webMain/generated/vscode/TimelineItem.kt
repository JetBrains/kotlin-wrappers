// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.numbers.JsInt53

/**
 * An entry in a timeline, such as a commit or a saved version of a file.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem)
 */
open external class TimelineItem {
    /**
     * When the item occurred, in milliseconds since 1 January 1970 00:00:00 UTC.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.timestamp)
     */
    var timestamp: JsInt53 /* EpochTimeStamp */

    /**
     * A human-readable string describing the timeline item. When `falsy`, it is derived from [resourceUri][TimelineItem.resourceUri].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.label)
     */
    var label: String?

    /**
     * Optional id for the timeline item. It must be unique across all the timeline items provided by its provider.
     *
     * If not provided, the item is identified by its timestamp. Set an id when two items can have the same timestamp.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.id)
     */
    var id: String?

    /**
     * The icon path or [ThemeIcon] for the timeline item.
     *
     * When [label][TimelineItem.label] is `falsy` and [resourceUri][TimelineItem.resourceUri] is set,
     * the icon is derived from the current file icon theme when `iconPath` is `falsy` or set to
     * [ThemeIcon.File] or [ThemeIcon.Folder].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.iconPath)
     */
    var iconPath: IconPath?

    /**
     * A human-readable string describing less prominent details of the timeline item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.description)
     */
    var description: String?

    /**
     * The tooltip text when you hover over the timeline item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.tooltip)
     */
    var tooltip: JsAny /* string | MarkdownString */?

    /**
     * The [Command] that should be executed when the timeline item is opened.
     *
     * For an item that changes multiple resources, such as a commit in a folder or workspace timeline,
     * use the `vscode.changes` command to show all of its changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.command)
     */
    var command: Command?

    /**
     * The [Uri] of the resource's content as of this item, for example a `git:` uri for a commit
     * or the uri of a saved version of a file.
     *
     * When set, two selected items can be compared, including items from different providers.
     * Leave it `undefined` when the item does not represent a single version of a resource, for example
     * a commit in a folder or workspace timeline.
     *
     * When [label][TimelineItem.label] is `falsy`, the item represents the resource itself, and all of
     * the following are derived from this property:
     * - **Label**: Derived from the resource's file name.
     * - **Icon**: Derived from the current file icon theme when [iconPath][TimelineItem.iconPath] is `falsy`
     *   or set to [ThemeIcon.File] or [ThemeIcon.Folder].
     * - **Decorations**: The resource's [file decorations][FileDecoration] are shown.
     *
     * When `label` is set, the label, icon, and decorations are not derived from this property.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.resourceUri)
     */
    var resourceUri: Uri?

    /**
     * Context value of the timeline item. This can be used to contribute specific actions to the item.
     * For example, a timeline item is given a context value as `commit`. When contributing actions to `timeline/item/context`
     * using `menus` extension point, you can specify context value for key `timelineItem` in `when` expression like `timelineItem == commit`.
     * ```
     *	"contributes": {
     *		"menus": {
     *			"timeline/item/context": [
     *				{
     *					"command": "extension.copyCommitId",
     *					"when": "timelineItem == commit && !listMultiSelection"
     *				}
     *			]
     *		}
     *	}
     * ```
     * This will show the `extension.copyCommitId` action only for items where `contextValue` is `commit`,
     * and only when a single item is selected.
     *
     * Commands contributed to `timeline/item/context` are run with the following arguments:
     * 1. The [TimelineItem] the command was run on.
     * 2. The [Uri] of the file or folder whose timeline is shown, or `undefined` for the workspace timeline.
     * 3. The id that the provider of the item was registered with, see [workspace.registerTimelineProvider].
     * 4. If the item is part of a multi-selection, all selected items from the same provider, including the
     *    first argument. Otherwise `undefined`.
     *
     * Commands contributed by other extensions receive read-only copies of the items, with all properties
     * except [command][TimelineItem.command]. The extension that provided the items receives the
     * original objects.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.contextValue)
     */
    var contextValue: String?

    /**
     * Accessibility information used when screen reader interacts with this timeline item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.accessibilityInformation)
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * @param label A human-readable string describing the timeline item.
     * @param timestamp When the item occurred, in milliseconds since 1 January 1970 00:00:00 UTC.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.constructor)
     */
    constructor(
        label: String,
        timestamp: JsInt53, /* EpochTimeStamp */
    )

    /**
     * @param resourceUri The [Uri] of the resource's content as of this item, see [TimelineItem.resourceUri].
     * @param timestamp When the item occurred, in milliseconds since 1 January 1970 00:00:00 UTC.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineItem.constructor)
     */
    constructor(
        resourceUri: Uri,
        timestamp: JsInt53, /* EpochTimeStamp */
    )
}
