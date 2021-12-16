plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-css"))
    api(project(":kotlin-react-legacy"))
    api(project(":kotlin-react-dom-legacy"))

    api(kotlinxHtml("js"))

    api(npmv("css-in-js-utils"))
    api(npmv("inline-style-prefixer"))
    api(npmv("styled-components"))
}
