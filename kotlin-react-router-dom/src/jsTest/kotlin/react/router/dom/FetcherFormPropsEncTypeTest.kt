package react.router.dom

import react.router.dom.FetcherFormPropsEncType.Companion.multipartFormData
import kotlin.test.Test
import kotlin.test.assertEquals

class FetcherFormPropsEncTypeTest {
    @Test
    fun import() {
        assertEquals<Any>("text/plain", FetcherFormPropsEncType.textPlain)
    }

    @Test
    fun staticImport() {
        assertEquals<Any>("multipart/form-data", multipartFormData)
    }
}
