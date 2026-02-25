package react

import js.objects.unsafeJso
import kotlin.test.Test
import kotlin.test.assertEquals

class PropsTest {
    @Test
    fun plusTest() {
        val additionalProps: PointProps = unsafeJso {
            x = 5
            y = 6
        }

        val props: PointProps = unsafeJso {
            +additionalProps
        }

        assertEquals(5, props.x)
        assertEquals(6, props.y)
    }
}
