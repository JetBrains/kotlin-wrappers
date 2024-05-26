// Automatically generated - do not modify!

package actions.core

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface InputOptions {
    /** Optional. Whether the input is required. If required and not present, will throw. Defaults to false */
    var required: Boolean?

    /** Optional. Whether leading/trailing whitespace will be trimmed for the input. Defaults to true */
    var trimWhitespace: Boolean?
}
