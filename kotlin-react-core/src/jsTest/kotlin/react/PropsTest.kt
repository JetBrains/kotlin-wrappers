package react

import js.core.jso
import kotlin.test.Test
import kotlin.test.assertEquals

class PropsTest {
    @Test
    fun plusTest() {
        val additionalProps: PointProps = jso {
            x = 5
            y = 6
        }

        val props: PointProps = jso {
            +additionalProps
        }

        assertEquals(5, props.x)
        assertEquals(6, props.y)
    }
}
