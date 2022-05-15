package styled.demo

import styled.HasCssSuffix

enum class ScreenSize(private val startsFromWidth: Int) : HasCssSuffix {

    DESKTOP(992),
    TABLET(768),
    PHONE(0);

    companion object {
        fun fromRawWidth(rawWidth: Int): ScreenSize {
            for (value in values()) {
                if (rawWidth >= value.startsFromWidth) return value
            }
            return DESKTOP
        }
    }

    override val cssSuffix: String get() = name.lowercase()

}
