package tanstack.router.core

import web.http.Headers

external interface RedirectOptions :
    NavigateOptions {

    override var href: String?

    /**
     * The HTTP status code to use when redirecting.
     * @link [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RedirectType#statuscode-property)
     */
    var statusCode: Short?

    /**
     * If provided, will throw the redirect object instead of returning it. This can be useful in places where `throwing` in a function might cause it to have a return type of `never`. In that case, you can use `redirect({ throw: true })` to throw the redirect object instead of returning it.
     * @link [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RedirectType#throw-property)
     */
    var `throw`: Boolean?

    /**
     * The HTTP headers to use when redirecting.
     * @link [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/RedirectType#headers-property)
     */
    var headers: Headers?
}
