package node.http

import js.objects.jso
import kotlin.test.assertEquals

class OutgoingHttpHeadersTest {
    fun contentType() {
        val headers: OutgoingHttpHeaders = jso {
            contentType = "my-content-type"
        }

        assertEquals("my-content-type", headers.asDynamic()["content-type"])
    }

    fun userAgent() {
        val headers: OutgoingHttpHeaders = jso {
            userAgent = "my-user-agent"
        }

        assertEquals("my-user-agent", headers.asDynamic()["user-agent"])
    }
}
