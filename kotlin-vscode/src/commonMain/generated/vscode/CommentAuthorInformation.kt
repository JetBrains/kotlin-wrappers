// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Author information of a [Comment]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentAuthorInformation)
 */
@JsPlainObject
external interface CommentAuthorInformation {
    /**
     * The display name of the author of the comment
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentAuthorInformation.name)
     */
    var name: String

    /**
     * The optional icon path for the author
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CommentAuthorInformation.iconPath)
     */
    var iconPath: Uri?
}
