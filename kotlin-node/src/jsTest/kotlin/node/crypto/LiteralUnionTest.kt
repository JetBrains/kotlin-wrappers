package node.crypto

import kotlin.test.Test
import kotlin.test.assertEquals

class LiteralUnionTest {
    @Test
    fun checkJsAsyncForDoesNotReject() {
        val actual = GetFipsResult.`0`
        val expected = 0

        assertEquals<Any>(expected, actual)
    }
}
