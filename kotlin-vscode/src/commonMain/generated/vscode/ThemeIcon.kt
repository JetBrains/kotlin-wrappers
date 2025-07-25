// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A reference to a named icon. Currently, [File}, {@link ThemeIcon.Folder Folder][ThemeIcon.File],
 * and [ThemeIcon ids](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing) are supported.
 * Using a theme icon is preferred over a custom icon as it gives product theme authors the possibility to change the icons.
 *
 * *Note* that theme icons can also be rendered inside labels and descriptions. Places that support theme icons spell this out
 * and they use the `$(<name>)`-syntax, for instance `quickPick.label = "Hello World $(globe)"`.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeIcon)
 */
open external class ThemeIcon {
    /**
     * The id of the icon. The available icons are listed in https://code.visualstudio.com/api/references/icons-in-labels#icon-listing.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeIcon.id)
     */
    val id: String

    /**
     * The optional ThemeColor of the icon. The color is currently only used in [TreeItem].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeIcon.color)
     */
    val color: ThemeColor?

    /**
     * Creates a reference to a theme icon.
     * @param id id of the icon. The available icons are listed in https://code.visualstudio.com/api/references/icons-in-labels#icon-listing.
     * @param color optional `ThemeColor` for the icon. The color is currently only used in [TreeItem].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeIcon.constructor)
     */
    constructor(
        id: String,
        color: ThemeColor = definedExternally,
    )

    companion object {
        /**
         * Reference to an icon representing a file. The icon is taken from the current file icon theme or a placeholder icon is used.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeIcon.File)
         */
        val File: ThemeIcon

        /**
         * Reference to an icon representing a folder. The icon is taken from the current file icon theme or a placeholder icon is used.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ThemeIcon.Folder)
         */
        val Folder: ThemeIcon
    }
}
