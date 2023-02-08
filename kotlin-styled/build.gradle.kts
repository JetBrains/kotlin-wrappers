plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-extensions"))
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-css"))
    jsMainApi(project(":kotlin-react-legacy"))
    jsMainApi(project(":kotlin-react-dom-legacy"))

    jsMainApi(kotlinxHtml("js"))

    jsMainApi(npmv("css-in-js-utils"))
    jsMainApi(npmv("inline-style-prefixer"))
    jsMainApi(npmv("styled-components"))
}
