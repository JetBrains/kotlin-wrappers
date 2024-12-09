package web.http

import kotlin.test.Test
import kotlin.test.assertEquals

class RequestInitTest {
    @Test
    fun type() {
        val options = RequestInit(
            method = RequestMethod.PUT
        )

        assertEquals<Any?>("PUT", options.method)
    }
}
