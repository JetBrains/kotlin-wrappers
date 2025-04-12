package karakum.browser

import karakum.common.loadContent
import java.net.URI

private val DENO_UNSTABLE_URI =
    URI("https://raw.githubusercontent.com/denoland/deno/main/cli/tsc/dts/lib.deno.unstable.d.ts")

internal val DENO_UNSTABLE_CONTENT by lazy {
    loadContent(DENO_UNSTABLE_URI)
        .replace("\ndeclare ", "\n")
        .replace("\n  /** @category Temporal */", "")
        .replace("\n   *\n   * @category Temporal", "")
}
