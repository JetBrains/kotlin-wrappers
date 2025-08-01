// Automatically generated - do not modify!

package vscode

/**
 * A language status item is the preferred way to present language status reports for the active text editors,
 * such as selected linter or notifying about a configuration problem.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem)
 */
external interface LanguageStatusItem :
    DisposableLike {
    /**
     * The identifier of this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.id)
     */
    val id: String

    /**
     * The short name of this item, like 'Java Language Status', etc.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.name)
     */
    var name: String?

    /**
     * A [selector][DocumentSelector] that defines for what editors
     * this item shows.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.selector)
     */
    var selector: DocumentSelector

    /**
     * The severity of this item.
     *
     * Defaults to [information][LanguageStatusSeverity.Information]. You can use this property to
     * signal to users that there is a problem that needs attention, like a missing executable or an
     * invalid configuration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.severity)
     */
    var severity: LanguageStatusSeverity

    /**
     * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
     *
     * `My text $(icon-name) contains icons like $(icon-name) this one.`
     *
     * Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
     * `light-bulb`, `thumbsup`, `zap` etc.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.text)
     */
    var text: String

    /**
     * Optional, human-readable details for this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.detail)
     */
    var detail: String?

    /**
     * Controls whether the item is shown as "busy". Defaults to `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.busy)
     */
    var busy: Boolean

    /**
     * A {@linkcode Command command} for this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.command)
     */
    var command: Command?

    /**
     * Accessibility information used when a screen reader interacts with this item
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.accessibilityInformation)
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * Dispose and free associated resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageStatusItem.dispose)
     */
    override fun dispose()
}
