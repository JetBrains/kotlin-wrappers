// Automatically generated - do not modify!

package vscode

/**
 * A language status item is the preferred way to present language status reports for the active text editors,
 * such as selected linter or notifying about a configuration problem.
 */
external interface LanguageStatusItem :
    DisposableLike {
    /**
     * The identifier of this item.
     */
    val id: String

    /**
     * The short name of this item, like 'Java Language Status', etc.
     */
    var name: String?

    /**
     * A [selector][DocumentSelector] that defines for what editors
     * this item shows.
     */
    var selector: DocumentSelector

    /**
     * The severity of this item.
     *
     * Defaults to [information][LanguageStatusSeverity.Information]. You can use this property to
     * signal to users that there is a problem that needs attention, like a missing executable or an
     * invalid configuration.
     */
    var severity: LanguageStatusSeverity

    /**
     * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
     *
     * `My text $(icon-name) contains icons like $(icon-name) this one.`
     *
     * Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
     * `light-bulb`, `thumbsup`, `zap` etc.
     */
    var text: String

    /**
     * Optional, human-readable details for this item.
     */
    var detail: String?

    /**
     * Controls whether the item is shown as "busy". Defaults to `false`.
     */
    var busy: Boolean

    /**
     * A {@linkcode Command command} for this item.
     */
    var command: Command?

    /**
     * Accessibility information used when a screen reader interacts with this item
     */
    var accessibilityInformation: AccessibilityInformation?

    /**
     * Dispose and free associated resources.
     */
    override fun dispose()
}
