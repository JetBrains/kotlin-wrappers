// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * A followup question suggested by the participant.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatFollowup)
 */
@JsPlainObject
external interface ChatFollowup {
    /**
     * The message to send to the chat.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatFollowup.prompt)
     */
    var prompt: String

    /**
     * A title to show the user. The prompt will be shown by default, when this is unspecified.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatFollowup.label)
     */
    var label: String?

    /**
     * By default, the followup goes to the same participant/command. But this property can be set to invoke a different participant by ID.
     * Followups can only invoke a participant that was contributed by the same extension.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatFollowup.participant)
     */
    var participant: String?

    /**
     * By default, the followup goes to the same participant/command. But this property can be set to invoke a different command.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatFollowup.command)
     */
    var command: String?
}
