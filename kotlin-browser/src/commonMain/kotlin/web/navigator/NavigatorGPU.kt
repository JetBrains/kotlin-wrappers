package web.navigator

import web.gpu.GPU

sealed external interface NavigatorGPU {
    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/gpu)
     */
    val gpu: GPU
}
