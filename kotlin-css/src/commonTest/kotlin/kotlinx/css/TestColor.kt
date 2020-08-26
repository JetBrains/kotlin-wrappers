package kotlinx.css

import kotlin.test.*

class TestColor {
    @Test
    fun testParseRGB() {
        val color = Color("rgb(123, 45, 67)")
        val rgb = color.toRGBA()
        assertEquals(123, rgb.red, "Parsed RGB red value is incorrect")
        assertEquals(45, rgb.green, "Parsed RGB green value is incorrect")
        assertEquals(67, rgb.blue, "Parsed RGB blue value is incorrect")
    }

    @Test
    fun testParseRGB2() {
        val color = Color("rgb(123   45 ,  67)")
        val rgb = color.toRGBA()
        assertEquals(123, rgb.red, "Parsed RGB red value is incorrect")
        assertEquals(45, rgb.green, "Parsed RGB green value is incorrect")
        assertEquals(67, rgb.blue, "Parsed RGB blue value is incorrect")
    }

    @Test
    fun testParseRGB3() {
        val color = Color("rgb(100%, 33%, 40%)")
        val rgb = color.toRGBA()
        assertEquals(255, rgb.red, "Parsed RGB red value is incorrect")
        assertEquals(84, rgb.green, "Parsed RGB green value is incorrect")
        assertEquals(102, rgb.blue, "Parsed RGB blue value is incorrect")
    }

    @Test
    fun testParseRGBa() {
        val color = Color("rgba(123, 45, 67, 0.8)")
        val rgba = color.toRGBA()
        assertEquals(123, rgba.red, "Parsed RGBa red value is incorrect")
        assertEquals(45, rgba.green, "Parsed RGBa green value is incorrect")
        assertEquals(67, rgba.blue, "Parsed RGBa blue value is incorrect")
        assertEquals(0.8, rgba.alpha, "Parsed RGBa alpha/opacity value is incorrect")
    }

    @Test
    fun testParseRGBa_ValueCapping() {
        val color = Color("rgba(300, 45, 67, 1.8)")
        val rgba = color.toRGBA()
        assertEquals(255, rgba.red, "Parsed RGBa red value is incorrect")
        assertEquals(45, rgba.green, "Parsed RGBa green value is incorrect")
        assertEquals(67, rgba.blue, "Parsed RGBa blue value is incorrect")
        assertEquals(1.0, rgba.alpha, "Parsed RGBa alpha/opacity value is incorrect")
    }

