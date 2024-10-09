package node.stream

import web.abort.AbortSignal
import kotlin.test.Test
import kotlin.test.assertNotNull

class StreamOptionsTest {

    // Details - KT_68943
    @Test
    fun KT_68943() {
        val options = StreamOptions<Stream>(
            signal = AbortSignal.timeout(42.0)
        )

        assertNotNull(options)
    }
}
