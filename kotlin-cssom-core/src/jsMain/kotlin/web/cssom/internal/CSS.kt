package web.cssom.internal

import js.internal.InternalApi

@InternalApi
internal external object CSS {
    fun escape(ident: String): String
}
