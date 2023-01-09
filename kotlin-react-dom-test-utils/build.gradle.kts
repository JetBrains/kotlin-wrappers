plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-js"))
    api(project(":kotlin-browser"))
    api(project(":kotlin-react-core"))
    api(project(":kotlin-react-dom"))

    implementation(kotlinxCoroutines("core"))

    api(npmv("react-dom"))
}
