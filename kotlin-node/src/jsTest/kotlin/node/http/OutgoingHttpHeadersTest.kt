package node.http

import js.objects.unsafeJso
import js.reflect.Reflect
import kotlin.test.assertEquals

class OutgoingHttpHeadersTest {
    fun contentType() {
        val headers: OutgoingHttpHeaders = unsafeJso {
            contentType = "my-content-type"
        }

        assertEquals("my-content-type", Reflect.get(headers, "content-type"))
    }

    fun userAgent() {
        val headers: OutgoingHttpHeaders = unsafeJso {
            userAgent = "my-user-agent"
        }

        assertEquals("my-user-agent", Reflect.get(headers, "user-agent"))
    }
}
