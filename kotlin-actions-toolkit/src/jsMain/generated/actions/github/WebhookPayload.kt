// Automatically generated - do not modify!

package actions.github

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface WebhookPayload {
    // [key: string]: any
    var repository: PayloadRepository?
    var issue: Issue?

    @JsPlainObject
    interface Issue {
        //     [key: string]: any
        var number: Number
        var html_url: String?
        var body: String?
    }

    var pull_request: PullRequest?

    @JsPlainObject
    interface PullRequest {
        //     [key: string]: any
        var number: Number
        var html_url: String?
        var body: String?
    }

    var sender: Sender?

    @JsPlainObject
    interface Sender {
        //     [key: string]: any
        var type: String
    }

    var action: String?
    var installation: Installation?

    @JsPlainObject
    interface Installation {
        var id: Number
        //     [key: string]: any
    }

    var comment: Comment?

    @JsPlainObject
    interface Comment {
        var id: Number
        //     [key: string]: any
    }
}
