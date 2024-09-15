package vercel.ncc

import seskar.js.JsValue
import kotlin.annotation.Target

sealed external interface Target {
    companion object {
        @JsValue("es2015")
        val es2015: Target

        @JsValue("es2016")
        val es2016: Target

        @JsValue("es2017")
        val es2017: Target

        @JsValue("es2018")
        val es2018: Target

        @JsValue("es2019")
        val es2019: Target

        @JsValue("es2020")
        val es2020: Target

        @JsValue("es2021")
        val es2021: Target

        @JsValue("es2022")
        val es2022: Target

        @JsValue("es2023")
        val es2023: Target

        @JsValue("es2024")
        val es2024: Target

        @JsValue("esnext")
        val esnext: Target
    }
}