    @Test
    fun testParseHSL() {
        val color = Color("hsl(100, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        assertEquals(100, hsl.hue, "Parsed HSL hue value is incorrect")
        assertEquals(100, hsl.saturation, "Parsed HSL saturation value is incorrect")
        assertEquals(50, hsl.lightness, "Parsed HSL lightness value is incorrect")
    }

    @Test
    fun testParseHSL_Turn() {
        val color = Color("hsl(1.25turn, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        assertEquals(90, hsl.hue, "Parsed HSL hue value is incorrect")
        assertEquals(100, hsl.saturation, "Parsed HSL saturation value is incorrect")
        assertEquals(50, hsl.lightness, "Parsed HSL lightness value is incorrect")
    }

    @Test
    fun testParseHSL_Grad() {
        val color = Color("hsl(100grad, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        assertEquals(90, hsl.hue, "Parsed HSL hue value is incorrect")
        assertEquals(100, hsl.saturation, "Parsed HSL saturation value is incorrect")
        assertEquals(50, hsl.lightness, "Parsed HSL lightness value is incorrect")
    }

    @Test
    fun testParseHSL_Rad() {
        val color = Color("hsl(1.5708rad, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        assertEquals(90, hsl.hue, "Parsed HSL hue value is incorrect")
        assertEquals(100, hsl.saturation, "Parsed HSL saturation value is incorrect")
        assertEquals(50, hsl.lightness, "Parsed HSL lightness value is incorrect")
    }

    @Test
    fun testParseHSL_Deg() {
        val color = Color("hsl(90deg, 100%, 50%)")
        val hsl = color.fromHSLANotation()
        assertEquals(90, hsl.hue, "Parsed HSL hue value is incorrect")
        assertEquals(100, hsl.saturation, "Parsed HSL saturation value is incorrect")
        assertEquals(50, hsl.lightness, "Parsed HSL lightness value is incorrect")
    }

    @Test
    fun testParseHSLa() {
        val color = Color("hsla(100, 100%, 50%, 0.8)")
        val hsla = color.fromHSLANotation()
        assertEquals(100, hsla.hue, "Parsed HSLa hue value is incorrect")
        assertEquals(100, hsla.saturation, "Parsed HSLa saturation value is incorrect")
        assertEquals(50, hsla.lightness, "Parsed HSLa lightness value is incorrect")
        assertEquals(0.8, hsla.alpha, "Parsed HSLa alpha/opacity value is incorrect")
    }

    @Test
    fun testRGB2HSL() {
        val color = Color("rgb(123, 45, 67)")
        val hsla = color.toRGBA().asHSLA()
        assertEquals(343, hsla.hue, "Converted HSLa hue value is incorrect")
        assertEquals(46, hsla.saturation, "Converted HSLa saturation value is incorrect")
        assertEquals(33, hsla.lightness, "Converted HSLa lightness value is incorrect")
        assertEquals(1.0, hsla.alpha, "Converted HSLa alpha/opacity value is incorrect")
    }

    @Test
    fun testHSL2RGB() {
        val color = Color("hsl(343, 46%, 33%)")
        val rgba = color.fromHSLANotation().asRGBA()
        assertEquals(123, rgba.red, "Converted RGBa red value is incorrect")
        assertEquals(45, rgba.green, "Converted RGBa green value is incorrect")
        assertEquals(67, rgba.blue, "Converted RGBa blue value is incorrect")
        assertEquals(1.0, rgba.alpha, "Converted RGBa alpha/opacity value is incorrect")
    }

    @Test
    fun testHSL2RGB2() {
        val color = Color("hsl(30, 51%, 17%)")
        val rgba = color.fromHSLANotation().asRGBA()
        assertEquals(0x41, rgba.red, "Converted RGBa red value is incorrect")
        assertEquals(0x2B, rgba.green, "Converted RGBa green value is incorrect")
        assertEquals(0x15, rgba.blue, "Converted RGBa blue value is incorrect")
        assertEquals(1.0, rgba.alpha, "Converted RGBa alpha/opacity value is incorrect")
    }

    @Test
    fun testLighten() {
        val color = Color.burlyWood.lighten(10)  // #DEB887 = hsl(34, 57%, 70%) => lighten(10) => hsl(34, 57%, 77%) = #E6C9A3
        val rgba = color.toRGBA()
        assertEquals(0xE6, rgba.red, "Converted RGBa red value is incorrect")
        assertEquals(0xC9, rgba.green, "Converted RGBa green value is incorrect")
        assertEquals(0xA3, rgba.blue, "Converted RGBa blue value is incorrect")
        assertEquals(1.0, rgba.alpha, "Converted RGBa alpha/opacity value is incorrect")

        assertEquals("rgba(230, 201, 163, 1.0)", color.value, "Generated RGBa string is incorrect")
    }

    @Test
    fun testSaturate() {
        val color = Color.burlyWood.saturate(10)  // #DEB887 = hsl(34, 57%, 70%) => saturate(10) => hsl(34, 63%, 70%) = #E3B982
        val rgba = color.toRGBA()
        val hsla = rgba.asHSLA()

        assertEquals(34, hsla.hue, "Converted HSLa hue value is incorrect")
        assertEquals(63, hsla.saturation, "Converted HSLa saturation value is incorrect")
        assertEquals(70, hsla.lightness, "Converted HSLa lightness value is incorrect")
        assertEquals(1.0, hsla.alpha, "Converted HSLa alpha/opacity value is incorrect")

        assertEquals(0xE3, rgba.red, "Converted RGBa red value is incorrect")
        assertEquals(0xB9, rgba.green, "Converted RGBa green value is incorrect")
        assertEquals(0x82, rgba.blue, "Converted RGBa blue value is incorrect")
        assertEquals(1.0, rgba.alpha, "Converted RGBa alpha/opacity value is incorrect")

        assertEquals("rgba(227, 185, 130, 1.0)", color.value, "Generated RGBa string is incorrect")
    }

    @Test
    fun testBlackAlpha() {
        val color = blackAlpha(0.1)
        val rgba = color.toRGBA()

        assertEquals("rgba(0, 0, 0, 0.1)", color.toString(), "String representation is incorrect")
        assertEquals(0, rgba.red, "Parsed RGBa red value is incorrect")
        assertEquals(0, rgba.green, "Parsed RGBa green value is incorrect")
        assertEquals(0, rgba.blue, "Parsed RGBa blue value is incorrect")
        assertEquals(0.1, rgba.alpha, "Parsed RGBa alpha value is incorrect")
    }

    @Test
    fun testWhiteAlpha() {
        val color = whiteAlpha(0.1)
        val rgba = color.toRGBA()

        assertEquals("rgba(255, 255, 255, 0.1)", color.toString(), "String representation is incorrect")
        assertEquals(255, rgba.red, "Parsed RGBa red value is incorrect")
        assertEquals(255, rgba.green, "Parsed RGBa green value is incorrect")
        assertEquals(255, rgba.blue, "Parsed RGBa blue value is incorrect")
        assertEquals(0.1, rgba.alpha, "Parsed RGBa alpha value is incorrect")
    }

    @Test
    fun testWithAlpha() {
        val rgb = rgb(0, 0, 0).withAlpha(0.1)
        val rgba = rgba(0, 0, 0, 0.5).withAlpha(0.1)
        val hex = Color("#000").withAlpha(0.1)
        val hexa = Color("#00000000").withAlpha(0.1)

        assertEquals("rgba(0, 0, 0, 0.1)", rgb.toString(), "Alpha conversion is incorrect")
        assertEquals("rgba(0, 0, 0, 0.05)", rgba.toString(), "Alpha conversion is incorrect")
        assertEquals("rgba(0, 0, 0, 0.1)", hex.toString(), "Alpha conversion is incorrect")
        assertEquals("rgba(0, 0, 0, 0.1)", hexa.toString(), "Alpha conversion is incorrect")
    }

    @Test
    fun testHex() {
        val black = hex(0x000)
        val white = hex(0xfff)
        val color = hex(0x812dd3)

        assertEquals("#000", black.toString())
        assertEquals("#fff", white.toString())
        assertEquals("#812dd3", color.toString())
    }

    @Test
    fun testBlend() {
        val source = whiteAlpha(0.1)
        val mix = source.blend(Color("#1a3b66"))

        assertEquals("rgb(49, 79, 117)", mix.toString(), "Alpha blending is incorrect")
    }
}
