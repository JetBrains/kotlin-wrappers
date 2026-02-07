// Automatically generated - do not modify!

package actions.github

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface WebhookPayload {
    // [key: string]: any
    val repository: PayloadRepository?
    val issue: Issue?

    @JsPlainObject
    interface Issue {
        //     [key: string]: any
        val number: Number
        val html_url: String?
        val body: String?
    }

    val pull_request: PullRequest?

    @JsPlainObject
    interface PullRequest {
        //     [key: string]: any
        val number: Number
        val html_url: String?
        val body: String?
    }

    val sender: Sender?

    @JsPlainObject
    interface Sender {
        //     [key: string]: any
        val type: String
    }

    val action: String?
    val installation: Installation?

    @JsPlainObject
    interface Installation {
        val id: Number
        //     [key: string]: any
    }

    val comment: Comment?

    @JsPlainObject
    interface Comment {
        val id: Number
        //     [key: string]: any
    }
}
