package kotlinx.css

import kotlin.test.*

class TestColor {
    @Test
    fun testParseRGB() {
        val color = Color("rgb(123, 45, 67)")
        val rgb = color.toRGBA()
        asserter.assertEquals("Parsed RGB red value is incorrect", 123, rgb.red)
        asserter.assertEquals("Parsed RGB green value is incorrect", 45, rgb.green)
        asserter.assertEquals("Parsed RGB blue value is incorrect", 67, rgb.blue)
    }

    @Test
    fun testParseRGB2() {
        val color = Color("rgb(123   45 ,  67)")
        val rgb = color.toRGBA()
        asserter.assertEquals("Parsed RGB red value is incorrect", 123, rgb.red)
        asserter.assertEquals("Parsed RGB green value is incorrect", 45, rgb.green)
        asserter.assertEquals("Parsed RGB blue value is incorrect", 67, rgb.blue)
    }

    @Test
    fun testParseRGB3() {
        val color = Color("rgb(100%, 33%, 40%)")
        val rgb = color.toRGBA()
        asserter.assertEquals("Parsed RGB red value is incorrect", 255, rgb.red)
        asserter.assertEquals("Parsed RGB green value is incorrect", 84, rgb.green)
        asserter.assertEquals("Parsed RGB blue value is incorrect", 102, rgb.blue)
    }

    @Test
    fun testParseRGBa() {
        val color = Color("rgba(123, 45, 67, 0.8)")
        val rgba = color.toRGBA()
        asserter.assertEquals("Parsed RGBa red value is incorrect", 123, rgba.red)
        asserter.assertEquals("Parsed RGBa green value is incorrect", 45, rgba.green)
        asserter.assertEquals("Parsed RGBa blue value is incorrect", 67, rgba.blue)
        asserter.assertEquals("Parsed RGBa alpha/opacity value is incorrect", 0.8, rgba.alpha)
    }

    @Test
    fun testParseRGBa_ValueCapping() {
        val color = Color("rgba(300, 45, 67, 1.8)")
        val rgba = color.toRGBA()
        asserter.assertEquals("Parsed RGBa red value is incorrect", 255, rgba.red)
        asserter.assertEquals("Parsed RGBa green value is incorrect", 45, rgba.green)
        asserter.assertEquals("Parsed RGBa blue value is incorrect", 67, rgba.blue)
        asserter.assertEquals("Parsed RGBa alpha/opacity value is incorrect", 1.0, rgba.alpha)
    }

