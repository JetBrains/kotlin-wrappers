// Automatically generated - do not modify!

package actions.github

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PayloadRepository {
    // [key: string]: any
    val full_name: String?
    val name: String
    val owner: Owner

    @JsPlainObject
    interface Owner {
        //     [key: string]: any
        val login: String
        val name: String?
    }

    val html_url: String?
}
