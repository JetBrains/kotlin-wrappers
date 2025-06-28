package web.crypto

import kotlin.test.Test
import kotlin.test.assertEquals

class Ed25519Test {
    @Test
    fun jsNameShouldResolveCorrectly() {
        assertEquals<Any>("Ed25519", Ed25519)
    }
}
