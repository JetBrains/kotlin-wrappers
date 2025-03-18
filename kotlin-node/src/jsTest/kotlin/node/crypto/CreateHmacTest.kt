package node.crypto

import node.stream.Duplex
import kotlin.test.Test
import kotlin.test.assertTrue

class CreateHmacTest {
    @Test
    fun checkCreateHmac() {
        val hmac: Any = createHmac("sha256", "a secret")

        assertTrue(hmac is Duplex)
    }
}
