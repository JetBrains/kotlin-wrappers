// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import kotlin.js.Promise

external fun hashFiles(
    globber: Globber,
    currentWorkspace: String,
    verbose: Boolean = definedExternally,
): Promise<String>

external fun hashFiles(
    patterns: String,
    currentWorkspace: String = definedExternally,
    options: HashFileOptions = definedExternally,
    verbose: Boolean = definedExternally,
): Promise<String>
