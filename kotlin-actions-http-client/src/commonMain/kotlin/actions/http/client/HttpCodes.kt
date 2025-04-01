// Automatically generated - do not modify!

package actions.http.client

import seskar.js.JsRawValue

sealed external interface HttpCodes {
    companion object {
        @JsRawValue("200")
        val OK: HttpCodes

        @JsRawValue("300")
        val MultipleChoices: HttpCodes

        @JsRawValue("301")
        val MovedPermanently: HttpCodes

        @JsRawValue("302")
        val ResourceMoved: HttpCodes

        @JsRawValue("303")
        val SeeOther: HttpCodes

        @JsRawValue("304")
        val NotModified: HttpCodes

        @JsRawValue("305")
        val UseProxy: HttpCodes

        @JsRawValue("306")
        val SwitchProxy: HttpCodes

        @JsRawValue("307")
        val TemporaryRedirect: HttpCodes

        @JsRawValue("308")
        val PermanentRedirect: HttpCodes

        @JsRawValue("400")
        val BadRequest: HttpCodes

        @JsRawValue("401")
        val Unauthorized: HttpCodes

        @JsRawValue("402")
        val PaymentRequired: HttpCodes

        @JsRawValue("403")
        val Forbidden: HttpCodes

        @JsRawValue("404")
        val NotFound: HttpCodes

        @JsRawValue("405")
        val MethodNotAllowed: HttpCodes

        @JsRawValue("406")
        val NotAcceptable: HttpCodes

        @JsRawValue("407")
        val ProxyAuthenticationRequired: HttpCodes

        @JsRawValue("408")
        val RequestTimeout: HttpCodes

        @JsRawValue("409")
        val Conflict: HttpCodes

        @JsRawValue("410")
        val Gone: HttpCodes

        @JsRawValue("429")
        val TooManyRequests: HttpCodes

        @JsRawValue("500")
        val InternalServerError: HttpCodes

        @JsRawValue("501")
        val NotImplemented: HttpCodes

        @JsRawValue("502")
        val BadGateway: HttpCodes

        @JsRawValue("503")
        val ServiceUnavailable: HttpCodes

        @JsRawValue("504")
        val GatewayTimeout: HttpCodes
    }
}
