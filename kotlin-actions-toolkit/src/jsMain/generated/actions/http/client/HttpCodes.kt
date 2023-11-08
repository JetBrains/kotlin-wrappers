// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.http.client

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface HttpCodes {
    companion object {
        @JsIntValue(200)
        val OK: HttpCodes

        @JsIntValue(300)
        val MultipleChoices: HttpCodes

        @JsIntValue(301)
        val MovedPermanently: HttpCodes

        @JsIntValue(302)
        val ResourceMoved: HttpCodes

        @JsIntValue(303)
        val SeeOther: HttpCodes

        @JsIntValue(304)
        val NotModified: HttpCodes

        @JsIntValue(305)
        val UseProxy: HttpCodes

        @JsIntValue(306)
        val SwitchProxy: HttpCodes

        @JsIntValue(307)
        val TemporaryRedirect: HttpCodes

        @JsIntValue(308)
        val PermanentRedirect: HttpCodes

        @JsIntValue(400)
        val BadRequest: HttpCodes

        @JsIntValue(401)
        val Unauthorized: HttpCodes

        @JsIntValue(402)
        val PaymentRequired: HttpCodes

        @JsIntValue(403)
        val Forbidden: HttpCodes

        @JsIntValue(404)
        val NotFound: HttpCodes

        @JsIntValue(405)
        val MethodNotAllowed: HttpCodes

        @JsIntValue(406)
        val NotAcceptable: HttpCodes

        @JsIntValue(407)
        val ProxyAuthenticationRequired: HttpCodes

        @JsIntValue(408)
        val RequestTimeout: HttpCodes

        @JsIntValue(409)
        val Conflict: HttpCodes

        @JsIntValue(410)
        val Gone: HttpCodes

        @JsIntValue(429)
        val TooManyRequests: HttpCodes

        @JsIntValue(500)
        val InternalServerError: HttpCodes

        @JsIntValue(501)
        val NotImplemented: HttpCodes

        @JsIntValue(502)
        val BadGateway: HttpCodes

        @JsIntValue(503)
        val ServiceUnavailable: HttpCodes

        @JsIntValue(504)
        val GatewayTimeout: HttpCodes
    }
}
