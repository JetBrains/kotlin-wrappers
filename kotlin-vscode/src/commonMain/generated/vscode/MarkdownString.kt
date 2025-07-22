// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Human-readable text that supports formatting via the [markdown syntax](https://commonmark.org).
 *
 * Rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax is supported
 * when the {@linkcode supportThemeIcons} is set to `true`.
 *
 * Rendering of embedded html is supported when {@linkcode supportHtml} is set to `true`.
 */
open external class MarkdownString {
    /**
     * The markdown string.
     */
//  value: string

    /**
     * Indicates that this markdown string is from a trusted source. Only *trusted*
     * markdown supports links that execute commands, e.g. `[Run it](command:myCommandId)`.
     *
     * Defaults to `false` (commands are disabled).
     */
    /*
    isTrusted?: boolean | {
        /**
         * A set of commend ids that are allowed to be executed by this markdown string.
         */
        readonly enabledCommands: readonly string[];
    }
    */

    /**
     * Indicates that this markdown string can contain {@link ThemeIcon ThemeIcons}, e.g. `$(zap)`.
     */
//  supportThemeIcons?: boolean

    /**
     * Indicates that this markdown string can contain raw html tags. Defaults to `false`.
     *
     * When `supportHtml` is false, the markdown renderer will strip out any raw html tags
     * that appear in the markdown text. This means you can only use markdown syntax for rendering.
     *
     * When `supportHtml` is true, the markdown render will also allow a safe subset of html tags
     * and attributes to be rendered. See https://github.com/microsoft/vscode/blob/6d2920473c6f13759c978dd89104c4270a83422d/src/vs/base/browser/markdownRenderer.ts#L296
     * for a list of all supported tags and attributes.
     */
//  supportHtml?: boolean

    /**
     * Uri that relative paths are resolved relative to.
     *
     * If the `baseUri` ends with `/`, it is considered a directory and relative paths in the markdown are resolved relative to that directory:
     *
     * ```ts
     * const md = new vscode.MarkdownString(`[link](./file.js)`);
     * md.baseUri = vscode.Uri.file('/path/to/dir/');
     * // Here 'link' in the rendered markdown resolves to '/path/to/dir/file.js'
     * ```
     *
     * If the `baseUri` is a file, relative paths in the markdown are resolved relative to the parent dir of that file:
     *
     * ```ts
     * const md = new vscode.MarkdownString(`[link](./file.js)`);
     * md.baseUri = vscode.Uri.file('/path/to/otherFile.js');
     * // Here 'link' in the rendered markdown resolves to '/path/to/file.js'
     * ```
     */
//  baseUri?: Uri

    /**
     * Creates a new markdown string with the given value.
     *
     * @param value Optional, initial value.
     * @param supportThemeIcons Optional, Specifies whether {@link ThemeIcon ThemeIcons} are supported within the {@linkcode MarkdownString}.
     */
//  constructor(value?: string, supportThemeIcons?: boolean)

    /**
     * Appends and escapes the given string to this markdown string.
     * @param value Plain text.
     */
//  appendText(value: string): MarkdownString

    /**
     * Appends the given string 'as is' to this markdown string. When {@linkcode MarkdownString.supportThemeIcons supportThemeIcons} is `true`, {@link ThemeIcon ThemeIcons} in the `value` will be iconified.
     * @param value Markdown string.
     */
//  appendMarkdown(value: string): MarkdownString

    /**
     * Appends the given string as codeblock using the provided language.
     * @param value A code snippet.
     * @param language An optional {@link languages.getLanguages language identifier}.
     */
//  appendCodeblock(value: string, language?: string): MarkdownString
}
