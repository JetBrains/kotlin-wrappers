package electron.core


external interface Params {
    /**
     * x coordinate.
     */
    var x: Double

    /**
     * y coordinate.
     */
    var y: Double

    /**
     * URL of the link that encloses the node the context menu was invoked on.
     */
    var linkURL: String

    /**
     * Text associated with the link. May be an empty string if the contents of the
     * link are an image.
     */
    var linkText: String

    /**
     * URL of the top level page that the context menu was invoked on.
     */
    var pageURL: String

    /**
     * URL of the subframe that the context menu was invoked on.
     */
    var frameURL: String

    /**
     * Source URL for the element that the context menu was invoked on. Elements with
     * source URLs are images, audio and video.
     */
    var srcURL: String

    /**
     * Type of the node the context menu was invoked on. Can be `none`, `image`,
     * `audio`, `video`, `canvas`, `file` or `plugin`.
     */
    var mediaType: (ParamsMediaType)

    /**
     * Whether the context menu was invoked on an image which has non-empty contents.
     */
    var hasImageContents: Boolean

    /**
     * Whether the context is editable.
     */
    var isEditable: Boolean

    /**
     * Text of the selection that the context menu was invoked on.
     */
    var selectionText: String

    /**
     * Title text of the selection that the context menu was invoked on.
     */
    var titleText: String

    /**
     * Alt text of the selection that the context menu was invoked on.
     */
    var altText: String

    /**
     * Suggested filename to be used when saving file through 'Save Link As' option of
     * context menu.
     */
    var suggestedFilename: String

    /**
     * Rect representing the coordinates in the document space of the selection.
     */
    var selectionRect: Rectangle

    /**
     * Start position of the selection text.
     */
    var selectionStartOffset: Double

    /**
     * The referrer policy of the frame on which the menu is invoked.
     */
    var referrerPolicy: Referrer

    /**
     * The misspelled word under the cursor, if any.
     */
    var misspelledWord: String

    /**
     * An array of suggested words to show the user to replace the `misspelledWord`.
     * Only available if there is a misspelled word and spellchecker is enabled.
     */
    var dictionarySuggestions: js.core.ReadonlyArray<String>

    /**
     * The character encoding of the frame on which the menu was invoked.
     */
    var frameCharset: String

    /**
     * If the context menu was invoked on an input field, the type of that field.
     * Possible values are `none`, `plainText`, `password`, `other`.
     */
    var inputFieldType: String

    /**
     * If the context is editable, whether or not spellchecking is enabled.
     */
    var spellcheckEnabled: Boolean

    /**
     * Input source that invoked the context menu. Can be `none`, `mouse`, `keyboard`,
     * `touch`, `touchMenu`, `longPress`, `longTap`, `touchHandle`, `stylus`,
     * `adjustSelection`, or `adjustSelectionReset`.
     */
    var menuSourceType: (ParamsMenuSourceType)

    /**
     * The flags for the media element the context menu was invoked on.
     */
    var mediaFlags: MediaFlags

    /**
     * These flags indicate whether the renderer believes it is able to perform the
     * corresponding action.
     */
    var editFlags: EditFlags
}
