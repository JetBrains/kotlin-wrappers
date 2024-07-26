// Automatically generated - do not modify!

package actions.github

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface PayloadRepository {
    // [key: string]: any
    var full_name: String?
    var name: String
    var owner: Owner

    @JsPlainObject
    interface Owner {
        //     [key: string]: any
        var login: String
        var name: String?
    }

    var html_url: String?
}
