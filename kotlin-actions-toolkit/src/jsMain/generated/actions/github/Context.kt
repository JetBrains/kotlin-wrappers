// Automatically generated - do not modify!

@file:JsModule("@actions/github")

package actions.github

import kotlinx.js.JsPlainObject

external class Context {
    /**
     * Webhook payload object that triggered the workflow
     */
    var payload: WebhookPayload
    var eventName: String
    var sha: String
    var ref: String
    var workflow: String
    var action: String
    var actor: String
    var job: String
    var runNumber: Number
    var runId: Number
    var apiUrl: String
    var serverUrl: String
    var graphqlUrl: String

    /**
     * Hydrate the context from the environment
     */
    constructor()

    val issue: Issue

    @JsPlainObject
    interface Issue {
        var owner: String
        var repo: String
        var number: Number
    }

    val repo: Repo

    @JsPlainObject
    interface Repo {
        var owner: String
        var repo: String
    }
}