    @Test
    fun testParseHSL() {
        val color = Color("hsl(100, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        asserter.assertEquals("Parsed HSL hue value is incorrect", 100, hsl.hue)
        asserter.assertEquals("Parsed HSL saturation value is incorrect", 100, hsl.saturation)
        asserter.assertEquals("Parsed HSL lightness value is incorrect", 50, hsl.lightness)
    }

    @Test
    fun testParseHSL_Turn() {
        val color = Color("hsl(1.25turn, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        asserter.assertEquals("Parsed HSL hue value is incorrect", 90, hsl.hue)
        asserter.assertEquals("Parsed HSL saturation value is incorrect", 100, hsl.saturation)
        asserter.assertEquals("Parsed HSL lightness value is incorrect", 50, hsl.lightness)
    }

    @Test
    fun testParseHSL_Grad() {
        val color = Color("hsl(100grad, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        asserter.assertEquals("Parsed HSL hue value is incorrect", 90, hsl.hue)
        asserter.assertEquals("Parsed HSL saturation value is incorrect", 100, hsl.saturation)
        asserter.assertEquals("Parsed HSL lightness value is incorrect", 50, hsl.lightness)
    }

    @Test
    fun testParseHSL_Rad() {
        val color = Color("hsl(1.5708rad, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        asserter.assertEquals("Parsed HSL hue value is incorrect", 90, hsl.hue)
        asserter.assertEquals("Parsed HSL saturation value is incorrect", 100, hsl.saturation)
        asserter.assertEquals("Parsed HSL lightness value is incorrect", 50, hsl.lightness)
    }

    @Test
    fun testParseHSL_Deg() {
        val color = Color("hsl(90deg, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        asserter.assertEquals("Parsed HSL hue value is incorrect", 90, hsl.hue)
        asserter.assertEquals("Parsed HSL saturation value is incorrect", 100, hsl.saturation)
        asserter.assertEquals("Parsed HSL lightness value is incorrect", 50, hsl.lightness)
    }

    @Test
    fun testParseHSLa() {
        val color = Color("hsla(100, 100%, 50%, 0.8)")
        val hsla = color.fromHSLANotation()
        asserter.assertEquals("Parsed HSLa hue value is incorrect", 100, hsla.hue)
        asserter.assertEquals("Parsed HSLa saturation value is incorrect", 100, hsla.saturation)
        asserter.assertEquals("Parsed HSLa lightness value is incorrect", 50, hsla.lightness)
        asserter.assertEquals("Parsed HSLa alpha/opacity value is incorrect", 0.8, hsla.alpha)
    }

    @Test
    fun testRGB2HSL() {
        val color = Color("rgb(123, 45, 67)")
        val hsla = color.toRGBA().asHSLA()
        asserter.assertEquals("Converted HSLa hue value is incorrect", 343, hsla.hue)
        asserter.assertEquals("Converted HSLa saturation value is incorrect", 46, hsla.saturation)
        asserter.assertEquals("Converted HSLa lightness value is incorrect", 33, hsla.lightness)
        asserter.assertEquals("Converted HSLa alpha/opacity value is incorrect", 1.0, hsla.alpha)
    }

    @Test
    fun testHSL2RGB() {
        val color = Color("hsl(343, 46%, 33%)")
        val rgba = color.fromHSLANotation().asRGBA()
        asserter.assertEquals("Converted RGBa red value is incorrect", 123, rgba.red)
        asserter.assertEquals("Converted RGBa green value is incorrect", 45, rgba.green)
        asserter.assertEquals("Converted RGBa blue value is incorrect", 67, rgba.blue)
        asserter.assertEquals("Converted RGBa alpha/opacity value is incorrect", 1.0, rgba.alpha)
    }

    @Test
    fun testHSL2RGB2() {
        val color = Color("hsl(30, 51%, 17%)")
        val rgba = color.fromHSLANotation().asRGBA()
        asserter.assertEquals("Converted RGBa red value is incorrect", 0x41, rgba.red)
        asserter.assertEquals("Converted RGBa green value is incorrect", 0x2B, rgba.green)
        asserter.assertEquals("Converted RGBa blue value is incorrect", 0x15, rgba.blue)
        asserter.assertEquals("Converted RGBa alpha/opacity value is incorrect", 1.0, rgba.alpha)
    }

    @Test
    fun testLighten() {
        val color = Color.burlyWood.lighten(10)  // #DEB887 = hsl(34, 57%, 70%) => lighten(10) => hsl(34, 57%, 77%) = #E6C9A3
        val rgba = color.toRGBA()
        asserter.assertEquals("Converted RGBa red value is incorrect", 0xE6, rgba.red)
        asserter.assertEquals("Converted RGBa green value is incorrect", 0xC9, rgba.green)
        asserter.assertEquals("Converted RGBa blue value is incorrect", 0xA3, rgba.blue)
        asserter.assertEquals("Converted RGBa alpha/opacity value is incorrect", 1.0, rgba.alpha)

        asserter.assertEquals("Generated RGBa string not as expected", "rgba(230, 201, 163, 1.0)", color.value)
    }

    @Test
    fun testSaturate() {
        val color = Color.burlyWood.saturate(10)  // #DEB887 = hsl(34, 57%, 70%) => saturate(10) => hsl(34, 63%, 70%) = #E3B982
        val rgba = color.toRGBA()
        val hsla = rgba.asHSLA()

        asserter.assertEquals("Converted HSLa hue value is incorrect", 34, hsla.hue)
        asserter.assertEquals("Converted HSLa saturation value is incorrect", 63, hsla.saturation)
        asserter.assertEquals("Converted HSLa lightness value is incorrect", 70, hsla.lightness)
        asserter.assertEquals("Converted HSLa alpha/opacity value is incorrect", 1.0, hsla.alpha)

        asserter.assertEquals("Converted RGBa red value is incorrect", 0xE3, rgba.red)
        asserter.assertEquals("Converted RGBa green value is incorrect", 0xB9, rgba.green)
        asserter.assertEquals("Converted RGBa blue value is incorrect", 0x82, rgba.blue)
        asserter.assertEquals("Converted RGBa alpha/opacity value is incorrect", 1.0, rgba.alpha)

        asserter.assertEquals("Generated RGBa string not as expected", "rgba(227, 185, 130, 1.0)", color.value)
    }

    @Test
    fun testBlackAlpha() {
        val color = blackAlpha(0.1)
        val rgba = color.toRGBA()

        asserter.assertEquals("String representation is incorrect", "rgba(0, 0, 0, 0.1)", color.toString())
        asserter.assertEquals("Parsed RGBa red value is incorrect", 0, rgba.red)
        asserter.assertEquals("Parsed RGBa green value is incorrect", 0, rgba.green)
        asserter.assertEquals("Parsed RGBa blue value is incorrect", 0, rgba.blue)
        asserter.assertEquals("Parsed RGBa alpha value is incorrect", 0.1, rgba.alpha)
    }

    @Test
    fun testWhiteAlpha() {
        val color = whiteAlpha(0.1)
        val rgba = color.toRGBA()

        asserter.assertEquals("String representation is incorrect", "rgba(255, 255, 255, 0.1)", color.toString())
        asserter.assertEquals("Parsed RGBa red value is incorrect", 255, rgba.red)
        asserter.assertEquals("Parsed RGBa green value is incorrect", 255, rgba.green)
        asserter.assertEquals("Parsed RGBa blue value is incorrect", 255, rgba.blue)
        asserter.assertEquals("Parsed RGBa alpha value is incorrect", 0.1, rgba.alpha)
    }
}
