plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-extensions"))
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-react-legacy"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainApi(kotlinxHtml("js"))
}
