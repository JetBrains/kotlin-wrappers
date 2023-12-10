plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinExtensions)
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCss)
    jsMainApi(projects.kotlinReactLegacy)
    jsMainApi(projects.kotlinReactDomLegacy)

    jsMainApi(kotlinxHtml("js"))

    jsMainApi(npmv("css-in-js-utils"))
    jsMainApi(npmv("inline-style-prefixer"))
    jsMainApi(npmv("styled-components"))
}
