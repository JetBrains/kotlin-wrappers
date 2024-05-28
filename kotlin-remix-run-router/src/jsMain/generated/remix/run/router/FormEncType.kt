// Generated by Karakum - do not modify it manually!


package remix.run.router


@seskar.js.JsVirtual
sealed external interface FormEncType {
    companion object {
        @seskar.js.JsValue("application/x-www-form-urlencoded")
        val applicationXWwwFormUrlencoded: FormEncType

        @seskar.js.JsValue("multipart/form-data")
        val multipartFormData: FormEncType

        @seskar.js.JsValue("application/json")
        val applicationJson: FormEncType

        @seskar.js.JsValue("text/plain")
        val textPlain: FormEncType
    }
}
