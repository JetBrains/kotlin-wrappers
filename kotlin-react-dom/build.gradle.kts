plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-extensions"))
    api(project(":kotlin-react"))

    api(kotlinxHtml("js"))

    api(npmv("react-dom"))
}
