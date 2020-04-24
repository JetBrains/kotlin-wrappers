plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-css"))
    api(project(":kotlin-react"))
    api(project(":kotlin-react-dom"))

    api(kotlinxHtml("js"))

    api(npm("css-in-js-utils", "^3.0.4"))
    api(npm("inline-style-prefixer", "^5.1.2"))
    api(npm("styled-components", "^5.0.1"))
}
