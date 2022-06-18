plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-js"))
    api(project(":kotlin-react-legacy"))
    api(project(":kotlin-react-dom"))

    api(kotlinxHtml("js"))
}
