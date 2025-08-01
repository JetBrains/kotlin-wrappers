// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule

/**
 * A relative pattern is a helper to construct glob patterns that are matched
 * relatively to a base file path. The base path can either be an absolute file
 * path as string or uri or a [workspace folder][WorkspaceFolder], which is the
 * preferred way of creating the relative pattern.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#RelativePattern)
 */
open external class RelativePattern {
    /**
     * A base file path to which this pattern will be matched against relatively. The
     * file path must be absolute, should not have any trailing path separators and
     * not include any relative segments (`.` or `..`).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#RelativePattern.baseUri)
     */
    var baseUri: Uri

    /**
     * A file glob pattern like `*.{ts,js}` that will be matched on file paths
     * relative to the base path.
     *
     * Example: Given a base of `/home/work/folder` and a file path of `/home/work/folder/index.js`,
     * the file glob pattern will match on `index.js`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#RelativePattern.pattern)
     */
    var pattern: String

    /**
     * Creates a new relative pattern object with a base file path and pattern to match. This pattern
     * will be matched on file paths relative to the base.
     *
     * Example:
     * ```ts
     * const folder = vscode.workspace.workspaceFolders?.[0];
     * if (folder) {
     *
     *   // Match any TypeScript file in the root of this workspace folder
     *   const pattern1 = new vscode.RelativePattern(folder, '*.ts');
     *
     *   // Match any TypeScript file in `someFolder` inside this workspace folder
     *   const pattern2 = new vscode.RelativePattern(folder, 'someFolder/​*.ts');
     * }
     * ```
     *
     * @param base A base to which this pattern will be matched against relatively. It is recommended
     * to pass in a [workspace folder][WorkspaceFolder] if the pattern should match inside the workspace.
     * Otherwise, a uri or string should only be used if the pattern is for a file path outside the workspace.
     * @param pattern A file glob pattern like `*.{ts,js}` that will be matched on paths relative to the base.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#RelativePattern.constructor)
     */
    constructor(
        base: JsAny, /* WorkspaceFolder | Uri | string */
        pattern: String,
    )
}
