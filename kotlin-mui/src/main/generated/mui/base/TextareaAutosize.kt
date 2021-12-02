// Automatically generated - do not modify!

@file:JsModule("@mui/base/TextareaAutosize")
@file:JsNonModule

package mui.base

external interface TextareaAutosizeProps :
    react.dom.html.TextareaHTMLAttributes<org.w3c.dom.HTMLTextAreaElement> {
    /**
     * Maximum number of rows to display.
     */
    var maxRows: Int?

    /**
     * Minimum number of rows to display.
     * @default 1
     */
    var minRows: Int?
}

/**
 *
 * Demos:
 *
 * - [Textarea Autosize](https://mui.com/components/textarea-autosize/)
 *
 * API:
 *
 * - [TextareaAutosize API](https://mui.com/api/textarea-autosize/)
 */
@JsName("default")
external val TextareaAutosize: react.FC<TextareaAutosizeProps>
